package cleon.conception.architecture.spec.eamod.chrv.distinction.supply.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISupplies extends cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementDocument, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("13d24c1c-0e15-11e6-ae01-ef640c578b9b");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.distinction.supply.javamodel.ISupply> selectSupply();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,13d24c1c-0e15-11e6-ae01-ef640c578b9b,plTACa2hafXgDT6yr7u9fVnuT7Q=] */