package cleon.conception.eamod.spec.chrv.motivation.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDrivers extends cleon.conception.eamod.spec.chrv.javamodel.IRequirementDocument, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e54f10bf-a950-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.drivers.javamodel.IDriver> selectDrivers();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e54f10bf-a950-11e5-bda2-a7fc3bd7c783,3jW4MTLbtROY3xlxuob3Q/vIr+s=] */
