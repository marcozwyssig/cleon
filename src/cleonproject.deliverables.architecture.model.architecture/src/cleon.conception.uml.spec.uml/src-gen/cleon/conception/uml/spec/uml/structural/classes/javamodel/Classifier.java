package cleon.conception.uml.spec.uml.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Classifier extends DynamicResource implements IClassifier {

  // abstract implementation, only used for static method calls
  private Classifier() {
    super(IClassifier.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2141695f-1144-11e3-b60e-ab478a3e1eca,A3jHBo/DUOrzQ7pFDbxu4oRXAhw=] */
