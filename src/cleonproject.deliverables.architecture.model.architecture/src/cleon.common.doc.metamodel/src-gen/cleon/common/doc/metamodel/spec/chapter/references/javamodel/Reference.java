package cleon.common.doc.metamodel.spec.chapter.references.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Reference extends DynamicResource implements IReference {

  // abstract implementation, only used for static method calls
  private Reference() {
    super(IReference.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6288bf23-1b3b-11e9-8cd4-efe75fb4587a,FjzbaiUVj/3GGmufoxpkfDcoHm0=] */
