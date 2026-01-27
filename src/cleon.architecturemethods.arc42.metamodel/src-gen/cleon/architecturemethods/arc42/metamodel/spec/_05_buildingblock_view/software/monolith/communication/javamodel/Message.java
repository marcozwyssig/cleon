package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Message extends DynamicResource implements IMessage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMessage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMessage>() {
    
    @Override
    public IMessage create() {
      return new Message();
    }
    
    @Override
    public IMessage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Message(resourceRepository, resource);
    }
  
  };

  public Message() {
    super(IMessage.TYPE_ID);
  }
  
  public Message(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMessage.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable selectAbstractTable() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_abstractTable);
  }

  public Message setAbstractTable(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable abstractTable) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_abstractTable, abstractTable);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField> selectFields() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_fields);
  }

  public Message setFields(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField> fields) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_fields, fields);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IRelation> selectRelation() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IRelation.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_relation);
  }

  public Message setRelation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IRelation> relation) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_relation, relation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Message setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Message setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_abstractTable, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_fields, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IRelation.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_relation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage> selectToMeAbstractTable(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_abstractTable, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage selectToMeFields(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_fields, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage selectToMeRelation(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IRelation object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Message_relation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3ec14480-fac5-11f0-81b8-83fdbb37c0b0,4+y/WIDz6GcDy3jh9xQKPEANfq0=] */
