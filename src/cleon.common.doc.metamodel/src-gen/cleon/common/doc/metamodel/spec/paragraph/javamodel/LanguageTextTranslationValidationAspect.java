package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.core.job.Update;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage;
import cleon.common.language.metamodel.spec.translation.javamodel.AbstractBaseTranslationValidationAspect;

public class LanguageTextTranslationValidationAspect extends AbstractBaseTranslationValidationAspect {

	@Override
	protected void applyTranslation(final IModifiable modifiable, final ValidationContext context, final String translation) {
		Update.createStatement(modifiable, context.getPackage(), context.getResource(), ParagraphPackage.LanguageTextTranslation_text, LiteralUtil.create(translation));
	}

	@Override
	protected boolean hasTranslation(final ValidationContext context) {
		final var textTransation = getRepository(context).getResource(ILanguageTextTranslation.class, context.getResource());
		return textTransation.selectText() != null;
	}

}
