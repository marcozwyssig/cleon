package cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSequence extends DynamicResource implements IAbstractSequence {

  // abstract implementation, only used for static method calls
  private AbstractSequence() {
    super(IAbstractSequence.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2d6e7f54-de54-11ef-81c7-3391f050addb,uEVCvKZAndIvjSxLvIFse2xu1EE=] */
