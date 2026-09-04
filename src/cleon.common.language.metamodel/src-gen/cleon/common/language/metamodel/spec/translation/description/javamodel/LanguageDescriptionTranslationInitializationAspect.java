package cleon.common.language.metamodel.spec.translation.description.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.update.IModifiable;
import cleon.common.language.metamodel.spec.translation.javamodel.AbstractBaseLanguageInitializationAspect;
import cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage;

public class LanguageDescriptionTranslationInitializationAspect extends AbstractBaseLanguageInitializationAspect {
	@Override
	protected void setTargetText(final IModifiable modifiable, final Package pkg, final INode newInstance, final Literal literal) {
		Update.createStatement(modifiable, pkg, newInstance, DescriptionsPackage.SimpleDescription_descriptions, literal);
	}

}