package cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDefectFeatureGroup extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d243a7a6-369e-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect> selectDefects();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d243a7a6-369e-11e5-95d9-2b04d7ab02d9,z2e2OtvfCI1DqiUoc2/CgoSJbTc=] */
