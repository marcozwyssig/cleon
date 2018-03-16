package cleon.conception.eamod.spec.chrv.motivation.principles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPrinciple extends cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription, cleon.conception.eamod.spec.chrv.javamodel.INotes, cleon.common.resources.spec.resources.id.javamodel.IBusinessObjectId, cleon.common.doc.spec.doc.document.properties.member.javamodel.IAuthors, cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceAware, cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoalAware, cleon.common.doc.spec.doc.chapter.javamodel.INamedChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6f06a6ec-a951-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.principles.javamodel.IPrinciple> selectAggregation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6f06a6ec-a951-11e5-bda2-a7fc3bd7c783,BrDwMnoj5KHE4DfyA7qBJd+IqWM=] */
