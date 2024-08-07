package cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoal extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IAuthors, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.INotes, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceAware, cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDriverAware, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("31468bb8-a951-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoal> selectGoalAggregation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,31468bb8-a951-11e5-bda2-a7fc3bd7c783,mMvnuz5gz44WuUDcUUDujL1jTxM=] */
