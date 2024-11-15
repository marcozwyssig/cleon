package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.update.IModifiable;
import cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage;
import cleon.common.language.metamodel.spec.translation.javamodel.AbstractBaseLanguageInitializationAspect;

public class LanguageTextTranslationInitializationAspect extends AbstractBaseLanguageInitializationAspect {

	@Override
	protected void setTargetText(final IModifiable modifiable, final Package pkg, final INode newInstance, final Literal literal) {
		Update.createStatement(modifiable, pkg, newInstance, ParagraphPackage.LanguageTextTranslation_text, literal);
	}

}