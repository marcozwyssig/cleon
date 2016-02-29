package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.process.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Der ProzessMASTER greift auf einen Zweig des FunktionsMASTERs zurück. Der
 * entscheidende Unterschied ist, dass hier Anforderungen an einen Akteur und nicht
 * an ein System gestellt
 * werden. In unserem Beispiel wird der Auftragnehmer in die Pflicht genommen. Für
 * ihn ergibt
 * sich aus dieser Anforderung eine Aufgabe. Sie geht mit der eigentlichen
 * Entwicklung des
 * Systems einher. Da der Akteur der Schwerpunkt im ProzessMASTER ist, wird von der
 * Schablone im Gegensatz zu allen anderen MASTER-Schablonen auch nicht die Angabe
 * des Systems
 * explizit gefordert. (Sie ist fakultativ und fällt im obigen Beispiel unter die
 * Präzisierung des
 * Objekts.)
 */
public interface IActor extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("65ef7d85-debc-11e5-bf7d-117d548070bb");
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,65ef7d85-debc-11e5-bf7d-117d548070bb,D3worlW4AIdLRdSsdBY/fbFMuhY=] */
