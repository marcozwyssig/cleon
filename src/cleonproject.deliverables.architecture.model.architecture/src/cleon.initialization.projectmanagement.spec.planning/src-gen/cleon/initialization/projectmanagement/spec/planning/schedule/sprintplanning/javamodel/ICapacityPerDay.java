package cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICapacityPerDay extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cd28fab0-c0d5-11e5-8f91-3dfd9b379121");
  
  public java.lang.Integer selectCapacity();
  
  // relations
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectDay();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cd28fab0-c0d5-11e5-8f91-3dfd9b379121,Ump0rZwPhGGEVXsxjmKStuPdFzc=] */
