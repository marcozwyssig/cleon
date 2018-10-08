package cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoal extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, cleon.common.doc.spec.doc.document.properties.member.javamodel.IAuthors, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription, cleon.conception.architecture.spec.eamod.chrv.javamodel.INotes, cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISourceAware, cleon.conception.architecture.spec.eamod.chrv.motivation.drivers.javamodel.IDriverAware, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("31468bb8-a951-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal> selectGoalAggregation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,31468bb8-a951-11e5-bda2-a7fc3bd7c783,BZbAZwociRrIwB/2SdV7GSzKyUY=] */
