package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICaCrlDistributionPoint extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("18637d1f-0fd1-11f0-999f-c7e64e984aff");
  
  // attributes
  
  public java.lang.Boolean selectPublishToServer();
  
  public java.lang.Boolean selectPublishDeltaToServer();
  
  public java.lang.Boolean selectAddToCertificateCdp();
  
  public java.lang.Boolean selectAddToFreshestCrl();
  
  public java.lang.Boolean selectAddToCrlCdp();
  
  public java.lang.Boolean selectAddToCrlIdp();
  
  public java.lang.String selectUri();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,18637d1f-0fd1-11f0-999f-c7e64e984aff,h/Q2rvwBQP62fMAa2yMBPN+vjuk=] */
