package cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ProtocolItems extends DynamicResource implements IProtocolItems {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocolItems> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocolItems>() {
    
    @Override
    public IProtocolItems create() {
      return new ProtocolItems();
    }
    
    @Override
    public IProtocolItems create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ProtocolItems(resourceRepository, resource);
    }
  
  };

  public ProtocolItems() {
    super(IProtocolItems.TYPE_ID);
  }
  
  public ProtocolItems(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProtocolItems.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IAgendaItem selectAgendaItem() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem);
  }

  public ProtocolItems setAgendaItem(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IAgendaItem agendaItem) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem, agendaItem);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ProtocolItems setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItem> selectProtocols() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItem.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols);
  }

  public ProtocolItems setProtocols(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItem> protocols) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols, protocols);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems> selectProtocolsAgenda() {
    return _getMap(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda);
  }

  public ProtocolItems setProtocolsAgenda(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems> protocolsAgenda) {
    _setMap(cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda, protocolsAgenda);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ProtocolItems setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ProtocolItems setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItem.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols, visitor);
    _acceptMap(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems selectToMeProtocolsAgenda(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems> selectToMeAgendaItem(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IAgendaItem object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems selectToMeProtocols(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItem object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,35502e39-b462-11e5-a3f4-497fd75158dc,+rrsQkGTz15KHO+AN+cSdhMfXO0=] */
