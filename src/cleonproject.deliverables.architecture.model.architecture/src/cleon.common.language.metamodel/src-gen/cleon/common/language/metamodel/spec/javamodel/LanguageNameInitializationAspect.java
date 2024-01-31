package cleon.common.language.metamodel.spec.javamodel;

import java.util.Arrays;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.update.IModifiable;
import cleon.common.language.metamodel.spec.FunctionSpace_Language.IAbstractMultilingualFunctions;

public class LanguageNameInitializationAspect extends AbstractMultiLanguageInitializationAspect {
	@Override
	protected String getTargetLanguage(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		final var name = dynamicResourceRepository.getResource(ILanguageNameTranslation.class, newInstance);
		return name.selectLanguage().selectCode();
	}

	@Override
	protected String getSourceLanguage(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		final var multilingualName = getDefaultName(dynamicResourceRepository, newInstance);
		return multilingualName.extension(IAbstractMultilingualFunctions.class).LanguageSettings().selectDefaultLanguage().selectCode();
	}

	private IMultilingualName getDefaultName(IDynamicResourceRepository dynamicResourceRepository,
			INode newInstance) {
		final var name = dynamicResourceRepository.getResource(ILanguageNameTranslation.class, newInstance);
		return MultilingualName.selectToMeNames(name);
	}

	@Override
	protected Iterable<String> getSourceText(IDynamicResourceRepository dynamicResourceRepository, INode newInstance) {
		return Arrays.asList(getDefaultName(dynamicResourceRepository, newInstance).selectName());
	}

	@Override
	protected void setTargetText(IModifiable modifiable, Package pkg, INode newInstance, Literal literal) {
		Update.createStatement(modifiable, pkg, newInstance, CorePackage.NamedResource_name, literal);
	}

}