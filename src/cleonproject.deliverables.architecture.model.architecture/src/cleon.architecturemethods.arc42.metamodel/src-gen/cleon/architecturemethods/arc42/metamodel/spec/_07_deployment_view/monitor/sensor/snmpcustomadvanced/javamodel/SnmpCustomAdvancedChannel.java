package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SnmpCustomAdvancedChannel extends DynamicResource implements ISnmpCustomAdvancedChannel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpCustomAdvancedChannel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpCustomAdvancedChannel>() {
    
    @Override
    public ISnmpCustomAdvancedChannel create() {
      return new SnmpCustomAdvancedChannel();
    }
    
    @Override
    public ISnmpCustomAdvancedChannel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SnmpCustomAdvancedChannel(resourceRepository, resource);
    }
  
  };

  public SnmpCustomAdvancedChannel() {
    super(ISnmpCustomAdvancedChannel.TYPE_ID);
  }
  
  public SnmpCustomAdvancedChannel(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpCustomAdvancedChannel.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectOid() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.SnmpcustomadvancedPackage.SnmpCustomAdvancedChannel_oid);
  }
    
  public void setOid(java.lang.String oid) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.SnmpcustomadvancedPackage.SnmpCustomAdvancedChannel_oid, oid);
  }

  @Override
  public java.lang.String selectUsechannel() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.SnmpcustomadvancedPackage.SnmpCustomAdvancedChannel_usechannel);
  }
    
  public void setUsechannel(java.lang.String usechannel) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.SnmpcustomadvancedPackage.SnmpCustomAdvancedChannel_usechannel, usechannel);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SnmpCustomAdvancedChannel setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.SnmpcustomadvancedPackage.SnmpCustomAdvancedChannel_oid, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomadvanced.SnmpcustomadvancedPackage.SnmpCustomAdvancedChannel_usechannel, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3079b7ba-7cda-11eb-8da4-61a512a179fd,yTVbdBiarnhkMlJnt8TyoKzkU1w=] */
