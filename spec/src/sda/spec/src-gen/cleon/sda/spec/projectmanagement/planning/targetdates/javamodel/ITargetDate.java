package cleon.sda.spec.projectmanagement.planning.targetdates.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITargetDate extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bdf7db5a-a7d8-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson selectOwner();
  
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectDeadline();
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> selectMembers();
  
  public cleon.sda.spec.javamodel.IWorkState selectState();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bdf7db5a-a7d8-11e5-82dd-3b995d9c840c,IBS/Q9ijV2DQFIf09UoGtdfYaFI=] */
