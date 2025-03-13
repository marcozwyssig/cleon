package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.hostname.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class HostnameResource extends DynamicResource implements IHostnameResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHostnameResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHostnameResource>() {
    
    @Override
    public IHostnameResource create() {
      return new HostnameResource();
    }
    
    @Override
    public IHostnameResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new HostnameResource(resourceRepository, resource);
    }
  
  };

  public HostnameResource() {
    super(IHostnameResource.TYPE_ID);
  }
  
  public HostnameResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHostnameResource.TYPE_ID);
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
  public java.lang.String selectTitle() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title);
  }
    
  public void setTitle(java.lang.String title) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, title);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public HostnameResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,040fa165-f19e-11e8-b3e7-15e2dd8d9b05,eB+LCzjYjCebEytpEmO1fm72+24=] */
