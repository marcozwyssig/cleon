package cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Mit den Treibern wird die Motivation für die in diesem Dokument festlegten
 * Anforderungen zwecks der Nachvollziehbarkeit aufgeführt.
 * Jeder Treiber kann einer Quelle zugeordnet werden. Die Quelle stellt den
 * Ursprung respektive die Herkunft des entsprechenden Treibers dar.
 * Als Quellenarten kommen die Arten "Organisation", "Person", "Dokument",
 * "Kapitel" oder "Referenz" in Frage.
 */
public interface IDrivers extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e54f10bf-a950-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDriver> selectDrivers();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e54f10bf-a950-11e5-bda2-a7fc3bd7c783,OHVmQPULnGv9OU5jxX5FmYdimwo=] */
