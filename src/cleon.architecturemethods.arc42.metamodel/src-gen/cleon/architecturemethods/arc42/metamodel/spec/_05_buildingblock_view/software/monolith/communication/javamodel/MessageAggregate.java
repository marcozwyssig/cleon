package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MessageAggregate extends DynamicResource implements IMessageAggregate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMessageAggregate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMessageAggregate>() {
    
    @Override
    public IMessageAggregate create() {
      return new MessageAggregate();
    }
    
    @Override
    public IMessageAggregate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MessageAggregate(resourceRepository, resource);
    }
  
  };

  public MessageAggregate() {
    super(IMessageAggregate.TYPE_ID);
  }
  
  public MessageAggregate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMessageAggregate.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage> selectMessage() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.MessageAggregate_message);
  }

  public MessageAggregate setMessage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage> message) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.MessageAggregate_message, message);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea selectTableArea() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.MessageAggregate_tableArea);
  }

  public MessageAggregate setTableArea(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea tableArea) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.MessageAggregate_tableArea, tableArea);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public MessageAggregate setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MessageAggregate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.MessageAggregate_message, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.MessageAggregate_tableArea, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessageAggregate> selectToMeTableArea(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessageAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.MessageAggregate_tableArea, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessageAggregate selectToMeMessage(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessageAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.MessageAggregate_message, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e3ab2692-fb82-11f0-919e-07363e802872,bIZSNSKfCqERNL9T86w+KeNoGjI=] */
