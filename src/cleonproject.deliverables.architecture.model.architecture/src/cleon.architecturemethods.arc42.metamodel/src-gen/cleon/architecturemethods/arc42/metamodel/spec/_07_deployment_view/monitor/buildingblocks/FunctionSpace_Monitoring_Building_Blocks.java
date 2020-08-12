package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2825a27d-c1f3-11ea-820f-9931558a898c,imports]] */

/* End Protected Region   [[2825a27d-c1f3-11ea-820f-9931558a898c,imports]] */

public class FunctionSpace_Monitoring_Building_Blocks {

  /* Begin Protected Region [[2825a27d-c1f3-11ea-820f-9931558a898c]] */
  
  /* End Protected Region   [[2825a27d-c1f3-11ea-820f-9931558a898c]] */


  public static interface IMonitoringBuildingBlocksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4b90dd9c-c1f3-11ea-820f-9931558a898c")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> SelectMonitorBuildingBlocks();

  }
  
  public static interface IMonitoringBuildingBlocksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MonitoringBuildingBlocksFunctionsImpl implements IMonitoringBuildingBlocksFunctionsImpl {

    public static final IMonitoringBuildingBlocksFunctionsImpl INSTANCE = new MonitoringBuildingBlocksFunctionsImpl();

    private MonitoringBuildingBlocksFunctionsImpl() {}

  }
  
  public static class MonitoringBuildingBlocksFunctions {

    private MonitoringBuildingBlocksFunctions() {}

  }

  public static interface IMonitoringBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("49ebdce4-c740-11ea-9c12-5371f8bad411")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor> SelectAllSensors();

    @IDynamicResourceExtension.MethodId("14d5469b-c764-11ea-9c12-5371f8bad411")
    public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock SelectUsedBuildingBlockForMonitoring();

  }
  
  public static interface IMonitoringBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MonitoringBuildingBlockFunctionsImpl implements IMonitoringBuildingBlockFunctionsImpl {

    public static final IMonitoringBuildingBlockFunctionsImpl INSTANCE = new MonitoringBuildingBlockFunctionsImpl();

    private MonitoringBuildingBlockFunctionsImpl() {}

  }
  
  public static class MonitoringBuildingBlockFunctions {

    private MonitoringBuildingBlockFunctions() {}

  }

  public static interface ISensorFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ef2cd084-c764-11ea-9c12-5371f8bad411")
    public java.lang.String Parameters();

  }
  
  public static interface ISensorFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SensorFunctionsImpl implements ISensorFunctionsImpl {

    public static final ISensorFunctionsImpl INSTANCE = new SensorFunctionsImpl();

    private SensorFunctionsImpl() {}

  }
  
  public static class SensorFunctions {

    private SensorFunctions() {}

  }

  public static interface IwmiserviceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f79c8af5-c764-11ea-9c12-5371f8bad411")
    public java.lang.String Parameters();

  }
  
  public static interface IwmiserviceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class wmiserviceFunctionsImpl implements IwmiserviceFunctionsImpl {

    public static final IwmiserviceFunctionsImpl INSTANCE = new wmiserviceFunctionsImpl();

    private wmiserviceFunctionsImpl() {}

  }
  
  public static class wmiserviceFunctions {

    private wmiserviceFunctions() {}

  }

  public static interface IexexmlFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9240eff2-dc8d-11ea-a169-cb4c6ff66798")
    public java.lang.String Parameters();

  }
  
  public static interface IexexmlFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class exexmlFunctionsImpl implements IexexmlFunctionsImpl {

    public static final IexexmlFunctionsImpl INSTANCE = new exexmlFunctionsImpl();

    private exexmlFunctionsImpl() {}

  }
  
  public static class exexmlFunctions {

    private exexmlFunctions() {}

  }

  public static interface IrestcustomFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9240f032-dc8d-11ea-a169-cb4c6ff66798")
    public java.lang.String Parameters();

  }
  
  public static interface IrestcustomFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class restcustomFunctionsImpl implements IrestcustomFunctionsImpl {

    public static final IrestcustomFunctionsImpl INSTANCE = new restcustomFunctionsImpl();

    private restcustomFunctionsImpl() {}

  }
  
  public static class restcustomFunctions {

    private restcustomFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2825a27d-c1f3-11ea-820f-9931558a898c,pS7rsvcaon72IlcMN0/aBkqb6ms=] */
