package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f7e5720e-8bdb-11eb-a832-91f5636963f2,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions;
import java.util.stream.Collectors;

/* End Protected Region   [[f7e5720e-8bdb-11eb-a832-91f5636963f2,imports]] */

public class firewall__T_yaml {

  /* Begin Protected Region [[f7e5720e-8bdb-11eb-a832-91f5636963f2]] */
  
  /* End Protected Region   [[f7e5720e-8bdb-11eb-a832-91f5636963f2]] */


  public static interface IServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f7e57217-8bdb-11eb-a832-91f5636963f2")
    public java.lang.String PolicyName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

  }
  
  public static interface IServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceFunctionsImpl implements IServiceFunctionsImpl {

    public static final IServiceFunctionsImpl INSTANCE = new ServiceFunctionsImpl();

    private ServiceFunctionsImpl() {}

  }
  
  public static class ServiceFunctions {

    private ServiceFunctions() {}

  }

  public static interface IDestinationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4a15ac8e-0674-11ec-b623-f16d27d7978c")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> onlyLinux();

  }
  
  public static interface IDestinationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4a15ac8e-0674-11ec-b623-f16d27d7978c")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> onlyLinux(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList);

  }
  
  public static class DestinationFunctionsImpl implements IDestinationFunctionsImpl {

    public static final IDestinationFunctionsImpl INSTANCE = new DestinationFunctionsImpl();

    private DestinationFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> onlyLinux(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList) {
      /* Begin Protected Region [[4a15ac8e-0674-11ec-b623-f16d27d7978c]] */
    	return destinationList.stream().filter(x -> {
    		var functions = x.selectDestinationSystemConfiguration().extension(ISystemConfigurationFunctions.class);
    		return functions.DependsOnLinux();
    	}).collect(Collectors.toList());
  
      /* End Protected Region   [[4a15ac8e-0674-11ec-b623-f16d27d7978c]] */
    }

  }
  
  public static class DestinationFunctions {

    private DestinationFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> onlyLinux(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList) {
      return DynamicResourceUtil.invoke(IDestinationFunctionsImpl.class, DestinationFunctionsImpl.INSTANCE, destinationList).onlyLinux(destinationList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f7e5720e-8bdb-11eb-a832-91f5636963f2,FyqpMdPV2QChjlIR89k0O6K6SWg=] */
