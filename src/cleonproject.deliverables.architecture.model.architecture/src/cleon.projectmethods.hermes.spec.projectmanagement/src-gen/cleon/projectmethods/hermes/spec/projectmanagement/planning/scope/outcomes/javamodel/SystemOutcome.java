package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemOutcome extends DynamicResource implements ISystemOutcome {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemOutcome> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemOutcome>() {
    
    @Override
    public ISystemOutcome create() {
      return new SystemOutcome();
    }
    
    @Override
    public ISystemOutcome create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemOutcome(resourceRepository, resource);
    }
  
  };

  public SystemOutcome() {
    super(ISystemOutcome.TYPE_ID);
  }
  
  public SystemOutcome(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemOutcome.TYPE_ID);
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

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.Integer selectTimeLag() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_timeLag);
  }
    
  public void setTimeLag(java.lang.Integer timeLag) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_timeLag, timeLag);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public SystemOutcome setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline> selectDeadlines() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines);
  }

  public SystemOutcome setDeadlines(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline> deadlines) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines, deadlines);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable);
  }

  public SystemOutcome setDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable, deliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency> selectDependsOn() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn);
  }

  public SystemOutcome setDependsOn(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency> dependsOn) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SystemOutcome setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner);
  }

  public SystemOutcome setOwner(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson owner) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner, owner);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SystemOutcome setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IState selectState() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IState.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.ScopePackage.StateAware_state);
  }

  public SystemOutcome setState(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IState state) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.ScopePackage.StateAware_state, state);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.versions.javamodel.ISystemStage selectSystemStage() {
    return _getSingle(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage);
  }

  public SystemOutcome setSystemStage(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage systemStage) {
    _setSingle(cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage, systemStage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SystemOutcome setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemOutcome setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion selectVersion() {
    return _getSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version);
  }

  public SystemOutcome setVersion(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion version) {
    _setSingle(cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, version);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_timeLag, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner, visitor);
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IState.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.ScopePackage.StateAware_state, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ac8b4c03-bfeb-11e8-a3d0-5394fd9291a1,BUozUZPZZhiSQ3L55a8pXen4ITI=] */
