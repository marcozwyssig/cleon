package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractGatewayNode extends DynamicResource implements IAbstractGatewayNode {

  // abstract implementation, only used for static method calls
  private AbstractGatewayNode() {
    super(IAbstractGatewayNode.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,de1fdb49-7b84-11e9-94aa-f1ea7ea33f46,GLz82q+GGgR6eTcxufGn1B8r1H0=] */
