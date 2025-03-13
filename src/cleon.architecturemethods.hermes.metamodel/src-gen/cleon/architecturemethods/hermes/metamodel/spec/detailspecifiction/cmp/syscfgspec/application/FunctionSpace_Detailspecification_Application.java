package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.application;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d598b535-c9f1-11ee-953e-1bc687172a5b,imports]] */

/* End Protected Region   [[d598b535-c9f1-11ee-953e-1bc687172a5b,imports]] */

public class FunctionSpace_Detailspecification_Application {

  /* Begin Protected Region [[d598b535-c9f1-11ee-953e-1bc687172a5b]] */
  
  /* End Protected Region   [[d598b535-c9f1-11ee-953e-1bc687172a5b]] */


  public static interface ISysCfgAppCategorySpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e27e1930-c9f1-11ee-953e-1bc687172a5b")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration SysCfg();

    @IDynamicResourceExtension.MethodId("4b3f278c-c9f3-11ee-953e-1bc687172a5b")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.javamodel.IEnvironment Env();

  }
  
  public static interface ISysCfgAppCategorySpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgAppCategorySpecificationFunctionsImpl implements ISysCfgAppCategorySpecificationFunctionsImpl {

    public static final ISysCfgAppCategorySpecificationFunctionsImpl INSTANCE = new SysCfgAppCategorySpecificationFunctionsImpl();

    private SysCfgAppCategorySpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgAppCategorySpecificationFunctions {

    private SysCfgAppCategorySpecificationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d598b535-c9f1-11ee-953e-1bc687172a5b,+baoLit8YGkjhZ3Q6XLRwOvi5jM=] */
