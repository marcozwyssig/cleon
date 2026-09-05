package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[bfec6549-52a4-11f0-9b60-9f3150c7f92b,imports]] */

/* End Protected Region   [[bfec6549-52a4-11f0-9b60-9f3150c7f92b,imports]] */

public class FunctionSpace_SysCfgSpec {

  /* Begin Protected Region [[bfec6549-52a4-11f0-9b60-9f3150c7f92b]] */
  
  /* End Protected Region   [[bfec6549-52a4-11f0-9b60-9f3150c7f92b]] */


  public static interface IAbstractListOfSysCfgCategorySpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4c4ab053-52a5-11f0-9b60-9f3150c7f92b")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration SysCfg();

    @IDynamicResourceExtension.MethodId("0a4d66b1-5327-11f0-8fbb-ff2ccb392c9c")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> Hosts();

  }
  
  public static interface IAbstractListOfSysCfgCategorySpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractListOfSysCfgCategorySpecificationFunctionsImpl implements IAbstractListOfSysCfgCategorySpecificationFunctionsImpl {

    public static final IAbstractListOfSysCfgCategorySpecificationFunctionsImpl INSTANCE = new AbstractListOfSysCfgCategorySpecificationFunctionsImpl();

    private AbstractListOfSysCfgCategorySpecificationFunctionsImpl() {}

  }
  
  public static class AbstractListOfSysCfgCategorySpecificationFunctions {

    private AbstractListOfSysCfgCategorySpecificationFunctions() {}

  }

  public static interface IHostSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a088da31-52a5-11f0-9b60-9f3150c7f92b")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration SysCfg();

    @IDynamicResourceExtension.MethodId("2ad24ae3-5327-11f0-8fbb-ff2ccb392c9c")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> Hosts();

  }
  
  public static interface IHostSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HostSpecificationFunctionsImpl implements IHostSpecificationFunctionsImpl {

    public static final IHostSpecificationFunctionsImpl INSTANCE = new HostSpecificationFunctionsImpl();

    private HostSpecificationFunctionsImpl() {}

  }
  
  public static class HostSpecificationFunctions {

    private HostSpecificationFunctions() {}

  }

  public static interface ISysCfgSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("adc8ba33-52a5-11f0-9b60-9f3150c7f92b")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration SysCfg();

    @IDynamicResourceExtension.MethodId("e73538cf-5327-11f0-8fbb-ff2ccb392c9c")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> Hosts();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,bfec6549-52a4-11f0-9b60-9f3150c7f92b,zvw/QWnZgfWtTfXKF6I2/m1t/Ag=] */
