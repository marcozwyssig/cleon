package cleon.common.doc.spec.doc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class StandardDocumentElement extends DynamicResource implements IStandardDocumentElement {

  // abstract implementation, only used for static method calls
  private StandardDocumentElement() {
    super(IStandardDocumentElement.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a1b0bb10-e98b-11e8-af5c-a5aa9dc47205,MSDIy+3lsVVmF4IKrkyjtil+zcg=] */
