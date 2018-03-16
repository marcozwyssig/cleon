package cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPersonCapacity extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1d4b698d-c00c-11e5-a165-d34765931e10");
  
  public java.lang.Integer selectProductivity();
  
  // relations
  
  public cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson selectPerson();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay> selectCapacityPerDay();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1d4b698d-c00c-11e5-a165-d34765931e10,VNJD9uL4pZGunZNBCOpVwSBlbe0=] */
