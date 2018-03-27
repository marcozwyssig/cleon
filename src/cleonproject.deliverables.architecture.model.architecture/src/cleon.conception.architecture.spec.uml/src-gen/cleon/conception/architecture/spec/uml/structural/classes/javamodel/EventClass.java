package cleon.conception.architecture.spec.uml.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class EventClass extends DynamicResource implements IEventClass {

  // abstract implementation, only used for static method calls
  private EventClass() {
    super(IEventClass.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.conception.architecture.spec.uml.structural.classes.javamodel.IEventClass selectToMeEvents(cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEvent object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.uml.structural.classes.javamodel.IEventClass.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.EventClass_events, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b7660a2e-7fc5-11e4-842a-1924f269f20b,ZYZJUi3NcFOYGK4gHC7caG9wAQo=] */
