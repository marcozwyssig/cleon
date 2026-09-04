package cleon.common.language.metamodel.spec.translation.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.function.Consumer;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency.NodeRole;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.util.inconsistency.InconsistencyType;
import ch.actifsource.util.log.Logger;
import cleon.common.language.metamodel.spec.FunctionSpace_Language.IAbstractTranslationFunctions;

public abstract class AbstractBaseTranslationValidationAspect implements IResourceValidationAspect {

    private static final long VALIDATION_THRESHOLD_MS = 100;
    private static final String NO_TRANSLATION_MESSAGE = "Translation is missing.";
    private static final String TRANSLATION_QUICKFIX_TEXT = "Apply missing translation";
    private static final String VALIDATION_COMPLETED_MSG = "Translation validation for %s completed in %d ms";
    private static final String TRANSLATION_ERROR_MSG = "Error during translation process: %s";

    @Override
    public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
        final Instant start = Instant.now();
        try {
            validateTranslation(context, inconsistencyList);
        } finally {
            logIfValidationExceededThreshold(start);
        }
    }

    private void validateTranslation(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
        final var abstractTranslation = loadAbstractTranslation(context);
        final var translationFunctions = abstractTranslation.extension(IAbstractTranslationFunctions.class);

        if (!hasTranslation(context)) {
            addMissingTranslationInconsistency(context, inconsistencyList, translationFunctions);
        }
    }

    private void addMissingTranslationInconsistency(ValidationContext context, List<IResourceInconsistency> inconsistencyList, IAbstractTranslationFunctions translationFunctions) {
    	final var originText = translationFunctions.OriginText();
        
        if (!originText.isEmpty()) {
            try {
                final String translation = TranslationService.INSTANCE.translate(
                    translationFunctions.SourceLanguage().selectCode(),
                    translationFunctions.TargetLanguage().selectCode(),
                    originText
                );
                addInconsistencyWithQuickFix(inconsistencyList, context, translation);
            } catch (Exception e) {
                Logger.instance().logError(String.format(TRANSLATION_ERROR_MSG, e.getMessage()));
            }
        }
    }

    private void addInconsistencyWithQuickFix(List<IResourceInconsistency> inconsistencyList, ValidationContext context, String translation) {
        Consumer<IModifiable> applyTranslation = modifiable -> applyTranslation(modifiable, context, translation);
        addInconsistency(inconsistencyList, context, NO_TRANSLATION_MESSAGE, TRANSLATION_QUICKFIX_TEXT, applyTranslation);
    }

    protected abstract boolean hasTranslation(ValidationContext context);
    protected abstract void applyTranslation(IModifiable modifiable, ValidationContext context, String translation);

    protected IDynamicResourceRepository getRepository(ValidationContext context) {
        return TypeSystem.create(context.getReadJobExecutor()).getResourceRepository();    	    	
    }
    
    private IAbstractTranslation loadAbstractTranslation(ValidationContext context) {
        return getRepository(context).getResource(IAbstractTranslation.class, context.getResource());
    }

    private void addInconsistency(List<IResourceInconsistency> inconsistencyList, ValidationContext context, String message, String quickfixText, Consumer<IModifiable> action) {
    	final var quickfix = new AbstractQuickFix(quickfixText, "", () -> true) {
            @Override
            protected void doApply(IModifiable modifiable) {
                action.accept(modifiable);
            }
        };

        inconsistencyList.add(new SingleResourceInconsistency(
            context.getPackage(),
            context.getResource(),
            NodeRole.Object,
            message, 
            InconsistencyType.Error,
            quickfix
        ));
    }

    private void logIfValidationExceededThreshold(Instant start) {
        final var elapsedTime = Duration.between(start, Instant.now()).toMillis();
        if (elapsedTime > VALIDATION_THRESHOLD_MS) {
            Logger.instance().logInfo(String.format(VALIDATION_COMPLETED_MSG, this.getClass().getSimpleName(), elapsedTime));
        }
    }
}
