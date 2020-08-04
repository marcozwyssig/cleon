package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Exexml extends DynamicResource implements IExexml {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExexml> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExexml>() {
    
    @Override
    public IExexml create() {
      return new Exexml();
    }
    
    @Override
    public IExexml create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Exexml(resourceRepository, resource);
    }
  
  };

  public Exexml() {
    super(IExexml.TYPE_ID);
  }
  
  public Exexml(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExexml.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectExeFile() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.exexml_exeFile);
  }
    
  public void setExeFile(java.lang.String exeFile) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.exexml_exeFile, exeFile);
  }

  @Override
  public java.lang.String selectExeParams() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.exexml_exeParams);
  }
    
  public void setExeParams(java.lang.String exeParams) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.exexml_exeParams, exeParams);
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
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.exexml_useWindowsAuthentication);
  }
    
  public void setUseWindowsAuthentication(java.lang.Boolean useWindowsAuthentication) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.exexml_useWindowsAuthentication, useWindowsAuthentication);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Exexml setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.exexml_exeFile, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.exexml_exeParams, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.exexml_useWindowsAuthentication, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db43f2f0-c1eb-11ea-820f-9931558a898c,bQxx5QboLdllcSNSDiHqKXaU8gI=] */
