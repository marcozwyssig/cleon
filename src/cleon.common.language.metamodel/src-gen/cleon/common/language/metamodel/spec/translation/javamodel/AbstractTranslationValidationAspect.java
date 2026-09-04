package cleon.common.language.metamodel.spec.translation.javamodel;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency.NodeRole;
import ch.actifsource.core.validation.inconsistency.SingleResourceInconsistency;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.util.inconsistency.InconsistencyType;
import ch.actifsource.util.log.Logger;

import cleon.common.language.metamodel.spec.FunctionSpace_Language.IAbstractTranslationFunctions;
import cleon.common.language.metamodel.spec.translation.TranslationPackage;
import cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage;
import cleon.common.resources.metamodel.spec.literals.StringFunctionSpace;
import cleon.common.resources.metamodel.spec.literals.StringFunctionSpace.StringLiteralFunctionsImpl;

/**
 * Validates that the MD5 hash stored on an {@link IAbstractTranslation} still
 * matches its current origin text. If the origin text has changed, a quick-fix
 * offers to re-translate via {@link TranslationService}.
 */
public class AbstractTranslationValidationAspect implements IResourceValidationAspect {

    private static final long VALIDATION_THRESHOLD_MS = 100L;

    private static final String MSG_MD5_EMPTY =
            "MD5 hash can't be empty for a translation with Origin Text";
    private static final String MSG_ORIGIN_CHANGED =
            "Origin Text has been changed. Please update the translation";
    private static final String QUICKFIX_LABEL = "Translate...";

    @Override
    public void validate(final ValidationContext context,
                         final List<IResourceInconsistency> inconsistencies) {
        final Instant start = Instant.now();
        try {
            validateTranslation(context, inconsistencies);
        } finally {
            logElapsedIfSlow(start);
        }
    }

    // ---------------------------------------------------------------------
    // Validation
    // ---------------------------------------------------------------------

    private void validateTranslation(final ValidationContext context,
                                     final List<IResourceInconsistency> inconsistencies) {
        final IAbstractTranslation translation = loadTranslation(context);
        final IAbstractTranslationFunctions functions =
                translation.extension(IAbstractTranslationFunctions.class);

        if (!hasOriginText(functions)) {
            return;
        }

        if (isMd5Missing(translation)) {
            inconsistencies.add(error(context, MSG_MD5_EMPTY, null));
            return;
        }

        if (isMd5Mismatch(translation, functions)) {
            inconsistencies.add(error(context, MSG_ORIGIN_CHANGED, translateQuickFix(context)));
        }
    }

    private IAbstractTranslation loadTranslation(final ValidationContext context) {
        return TypeSystem.create(context.getReadJobExecutor())
                .getResourceRepository()
                .getResource(IAbstractTranslation.class, context.getResource());
    }

    private boolean hasOriginText(final IAbstractTranslationFunctions functions) {
        final String origin = functions.OriginText();
        return origin != null && !origin.isEmpty();
    }

    private boolean isMd5Missing(final IAbstractTranslation translation) {
        final String md5 = translation.selectMd5();
        return md5 == null || md5.isEmpty();
    }

    private boolean isMd5Mismatch(final IAbstractTranslation translation,
                                  final IAbstractTranslationFunctions functions) {
        final String expected = StringFunctionSpace.StringLiteralFunctionsImpl.INSTANCE
                .md5(functions.OriginText());
        return !Objects.equals(expected, translation.selectMd5());
    }

    // ---------------------------------------------------------------------
    // Inconsistency factory
    // ---------------------------------------------------------------------

    private SingleResourceInconsistency error(final ValidationContext context,
                                              final String message,
                                              final AbstractQuickFix quickFix) {
        return new SingleResourceInconsistency(
                context.getPackage(),
                context.getResource(),
                NodeRole.Object,
                message,
                InconsistencyType.Error,
                quickFix);
    }

    // ---------------------------------------------------------------------
    // Quick fix
    // ---------------------------------------------------------------------

    private AbstractQuickFix translateQuickFix(final ValidationContext context) {
        return new AbstractQuickFix(QUICKFIX_LABEL, "", () -> true) {
            @Override
            protected void doApply(final IModifiable modifiable) {
                applyTranslation(context, modifiable);
            }
        };
    }

    private void applyTranslation(final ValidationContext context, final IModifiable modifiable) {
        try {
            final IAbstractTranslation translation = TypeSystem.create(modifiable)
                    .getResourceRepository()
                    .getResource(IAbstractTranslation.class, context.getResource());
            final IAbstractTranslationFunctions functions =
                    translation.extension(IAbstractTranslationFunctions.class);

            final String sourceText = functions.OriginText();
            if (sourceText == null || sourceText.isEmpty()) {
                return;
            }

            final String sourceLanguage = functions.SourceLanguage().selectCode();
            final String targetLanguage = functions.TargetLanguage().selectCode();
            final String targetText = TranslationService.INSTANCE
                    .translate(sourceLanguage, targetLanguage, sourceText);

            Logger.instance().logInfo(String.format(
                    "Translated [%s -> %s]: '%s' -> '%s'",
                    sourceLanguage, targetLanguage, sourceText, targetText));

            final var statements = Select.statementsForAttribute(modifiable, DescriptionsPackage.SimpleDescription_descriptions, context.getResource());
            if( statements != null) {
            	statements.forEach(x -> Update.removeStatement(modifiable, x));
            }
            
            Update.createStatement(
                    modifiable,
                    context.getPackage(),
                    context.getResource(),
                    DescriptionsPackage.SimpleDescription_descriptions,
                    LiteralUtil.create(targetText));
            
//    		final var md5 = StringLiteralFunctionsImpl.INSTANCE.md5(abstractFunctions.OriginText());
//    		Update.createStatement(modifiable, pkg, newInstance, TranslationPackage.AbstractTranslation_md5, LiteralUtil.create(md5));
            

        } catch (final IOException e) {
            logError("Translation service call failed", e);
        } catch (final RuntimeException e) {
            logError("Unexpected error while applying translation quick fix", e);
        }
    }

    // ---------------------------------------------------------------------
    // Logging
    // ---------------------------------------------------------------------

    private void logElapsedIfSlow(final Instant start) {
        final long elapsedMs = Duration.between(start, Instant.now()).toMillis();
        if (elapsedMs > VALIDATION_THRESHOLD_MS) {
            Logger.instance().logInfo(String.format(
                    "Validation in %s took %d ms", getClass().getSimpleName(), elapsedMs));
        }
    }

    private static void logError(final String message, final Throwable t) {
        final StringWriter sw = new StringWriter();
        try (PrintWriter pw = new PrintWriter(sw)) {
            t.printStackTrace(pw);
        }
        Logger.instance().logError(String.format("%s: %s%n%s", message, t.getMessage(), sw));
    }
}