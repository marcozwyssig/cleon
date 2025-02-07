package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVmwareEsxiServerLicense extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractVirtualiuationServersLicense {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b94498f2-e4a2-11ef-a6bd-497168f25adc");
  
  // attributes
  
  public java.lang.Integer selectTotalCores();
  
  public java.lang.String selectRecommendedLicense();
  
  public java.lang.Integer selectRequiredLicenses();
  
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwarevSphereLicense selectVmwareEsxiLicense();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b94498f2-e4a2-11ef-a6bd-497168f25adc,hFhQEi45VrFY3s45dAVdrId5hD4=] */
