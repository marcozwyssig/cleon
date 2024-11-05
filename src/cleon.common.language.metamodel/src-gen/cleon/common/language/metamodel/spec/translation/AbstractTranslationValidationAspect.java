package cleon.common.language.metamodel.spec.translation;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.common.language.metamodel.spec.FunctionSpace_Language.IAbstractTranslationFunctions;
import cleon.common.language.metamodel.spec.translation.javamodel.IAbstractTranslation;
import cleon.common.resources.metamodel.spec.literals.StringFunctionSpace;

public class AbstractTranslationValidationAspect implements IResourceValidationAspect {

    private static final long VALIDATION_THRESHOLD_MS = 100;

    @Override
    public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
        final Instant start = Instant.now();
        
        try {
            final IAbstractTranslation abstractTranslation = loadAbstractTranslation(context);
            final IAbstractTranslationFunctions translationFunctions = abstractTranslation.extension(IAbstractTranslationFunctions.class);
            
            // Check if Origin Text is present
            if (!translationFunctions.OriginText().isEmpty()) {
                validateMd5(inconsistencyList, context, abstractTranslation, translationFunctions);
            }
        } finally {
            logValidationTime(start);
        }
    }

    private void validateMd5(List<IResourceInconsistency> inconsistencyList, ValidationContext context, 
                             IAbstractTranslation abstractTranslation, IAbstractTranslationFunctions translationFunctions) {
        // MD5 should not be empty if Origin Text is present
        if (abstractTranslation.selectMd5() == null || abstractTranslation.selectMd5().isEmpty()) {
            addInconsistency(inconsistencyList, context, "MD5 hash can't be empty for a translation with Origin Text");
            return;
        }

        // Check if MD5 matches the current Origin Text
        if (isMd5Mismatch(abstractTranslation, translationFunctions)) {
            addInconsistency(inconsistencyList, context, "Origin Text has been changed. Please update the translation");
        }
    }

    private IAbstractTranslation loadAbstractTranslation(ValidationContext context) {
        var typeSystem = TypeSystem.create(context.getReadJobExecutor());
        var resourceRepository = typeSystem.getResourceRepository();
        return resourceRepository.getResource(IAbstractTranslation.class, context.getResource());
    }

    private boolean isMd5Mismatch(IAbstractTranslation translation, IAbstractTranslationFunctions translationFunctions) {
        var md5Hash = StringFunctionSpace.StringLiteralFunctionsImpl.INSTANCE.md5(translationFunctions.OriginText());
        return !md5Hash.equals(translation.selectMd5());
    }

    private void addInconsistency(List<IResourceInconsistency> inconsistencyList, ValidationContext context, String message) {
        inconsistencyList.add(new PredicateInconsistency(
                context.getPackage(),
                context.getResource(),
                TranslationPackage.AbstractTranslation_md5,
                message
        ));
    }

    private void logValidationTime(Instant start) {
        long elapsedTime = Duration.between(start, Instant.now()).toMillis();
        if (elapsedTime > VALIDATION_THRESHOLD_MS) {
            Logger.instance().logInfo(String.format("Validation in %s took %d ms", this.getClass().getSimpleName(), elapsedTime));
        }
    }
}
