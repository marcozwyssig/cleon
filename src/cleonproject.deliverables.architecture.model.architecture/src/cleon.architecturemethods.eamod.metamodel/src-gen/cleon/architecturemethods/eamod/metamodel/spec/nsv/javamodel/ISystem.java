package cleon.architecturemethods.eamod.metamodel.spec.nsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Systeme werden zur Modellierung eines technischen Kontextes eingesetzt und
 * stellen eine
 * Gesamtheit von zusammenwirkenden Komponenten dar. Diese Zusammenstellung erfolgt
 * meist
 * aufgaben-, sinn- oder zweckgebunden zum Erreichen eines bestimmten Ziels. Ein
 * System kann
 * dabei eine oder mehrere Funktionen und/oder Services zur Verfügung stellen. Die
 * «ConformsTo»-
 * Beziehung kann verwendet werden, wenn ein System gewisse Standards unterstützt
 * oder
 * unterstützen wird.
 * Zur Modellierung von Systemschnittstellen wird das Modellierungselement
 * «SystemPort»
 * eingesetzt. Diese können über die «SystemPortConnector»-Beziehung miteinander
 * verbunden
 * werden. Die von einem «SystemPort» unterstützten Protokolle können über die
 * «ImplementsProtocol»-Beziehung spezifiziert werden.
 * Anforderungen und Fähigkeiten können durch ein System realisiert werden. Bei der
 * Beschreibung
 * einer Soll-Architektur ist es zudem durchaus möglich, mehrere Lösungsvarianten
 * auszuarbeiten.
 */
public interface ISystem extends cleon.architecturemethods.eamod.metamodel.spec.nsv.javamodel.IFunctionalResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("360da2f8-818b-11e7-9507-01b75489c44b");
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,360da2f8-818b-11e7-9507-01b75489c44b,+G+fjVU9nfsG0AW0bMOEVZqT2T0=] */
