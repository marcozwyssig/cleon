package cleon.common.resources.spec.language.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;

public class DescriptionInitializationAspect extends AbstractMultiLanguageInitializationAspect {
	@Override
	protected String getTargetLanguage(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		ILanguageDescription description = dynamicResourceRepository.getResource(ILanguageDescription.class, newInstance);
		return description.selectLanguage().selectCode();		
	}

	@Override
	protected String getSourceLanguage(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		ILanguageDescription defaultDescription = getDefaultDescription(dynamicResourceRepository, newInstance);
		return defaultDescription.selectLanguage().selectCode();
	}

	private ILanguageDescription getDefaultDescription(IDynamicResourceRepository dynamicResourceRepository,
			INode newInstance) {
		ILanguageDescription description = dynamicResourceRepository.getResource(ILanguageDescription.class, newInstance);
		IMultilingualDescription multilingualDescription = MultilingualDescription.selectToMeDescription(description);
		ILanguageDescription defaultDescription = multilingualDescription.selectDefaultDescription().values().stream().findFirst().get();
		return defaultDescription;
	}

	@Override
	protected Iterable<String> getSourceText(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		ILanguageDescription defaultDescription = getDefaultDescription(dynamicResourceRepository, newInstance);
		return defaultDescription.selectDescriptions();
	}
}