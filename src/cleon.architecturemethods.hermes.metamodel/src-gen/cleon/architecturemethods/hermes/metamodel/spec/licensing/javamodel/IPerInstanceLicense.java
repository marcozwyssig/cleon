package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPerInstanceLicense extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductEnvironmentLicensing, cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAmountAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3f9dc083-dfcc-11ef-b0be-9b4cac321140");
  
  // attributes
  
  public java.lang.Integer selectAmount();
  
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant selectUseProductVariantForCalc();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3f9dc083-dfcc-11ef-b0be-9b4cac321140,2hRm5VW2JkxzQzCCaVSBSBezby0=] */
