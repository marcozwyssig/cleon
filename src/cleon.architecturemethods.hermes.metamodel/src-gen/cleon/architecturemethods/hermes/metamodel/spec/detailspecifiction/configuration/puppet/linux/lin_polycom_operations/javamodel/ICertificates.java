package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICertificates extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bc2d9fd2-4d0f-11f0-954b-b579526ae084");
  
  public java.lang.String selectSmb_share_name();
  
  public java.lang.String selectLogonAs();
  
  public java.lang.String selectSmb_csr_destination();
  
  public java.lang.String selectSmb_cert_source();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectSmb_server_host();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount selectSmb_username();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.ICertificate> selectCertificates();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bc2d9fd2-4d0f-11f0-954b-b579526ae084,/RxNLxiJHuorVXahps40pOemSA8=] */
