package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QoSSystemConfigurationSource extends DynamicResource implements IQoSSystemConfigurationSource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoSSystemConfigurationSource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoSSystemConfigurationSource>() {
    
    @Override
    public IQoSSystemConfigurationSource create() {
      return new QoSSystemConfigurationSource();
    }
    
    @Override
    public IQoSSystemConfigurationSource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QoSSystemConfigurationSource(resourceRepository, resource);
    }
  
  };

  public QoSSystemConfigurationSource() {
    super(IQoSSystemConfigurationSource.TYPE_ID);
  }
  
  public QoSSystemConfigurationSource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQoSSystemConfigurationSource.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectEstimateMean_KBits() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_estimateMean_aE_KBits);
  }
    
  public void setEstimateMean_KBits(java.lang.Integer estimateMean_KBits) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_estimateMean_aE_KBits, estimateMean_KBits);
  }

  @Override
  public java.lang.Integer selectEstimate_KBits() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_estimate_aE_KBits);
  }
    
  public void setEstimate_KBits(java.lang.Integer estimate_KBits) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_estimate_aE_KBits, estimate_KBits);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IServiceClass selectServiceClass() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IServiceClass.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_serviceClass);
  }

  public QoSSystemConfigurationSource setServiceClass(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IServiceClass serviceClass) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_serviceClass, serviceClass);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource selectSource() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_source);
  }

  public QoSSystemConfigurationSource setSource(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_source, source);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public QoSSystemConfigurationSource setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QoSSystemConfigurationSource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_estimateMean_aE_KBits, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_estimate_aE_KBits, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IServiceClass.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_serviceClass, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_source, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource> selectToMeSource(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_source, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource> selectToMeServiceClass(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IServiceClass object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSSystemConfigurationSource_serviceClass, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fcc35d62-a0c3-11ea-8daa-afb4679c3497,8Y6qNoGyaLyfWnxJIGRw62f+HBU=] */
