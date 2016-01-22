package cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISprintGoals extends cleon.doc.spec.chapter.javamodel.IChapter, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("99200ab1-c126-11e5-bfd0-47571a06cb62");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintGoal> selectGoals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,99200ab1-c126-11e5-bfd0-47571a06cb62,3is53SkYzOC2ESNBNxmmWVWepck=] */
