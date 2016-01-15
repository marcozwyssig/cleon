package cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFeatureGroup extends cleon.doc.spec.chapter.javamodel.INamedChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("409913e6-369c-11e5-95d9-2b04d7ab02d9");
  
  public java.lang.Integer selectPlannedEstimate();
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> selectWorkItems();
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> selectSubfeatureGroup();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,409913e6-369c-11e5-95d9-2b04d7ab02d9,j2JfwkjHFkP4VEURdPUUYOHGy/I=] */
