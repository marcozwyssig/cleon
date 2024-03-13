package cleon.common.language.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7b8a1045-3361-11e8-a9fe-87ba35d8f5c4,imports]] */
import cleon.common.language.metamodel.spec.language.InstancesModel;
import cleon.common.language.metamodel.spec.language.LanguagePackage;
import cleon.common.language.metamodel.spec.language.javamodel.CurrentLanguage;
import cleon.common.language.metamodel.spec.language.javamodel.ILanguage;
import cleon.common.language.metamodel.spec.languageClass.LanguageClassPackage;
import cleon.common.language.metamodel.spec.languageClass.javamodel.ILanguageClass;
import cleon.common.language.metamodel.spec.languageClass.javamodel.ILanguageNameAspectTranslation;
import cleon.common.language.metamodel.spec.languageClass.javamodel.ITranslateSimpleNameAspect;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.INameAspect;
import ch.actifsource.core.model.aspects.impl.NameBySelectorAspectImpl;
import ch.actifsource.core.model.aspects.impl.SelectOverridableResourceAspectImpl;
import ch.actifsource.util.character.StringUtil;
import ch.actifsource.util.log.Logger;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.javamodel.IClass;
import ch.actifsource.core.selector.SelectSelectorUtil;
/* End Protected Region   [[7b8a1045-3361-11e8-a9fe-87ba35d8f5c4,imports]] */

public class FunctionSpace_Language {

  /* Begin Protected Region [[7b8a1045-3361-11e8-a9fe-87ba35d8f5c4]] */

  /* End Protected Region   [[7b8a1045-3361-11e8-a9fe-87ba35d8f5c4]] */


