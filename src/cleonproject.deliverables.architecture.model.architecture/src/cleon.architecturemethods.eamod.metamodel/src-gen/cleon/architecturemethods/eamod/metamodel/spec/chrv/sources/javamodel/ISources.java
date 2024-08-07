package cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Beinhaltet alle verwendeten Quellen für die Treiber, Ziele, Prinzipien und
 * Anforderungen.
 */
public interface ISources extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("efb0f224-a281-11e5-9332-1b5893de4362");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource> selectSources();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,efb0f224-a281-11e5-9332-1b5893de4362,hwMvCijFssdQvniN807mSBDCFyw=] */
