package cleon.common.language.metamodel.spec.translation.name.javamodel;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import cleon.common.language.metamodel.spec.translation.javamodel.AbstractBaseTranslationValidationAspect;

public class LanguageNameTranslationValidationAspect extends AbstractBaseTranslationValidationAspect {

	@Override
	protected void applyTranslation(final IModifiable modifiable, final ValidationContext context, final String translation) {
		Update.createStatement(modifiable, context.getPackage(), context.getResource() , CorePackage.NamedResource_name, LiteralUtil.create(translation));
	}

	@Override
	protected boolean hasTranslation(final ValidationContext context) {
		final var nameTransation = getRepository(context).getResource(ILanguageNameTranslation.class, context.getResource());
		return nameTransation.selectName() != null;
	}

}
