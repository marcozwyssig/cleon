package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.update.IModifiable;
import cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage;

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

	@Override
	protected void setTargetText(IModifiable modifiable, Package pkg, INode newInstance, Literal literal) {
		Update.createStatement(modifiable, pkg, newInstance, DescriptionsPackage.SimpleDescription_descriptions, literal);									
	}
	
	@Override
	protected boolean isDefault(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		ILanguageDescription description = getDefaultDescription(dynamicResourceRepository, newInstance);
		return MultilingualDescription.selectToMeDefaultDescription(description) == null;
	}
	
}