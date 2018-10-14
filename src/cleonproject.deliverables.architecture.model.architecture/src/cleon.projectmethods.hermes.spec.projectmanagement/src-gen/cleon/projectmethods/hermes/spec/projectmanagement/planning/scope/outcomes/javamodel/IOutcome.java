package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOutcome extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter, cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IOwnerAware, ch.actifsource.core.javamodel.IDecorator, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a");
  
  public java.lang.Integer selectTimeLag();
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency> selectDependsOn();
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline> selectDeadlines();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a,rCONsOFSx6QHmBpPgup0LE+LxrQ=] */
