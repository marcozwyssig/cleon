package cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoalAware extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5b7e3e20-0abf-11e6-85a2-61e22bb4d1e3");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoal> selectAchieves();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5b7e3e20-0abf-11e6-85a2-61e22bb4d1e3,s8asCksgL/YxjbPz1Orb51VT18c=] */
