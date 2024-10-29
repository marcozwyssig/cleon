package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemConfigurationServiceGroup extends DynamicResource implements ISystemConfigurationServiceGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationServiceGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationServiceGroup>() {
    
    @Override
    public ISystemConfigurationServiceGroup create() {
      return new SystemConfigurationServiceGroup();
    }
    
    @Override
    public ISystemConfigurationServiceGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemConfigurationServiceGroup(resourceRepository, resource);
    }
  
  };

  public SystemConfigurationServiceGroup() {
    super(ISystemConfigurationServiceGroup.TYPE_ID);
  }
  
  public SystemConfigurationServiceGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemConfigurationServiceGroup.TYPE_ID);
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

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectServiceProvider() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.SystemConfigurationServiceGroup_serviceProvider);
  }

  public SystemConfigurationServiceGroup setServiceProvider(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration serviceProvider) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.SystemConfigurationServiceGroup_serviceProvider, serviceProvider);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> selectServices() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.AbstractServiceGroup_services);
  }

  public SystemConfigurationServiceGroup setServices(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> services) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.AbstractServiceGroup_services, services);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemConfigurationServiceGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.SystemConfigurationServiceGroup_serviceProvider, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.AbstractServiceGroup_services, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.ISystemConfigurationServiceGroup> selectToMeServiceProvider(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.ISystemConfigurationServiceGroup.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.SystemConfigurationServiceGroup_serviceProvider, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cb9950c8-6da3-11e9-8af5-2346ca56c2e2,prwsFoShAwAG/BI62eV6Onkxj8c=] */
