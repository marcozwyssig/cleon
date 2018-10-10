package cleon.architecturemethods.eamod.spec.eamod.nov.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Stellt eine Tätigkeit oder einen Prozess dar
 * welche durch einen oder mehrere Knoten
 * ausgeführt wird und bei der Realisierung von
 * Fähigkeiten unterstützt.
 */
public interface IOperationalActivity extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("93ef0a2d-bc84-11e6-b169-a12bde5a1c7c");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability> selectActivityMapsToCapability();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,93ef0a2d-bc84-11e6-b169-a12bde5a1c7c,DO2KlT9tCt4j+rR0XSVc2161DT0=] */
