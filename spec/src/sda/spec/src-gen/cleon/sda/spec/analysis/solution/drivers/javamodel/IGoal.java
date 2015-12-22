package cleon.sda.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoal extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0797167b-3c15-11e5-9962-cf3035adb922");
  
  // attributes
  
  public java.lang.String selectGoalname();
  
  public java.lang.String selectGoaldescription();
  
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance selectImportance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0797167b-3c15-11e5-9962-cf3035adb922,abguyr+7t39I83XnKcW4+woIKMM=] */
