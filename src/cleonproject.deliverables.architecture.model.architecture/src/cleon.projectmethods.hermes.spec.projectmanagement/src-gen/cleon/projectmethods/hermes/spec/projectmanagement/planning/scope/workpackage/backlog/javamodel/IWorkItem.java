package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkItem extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription, cleon.common.resources.spec.resources.priority.javamodel.IPriorityAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4330cc63-ff9c-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson> selectOwners();
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> selectPreconditions();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemState selectState();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4330cc63-ff9c-11e4-ac0a-959b440f987f,VLrUECMAkpaEW/xBfVR9b5redbg=] */
