package cleon.common.language.metamodel.spec.description.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.update.IModifiable;
import cleon.common.language.metamodel.spec.FunctionSpace_Language.IAbstractMultilingualFunctions;
import cleon.common.language.metamodel.spec.javamodel.AbstractMultiLanguageInitializationAspect;
import cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage;

public class LanguageDescriptionInitializationAspect extends AbstractMultiLanguageInitializationAspect {
	@Override
	protected String getTargetLanguage(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		final var description = dynamicResourceRepository.getResource(ILanguageDescriptionTranslation.class, newInstance);
		return description.selectLanguage().selectCode();
	}

	@Override
	protected String getSourceLanguage(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		final var multilingualDescription = getDefaultDescription(dynamicResourceRepository, newInstance);
		return multilingualDescription.extension(IAbstractMultilingualFunctions.class).LanguageSettings().selectDefaultLanguage().selectCode();
	}

	private IMultilingualDescription getDefaultDescription(IDynamicResourceRepository dynamicResourceRepository,
			INode newInstance) {
		final var description = dynamicResourceRepository.getResource(ILanguageDescriptionTranslation.class, newInstance);
		return MultilingualDescription.selectToMeTranslation(description);
	}

	@Override
	protected Iterable<String> getSourceText(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		return getDefaultDescription(dynamicResourceRepository, newInstance).selectDescriptions();
	}

	@Override
	protected void setTargetText(IModifiable modifiable, Package pkg, INode newInstance, Literal literal) {
		Update.createStatement(modifiable, pkg, newInstance, DescriptionsPackage.SimpleDescription_descriptions, literal);
	}

}