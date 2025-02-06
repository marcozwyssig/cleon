package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVmwareEsxiServerLicense extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductEnvironmentLicensing {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b94498f2-e4a2-11ef-a6bd-497168f25adc");
  
  public java.lang.Integer selectTotalCores();
  
  public java.lang.String selectRecommendedLicense();
  
  public java.lang.Integer selectRequiredLicenses();
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.javamodel.INode> selectHosts();
  
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel.IVMwarevSphereLicense selectVmwareEsxiLicense();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b94498f2-e4a2-11ef-a6bd-497168f25adc,1VlJ/mhxHYVclCTJUOTXwRcJgVg=] */
