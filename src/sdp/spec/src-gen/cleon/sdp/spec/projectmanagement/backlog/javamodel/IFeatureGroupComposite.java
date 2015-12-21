package cleon.sdp.spec.projectmanagement.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFeatureGroupComposite extends cleon.sdp.spec.projectmanagement.backlog.javamodel.IFeatureGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("66562d7f-369c-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.javamodel.IFeatureGroup> selectSubfeatureGroup();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,66562d7f-369c-11e5-95d9-2b04d7ab02d9,+qE0pBDgSXpE5Fo0MTTeeSRYmB0=] */
