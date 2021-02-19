package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOutcome extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IOwnerAware, ch.actifsource.core.javamodel.IDecorator, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.javamodel.IStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a");
  
  public java.lang.Integer selectTimeLag();
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency> selectDependsOn();
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline> selectDeadlines();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a,szj0Vm/blCeoylJ9fVwMLmIc2DQ=] */
