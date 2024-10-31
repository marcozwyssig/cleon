package cleon.common.modularity.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Interaction extends DynamicResource implements IInteraction {

  // abstract implementation, only used for static method calls
  private Interaction() {
    super(IInteraction.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f0ac037-0511-11e9-87b8-094c52ae4c98,i8q/W3FgXIyezcm2xC4leU8wE28=] */
