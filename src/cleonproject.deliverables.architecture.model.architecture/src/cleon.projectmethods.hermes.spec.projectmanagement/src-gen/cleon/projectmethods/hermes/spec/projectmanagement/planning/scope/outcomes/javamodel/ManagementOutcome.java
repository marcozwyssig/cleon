package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ManagementOutcome extends DynamicResource implements IManagementOutcome {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManagementOutcome> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManagementOutcome>() {
    
    @Override
    public IManagementOutcome create() {
      return new ManagementOutcome();
    }
    
    @Override
    public IManagementOutcome create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ManagementOutcome(resourceRepository, resource);
    }
  
  };

  public ManagementOutcome() {
    super(IManagementOutcome.TYPE_ID);
  }
  
  public ManagementOutcome(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManagementOutcome.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public ManagementOutcome setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline> selectDeadlines() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines);
  }

  public ManagementOutcome setDeadlines(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline> deadlines) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines, deadlines);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable);
  }

  public ManagementOutcome setDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable, deliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency> selectDependsOn() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn);
  }

  public ManagementOutcome setDependsOn(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency> dependsOn) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ManagementOutcome setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner);
  }

  public ManagementOutcome setOwner(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson owner) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner, owner);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ManagementOutcome setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IState selectState() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IState.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.ScopePackage.StateAware_state);
  }

  public ManagementOutcome setState(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IState state) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.ScopePackage.StateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ManagementOutcome setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ManagementOutcome setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_timeLag, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IState.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.ScopePackage.StateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cc207995-bfeb-11e8-a3d0-5394fd9291a1,ocYDEIF1JZ4NiZIaSnvE9Mv/Mu0=] */
