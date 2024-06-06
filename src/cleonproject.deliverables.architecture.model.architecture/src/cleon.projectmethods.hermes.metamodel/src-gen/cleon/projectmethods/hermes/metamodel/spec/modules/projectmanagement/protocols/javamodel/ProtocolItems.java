package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel;

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
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem selectAgendaItem() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem);
  }

  public ProtocolItems setAgendaItem(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem agendaItem) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem, agendaItem);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ProtocolItems setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ProtocolItems setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ProtocolItems setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItem> selectProtocols() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols);
  }

  public ProtocolItems setProtocols(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItem> protocols) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols, protocols);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems> selectProtocolsAgenda() {
    return _getMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda);
  }

  public ProtocolItems setProtocolsAgenda(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems> protocolsAgenda) {
    _setMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda, protocolsAgenda);
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
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols, visitor);
    _acceptMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems selectToMeProtocolsAgenda(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocolsAgenda, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems> selectToMeAgendaItem(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_agendaItem, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems selectToMeProtocols(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItem object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItems_protocols, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,35502e39-b462-11e5-a3f4-497fd75158dc,SPuZAsh42otZ/9Zqtk/vFsZTv3w=] */
