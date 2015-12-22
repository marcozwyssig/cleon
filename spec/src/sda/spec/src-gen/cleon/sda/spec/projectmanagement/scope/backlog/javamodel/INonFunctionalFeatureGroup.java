package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INonFunctionalFeatureGroup extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IRequirementFeatureGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8f5ab315-3777-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IConstraint> selectConstraints();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8f5ab315-3777-11e5-95d9-2b04d7ab02d9,iAx0Rfmk6ygCW0nY+rYm8x22NHk=] */
