package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SensorExeXml extends DynamicResource implements ISensorExeXml {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISensorExeXml> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISensorExeXml>() {
    
    @Override
    public ISensorExeXml create() {
      return new SensorExeXml();
    }
    
    @Override
    public ISensorExeXml create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SensorExeXml(resourceRepository, resource);
    }
  
  };

  public SensorExeXml() {
    super(ISensorExeXml.TYPE_ID);
  }
  
  public SensorExeXml(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISensorExeXml.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectExeFile() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.SensorExeXml_exeFile);
  }
    
  public void setExeFile(java.lang.String exeFile) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.SensorExeXml_exeFile, exeFile);
  }

  @Override
  public java.lang.String selectExeParams() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.SensorExeXml_exeParams);
  }
    
  public void setExeParams(java.lang.String exeParams) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.SensorExeXml_exeParams, exeParams);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectUseWindowsAuthentication() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.SensorExeXml_useWindowsAuthentication);
  }
    
  public void setUseWindowsAuthentication(java.lang.Boolean useWindowsAuthentication) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.SensorExeXml_useWindowsAuthentication, useWindowsAuthentication);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensorType selectSensorType() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensorType.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.Sensor_sensorType);
  }

  public SensorExeXml setSensorType(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensorType sensorType) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.Sensor_sensorType, sensorType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SensorExeXml setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.SensorExeXml_exeFile, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.SensorExeXml_exeParams, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.SensorExeXml_useWindowsAuthentication, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensorType.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.Sensor_sensorType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c5d4ec6b-cdbd-11ea-8b73-6b1c6b53a7a6,ucWiEN3Ahq2sDDLfVE9DGmye0fY=] */
