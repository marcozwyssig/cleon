package cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPrinciple extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.INotes, cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IAuthors, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceAware, cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoalAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6f06a6ec-a951-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.javamodel.IPrinciple> selectAggregation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6f06a6ec-a951-11e5-bda2-a7fc3bd7c783,jWv/E3NkNA2xfYnAR3OobAc+1ao=] */
