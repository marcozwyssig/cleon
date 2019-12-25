package cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ProductAware extends DynamicResource implements IProductAware {

  // abstract implementation, only used for static method calls
  private ProductAware() {
    super(IProductAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductAware> selectToMeUsingProducts(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductAware.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductAware_usingProducts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,194287ca-0a76-11e9-9915-0d353533f3da,vCfJsXAnxtVmy6ApYv1VVxMwu70=] */
