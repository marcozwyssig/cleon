package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.env;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[55bad5a1-059c-11f0-a294-67d88c30f2e4,imports]] */

/* End Protected Region   [[55bad5a1-059c-11f0-a294-67d88c30f2e4,imports]] */

public class FunctionSpace_Env {

  /* Begin Protected Region [[55bad5a1-059c-11f0-a294-67d88c30f2e4]] */
  
  /* End Protected Region   [[55bad5a1-059c-11f0-a294-67d88c30f2e4]] */


  public static interface IEnvironmentSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6434e306-059c-11f0-a294-67d88c30f2e4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetSystemConfigurations();

  }
  
  public static interface IEnvironmentSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnvironmentSpecificationsFunctionsImpl implements IEnvironmentSpecificationsFunctionsImpl {

    public static final IEnvironmentSpecificationsFunctionsImpl INSTANCE = new EnvironmentSpecificationsFunctionsImpl();

    private EnvironmentSpecificationsFunctionsImpl() {}

  }
  
  public static class EnvironmentSpecificationsFunctions {

    private EnvironmentSpecificationsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,55bad5a1-059c-11f0-a294-67d88c30f2e4,ns3iFbRIro1JCP1z9LhRkZ7/QmY=] */
