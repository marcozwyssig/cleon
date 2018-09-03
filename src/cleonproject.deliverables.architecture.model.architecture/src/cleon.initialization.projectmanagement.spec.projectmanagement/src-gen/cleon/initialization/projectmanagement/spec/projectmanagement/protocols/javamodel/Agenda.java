package cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Agenda extends DynamicResource implements IAgenda {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAgenda> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAgenda>() {
    
    @Override
    public IAgenda create() {
      return new Agenda();
    }
    
    @Override
    public IAgenda create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Agenda(resourceRepository, resource);
    }
  
  };

  public Agenda() {
    super(IAgenda.TYPE_ID);
  }
  
  public Agenda(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAgenda.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements);
  }

  public Agenda setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgendaItem> selectItems() {
    return _getList(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Agenda_items);
  }

  public Agenda setItems(java.util.List<? extends cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgendaItem> items) {
    _setList(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Agenda_items, items);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Agenda setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Agenda_items, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgenda selectToMeItems(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgendaItem object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgenda.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.Agenda_items, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6f5a3bc3-b461-11e5-a3f4-497fd75158dc,weXjiBXDPSOCKX9SY8WVZRyrOGs=] */
