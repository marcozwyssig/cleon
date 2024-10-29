package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fc6c724e-87f7-11ec-894d-7968efa38b99,imports]] */

/* End Protected Region   [[fc6c724e-87f7-11ec-894d-7968efa38b99,imports]] */

public class FunctionSpace_MachineConfiguration {

  /* Begin Protected Region [[fc6c724e-87f7-11ec-894d-7968efa38b99]] */
  
  /* End Protected Region   [[fc6c724e-87f7-11ec-894d-7968efa38b99]] */


  public static interface ICPU_ConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0fcc5061-87f8-11ec-894d-7968efa38b99")
    public java.lang.Integer Cpu();

    @IDynamicResourceExtension.MethodId("1f73bb72-87f8-11ec-894d-7968efa38b99")
    public java.lang.Integer Core();

  }
  
  public static interface ICPU_ConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CPU_ConfigurationFunctionsImpl implements ICPU_ConfigurationFunctionsImpl {

    public static final ICPU_ConfigurationFunctionsImpl INSTANCE = new CPU_ConfigurationFunctionsImpl();

    private CPU_ConfigurationFunctionsImpl() {}

  }
  
  public static class CPU_ConfigurationFunctions {

    private CPU_ConfigurationFunctions() {}

  }

  public static interface IMemory_ConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4e92697c-87f8-11ec-894d-7968efa38b99")
    public java.lang.Integer MemoryGB();

  }
  
  public static interface IMemory_ConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Memory_ConfigurationFunctionsImpl implements IMemory_ConfigurationFunctionsImpl {

    public static final IMemory_ConfigurationFunctionsImpl INSTANCE = new Memory_ConfigurationFunctionsImpl();

    private Memory_ConfigurationFunctionsImpl() {}

  }
  
  public static class Memory_ConfigurationFunctions {

    private Memory_ConfigurationFunctions() {}

  }

  public static interface IDisk_ConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e07a18db-87f8-11ec-894d-7968efa38b99")
    public java.lang.Integer CapacityGB();

    @IDynamicResourceExtension.MethodId("f55f868b-87f8-11ec-894d-7968efa38b99")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDiskType StorageFormat();

  }
  
  public static interface IDisk_ConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Disk_ConfigurationFunctionsImpl implements IDisk_ConfigurationFunctionsImpl {

    public static final IDisk_ConfigurationFunctionsImpl INSTANCE = new Disk_ConfigurationFunctionsImpl();

    private Disk_ConfigurationFunctionsImpl() {}

  }
  
  public static class Disk_ConfigurationFunctions {

    private Disk_ConfigurationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fc6c724e-87f7-11ec-894d-7968efa38b99,hbKpYWr1S7ZqNEIseuA0oyNN5C8=] */
