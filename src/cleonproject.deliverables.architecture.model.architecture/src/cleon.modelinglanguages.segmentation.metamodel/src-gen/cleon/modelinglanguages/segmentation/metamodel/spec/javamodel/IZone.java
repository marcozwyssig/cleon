package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IZone extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fb4a0fa3-0b73-11e9-a136-69d076e48ed1");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> selectZones();
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> selectAllowedAccessTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fb4a0fa3-0b73-11e9-a136-69d076e48ed1,UFApg3TIrsI0tfJvS9ynMybd9bg=] */
