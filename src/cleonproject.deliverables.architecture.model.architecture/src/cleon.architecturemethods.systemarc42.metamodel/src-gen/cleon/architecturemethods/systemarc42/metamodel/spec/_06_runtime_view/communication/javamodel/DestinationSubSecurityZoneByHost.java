package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DestinationSubSecurityZoneByHost extends DynamicResource implements IDestinationSubSecurityZoneByHost {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDestinationSubSecurityZoneByHost> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDestinationSubSecurityZoneByHost>() {
    
    @Override
    public IDestinationSubSecurityZoneByHost create() {
      return new DestinationSubSecurityZoneByHost();
    }
    
    @Override
    public IDestinationSubSecurityZoneByHost create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DestinationSubSecurityZoneByHost(resourceRepository, resource);
    }
  
  };

  public DestinationSubSecurityZoneByHost() {
    super(IDestinationSubSecurityZoneByHost.TYPE_ID);
  }
  
  public DestinationSubSecurityZoneByHost(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDestinationSubSecurityZoneByHost.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectOverrideDestinationGroupName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZoneByHost_overrideDestinationGroupName);
  }
    
  public void setOverrideDestinationGroupName(java.lang.String overrideDestinationGroupName) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZoneByHost_overrideDestinationGroupName, overrideDestinationGroupName);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectDestinationSecuritySubZone() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZone_destinationSecuritySubZone);
  }

  public DestinationSubSecurityZoneByHost setDestinationSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone destinationSecuritySubZone) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZone_destinationSecuritySubZone, destinationSecuritySubZone);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> selectHasCommunicationFrom() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZone_hasCommunicationFrom);
  }

  public DestinationSubSecurityZoneByHost setHasCommunicationFrom(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> hasCommunicationFrom) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZone_hasCommunicationFrom, hasCommunicationFrom);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface selectInInterface() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZone_inInterface);
  }

  public DestinationSubSecurityZoneByHost setInInterface(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface inInterface) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZone_inInterface, inInterface);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DestinationSubSecurityZoneByHost setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DestinationSubSecurityZoneByHost setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZoneByHost_overrideDestinationGroupName, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZone_destinationSecuritySubZone, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZone_hasCommunicationFrom, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.DestinationSubSecurityZone_inInterface, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2c509b70-b218-11e9-b89e-1728aee30149,dv1hYeM48WzWuilU8sIJB7pvC+M=] */
