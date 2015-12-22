package cleon.desktop.spec.mvvm.binding.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Binding extends DynamicResource implements IBinding {

  // abstract implementation, only used for static method calls
  private Binding() {
    super(IBinding.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,308b0189-a56a-11e4-b136-cb3641e3bed5,phRc8eJz9PQK8ENaXqU6UShYlbs=] */
