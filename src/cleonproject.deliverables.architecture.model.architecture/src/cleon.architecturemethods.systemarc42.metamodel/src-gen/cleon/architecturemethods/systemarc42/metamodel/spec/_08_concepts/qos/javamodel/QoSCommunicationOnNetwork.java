package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QoSCommunicationOnNetwork extends DynamicResource implements IQoSCommunicationOnNetwork {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoSCommunicationOnNetwork> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoSCommunicationOnNetwork>() {
    
    @Override
    public IQoSCommunicationOnNetwork create() {
      return new QoSCommunicationOnNetwork();
    }
    
    @Override
    public IQoSCommunicationOnNetwork create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QoSCommunicationOnNetwork(resourceRepository, resource);
    }
  
  };

  public QoSCommunicationOnNetwork() {
    super(IQoSCommunicationOnNetwork.TYPE_ID);
  }
  
  public QoSCommunicationOnNetwork(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQoSCommunicationOnNetwork.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone selectSourceInSubSecurityZone() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSCommunicationOnNetwork_sourceInSubSecurityZone);
  }

  public QoSCommunicationOnNetwork setSourceInSubSecurityZone(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSCommunicationOnNetwork_sourceInSubSecurityZone, sourceInSubSecurityZone);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public QoSCommunicationOnNetwork setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork selectTransportNetwork() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSCommunicationOnNetwork_transportNetwork);
  }

  public QoSCommunicationOnNetwork setTransportNetwork(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNetwork) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSCommunicationOnNetwork_transportNetwork, transportNetwork);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QoSCommunicationOnNetwork setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSCommunicationOnNetwork_sourceInSubSecurityZone, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSCommunicationOnNetwork_transportNetwork, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork> selectToMeTransportNetwork(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSCommunicationOnNetwork_transportNetwork, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork> selectToMeSourceInSubSecurityZone(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSCommunicationOnNetwork_sourceInSubSecurityZone, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e97fa7d3-fe9d-11eb-bbec-6b945b7259b1,lKa0rLvZrPR7QlVcIPXTr0PqgBI=] */
