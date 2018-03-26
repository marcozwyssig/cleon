package cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISources extends cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementDocument, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("efb0f224-a281-11e5-9332-1b5893de4362");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource> selectSources();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,efb0f224-a281-11e5-9332-1b5893de4362,tckjLEz5yC7iejWql9xm++OClm8=] */
