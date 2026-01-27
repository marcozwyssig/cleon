package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Messages extends DynamicResource implements IMessages {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMessages> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMessages>() {
    
    @Override
    public IMessages create() {
      return new Messages();
    }
    
    @Override
    public IMessages create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Messages(resourceRepository, resource);
    }
  
  };

  public Messages() {
    super(IMessages.TYPE_ID);
  }
  
  public Messages(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMessages.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage> selectMessage() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Messages_message);
  }

  public Messages setMessage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage> message) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Messages_message, message);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Messages setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Messages_message, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessages selectToMeMessage(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessages.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Messages_message, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0befee3a-fac5-11f0-81b8-83fdbb37c0b0,EFD5m+NSkfa2NLcsfqmur3aubYc=] */
