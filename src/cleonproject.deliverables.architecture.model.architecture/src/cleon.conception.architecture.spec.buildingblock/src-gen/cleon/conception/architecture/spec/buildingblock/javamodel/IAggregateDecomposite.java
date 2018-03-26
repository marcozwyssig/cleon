package cleon.conception.architecture.spec.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAggregateDecomposite extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("53d51c49-7ad7-11e4-a6e2-23d949480f96");
  
  // relations
  
  public cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock selectInto();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,53d51c49-7ad7-11e4-a6e2-23d949480f96,DvosjxljkAsUY93clh8tgQnadqY=] */
