package cleon.common.resources.spec.resources.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class System extends DynamicResource implements ISystem {

  // abstract implementation, only used for static method calls
  private System() {
    super(ISystem.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c5c0c80c-1cdb-11e6-8e4f-e37ebca0f18f,C33rLlcE1h6cg2iBF0F1Vk+237s=] */
