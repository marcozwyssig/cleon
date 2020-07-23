package cleon.architecturemethods.systemarc42.metamodel.template.yed;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[21062948-cc3b-11ea-9aba-81170876b0e5,imports]] */

/* End Protected Region   [[21062948-cc3b-11ea-9aba-81170876b0e5,imports]] */

public class System_aE_Architecture_aE_Overview__T_gml {

  /* Begin Protected Region [[21062948-cc3b-11ea-9aba-81170876b0e5]] */

  /* End Protected Region   [[21062948-cc3b-11ea-9aba-81170876b0e5]] */


  public static interface IComponentCompositionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("210650bb-cc3b-11ea-9aba-81170876b0e5")
    public java.lang.String GenerateComponents();

  }
  
  public static interface IComponentCompositionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ComponentCompositionFunctionsImpl implements IComponentCompositionFunctionsImpl {

    public static final IComponentCompositionFunctionsImpl INSTANCE = new ComponentCompositionFunctionsImpl();

    private ComponentCompositionFunctionsImpl() {}

  }
  
  public static class ComponentCompositionFunctions {

    private ComponentCompositionFunctions() {}

  }

  public static interface IGuidFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6")
    public java.lang.Integer id();

  }
  
  public static interface IGuidFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6")
    public java.lang.Integer id(final java.util.UUID guid);

  }
  
  public static class GuidFunctionsImpl implements IGuidFunctionsImpl {

    public static final IGuidFunctionsImpl INSTANCE = new GuidFunctionsImpl();

    private GuidFunctionsImpl() {}

    @Override
    public java.lang.Integer id(final java.util.UUID guid) {
      /* Begin Protected Region [[ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6]] */
      return guid.hashCode();
      /* End Protected Region   [[ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6]] */
    }

  }
  
  public static class GuidFunctions {

    private GuidFunctions() {}

    public static java.lang.Integer id(final java.util.UUID guid) {
      return DynamicResourceUtil.invoke(IGuidFunctionsImpl.class, GuidFunctionsImpl.INSTANCE, guid).id(guid);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,21062948-cc3b-11ea-9aba-81170876b0e5,NhLd5993pdy2lmAhKr1jXJQJfao=] */
