package cleon.common.analysis.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICategory extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f513f883-02ed-11e6-ac1c-338177f8bfef");
  
  // relations
  
  public java.util.List<? extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IGoal> selectGoals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f513f883-02ed-11e6-ac1c-338177f8bfef,0qeODP0YBmYq6buj5zcprX/umg4=] */
