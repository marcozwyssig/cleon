package cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class MaterialDeliverable extends DynamicResource implements IMaterialDeliverable {

  // abstract implementation, only used for static method calls
  private MaterialDeliverable() {
    super(IMaterialDeliverable.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,755a66f9-b467-11e8-bb21-172cc8e5f7cd,oAHHzm+hxYBuph9pa6hNmdy/uJY=] */
