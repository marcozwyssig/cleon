package cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Communication extends DynamicResource implements ICommunication {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICommunication> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICommunication>() {
    
    @Override
    public ICommunication create() {
      return new Communication();
    }
    
    @Override
    public ICommunication create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Communication(resourceRepository, resource);
    }
  
  };

  public Communication() {
    super(ICommunication.TYPE_ID);
  }
  
  public Communication(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICommunication.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.INamedSystem selectCommunicationSystem() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.INamedSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communication_communicationSystem);
  }

  public Communication setCommunicationSystem(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.INamedSystem communicationSystem) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communication_communicationSystem, communicationSystem);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.IDestination> selectDestination() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.IDestination.class, cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communication_destination);
  }

  public Communication setDestination(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.IDestination> destination) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communication_destination, destination);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Communication setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Communication setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.INamedSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communication_communicationSystem, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.IDestination.class, cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communication_destination, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication> selectToMeCommunicationSystem(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.INamedSystem object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication.class, cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communication_communicationSystem, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication selectToMeDestination(cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.IDestination object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication.class, cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communication_destination, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,91bc9aa9-8779-11e9-a61b-279ebde48b48,lDQlH/e1gflZuNbWdci4Tgw8X3E=] */
