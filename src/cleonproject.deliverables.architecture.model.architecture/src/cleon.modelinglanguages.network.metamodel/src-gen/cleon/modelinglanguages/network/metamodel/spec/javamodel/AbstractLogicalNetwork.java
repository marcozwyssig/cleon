package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractLogicalNetwork extends DynamicResource implements IAbstractLogicalNetwork {

  // abstract implementation, only used for static method calls
  private AbstractLogicalNetwork() {
    super(IAbstractLogicalNetwork.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,89c5d6c2-7ac9-11e9-a70f-4dc03941a024,LittUp9GA2O9h5IMqvBtp3kTHXU=] */
