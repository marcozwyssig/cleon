package cleon.sda.spec.projectmanagement.protocols.javamodel;

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
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.protocols.javamodel.IAgendaItem selectAgendaItem() {
    return _getSingle(cleon.sda.spec.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem);
  }

  public ProtocolItems setAgendaItem(cleon.sda.spec.projectmanagement.protocols.javamodel.IAgendaItem agendaItem) {
    _setSingle(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem, agendaItem);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public ProtocolItems setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public ProtocolItems setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.doc.spec.paragraph.javamodel.IParagraph selectNoParagraph() {
    return _getSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph);
  }

  public ProtocolItems setNoParagraph(cleon.doc.spec.paragraph.javamodel.IParagraph noParagraph) {
    _setSingle(cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, noParagraph);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public ProtocolItems setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public ProtocolItems setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItem> selectProtocols() {
    return _getList(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItem.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols);
  }

  public ProtocolItems setProtocols(java.util.List<? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItem> protocols) {
    _setList(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols, protocols);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems> selectProtocolsAgenda() {
    return _getMap(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda);
  }

  public ProtocolItems setProtocolsAgenda(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems> protocolsAgenda) {
    _setMap(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda, protocolsAgenda);
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
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItem.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols, visitor);
    _acceptMap(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems selectToMeProtocolsAgenda(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems> selectToMeAgendaItem(cleon.sda.spec.projectmanagement.protocols.javamodel.IAgendaItem object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems selectToMeProtocols(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItem object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,35502e39-b462-11e5-a3f4-497fd75158dc,SHDXusXNPbYJQXRhgzb7ZveHJU8=] */
