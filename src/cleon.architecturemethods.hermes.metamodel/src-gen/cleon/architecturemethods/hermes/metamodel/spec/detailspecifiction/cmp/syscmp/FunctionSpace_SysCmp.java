package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[a26bf8a1-059b-11f0-a294-67d88c30f2e4,imports]] */

/* End Protected Region   [[a26bf8a1-059b-11f0-a294-67d88c30f2e4,imports]] */

public class FunctionSpace_SysCmp {

  /* Begin Protected Region [[a26bf8a1-059b-11f0-a294-67d88c30f2e4]] */
  
  /* End Protected Region   [[a26bf8a1-059b-11f0-a294-67d88c30f2e4]] */


  public static interface ISysCmpSpecificationAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("addf2f8d-059b-11f0-a294-67d88c30f2e4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetSystemConfigurations();

    @IDynamicResourceExtension.MethodId("0f4148b3-05a3-11f0-a294-67d88c30f2e4")
    public java.lang.String Folder();

  }
  
  public static interface ISysCmpSpecificationAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCmpSpecificationAwareFunctionsImpl implements ISysCmpSpecificationAwareFunctionsImpl {

    public static final ISysCmpSpecificationAwareFunctionsImpl INSTANCE = new SysCmpSpecificationAwareFunctionsImpl();

    private SysCmpSpecificationAwareFunctionsImpl() {}

  }
  
  public static class SysCmpSpecificationAwareFunctions {

    private SysCmpSpecificationAwareFunctions() {}

  }

  public static interface ISysCmpSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c1e75b91-059b-11f0-a294-67d88c30f2e4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetSystemConfigurations();

    @IDynamicResourceExtension.MethodId("1db6c3ea-d21f-11ee-8171-1959ddc2a1e5")
    public java.lang.String GetComponentPath();

    @IDynamicResourceExtension.MethodId("b1e135fa-05a3-11f0-a294-67d88c30f2e4")
    public java.lang.String Folder();

  }
  
  public static interface ISysCmpSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCmpSpecificationFunctionsImpl implements ISysCmpSpecificationFunctionsImpl {

    public static final ISysCmpSpecificationFunctionsImpl INSTANCE = new SysCmpSpecificationFunctionsImpl();

    private SysCmpSpecificationFunctionsImpl() {}

  }
  
  public static class SysCmpSpecificationFunctions {

    private SysCmpSpecificationFunctions() {}

  }

  public static interface ISysCfgSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5df45a9a-42ed-11ec-905e-258a812affa7")
    public java.lang.String GetSystemComponentName();

    @IDynamicResourceExtension.MethodId("6845a5e7-42ed-11ec-905e-258a812affa7")
    public java.lang.String GetSystemConfigurationName();

  }
  
  public static interface ISysCfgSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgSpecificationFunctionsImpl implements ISysCfgSpecificationFunctionsImpl {

    public static final ISysCfgSpecificationFunctionsImpl INSTANCE = new SysCfgSpecificationFunctionsImpl();

    private SysCfgSpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgSpecificationFunctions {

    private SysCfgSpecificationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,a26bf8a1-059b-11f0-a294-67d88c30f2e4,uiaSAKFuIqM9MXXs3PrIeOCatNU=] */
