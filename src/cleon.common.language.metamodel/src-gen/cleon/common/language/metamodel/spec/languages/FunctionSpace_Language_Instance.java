package cleon.common.language.metamodel.spec.languages;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ef3c5f23-a0f4-11ef-9443-0b421a1b8616,imports]] */

/* End Protected Region   [[ef3c5f23-a0f4-11ef-9443-0b421a1b8616,imports]] */

public class FunctionSpace_Language_Instance {

  /* Begin Protected Region [[ef3c5f23-a0f4-11ef-9443-0b421a1b8616]] */
  
  /* End Protected Region   [[ef3c5f23-a0f4-11ef-9443-0b421a1b8616]] */


  public static interface ILanguageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f8b23eaa-a0f4-11ef-9443-0b421a1b8616")
    public java.lang.Boolean isEn();

    @IDynamicResourceExtension.MethodId("5373951c-a0f5-11ef-9443-0b421a1b8616")
    public java.lang.Boolean isDe();

  }
  
  public static interface ILanguageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f8b23eaa-a0f4-11ef-9443-0b421a1b8616")
    public java.lang.Boolean isEn(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("5373951c-a0f5-11ef-9443-0b421a1b8616")
    public java.lang.Boolean isDe(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static class LanguageFunctionsImpl implements ILanguageFunctionsImpl {

    public static final ILanguageFunctionsImpl INSTANCE = new LanguageFunctionsImpl();

    private LanguageFunctionsImpl() {}

    @Override
    public java.lang.Boolean isEn(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language) {
      /* Begin Protected Region [[f8b23eaa-a0f4-11ef-9443-0b421a1b8616]] */
    	return language.getResource().equals(InstancesModel.en__F___S___F_English);  
      /* End Protected Region   [[f8b23eaa-a0f4-11ef-9443-0b421a1b8616]] */
    }

    @Override
    public java.lang.Boolean isDe(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language) {
      /* Begin Protected Region [[5373951c-a0f5-11ef-9443-0b421a1b8616]] */
    	return language.getResource().equals(InstancesModel.de__F___S___F_German);  
      /* End Protected Region   [[5373951c-a0f5-11ef-9443-0b421a1b8616]] */
    }

  }
  
  public static class LanguageFunctions {

    private LanguageFunctions() {}

    public static java.lang.Boolean isEn(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language) {
      return DynamicResourceUtil.invoke(ILanguageFunctionsImpl.class, LanguageFunctionsImpl.INSTANCE, language).isEn(language);
    }

    public static java.lang.Boolean isDe(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language) {
      return DynamicResourceUtil.invoke(ILanguageFunctionsImpl.class, LanguageFunctionsImpl.INSTANCE, language).isDe(language);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ef3c5f23-a0f4-11ef-9443-0b421a1b8616,q5RwP+7SnwS8Kmd1QKDIFizrrok=] */
