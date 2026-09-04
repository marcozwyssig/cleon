package cleon.common.language.metamodel.spec.translation.description.javamodel;

import ch.actifsource.core.job.Update;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import cleon.common.language.metamodel.spec.translation.javamodel.AbstractBaseTranslationValidationAspect;
import cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage;

public class LanguageDescriptionTranslationValidationAspect extends AbstractBaseTranslationValidationAspect {

	@Override
	protected void applyTranslation(final IModifiable modifiable, final ValidationContext context, final String translation) {
		Update.createStatement(modifiable, context.getPackage(), context.getResource() , DescriptionsPackage.SimpleDescription_descriptions, LiteralUtil.create(translation));
	}

	@Override
	protected boolean hasTranslation(final ValidationContext context) {
		final var descpriptionTransation = getRepository(context).getResource(ILanguageDescriptionTranslation.class, context.getResource());
		return descpriptionTransation.selectDescriptions() != null && !descpriptionTransation.selectDescriptions().isEmpty();
	}

}
