package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceResource extends DynamicResource implements IServiceResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceResource>() {
    
    @Override
    public IServiceResource create() {
      return new ServiceResource();
    }
    
    @Override
    public IServiceResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceResource(resourceRepository, resource);
    }
  
  };

  public ServiceResource() {
    super(IServiceResource.TYPE_ID);
  }
  
  public ServiceResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceResource.TYPE_ID);
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
  public java.lang.Boolean selectEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.ServicePackage.ServiceResource_enabled);
  }
    
  public void setEnabled(java.lang.Boolean enabled) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.ServicePackage.ServiceResource_enabled, enabled);
  }

  @Override
  public java.lang.String selectOptions() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.ServicePackage.ServiceResource_options);
  }
    
  public void setOptions(java.lang.String options) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.ServicePackage.ServiceResource_options, options);
  }

  @Override
  public java.lang.String selectTitle() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title);
  }
    
  public void setTitle(java.lang.String title) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, title);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel.IState selectEnsure() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel.IState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.ServicePackage.ServiceResource_ensure);
  }

  public ServiceResource setEnsure(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel.IState ensure) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.ServicePackage.ServiceResource_ensure, ensure);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.ServicePackage.ServiceResource_enabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.ServicePackage.ServiceResource_options, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel.IState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.ServicePackage.ServiceResource_ensure, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel.IServiceResource> selectToMeEnsure(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel.IState object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel.IServiceResource.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.ServicePackage.ServiceResource_ensure, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9c7325a1-ef3f-11e8-be8a-b748ff8f0a75,kgFX24ufrRz7dP1KmloGVijzITs=] */
