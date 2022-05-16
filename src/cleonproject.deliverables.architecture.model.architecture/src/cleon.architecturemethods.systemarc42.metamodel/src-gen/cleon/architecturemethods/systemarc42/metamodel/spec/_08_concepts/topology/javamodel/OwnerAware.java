package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class OwnerAware extends DynamicResource implements IOwnerAware {

  // abstract implementation, only used for static method calls
  private OwnerAware() {
    super(IOwnerAware.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ca3494bb-d50c-11ec-ad12-8d6f8e00bc94,nltoexegnM3XQGkq43GJvYx71iw=] */
