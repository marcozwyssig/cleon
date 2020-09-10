package cleon.common.language.metamodel.spec.javamodel;

import java.util.Arrays;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.update.IModifiable;

public class NameInitializationAspect extends AbstractMultiLanguageInitializationAspect {
	@Override
	protected String getTargetLanguage(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		final ILanguageName name = dynamicResourceRepository.getResource(ILanguageName.class, newInstance);
		return name.selectLanguage().selectCode();		
	}

	@Override
	protected String getSourceLanguage(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		final ILanguageName defaultName = getDefaultName(dynamicResourceRepository, newInstance);
		return defaultName.selectLanguage().selectCode();
	}

	private ILanguageName getDefaultName(IDynamicResourceRepository dynamicResourceRepository,INode newInstance) {
		final ILanguageName name = dynamicResourceRepository.getResource(ILanguageName.class, newInstance);
		final IMultilingualName multilingualName = MultilingualName.selectToMeNames(name);
		return multilingualName.selectDefaultName().values().stream().findFirst().get();
	}

	@Override
	protected Iterable<String> getSourceText(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		final ILanguageName defaultName = getDefaultName(dynamicResourceRepository, newInstance);
		return Arrays.asList(defaultName.selectName());
	}

	@Override
	protected void setTargetText(IModifiable modifiable, Package pkg, INode newInstance, Literal literal) {
		Update.createStatement(modifiable, pkg, newInstance, CorePackage.NamedResource_name, literal);	
	}

}