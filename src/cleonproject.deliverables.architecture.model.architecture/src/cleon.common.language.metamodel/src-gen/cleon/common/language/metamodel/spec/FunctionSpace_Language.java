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
import cleon.common.language.metamodel.spec.languageClass.LanguageClassPackage;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.INameAspect;
import ch.actifsource.core.model.aspects.impl.SelectOverridableResourceAspectImpl;
import ch.actifsource.util.character.StringUtil;
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

  }
  
  public static interface IMultilingualDescriptionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a441e094-f382-11ea-9268-b5c52a12d7f9")
    public java.lang.String de(final cleon.common.language.metamodel.spec.description.javamodel.IMultilingualDescription multilingualDescription);

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

  }
  
  public static class MultilingualDescriptionFunctions {

    private MultilingualDescriptionFunctions() {}

    public static java.lang.String de(final cleon.common.language.metamodel.spec.description.javamodel.IMultilingualDescription multilingualDescription) {
      return DynamicResourceUtil.invoke(IMultilingualDescriptionFunctionsImpl.class, MultilingualDescriptionFunctionsImpl.INSTANCE, multilingualDescription).de(multilingualDescription);
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

  public static interface ILanguageClassFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8a21d594-c5f0-11ee-a17d-a7a71cc7c14b")
    public java.lang.String simpleName();

  }
  
  public static interface ILanguageClassFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8a21d594-c5f0-11ee-a17d-a7a71cc7c14b")
    public java.lang.String simpleName(final cleon.common.language.metamodel.spec.languageClass.javamodel.ILanguageClass languageClass);

  }
  
  public static class LanguageClassFunctionsImpl implements ILanguageClassFunctionsImpl {

    public static final ILanguageClassFunctionsImpl INSTANCE = new LanguageClassFunctionsImpl();

    private LanguageClassFunctionsImpl() {}

    @Override
    public java.lang.String simpleName(final cleon.common.language.metamodel.spec.languageClass.javamodel.ILanguageClass languageClass) {
      /* Begin Protected Region [[8a21d594-c5f0-11ee-a17d-a7a71cc7c14b]] */
      final var currentLanguageCode = CurrentLanguage.getInstance().LanguageCode();
      if( !currentLanguageCode.equals(languageClass.selectLanguageSettings().selectDefaultLanguage().selectCode())) {
      	final var node = languageClass.getResource();
      	final var aspect = LanguageClassPackage.LanguageClass_DefaultNameAspect;
      	final var nameAspect = Select.aspect(languageClass.getReadJobExecutor(), SelectOverridableResourceAspectImpl.forResource(languageClass.getReadJobExecutor(), aspect, INameAspect.class));

      	return nameAspect == null ? null : StringUtil.firstLine(nameAspect.getSimpleName(languageClass.getReadJobExecutor(), node));
      }
      return "en";

      // XXX implement template function here
      /* End Protected Region   [[8a21d594-c5f0-11ee-a17d-a7a71cc7c14b]] */
    }

  }
  
  public static class LanguageClassFunctions {

    private LanguageClassFunctions() {}

    public static java.lang.String simpleName(final cleon.common.language.metamodel.spec.languageClass.javamodel.ILanguageClass languageClass) {
      return DynamicResourceUtil.invoke(ILanguageClassFunctionsImpl.class, LanguageClassFunctionsImpl.INSTANCE, languageClass).simpleName(languageClass);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7b8a1045-3361-11e8-a9fe-87ba35d8f5c4,v48uvP8dYDgnGs5aoJnBslae4kw=] */
