package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Interface extends DynamicResource implements IInterface {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterface> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterface>() {
    
    @Override
    public IInterface create() {
      return new Interface();
    }
    
    @Override
    public IInterface create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Interface(resourceRepository, resource);
    }
  
  };

  public Interface() {
    super(IInterface.TYPE_ID);
  }
  
  public Interface(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInterface.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectVlan() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_vlan);
  }
    
  public void setVlan(java.lang.Integer vlan) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_vlan, vlan);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectInterfaceInSecuritySubZone() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_interfaceInSecuritySubZone);
  }

  public Interface setInterfaceInSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone interfaceInSecuritySubZone) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_interfaceInSecuritySubZone, interfaceInSecuritySubZone);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterfaceType selectInterfaceType() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterfaceType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_interfaceType);
  }

  public Interface setInterfaceType(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterfaceType interfaceType) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_interfaceType, interfaceType);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> selectProvidesService() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_providesService);
  }

  public Interface setProvidesService(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> providesService) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_providesService, providesService);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Interface setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Interface setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_vlan, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_interfaceInSecuritySubZone, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterfaceType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_interfaceType, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_providesService, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface> selectToMeInterfaceType(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterfaceType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_interfaceType, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface> selectToMeInterfaceInSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_interfaceInSecuritySubZone, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface> selectToMeProvidesService(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.Interface_providesService, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eb46c268-b371-11e9-91da-d1f3b9a7fba4,pXs+N8le93B4YFeDO/kG8CyiGtY=] */
