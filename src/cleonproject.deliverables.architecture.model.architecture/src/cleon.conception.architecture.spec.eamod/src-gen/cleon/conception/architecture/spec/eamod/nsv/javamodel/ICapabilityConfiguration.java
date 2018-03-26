package cleon.conception.architecture.spec.eamod.nsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Eine Fähigkeitskonfiguration stellt eine Gruppierung von funktionalen und/oder
 * organisatorischen
 * Ressourcen dar, die gemeinsam Fähigkeiten ermöglichen können. Diese funktionalen
 * Ressourcen
 * können typischerweise aus Systemen, Rollen und weiteren
 * Fähigkeitskonfigurationen bestehen.
 * Eine Fähigkeitskonfiguration kann auch die Realisierung für einen Knoten (aus
 * NOV-2) darstellen.
 * In diesen Fall sind Fähigkeitskonfiguration und Knoten über die
 * «NodeRealisation»-Beziehung
 * miteinander zu verbinden.
 */
public interface ICapabilityConfiguration extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("19f720d6-818c-11e7-9507-01b75489c44b");
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,19f720d6-818c-11e7-9507-01b75489c44b,ff1gMAe4Clkg0T86RaDMM4n5RT4=] */
