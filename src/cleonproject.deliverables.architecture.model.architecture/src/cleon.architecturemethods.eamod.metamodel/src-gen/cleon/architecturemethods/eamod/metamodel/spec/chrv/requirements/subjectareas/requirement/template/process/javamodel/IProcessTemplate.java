package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.process.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Die dritte Schablone für nicht-funktionale Anforderungen ist der ProzessMASTER –
 * eine
 * Schablone für Anforderungen an durchzuführende Tätigkeiten und
 * rechtlich-vertragliche
 * Anforderungen.
 * 
 * In diese Kategorie der nicht-funktionalen Anforderungen fallen neben Gesetzen
 * oder Normen auch der Auftragnehmer oder andere Personen. Der Faktor Mensch
 * spielt nach wie vor
 * eine entscheidende Rolle in der Systementwicklung. Die Schablone belegen diese
 * Aussage:
 * 
 * Der Auftragnehmer muss ein Betriebshandbuch für den MP3-Player erstellen.
 * 
 * Hinter dieser Anforderung verbirgt sich ein Prozess (hier: Wissen sammeln,
 * gliedern, niederschreiben etc.). Die Anforderung ist nicht an das betrachtete
 * System gestellt, sondern muss
 * neben der Entwicklung des Systems vom Auftragnehmer realisiert werden.
 */
public interface IProcessTemplate extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.javamodel.INonFunctionalTemplate, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.IConditionAware, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.javamodel.IActorAware, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.javamodel.IObjectAware, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.javamodel.IProcessAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3ba6dcf0-debb-11e5-bf7d-117d548070bb");
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3ba6dcf0-debb-11e5-bf7d-117d548070bb,wCBTmTAf/iIIHTHPIVNemFjhmec=] */
