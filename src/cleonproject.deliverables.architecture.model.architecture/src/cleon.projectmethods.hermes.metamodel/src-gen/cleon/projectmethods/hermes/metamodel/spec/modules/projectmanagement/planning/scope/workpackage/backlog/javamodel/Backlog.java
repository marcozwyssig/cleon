package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Backlog extends DynamicResource implements IBacklog {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklog> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklog>() {
    
    @Override
    public IBacklog create() {
      return new Backlog();
    }
    
    @Override
    public IBacklog create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Backlog(resourceRepository, resource);
    }
  
  };

  public Backlog() {
    super(IBacklog.TYPE_ID);
  }
  
  public Backlog(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBacklog.TYPE_ID);
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

  @Override
  public java.lang.Integer selectPlannedEstimate() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Backlog_plannedEstimate);
  }
    
  public void setPlannedEstimate(java.lang.Integer plannedEstimate) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Backlog_plannedEstimate, plannedEstimate);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Backlog setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Backlog setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> selectGroups() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Backlog_groups);
  }

  public Backlog setGroups(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> groups) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Backlog_groups, groups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Backlog setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Backlog setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Backlog_plannedEstimate, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Backlog_groups, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog selectToMeGroups(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Backlog_groups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,28af8502-ff9c-11e4-ac0a-959b440f987f,gtToOMLX8ocOnj4hAwYzaNIyn9Y=] */