  public static interface ILanguageSettingsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("83f97c59-3361-11e8-a9fe-87ba35d8f5c4")
    public java.lang.String formatLanguages();

  }
  
  public static interface ILanguageSettingsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LanguageSettingsFunctionsImpl implements ILanguageSettingsFunctionsImpl {

    public static final ILanguageSettingsFunctionsImpl INSTANCE = new LanguageSettingsFunctionsImpl();

    private LanguageSettingsFunctionsImpl() {}

  }
  
  public static class LanguageSettingsFunctions {

    private LanguageSettingsFunctions() {}

  }

  public static interface IMultilingualDescriptionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a441e094-f382-11ea-9268-b5c52a12d7f9")
    public java.lang.String de();

    @IDynamicResourceExtension.MethodId("3ca8bf73-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String en();

  }
  
  public static interface IMultilingualDescriptionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a441e094-f382-11ea-9268-b5c52a12d7f9")
    public java.lang.String de(final cleon.common.language.metamodel.spec.description.javamodel.IMultilingualDescription multilingualDescription);

    @IDynamicResourceExtension.MethodId("3ca8bf73-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String en(final cleon.common.language.metamodel.spec.description.javamodel.IMultilingualDescription multilingualDescription);

  }
  
  public static class MultilingualDescriptionFunctionsImpl implements IMultilingualDescriptionFunctionsImpl {

    public static final IMultilingualDescriptionFunctionsImpl INSTANCE = new MultilingualDescriptionFunctionsImpl();

    private MultilingualDescriptionFunctionsImpl() {}

    @Override
    public java.lang.String de(final cleon.common.language.metamodel.spec.description.javamodel.IMultilingualDescription multilingualDescription) {
      /* Begin Protected Region [[a441e094-f382-11ea-9268-b5c52a12d7f9]] */
      if( multilingualDescription.selectTranslation().containsKey(InstancesModel.de__F___S___F_German)) {
      	final var description = multilingualDescription.selectTranslation().get(InstancesModel.de__F___S___F_German);
      	return String.join("\n", description.selectDescriptions());
      }
      return null;
      /* End Protected Region   [[a441e094-f382-11ea-9268-b5c52a12d7f9]] */
    }

    @Override
    public java.lang.String en(final cleon.common.language.metamodel.spec.description.javamodel.IMultilingualDescription multilingualDescription) {
      /* Begin Protected Region [[3ca8bf73-d22c-11ee-b255-49ab47716ebd]] */
      if( multilingualDescription.selectTranslation().containsKey(InstancesModel.en__F___S___F_English)) {
      	final var description = multilingualDescription.selectTranslation().get(InstancesModel.en__F___S___F_English);
      	return String.join("\n", description.selectDescriptions());
      }
      return null;
      /* End Protected Region   [[3ca8bf73-d22c-11ee-b255-49ab47716ebd]] */
    }

  }
  
  public static class MultilingualDescriptionFunctions {

    private MultilingualDescriptionFunctions() {}

    public static java.lang.String de(final cleon.common.language.metamodel.spec.description.javamodel.IMultilingualDescription multilingualDescription) {
      return DynamicResourceUtil.invoke(IMultilingualDescriptionFunctionsImpl.class, MultilingualDescriptionFunctionsImpl.INSTANCE, multilingualDescription).de(multilingualDescription);
    }

    public static java.lang.String en(final cleon.common.language.metamodel.spec.description.javamodel.IMultilingualDescription multilingualDescription) {
      return DynamicResourceUtil.invoke(IMultilingualDescriptionFunctionsImpl.class, MultilingualDescriptionFunctionsImpl.INSTANCE, multilingualDescription).en(multilingualDescription);
    }

  }

  public static interface IMultilingualNameFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("47e137a4-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String de();

    @IDynamicResourceExtension.MethodId("47e137a6-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String en();

  }
  
  public static interface IMultilingualNameFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("47e137a4-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String de(final cleon.common.language.metamodel.spec.name.javamodel.IMultilingualName multilingualName);

    @IDynamicResourceExtension.MethodId("47e137a6-d22c-11ee-b255-49ab47716ebd")
    public java.lang.String en(final cleon.common.language.metamodel.spec.name.javamodel.IMultilingualName multilingualName);

  }
  
  public static class MultilingualNameFunctionsImpl implements IMultilingualNameFunctionsImpl {

    public static final IMultilingualNameFunctionsImpl INSTANCE = new MultilingualNameFunctionsImpl();

    private MultilingualNameFunctionsImpl() {}

    @Override
    public java.lang.String de(final cleon.common.language.metamodel.spec.name.javamodel.IMultilingualName multilingualName) {
      /* Begin Protected Region [[47e137a4-d22c-11ee-b255-49ab47716ebd]] */
      if( multilingualName.selectTranslation().containsKey(InstancesModel.de__F___S___F_German)) {
      	final var name = multilingualName.selectTranslation().get(InstancesModel.de__F___S___F_German);
      	return String.join("\n", name.selectName());
      }
      return null;
      /* End Protected Region   [[47e137a4-d22c-11ee-b255-49ab47716ebd]] */
    }

    @Override
    public java.lang.String en(final cleon.common.language.metamodel.spec.name.javamodel.IMultilingualName multilingualName) {
      /* Begin Protected Region [[47e137a6-d22c-11ee-b255-49ab47716ebd]] */
      if( multilingualName.selectTranslation().containsKey(InstancesModel.en__F___S___F_English)) {
      	final var name = multilingualName.selectTranslation().get(InstancesModel.en__F___S___F_English);
      	return String.join("\n", name.selectName());
      }
      return null;
      /* End Protected Region   [[47e137a6-d22c-11ee-b255-49ab47716ebd]] */
    }

  }
  
  public static class MultilingualNameFunctions {

    private MultilingualNameFunctions() {}

    public static java.lang.String de(final cleon.common.language.metamodel.spec.name.javamodel.IMultilingualName multilingualName) {
      return DynamicResourceUtil.invoke(IMultilingualNameFunctionsImpl.class, MultilingualNameFunctionsImpl.INSTANCE, multilingualName).de(multilingualName);
    }

    public static java.lang.String en(final cleon.common.language.metamodel.spec.name.javamodel.IMultilingualName multilingualName) {
      return DynamicResourceUtil.invoke(IMultilingualNameFunctionsImpl.class, MultilingualNameFunctionsImpl.INSTANCE, multilingualName).en(multilingualName);
    }

  }

  public static interface IAbstractMultilingualFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5dc9f105-cd3c-11ec-85c9-011c467ea292")
    public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface IAbstractMultilingualFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractMultilingualFunctionsImpl implements IAbstractMultilingualFunctionsImpl {

    public static final IAbstractMultilingualFunctionsImpl INSTANCE = new AbstractMultilingualFunctionsImpl();

    private AbstractMultilingualFunctionsImpl() {}

  }
  
  public static class AbstractMultilingualFunctions {

    private AbstractMultilingualFunctions() {}

  }

  public static interface IMultilingualNameWithLanguageSettingsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("92a82004-cd42-11ec-85c9-011c467ea292")
    public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface IMultilingualNameWithLanguageSettingsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MultilingualNameWithLanguageSettingsFunctionsImpl implements IMultilingualNameWithLanguageSettingsFunctionsImpl {

    public static final IMultilingualNameWithLanguageSettingsFunctionsImpl INSTANCE = new MultilingualNameWithLanguageSettingsFunctionsImpl();

    private MultilingualNameWithLanguageSettingsFunctionsImpl() {}

  }
  
  public static class MultilingualNameWithLanguageSettingsFunctions {

    private MultilingualNameWithLanguageSettingsFunctions() {}

  }

  public static interface IMultilingualDescriptionWithLanguageSettingsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fccce81d-cd44-11ec-85c9-011c467ea292")
    public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface IMultilingualDescriptionWithLanguageSettingsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MultilingualDescriptionWithLanguageSettingsFunctionsImpl implements IMultilingualDescriptionWithLanguageSettingsFunctionsImpl {

    public static final IMultilingualDescriptionWithLanguageSettingsFunctionsImpl INSTANCE = new MultilingualDescriptionWithLanguageSettingsFunctionsImpl();

    private MultilingualDescriptionWithLanguageSettingsFunctionsImpl() {}

  }
  
  public static class MultilingualDescriptionWithLanguageSettingsFunctions {

    private MultilingualDescriptionWithLanguageSettingsFunctions() {}

  }

  public static interface IAbstractLanguageSettingsAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("41427efa-c5ea-11ee-a17d-a7a71cc7c14b")
    public java.lang.String CurrentLanguageCode();

  }
  
  public static interface IAbstractLanguageSettingsAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("41427efa-c5ea-11ee-a17d-a7a71cc7c14b")
    public java.lang.String CurrentLanguageCode(final cleon.common.language.metamodel.spec.javamodel.IAbstractLanguageSettingsAware abstractLanguageSettingsAware);

  }
  
  public static class AbstractLanguageSettingsAwareFunctionsImpl implements IAbstractLanguageSettingsAwareFunctionsImpl {

    public static final IAbstractLanguageSettingsAwareFunctionsImpl INSTANCE = new AbstractLanguageSettingsAwareFunctionsImpl();

    private AbstractLanguageSettingsAwareFunctionsImpl() {}

    @Override
    public java.lang.String CurrentLanguageCode(final cleon.common.language.metamodel.spec.javamodel.IAbstractLanguageSettingsAware abstractLanguageSettingsAware) {
      /* Begin Protected Region [[41427efa-c5ea-11ee-a17d-a7a71cc7c14b]] */
      return CurrentLanguage.getInstance().LanguageCode();
      /* End Protected Region   [[41427efa-c5ea-11ee-a17d-a7a71cc7c14b]] */
    }

  }
  
  public static class AbstractLanguageSettingsAwareFunctions {

    private AbstractLanguageSettingsAwareFunctions() {}

    public static java.lang.String CurrentLanguageCode(final cleon.common.language.metamodel.spec.javamodel.IAbstractLanguageSettingsAware abstractLanguageSettingsAware) {
      return DynamicResourceUtil.invoke(IAbstractLanguageSettingsAwareFunctionsImpl.class, AbstractLanguageSettingsAwareFunctionsImpl.INSTANCE, abstractLanguageSettingsAware).CurrentLanguageCode(abstractLanguageSettingsAware);
    }

  }

  public static interface IResourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8a21d594-c5f0-11ee-a17d-a7a71cc7c14b")
    public java.lang.String translateSimpleName();

  }
  
  public static interface IResourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8a21d594-c5f0-11ee-a17d-a7a71cc7c14b")
    public java.lang.String translateSimpleName(final ch.actifsource.core.javamodel.IResource resource);

  }
  
  public static class ResourceFunctionsImpl implements IResourceFunctionsImpl {

    public static final IResourceFunctionsImpl INSTANCE = new ResourceFunctionsImpl();

    private ResourceFunctionsImpl() {}

    @Override
    public java.lang.String translateSimpleName(final ch.actifsource.core.javamodel.IResource resource) {
      /* Begin Protected Region [[8a21d594-c5f0-11ee-a17d-a7a71cc7c14b]] */
      // Retrieve the current language code from the system
      final var currentLanguageCode = CurrentLanguage.getInstance().LanguageCode();

      // Determine the shallow type of the resource
      final var shallowType = Select.shallowType(resource.getReadJobExecutor(), resource.getResource());

      // Create a type system and repository to work with resources
      final var typeSystem = TypeSystem.create(resource.getReadJobExecutor());
      final var repository = typeSystem.getResourceRepository();

      // Obtain the language class for the shallow type
      final var languageClass = repository.getResource(ILanguageClass.class, shallowType);

      // Check if the current language is different from the default language
      if (!currentLanguageCode.equals(languageClass.selectLanguageSettings().selectDefaultLanguage().selectCode())) {
      	// Find the translation key for the current language
      	final var languageKey = languageClass.selectTranslations().keySet().stream()
      			.filter(key -> {
      				// Fetch the language resource and compare its code with the current language code
      				final var language = repository.getResource(cleon.common.language.metamodel.spec.language.javamodel.ILanguage.class, key);
      				return language.selectCode().equals(currentLanguageCode);
      			})
      			.findFirst()
      			.orElse(null); // If no match is found, return null

      	// If a language key is found, fetch the corresponding translation
      	if (languageKey != null) {
      		final ILanguageNameAspectTranslation languageTranslation = languageClass.selectTranslations().get(languageKey);
      		final var pack = Select.mainPackage(resource.getReadJobExecutor(), languageTranslation.selectTranslationValue().getResource());
      		if( pack != null) {
      			final var value = SelectSelectorUtil.selectSelectorTextOrNull(
      					resource.getReadJobExecutor(),
      					languageTranslation.selectTranslationValue().getResource(),
      					languageTranslation.getResource());

      			// Return the translation value if it exists
      			if (value != null) {
      				return value;
      			}
      		}
      	}
      }

      // If the default language is used or no translation is found, try to get the simple name aspect translation
      final var declaredAspectImpl = resource.getReadJobExecutor().execute(
      		SelectOverridableResourceAspectImpl.forResource(
      				resource.getReadJobExecutor(),
      				resource.getResource(),
      				ITranslateSimpleNameAspect.class)
      		);

      // If no aspect implementation is declared, return a message
      if (declaredAspectImpl == null) {
      	return "no declaredAspectImpl";
      }

      // Obtain the aspect using the declared aspect implementation
      final var aspect = Select.aspect(
      		resource.getReadJobExecutor(),
      		ITranslateSimpleNameAspect.class,
      		declaredAspectImpl.getPackagedAspectImpl()
      		);

      // Return the simple name translation if the aspect is available, otherwise return a message
      return aspect == null ? "no aspect" : aspect.translateSimpleName(resource.getReadJobExecutor(), resource.getResource());


      /* End Protected Region   [[8a21d594-c5f0-11ee-a17d-a7a71cc7c14b]] */
    }

  }
  
  public static class ResourceFunctions {

    private ResourceFunctions() {}

    public static java.lang.String translateSimpleName(final ch.actifsource.core.javamodel.IResource resource) {
      return DynamicResourceUtil.invoke(IResourceFunctionsImpl.class, ResourceFunctionsImpl.INSTANCE, resource).translateSimpleName(resource);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7b8a1045-3361-11e8-a9fe-87ba35d8f5c4,6fuGL643Gt+U0dRaypg93C0+1aA=] */
