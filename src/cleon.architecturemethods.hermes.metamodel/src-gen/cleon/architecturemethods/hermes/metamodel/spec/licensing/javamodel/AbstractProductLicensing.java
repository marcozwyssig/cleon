package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractProductLicensing extends DynamicResource implements IAbstractProductLicensing {

  // abstract implementation, only used for static method calls
  private AbstractProductLicensing() {
    super(IAbstractProductLicensing.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductLicensing> selectToMeProduct_variant(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductLicensing.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractProductLicensing_product_aE_variant, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,de7849ee-dfbe-11ef-b0be-9b4cac321140,f7CHsEALHHdk7vuIxkPwmo8OPe8=] */
