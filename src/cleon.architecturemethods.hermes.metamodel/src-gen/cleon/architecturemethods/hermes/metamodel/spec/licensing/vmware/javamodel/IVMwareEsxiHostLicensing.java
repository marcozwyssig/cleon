package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVMwareEsxiHostLicensing extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAmountAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("53756815-e4a3-11ef-a6bd-497168f25adc");
  
  // attributes
  
  public java.lang.Integer selectAmount();
  
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwarevSphereLicense selectVmWareLicenseType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,53756815-e4a3-11ef-a6bd-497168f25adc,wQ7ifJJRnacKGklJiCg+IpxVVRI=] */
