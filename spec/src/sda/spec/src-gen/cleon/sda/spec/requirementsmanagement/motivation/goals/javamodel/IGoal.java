package cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoal extends ch.actifsource.core.javamodel.INamedResource, cleon.sda.spec.javamodel.IBusinessObjectId, cleon.doc.spec.autor.javamodel.IAutors, cleon.doc.spec.javamodel.ISimpleDescription, cleon.sda.spec.requirementsmanagement.javamodel.INotes {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("31468bb8-a951-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> selectGoalAggregation();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver> selectAddresses();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple> selectOriginatesFromPrinciple();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectOriginatesFromSource();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,31468bb8-a951-11e5-bda2-a7fc3bd7c783,7FDIT+L5h96CgFbDD5oXfNpZxHo=] */
