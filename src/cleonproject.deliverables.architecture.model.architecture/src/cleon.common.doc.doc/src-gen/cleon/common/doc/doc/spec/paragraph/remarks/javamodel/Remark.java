package cleon.common.doc.doc.spec.paragraph.remarks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Remark extends DynamicResource implements IRemark {

  // abstract implementation, only used for static method calls
  private Remark() {
    super(IRemark.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a1d1a9ce-466d-11e5-ba74-cb2e95044e1c,lTOTR+3dwNYliZ2S4hYfYHQjl+s=] */
