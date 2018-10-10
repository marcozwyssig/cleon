package cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Product extends DynamicResource implements IProduct {

  // abstract implementation, only used for static method calls
  private Product() {
    super(IProduct.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ab67a402-67bf-11e7-afcc-6df3a81a4d17,4z36kwGpesAAYcbY4+own8dWLbU=] */
