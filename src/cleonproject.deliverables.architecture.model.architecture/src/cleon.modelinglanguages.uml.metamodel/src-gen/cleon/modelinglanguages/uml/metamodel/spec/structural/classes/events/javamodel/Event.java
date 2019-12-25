package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Event extends DynamicResource implements IEvent {

  // abstract implementation, only used for static method calls
  private Event() {
    super(IEvent.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,42defe66-7fc6-11e4-842a-1924f269f20b,aB9ynakH1542btPHPup2YkUTd88=] */
