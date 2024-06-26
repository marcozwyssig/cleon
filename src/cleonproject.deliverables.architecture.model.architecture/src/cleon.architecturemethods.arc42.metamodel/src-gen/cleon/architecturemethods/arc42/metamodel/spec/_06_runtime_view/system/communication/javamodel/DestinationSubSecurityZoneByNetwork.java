package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DestinationSubSecurityZoneByNetwork extends DynamicResource implements IDestinationSubSecurityZoneByNetwork {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDestinationSubSecurityZoneByNetwork> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDestinationSubSecurityZoneByNetwork>() {
    
    @Override
    public IDestinationSubSecurityZoneByNetwork create() {
      return new DestinationSubSecurityZoneByNetwork();
    }
    
    @Override
    public IDestinationSubSecurityZoneByNetwork create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DestinationSubSecurityZoneByNetwork(resourceRepository, resource);
    }
  
  };

  public DestinationSubSecurityZoneByNetwork() {
    super(IDestinationSubSecurityZoneByNetwork.TYPE_ID);
  }
  
  public DestinationSubSecurityZoneByNetwork(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDestinationSubSecurityZoneByNetwork.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectOverrideDestinationGroupName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_overrideDestinationGroupName);
  }
    
  public void setOverrideDestinationGroupName(java.lang.String overrideDestinationGroupName) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_overrideDestinationGroupName, overrideDestinationGroupName);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectDestinationSecuritySubZone() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_destinationSecuritySubZone);
  }

  public DestinationSubSecurityZoneByNetwork setDestinationSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone destinationSecuritySubZone) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_destinationSecuritySubZone, destinationSecuritySubZone);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource> selectHasCommunicationFrom() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_hasCommunicationFrom);
  }

  public DestinationSubSecurityZoneByNetwork setHasCommunicationFrom(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource> hasCommunicationFrom) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_hasCommunicationFrom, hasCommunicationFrom);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationInterface selectInInterface() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationInterface.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_inInterface);
  }

  public DestinationSubSecurityZoneByNetwork setInInterface(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationInterface inInterface) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_inInterface, inInterface);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DestinationSubSecurityZoneByNetwork setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DestinationSubSecurityZoneByNetwork setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_overrideDestinationGroupName, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_destinationSecuritySubZone, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_hasCommunicationFrom, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationInterface.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.DestinationSubSecurityZone_inInterface, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,61856e2e-5537-11ed-a5a9-572b13f613fe,+oEuYibvaDKDa8Y4gz/H7DgUB0w=] */
