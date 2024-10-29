package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISprintBacklog extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d13f5581-c00b-11e5-a165-d34765931e10");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase> selectWorkItems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d13f5581-c00b-11e5-a165-d34765931e10,NVekdr/ZOTfciz1kzT9iuI/vWFk=] */
