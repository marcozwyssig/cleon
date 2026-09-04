package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Certificate extends DynamicResource implements ICertificate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICertificate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICertificate>() {
    
    @Override
    public ICertificate create() {
      return new Certificate();
    }
    
    @Override
    public ICertificate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Certificate(resourceRepository, resource);
    }
  
  };

  public Certificate() {
    super(ICertificate.TYPE_ID);
  }
  
  public Certificate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICertificate.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectCommon_name() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_common_aE_name);
  }
    
  public void setCommon_name(java.lang.String common_name) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_common_aE_name, common_name);
  }

  @Override
  public java.lang.String selectCountry_name() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_country_aE_name);
  }
    
  public void setCountry_name(java.lang.String country_name) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_country_aE_name, country_name);
  }

  @Override
  public java.util.List<java.lang.String> selectExtended_key_usage() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_extended_aE_key_aE_usage);
  }
    
  public void setExtended_key_usage(java.util.List<java.lang.String> extended_key_usage) {
     _setListAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_extended_aE_key_aE_usage, extended_key_usage);
  }

  @Override
  public java.lang.Integer selectKey_size() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_key_aE_size);
  }
    
  public void setKey_size(java.lang.Integer key_size) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_key_aE_size, key_size);
  }

  @Override
  public java.lang.String selectLocality_name() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_locality_aE_name);
  }
    
  public void setLocality_name(java.lang.String locality_name) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_locality_aE_name, locality_name);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectOrganization_name() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_organization_aE_name);
  }
    
  public void setOrganization_name(java.lang.String organization_name) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_organization_aE_name, organization_name);
  }

  @Override
  public java.lang.String selectOrganizational_unit_name() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_organizational_aE_unit_aE_name);
  }
    
  public void setOrganizational_unit_name(java.lang.String organizational_unit_name) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_organizational_aE_unit_aE_name, organizational_unit_name);
  }

  @Override
  public java.lang.String selectState_or_province_name() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_state_aE_or_aE_province_aE_name);
  }
    
  public void setState_or_province_name(java.lang.String state_or_province_name) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_state_aE_or_aE_province_aE_name, state_or_province_name);
  }

  @Override
  public java.util.List<java.lang.String> selectSubject_alt_names() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_subject_aE_alt_aE_names);
  }
    
  public void setSubject_alt_names(java.util.List<java.lang.String> subject_alt_names) {
     _setListAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_subject_aE_alt_aE_names, subject_alt_names);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.IKeyUsage> selectKey_usage() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.IKeyUsage.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_key_aE_usage);
  }

  public Certificate setKey_usage(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.IKeyUsage> key_usage) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_key_aE_usage, key_usage);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectSubject_alt_names_from_host() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_subject_aE_alt_aE_names_aE_from_aE_host);
  }

  public Certificate setSubject_alt_names_from_host(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost subject_alt_names_from_host) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_subject_aE_alt_aE_names_aE_from_aE_host, subject_alt_names_from_host);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Certificate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_common_aE_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_country_aE_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_extended_aE_key_aE_usage, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_key_aE_size, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_locality_aE_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_organization_aE_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_organizational_aE_unit_aE_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_state_aE_or_aE_province_aE_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_subject_aE_alt_aE_names, visitor);
    // relations
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.IKeyUsage.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_key_aE_usage, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_subject_aE_alt_aE_names_aE_from_aE_host, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.ICertificate> selectToMeKey_usage(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.IKeyUsage object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.ICertificate.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_key_aE_usage, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.ICertificate> selectToMeSubject_alt_names_from_host(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel.ICertificate.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.Certificate_subject_aE_alt_aE_names_aE_from_aE_host, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8ba9bd3c-4d1e-11f0-954b-b579526ae084,ziXENf+rGY3vAjzFNBP/qC66Tgg=] */
