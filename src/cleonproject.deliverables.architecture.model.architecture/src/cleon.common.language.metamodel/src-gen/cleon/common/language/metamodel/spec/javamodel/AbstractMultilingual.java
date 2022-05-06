package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractMultilingual extends DynamicResource implements IAbstractMultilingual {

  // abstract implementation, only used for static method calls
  private AbstractMultilingual() {
    super(IAbstractMultilingual.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a302d9a3-3360-11e8-a9fe-87ba35d8f5c4,0KXznajRJJ1ojqkTyOH3q6j8NM4=] */
