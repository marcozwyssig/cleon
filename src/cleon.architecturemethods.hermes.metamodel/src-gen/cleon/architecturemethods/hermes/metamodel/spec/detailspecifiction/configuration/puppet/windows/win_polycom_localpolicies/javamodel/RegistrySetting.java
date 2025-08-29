package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localpolicies.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RegistrySetting extends DynamicResource implements IRegistrySetting {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRegistrySetting> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRegistrySetting>() {
    
    @Override
    public IRegistrySetting create() {
      return new RegistrySetting();
    }
    
    @Override
    public IRegistrySetting create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RegistrySetting(resourceRepository, resource);
    }
  
  };

  public RegistrySetting() {
    super(IRegistrySetting.TYPE_ID);
  }
  
  public RegistrySetting(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRegistrySetting.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectRegistryKey() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localpolicies.Win_polycom_localpoliciesPackage.RegistrySetting_registryKey);
  }
    
  public void setRegistryKey(java.lang.String registryKey) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localpolicies.Win_polycom_localpoliciesPackage.RegistrySetting_registryKey, registryKey);
  }

  @Override
  public java.lang.String selectValueData() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localpolicies.Win_polycom_localpoliciesPackage.RegistrySetting_valueData);
  }
    
  public void setValueData(java.lang.String valueData) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localpolicies.Win_polycom_localpoliciesPackage.RegistrySetting_valueData, valueData);
  }

  @Override
  public java.lang.String selectValueType() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localpolicies.Win_polycom_localpoliciesPackage.RegistrySetting_valueType);
  }
    
  public void setValueType(java.lang.String valueType) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localpolicies.Win_polycom_localpoliciesPackage.RegistrySetting_valueType, valueType);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RegistrySetting setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localpolicies.Win_polycom_localpoliciesPackage.RegistrySetting_registryKey, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localpolicies.Win_polycom_localpoliciesPackage.RegistrySetting_valueData, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localpolicies.Win_polycom_localpoliciesPackage.RegistrySetting_valueType, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d0af758c-1090-11f0-b378-11a495632127,E5uTB1kg1n0u+vBolZbzzMWtINM=] */
