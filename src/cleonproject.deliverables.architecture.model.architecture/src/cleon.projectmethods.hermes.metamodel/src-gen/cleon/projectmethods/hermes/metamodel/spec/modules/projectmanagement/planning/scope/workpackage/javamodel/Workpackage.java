package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Workpackage extends DynamicResource implements IWorkpackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkpackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkpackage>() {
    
    @Override
    public IWorkpackage create() {
      return new Workpackage();
    }
    
    @Override
    public IWorkpackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Workpackage(resourceRepository, resource);
    }
  
  };

  public Workpackage() {
    super(IWorkpackage.TYPE_ID);
  }
  
  public Workpackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWorkpackage.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
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
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog selectBacklog() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_backlog);
  }

  public Workpackage setBacklog(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_backlog, backlog);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Workpackage setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Workpackage setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.goals.javamodel.IWorkspaceGoals selectGoals() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.goals.javamodel.IWorkspaceGoals.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_goals);
  }

  public Workpackage setGoals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.goals.javamodel.IWorkspaceGoals goals) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_goals, goals);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome selectOutcome() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_outcome);
  }

  public Workpackage setOutcome(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_outcome, outcome);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Workpackage setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Workpackage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Workpackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.utilization.javamodel.IResourceUtilization selectUtilization() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.utilization.javamodel.IResourceUtilization.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_utilization);
  }

  public Workpackage setUtilization(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.utilization.javamodel.IResourceUtilization utilization) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_utilization, utilization);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_backlog, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.goals.javamodel.IWorkspaceGoals.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_goals, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_outcome, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.utilization.javamodel.IResourceUtilization.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_utilization, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage selectToMeGoals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.goals.javamodel.IWorkspaceGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_goals, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage selectToMeBacklog(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_backlog, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage selectToMeUtilization(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.utilization.javamodel.IResourceUtilization object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_utilization, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage selectToMeOutcome(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.WorkpackagePackage.Workpackage_outcome, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ca090201-bbc8-11e6-997f-d73ea5a3671c,YHCa3YoUH0chnS3Ev8kPzBlhXVM=] */
