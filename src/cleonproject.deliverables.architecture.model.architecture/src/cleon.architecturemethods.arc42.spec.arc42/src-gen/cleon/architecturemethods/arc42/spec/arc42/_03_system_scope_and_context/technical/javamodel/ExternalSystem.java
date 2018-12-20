package cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ExternalSystem extends DynamicResource implements IExternalSystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExternalSystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExternalSystem>() {
    
    @Override
    public IExternalSystem create() {
      return new ExternalSystem();
    }
    
    @Override
    public IExternalSystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ExternalSystem(resourceRepository, resource);
    }
  
  };

  public ExternalSystem() {
    super(IExternalSystem.TYPE_ID);
  }
  
  public ExternalSystem(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExternalSystem.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectFormat() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.ExternalSystem_format);
  }
    
  public void setFormat(java.lang.String format) {
     _setSingleAttribute(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.ExternalSystem_format, format);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectProtocol() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.ExternalSystem_protocol);
  }
    
  public void setProtocol(java.lang.String protocol) {
     _setSingleAttribute(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.ExternalSystem_protocol, protocol);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ExternalSystem setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.ExternalSystem_format, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.ExternalSystem_protocol, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2e0ed149-2801-11e6-b263-9db62e053e59,/yZf0vkLTjm/cJA4XIqLusFiGqo=] */
