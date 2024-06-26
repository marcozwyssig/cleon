package cleon.common.doc.metamodel.spec.document.properties.member.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Member extends DynamicResource implements IMember {

  // abstract implementation, only used for static method calls
  private Member() {
    super(IMember.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7869d054-c589-11e5-aeea-1db9268c0ee9,co/VoPIif8etFjGl4QAGdkzN0f0=] */
