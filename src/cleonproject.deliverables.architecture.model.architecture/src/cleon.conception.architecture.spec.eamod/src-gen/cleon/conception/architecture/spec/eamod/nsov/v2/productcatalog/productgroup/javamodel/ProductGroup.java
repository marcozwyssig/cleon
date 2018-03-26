package cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ProductGroup extends DynamicResource implements IProductGroup {

  // abstract implementation, only used for static method calls
  private ProductGroup() {
    super(IProductGroup.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup selectToMeProducts(cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.product.javamodel.IProduct object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup.class, cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.productgroup.ProductgroupPackage.ProductGroup_products, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c9c23f77-67c8-11e7-afcc-6df3a81a4d17,f7zTAXFbgEMyIObbduooSCmgBOc=] */
