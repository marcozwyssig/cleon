package cleon.common.language.metamodel.spec.translation.name.javamodel;

import java.util.Arrays;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.update.IModifiable;
import cleon.common.language.metamodel.spec.FunctionSpace_Language.IAbstractMultilingualFunctions;
import cleon.common.language.metamodel.spec.translation.javamodel.AbstractBaseLanguageInitializationAspect;

public class LanguageNameTranslationInitializationAspect extends AbstractBaseLanguageInitializationAspect {
	private IMultilingualName getDefaultName(final IDynamicResourceRepository dynamicResourceRepository,
			final INode newInstance) {
		final var name = dynamicResourceRepository.getResource(ILanguageNameTranslation.class, newInstance);
		return MultilingualName.selectToMeNameTranslation(name);
	}

	@Override
	protected String getSourceLanguage(final IDynamicResourceRepository dynamicResourceRepository, final INode newInstance) {
		final var multilingualName = getDefaultName(dynamicResourceRepository, newInstance);
		return multilingualName.extension(IAbstractMultilingualFunctions.class).LanguageSettings().selectDefaultLanguage().selectCode();
	}

	@Override
	protected Iterable<String> getSourceText(final IDynamicResourceRepository dynamicResourceRepository, final INode newInstance) {
		return Arrays.asList(getDefaultName(dynamicResourceRepository, newInstance).selectName());
	}

	@Override
	protected String getTargetLanguage(final IDynamicResourceRepository dynamicResourceRepository, final INode newInstance) {
		final var name = dynamicResourceRepository.getResource(ILanguageNameTranslation.class, newInstance);
		return name.selectLanguage().selectCode();
	}

	@Override
	protected void setTargetText(final IModifiable modifiable, final Package pkg, final INode newInstance, final Literal literal) {
		Update.createStatement(modifiable, pkg, newInstance, CorePackage.NamedResource_name, literal);
	}

}