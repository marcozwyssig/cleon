package cleon.architecturemethods.eamod.spec.eamod.nsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Eine Funktion stellt eine von einer funktionalen Ressource (d. h. «System»,
 * «Role» und
 * «CapabilityConfiguration») erbrachte Aktivität dar. Über die
 * «FunctionFlow»-Beziehung können
 * Funktionen in einer NSV-4 als Funktionsabfolge modelliert werden. Falls eine
 * Funktion dabei
 * Datenelemente erzeugt oder verändert, so wird dies über die
 * «FunctionsUpon»-Beziehung
 * modelliert. Falls Funktionen können an der Ausführung von operationelle
 * Aktivitäten beteiligt
 * sein, so wird dies in der NSV-5 über die «ActivityToFunctionMapping»-Beziehung
 * modelliert.
 * Funktionen können weiter auch Anforderungen realisieren. Dies kann unter
 * Verwendung der
 * «IsRealizedBy»-Beziehung in einer CHRV-3 modelliert werden.
 */
public interface IFunction extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("33f184bf-818c-11e7-9507-01b75489c44b");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsv.javamodel.IFunction> selectFunctionFlow();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,33f184bf-818c-11e7-9507-01b75489c44b,sPN5Hm6ayPmkNHi3XzsQrmeHngQ=] */
