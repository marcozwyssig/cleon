package cleon.common.language.metamodel.spec.translation.description.javamodel;

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
	private IMultilingualDescription getDefaultDescription(final IDynamicResourceRepository dynamicResourceRepository,
			final INode newInstance) {
		final var description = dynamicResourceRepository.getResource(ILanguageDescriptionTranslation.class, newInstance);
		return MultilingualDescription.selectToMeDescriptionTranslation(description);
	}

	@Override
	protected String getSourceLanguage(final IDynamicResourceRepository dynamicResourceRepository, final INode newInstance) {
		final var multilingualDescription = getDefaultDescription(dynamicResourceRepository, newInstance);
		return multilingualDescription.extension(IAbstractMultilingualFunctions.class).LanguageSettings().selectDefaultLanguage().selectCode();
	}

	@Override
	protected Iterable<String> getSourceText(final IDynamicResourceRepository dynamicResourceRepository, final INode newInstance) {
		return getDefaultDescription(dynamicResourceRepository, newInstance).selectDescriptions();
	}

	@Override
	protected String getTargetLanguage(final IDynamicResourceRepository dynamicResourceRepository, final INode newInstance) {
		final var description = dynamicResourceRepository.getResource(ILanguageDescriptionTranslation.class, newInstance);
		return description.selectLanguage().selectCode();
	}

	@Override
	protected void setTargetText(final IModifiable modifiable, final Package pkg, final INode newInstance, final Literal literal) {
		Update.createStatement(modifiable, pkg, newInstance, DescriptionsPackage.SimpleDescription_descriptions, literal);
	}

}