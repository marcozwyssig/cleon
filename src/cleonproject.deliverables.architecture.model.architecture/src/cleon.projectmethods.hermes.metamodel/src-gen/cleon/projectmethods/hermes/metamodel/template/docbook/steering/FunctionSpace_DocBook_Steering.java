package cleon.projectmethods.hermes.metamodel.template.docbook.steering;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[64d352e5-1e05-11e7-882a-cdd93aa926f8,imports]] */

/* End Protected Region   [[64d352e5-1e05-11e7-882a-cdd93aa926f8,imports]] */

public class FunctionSpace_DocBook_Steering {

  /* Begin Protected Region [[64d352e5-1e05-11e7-882a-cdd93aa926f8]] */
  
  /* End Protected Region   [[64d352e5-1e05-11e7-882a-cdd93aa926f8]] */


  public static interface IRisksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b828fc88-2b4a-11eb-863c-b9f41a0a3f06")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRisksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RisksFunctionsImpl implements IRisksFunctionsImpl {

    public static final IRisksFunctionsImpl INSTANCE = new RisksFunctionsImpl();

    private RisksFunctionsImpl() {}

  }
  
  public static class RisksFunctions {

    private RisksFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,64d352e5-1e05-11e7-882a-cdd93aa926f8,Iz6Ejy70H+mIQmDQkvDXvONzpUw=] */
