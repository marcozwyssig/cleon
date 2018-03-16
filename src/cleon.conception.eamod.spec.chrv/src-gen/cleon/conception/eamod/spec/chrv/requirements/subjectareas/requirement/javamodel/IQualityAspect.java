package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IQualityAspect extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.javamodel.IQualityRequirement {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0c78c3a9-dbc1-11e5-8b2d-07cd3ff9eacd");
  
  // relations
  
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectAffectedRequirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0c78c3a9-dbc1-11e5-8b2d-07cd3ff9eacd,wqZkvsp/pzs2uIpcPLx83LlmJcM=] */
