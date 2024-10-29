package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmpcustomadvanced extends DynamicResource implements ISnmpcustomadvanced {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpcustomadvanced> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpcustomadvanced>() {
    
    @Override
    public ISnmpcustomadvanced create() {
      return new Snmpcustomadvanced();
    }
    
    @Override
    public ISnmpcustomadvanced create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmpcustomadvanced(resourceRepository, resource);
    }
  
  };

  public Snmpcustomadvanced() {
    super(ISnmpcustomadvanced.TYPE_ID);
  }
  
  public Snmpcustomadvanced(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpcustomadvanced.TYPE_ID);
  }

  // attributes
  
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpCustomAdvancedChannel> selectSnmpCustomAdvancedChannels() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpCustomAdvancedChannel.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.SnmpcustomadvancedPackage.snmpcustomadvanced_snmpCustomAdvancedChannels);
  }

  public Snmpcustomadvanced setSnmpCustomAdvancedChannels(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpCustomAdvancedChannel> snmpCustomAdvancedChannels) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.SnmpcustomadvancedPackage.snmpcustomadvanced_snmpCustomAdvancedChannels, snmpCustomAdvancedChannels);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmpcustomadvanced setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpCustomAdvancedChannel.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.SnmpcustomadvancedPackage.snmpcustomadvanced_snmpCustomAdvancedChannels, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpcustomadvanced selectToMeSnmpCustomAdvancedChannels(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpCustomAdvancedChannel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel.ISnmpcustomadvanced.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.SnmpcustomadvancedPackage.snmpcustomadvanced_snmpCustomAdvancedChannels, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4b946e-c1eb-11ea-820f-9931558a898c,kdJ6pISKoW0CY3iW6uzkyir1x0Q=] */
