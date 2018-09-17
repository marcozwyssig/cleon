package cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Outcome extends DynamicResource implements IOutcome {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcome> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcome>() {
    
    @Override
    public IOutcome create() {
      return new Outcome();
    }
    
    @Override
    public IOutcome create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Outcome(resourceRepository, resource);
    }
  
  };

  public Outcome() {
    super(IOutcome.TYPE_ID);
  }
  
  public Outcome(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOutcome.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Integer selectTimeLag() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_timeLag);
  }
    
  public void setTimeLag(java.lang.Integer timeLag) {
     _setSingleAttribute(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_timeLag, timeLag);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline> selectDeadlines() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines);
  }

  public Outcome setDeadlines(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline> deadlines) {
    _setList(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines, deadlines);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable);
  }

  public Outcome setDeliverable(cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable, deliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomeDependency> selectDependsOn() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomeDependency.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn);
  }

  public Outcome setDependsOn(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomeDependency> dependsOn) {
    _setList(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Outcome setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner);
  }

  public Outcome setOwner(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson owner) {
    _setSingle(cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, owner);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomeState selectState() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomeState.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_state);
  }

  public Outcome setState(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomeState state) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Outcome setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Outcome setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_timeLag, visitor);
    // relations
    _acceptList(cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable, visitor);
    _acceptList(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomeDependency.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomeState.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome selectToMeDependsOn(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomeDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome> selectToMeDeadlines(cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome> selectToMeState(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomeState object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_state, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome> selectToMeDeliverable(cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a,l6dgJ+o9efkYLg4+DT/wVJEQk+w=] */
