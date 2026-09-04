package cleon.architecturemethods.hermes.metamodel.spec.licensing.veeam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVeeamAvailabilitySuiteLicense extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractVirtualiuationServersLicense {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("524f51d5-e4b8-11ef-a6bd-497168f25adc");
  
  // attributes
  
  public java.lang.Integer selectTotalSockets();
  
  public java.lang.String selectRecommendedLicense();
  
  public java.lang.Integer selectRequiredLicenses();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> selectVmsToBackup();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,524f51d5-e4b8-11ef-a6bd-497168f25adc,uv4wV3WbnLqqZbEtOfKRDyXaQoY=] */
