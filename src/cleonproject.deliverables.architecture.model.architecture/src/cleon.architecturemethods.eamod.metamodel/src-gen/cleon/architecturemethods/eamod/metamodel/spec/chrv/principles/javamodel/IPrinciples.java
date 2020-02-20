package cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Mit den Prinzipien werden die übergeordneten Gesetzmässigkeiten an das Vorhaben
 * festgelegt. Die Prinzipien können aus untergeordneten Prinzipien bestehen.
 */
public interface IPrinciples extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5d54c5db-a951-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.javamodel.IPrinciple> selectPrinciples();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5d54c5db-a951-11e5-bda2-a7fc3bd7c783,SK5MKgptnRsck0tpqrtFyKLdcOI=] */
