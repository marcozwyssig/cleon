package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class RuntimeView extends DynamicResource implements IRuntimeView {

  // abstract implementation, only used for static method calls
  private RuntimeView() {
    super(IRuntimeView.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,64fa2d04-9984-11e8-b187-17b9138759f6,vReJZxECwof9/SOUZw+9yUa71zU=] */
