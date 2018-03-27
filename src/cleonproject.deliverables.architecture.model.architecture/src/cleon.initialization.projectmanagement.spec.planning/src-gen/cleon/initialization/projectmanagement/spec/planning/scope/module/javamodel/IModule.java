package cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IModule extends cleon.common.doc.spec.doc.chapter.javamodel.INamedChapter, cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IOwnerAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a");
  
  // relations
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModuleDependency> selectDependsOn();
  
  public cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes selectOutcomes();
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadline> selectDeadlines();
  
  public cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModuleState selectState();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a,C35JDSNPquaJe00JIViiEs/GhMY=] */
