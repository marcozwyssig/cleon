package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOpenVmwareLicense extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductLicensing {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d4585acd-dff0-11ef-8b41-bffcdee4ee9e");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwareLicenseType selectVmwareLicenseType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d4585acd-dff0-11ef-8b41-bffcdee4ee9e,oO8ZgE0ISV3rL8e/GS1sIUsmB1Y=] */
