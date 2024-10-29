package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Ping extends DynamicResource implements IPing {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPing> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPing>() {
    
    @Override
    public IPing create() {
      return new Ping();
    }
    
    @Override
    public IPing create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Ping(resourceRepository, resource);
    }
  
  };

  public Ping() {
    super(IPing.TYPE_ID);
  }
  
  public Ping(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPing.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAddress() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.ping_address);
  }
    
  public void setAddress(java.lang.String address) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.ping_address, address);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectInterval_aE__aA_s_aC_() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_);
  }
    
  public void setInterval_aE__aA_s_aC_(java.lang.Integer interval_aE__aA_s_aC_) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_, interval_aE__aA_s_aC_);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Ping setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.ping_address, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db488738-c1eb-11ea-820f-9931558a898c,oNUaGbA0R2HPl1uD6QeOsLa9cKg=] */
