package cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Catalog extends DynamicResource implements ICatalog {

  // abstract implementation, only used for static method calls
  private Catalog() {
    super(ICatalog.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel.ICatalog selectToMeProductGroups(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel.ICatalog.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.ProductcatalogPackage.Catalog_productGroups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4d650153-67c6-11e7-afcc-6df3a81a4d17,7Ww414CKbhU6WrFhWIRYpLPTL2w=] */
