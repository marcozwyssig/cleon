package cleon.sdp.spec.project.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFunctionalFeatureGroup extends cleon.sdp.spec.project.backlog.javamodel.IRequirementFeatureGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("89e4b111-3777-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public java.util.List<? extends cleon.sdp.spec.project.backlog.story.javamodel.IUserStory> selectWorkItems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,89e4b111-3777-11e5-95d9-2b04d7ab02d9,NTPNIYeNla7ZoMJnmCAL0shjfiQ=] */
