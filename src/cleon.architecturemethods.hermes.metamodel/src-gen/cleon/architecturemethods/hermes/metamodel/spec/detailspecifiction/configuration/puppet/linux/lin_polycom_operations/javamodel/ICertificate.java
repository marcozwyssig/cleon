package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICertificate extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8ba9bd3c-4d1e-11f0-954b-b579526ae084");
  
  // attributes
  
  public java.lang.String selectCommon_name();
  
  public java.lang.Boolean selectGenerate_key();
  
  public java.lang.Integer selectKey_size();
  
  public java.lang.String selectCountry_name();
  
  public java.lang.String selectState_or_province_name();
  
  public java.lang.String selectLocality_name();
  
  public java.lang.String selectOrganization_name();
  
  public java.lang.String selectOrganizational_unit_name();
  
  public java.util.List<java.lang.String> selectExtended_key_usage();
  
  public java.util.List<java.lang.String> selectSubject_alt_names();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.IKeyType selectKey_type();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.IKeyUsage> selectKey_usage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8ba9bd3c-4d1e-11f0-954b-b579526ae084,8qoTytJZnhpD8CZb8HLVFQjdDt8=] */
