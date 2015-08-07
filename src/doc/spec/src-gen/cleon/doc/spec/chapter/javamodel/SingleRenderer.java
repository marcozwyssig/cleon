package cleon.doc.spec.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SingleRenderer extends DynamicResource implements ISingleRenderer {

  // abstract implementation, only used for static method calls
  private SingleRenderer() {
    super(ISingleRenderer.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,32fc03ac-3cd7-11e5-871f-6beac6a7c24b,TP+dmXGicqgCYtcXt3LLOegdvvo=] */
