package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Threshold extends DynamicResource implements IThreshold {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IThreshold> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IThreshold>() {
    
    @Override
    public IThreshold create() {
      return new Threshold();
    }
    
    @Override
    public IThreshold create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Threshold(resourceRepository, resource);
    }
  
  };

  public Threshold() {
    super(IThreshold.TYPE_ID);
  }
  
  public Threshold(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IThreshold.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectThreshold() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.DevicebehaviourPackage.Threshold_threshold);
  }
    
  public void setThreshold(java.lang.String threshold) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.DevicebehaviourPackage.Threshold_threshold, threshold);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Threshold setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.DevicebehaviourPackage.Threshold_threshold, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,894657d9-8f34-11e8-90f3-6f51c1a0b373,jK9H8q4/cpbuYdrK3TxzMtSv7Nk=] */
