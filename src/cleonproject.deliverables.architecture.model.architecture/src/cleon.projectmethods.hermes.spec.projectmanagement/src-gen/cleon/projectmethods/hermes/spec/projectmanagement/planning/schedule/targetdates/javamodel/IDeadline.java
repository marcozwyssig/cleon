package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeadline extends ch.actifsource.core.javamodel.INamedResource, cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.ITargetDate {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bdf7db5a-a7d8-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson selectOwner();
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson> selectMembers();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bdf7db5a-a7d8-11e5-82dd-3b995d9c840c,mZonCFieoIYK4sgpVDjIB6xKCy4=] */
