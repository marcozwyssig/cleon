package cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivityFeatureGroup extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("98e4deb9-b9c5-11e5-a5dc-db9071475fc6");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IActivity> selectActivities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,98e4deb9-b9c5-11e5-a5dc-db9071475fc6,WeE0QT4m2eYGCoRigE9bkB+OjdM=] */
