package cleon.common.resources.metamodel.spec.descriptions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class MandatoryDescription extends DynamicResource implements IMandatoryDescription {

  // abstract implementation, only used for static method calls
  private MandatoryDescription() {
    super(IMandatoryDescription.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0397d401-0e16-11e6-ae01-ef640c578b9b,LLMv7aiKaPdbjpB39wDgGWDhQ7w=] */
