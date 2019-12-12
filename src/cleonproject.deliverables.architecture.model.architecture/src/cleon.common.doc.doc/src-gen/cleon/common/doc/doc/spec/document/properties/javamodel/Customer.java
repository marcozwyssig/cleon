package cleon.common.doc.doc.spec.document.properties.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Customer extends DynamicResource implements ICustomer {

  // abstract implementation, only used for static method calls
  private Customer() {
    super(ICustomer.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2283443b-47fb-11e6-b388-8539f6ff7310,DnqhHuGP09rgdpaYB7WxpxCS5CA=] */
