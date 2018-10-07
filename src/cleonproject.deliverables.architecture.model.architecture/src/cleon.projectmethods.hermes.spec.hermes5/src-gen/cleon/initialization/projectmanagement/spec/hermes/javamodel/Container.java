package cleon.initialization.projectmanagement.spec.hermes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Container extends DynamicResource implements IContainer {

  // abstract implementation, only used for static method calls
  private Container() {
    super(IContainer.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dd805553-31ca-11e8-8a84-6f139e67278b,AoJk5F5C0MtRHrn3c5f/YcSAmkQ=] */
