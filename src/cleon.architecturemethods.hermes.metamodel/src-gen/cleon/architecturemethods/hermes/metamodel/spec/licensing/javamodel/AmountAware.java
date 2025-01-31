package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AmountAware extends DynamicResource implements IAmountAware {

  // abstract implementation, only used for static method calls
  private AmountAware() {
    super(IAmountAware.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1d688582-dfd2-11ef-b0be-9b4cac321140,t3JPTFfjKdWf6aZKkGl8lGfuF6k=] */
