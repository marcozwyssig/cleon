package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NodeSensorMonitoringBuildingBlock extends DynamicResource implements INodeSensorMonitoringBuildingBlock {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INodeSensorMonitoringBuildingBlock> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INodeSensorMonitoringBuildingBlock>() {
    
    @Override
    public INodeSensorMonitoringBuildingBlock create() {
      return new NodeSensorMonitoringBuildingBlock();
    }
    
    @Override
    public INodeSensorMonitoringBuildingBlock create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NodeSensorMonitoringBuildingBlock(resourceRepository, resource);
    }
  
  };

  public NodeSensorMonitoringBuildingBlock() {
    super(INodeSensorMonitoringBuildingBlock.TYPE_ID);
  }
  
  public NodeSensorMonitoringBuildingBlock(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INodeSensorMonitoringBuildingBlock.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock selectBasedOn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.AbstractSensorMonitoringBuildingBlock_basedOn);
  }

  public NodeSensorMonitoringBuildingBlock setBasedOn(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock basedOn) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.AbstractSensorMonitoringBuildingBlock_basedOn, basedOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor> selectSensors() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.AbstractSensorMonitoringBuildingBlock_sensors);
  }

  public NodeSensorMonitoringBuildingBlock setSensors(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor> sensors) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.AbstractSensorMonitoringBuildingBlock_sensors, sensors);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NodeSensorMonitoringBuildingBlock setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.AbstractSensorMonitoringBuildingBlock_basedOn, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.AbstractSensorMonitoringBuildingBlock_sensors, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,df9a2045-e065-11ea-bb83-59933a3fa779,rgnO2VS6k7/G2vLP5H0YULVnZoM=] */
