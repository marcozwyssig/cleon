package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel;

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
  public java.lang.Integer selectEstimateMean_aE__aA_KB_aE_s_aC_() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_estimateMean_aE__aA_KB_aE_s_aC_);
  }
    
  public void setEstimateMean_aE__aA_KB_aE_s_aC_(java.lang.Integer estimateMean_aE__aA_KB_aE_s_aC_) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_estimateMean_aE__aA_KB_aE_s_aC_, estimateMean_aE__aA_KB_aE_s_aC_);
  }

  @Override
  public java.lang.Integer selectLoaddistribution_aE__aA___K__aC_() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_loaddistribution_aE__aA___K__aC_);
  }
    
  public void setLoaddistribution_aE__aA___K__aC_(java.lang.Integer loaddistribution_aE__aA___K__aC_) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_loaddistribution_aE__aA___K__aC_, loaddistribution_aE__aA___K__aC_);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork> selectCommunicationOnNetwork() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_communicationOnNetwork);
  }

  public QoSSystemConfigurationSource setCommunicationOnNetwork(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork> communicationOnNetwork) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_communicationOnNetwork, communicationOnNetwork);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IDSCP selectServiceClass() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IDSCP.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.ServiceClassAware_serviceClass);
  }

  public QoSSystemConfigurationSource setServiceClass(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IDSCP serviceClass) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.ServiceClassAware_serviceClass, serviceClass);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource selectSource() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_source);
  }

  public QoSSystemConfigurationSource setSource(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource source) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_source, source);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSpecifcServiceClass> selectSpecifcServiceClass() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSpecifcServiceClass.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_specifcServiceClass);
  }

  public QoSSystemConfigurationSource setSpecifcServiceClass(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSpecifcServiceClass> specifcServiceClass) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_specifcServiceClass, specifcServiceClass);
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
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_estimateMean_aE__aA_KB_aE_s_aC_, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_loaddistribution_aE__aA___K__aC_, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_communicationOnNetwork, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IDSCP.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.ServiceClassAware_serviceClass, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_source, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSpecifcServiceClass.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_specifcServiceClass, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource> selectToMeSource(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_source, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource selectToMeCommunicationOnNetwork(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_communicationOnNetwork, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource selectToMeSpecifcServiceClass(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSpecifcServiceClass object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSystemConfigurationSource_specifcServiceClass, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fcc35d62-a0c3-11ea-8daa-afb4679c3497,xsLP7ICtLdjlmY9Rdg6DbWqOMnA=] */
