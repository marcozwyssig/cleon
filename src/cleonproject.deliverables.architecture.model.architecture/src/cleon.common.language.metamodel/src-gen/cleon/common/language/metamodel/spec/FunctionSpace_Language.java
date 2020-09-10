package cleon.common.language.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7b8a1045-3361-11e8-a9fe-87ba35d8f5c4,imports]] */
import cleon.common.language.metamodel.spec.instances.InstancesModel;
import cleon.common.language.metamodel.spec.javamodel.ILanguageDescription;
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
    public java.lang.String de(final cleon.common.language.metamodel.spec.javamodel.IMultilingualDescription multilingualDescription);

  }
  
  public static class MultilingualDescriptionFunctionsImpl implements IMultilingualDescriptionFunctionsImpl {

    public static final IMultilingualDescriptionFunctionsImpl INSTANCE = new MultilingualDescriptionFunctionsImpl();

    private MultilingualDescriptionFunctionsImpl() {}

    @Override
    public java.lang.String de(final cleon.common.language.metamodel.spec.javamodel.IMultilingualDescription multilingualDescription) {
      /* Begin Protected Region [[a441e094-f382-11ea-9268-b5c52a12d7f9]] */
      if( multilingualDescription.selectTranslation().containsKey(InstancesModel.de__F___S___F_German)) {
      	final ILanguageDescription description = multilingualDescription.selectTranslation().get(InstancesModel.de__F___S___F_German);
      	return String.join("\n", description.selectDescriptions());
      }
      return null;
      /* End Protected Region   [[a441e094-f382-11ea-9268-b5c52a12d7f9]] */
    }

  }
  
  public static class MultilingualDescriptionFunctions {

    private MultilingualDescriptionFunctions() {}

    public static java.lang.String de(final cleon.common.language.metamodel.spec.javamodel.IMultilingualDescription multilingualDescription) {
      return DynamicResourceUtil.invoke(IMultilingualDescriptionFunctionsImpl.class, MultilingualDescriptionFunctionsImpl.INSTANCE, multilingualDescription).de(multilingualDescription);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7b8a1045-3361-11e8-a9fe-87ba35d8f5c4,pvOtPkLc+/BYF75Fxvn9IIA9cFM=] */
