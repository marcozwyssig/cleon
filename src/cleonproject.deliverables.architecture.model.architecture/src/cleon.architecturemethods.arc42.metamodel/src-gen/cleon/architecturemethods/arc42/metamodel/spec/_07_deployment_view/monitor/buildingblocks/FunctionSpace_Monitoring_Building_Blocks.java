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

    @IDynamicResourceExtension.MethodId("68a82a45-6498-11eb-bcb1-d5dcf010d136")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock> SelectMonitoringBuildingBlocks();

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
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor> SelectAllSingleSensors();

    @IDynamicResourceExtension.MethodId("38557ca6-e085-11ea-bb83-59933a3fa779")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor> SelectAllClusterSensors();

    @IDynamicResourceExtension.MethodId("14d5469b-c764-11ea-9c12-5371f8bad411")
    public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock SelectUsedBuildingBlockForMonitoring();

    @IDynamicResourceExtension.MethodId("be24ca31-08a5-11eb-a18e-c7dfa3f96804")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock> SelectMonitoringBuildingBlock();

    @IDynamicResourceExtension.MethodId("2ec1c20e-d8f1-11eb-b083-d9bf2ecd74ec")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor> SelectAllSensors();

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

  public static interface IexeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9240eff2-dc8d-11ea-a169-cb4c6ff66798")
    public java.lang.String Parameters();

  }
  
  public static interface IexeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class exeFunctionsImpl implements IexeFunctionsImpl {

    public static final IexeFunctionsImpl INSTANCE = new exeFunctionsImpl();

    private exeFunctionsImpl() {}

  }
  
  public static class exeFunctions {

    private exeFunctions() {}

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

  public static interface IhttpFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8abb56c8-dca1-11ea-b5f8-77c3980a1d0a")
    public java.lang.String Parameters();

  }
  
  public static interface IhttpFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class httpFunctionsImpl implements IhttpFunctionsImpl {

    public static final IhttpFunctionsImpl INSTANCE = new httpFunctionsImpl();

    private httpFunctionsImpl() {}

  }
  
  public static class httpFunctions {

    private httpFunctions() {}

  }

  public static interface IwmishareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f41986c0-1cf9-11eb-acd1-95299b344117")
    public java.lang.String Parameters();

    @IDynamicResourceExtension.MethodId("20eac2e0-1cfa-11eb-acd1-95299b344117")
    public java.lang.String ShareName();

  }
  
  public static interface IwmishareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class wmishareFunctionsImpl implements IwmishareFunctionsImpl {

    public static final IwmishareFunctionsImpl INSTANCE = new wmishareFunctionsImpl();

    private wmishareFunctionsImpl() {}

  }
  
  public static class wmishareFunctions {

    private wmishareFunctions() {}

  }

  public static interface IAbstractSensorMonitoringBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("be0747a6-e068-11ea-bb83-59933a3fa779")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock Parent();

    @IDynamicResourceExtension.MethodId("ec15906e-e06b-11ea-bb83-59933a3fa779")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor> SelectAllSensors();

    @IDynamicResourceExtension.MethodId("7996825a-da39-11eb-8ffa-d7727a940bcf")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock Top();

  }
  
  public static interface IAbstractSensorMonitoringBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSensorMonitoringBuildingBlockFunctionsImpl implements IAbstractSensorMonitoringBuildingBlockFunctionsImpl {

    public static final IAbstractSensorMonitoringBuildingBlockFunctionsImpl INSTANCE = new AbstractSensorMonitoringBuildingBlockFunctionsImpl();

    private AbstractSensorMonitoringBuildingBlockFunctionsImpl() {}

  }
  
  public static class AbstractSensorMonitoringBuildingBlockFunctions {

    private AbstractSensorMonitoringBuildingBlockFunctions() {}

  }

  public static interface INodeSensorMonitoringBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("54b81738-e069-11ea-bb83-59933a3fa779")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock Parent();

  }
  
  public static interface INodeSensorMonitoringBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NodeSensorMonitoringBuildingBlockFunctionsImpl implements INodeSensorMonitoringBuildingBlockFunctionsImpl {

    public static final INodeSensorMonitoringBuildingBlockFunctionsImpl INSTANCE = new NodeSensorMonitoringBuildingBlockFunctionsImpl();

    private NodeSensorMonitoringBuildingBlockFunctionsImpl() {}

  }
  
  public static class NodeSensorMonitoringBuildingBlockFunctions {

    private NodeSensorMonitoringBuildingBlockFunctions() {}

  }

  public static interface IClusterSensorMonitoringBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cbbf0e4-e069-11ea-bb83-59933a3fa779")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock Parent();

  }
  
  public static interface IClusterSensorMonitoringBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ClusterSensorMonitoringBuildingBlockFunctionsImpl implements IClusterSensorMonitoringBuildingBlockFunctionsImpl {

    public static final IClusterSensorMonitoringBuildingBlockFunctionsImpl INSTANCE = new ClusterSensorMonitoringBuildingBlockFunctionsImpl();

    private ClusterSensorMonitoringBuildingBlockFunctionsImpl() {}

  }
  
  public static class ClusterSensorMonitoringBuildingBlockFunctions {

    private ClusterSensorMonitoringBuildingBlockFunctions() {}

  }

  public static interface IAbstractMonitoringBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("98533d11-08a5-11eb-a18e-c7dfa3f96804")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock> SelectMonitoringBuildingBlock();

  }
  
  public static interface IAbstractMonitoringBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractMonitoringBuildingBlockFunctionsImpl implements IAbstractMonitoringBuildingBlockFunctionsImpl {

    public static final IAbstractMonitoringBuildingBlockFunctionsImpl INSTANCE = new AbstractMonitoringBuildingBlockFunctionsImpl();

    private AbstractMonitoringBuildingBlockFunctionsImpl() {}

  }
  
  public static class AbstractMonitoringBuildingBlockFunctions {

    private AbstractMonitoringBuildingBlockFunctions() {}

  }

  public static interface IMonitoringCompositeBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d774e3c8-08a5-11eb-a18e-c7dfa3f96804")
    public List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock> SelectMonitoringBuildingBlock();

  }
  
  public static interface IMonitoringCompositeBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MonitoringCompositeBuildingBlockFunctionsImpl implements IMonitoringCompositeBuildingBlockFunctionsImpl {

    public static final IMonitoringCompositeBuildingBlockFunctionsImpl INSTANCE = new MonitoringCompositeBuildingBlockFunctionsImpl();

    private MonitoringCompositeBuildingBlockFunctionsImpl() {}

  }
  
  public static class MonitoringCompositeBuildingBlockFunctions {

    private MonitoringCompositeBuildingBlockFunctions() {}

  }

  public static interface IsnmpcustomstringFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3516d0cb-0c99-11ec-a707-cfc3a993d4d5")
    public java.lang.String Parameters();

  }
  
  public static interface IsnmpcustomstringFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class snmpcustomstringFunctionsImpl implements IsnmpcustomstringFunctionsImpl {

    public static final IsnmpcustomstringFunctionsImpl INSTANCE = new snmpcustomstringFunctionsImpl();

    private snmpcustomstringFunctionsImpl() {}

  }
  
  public static class snmpcustomstringFunctions {

    private snmpcustomstringFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2825a27d-c1f3-11ea-820f-9931558a898c,AHPVoAadgRoEggHufSUhMVFdjhw=] */
