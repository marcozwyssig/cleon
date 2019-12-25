package cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DomainFlow_In extends DynamicResource implements IDomainFlow_In {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDomainFlow_In> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDomainFlow_In>() {
    
    @Override
    public IDomainFlow_In create() {
      return new DomainFlow_In();
    }
    
    @Override
    public IDomainFlow_In create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DomainFlow_In(resourceRepository, resource);
    }
  
  };

  public DomainFlow_In() {
    super(IDomainFlow_In.TYPE_ID);
  }
  
  public DomainFlow_In(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDomainFlow_In.TYPE_ID);
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
  public cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider selectPort_Provider() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.DomainFlow_aE_In_port_aE_Provider);
  }

  public DomainFlow_In setPort_Provider(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider port_Provider) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.DomainFlow_aE_In_port_aE_Provider, port_Provider);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DomainFlow_In setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DomainFlow_In setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.DomainFlow_aE_In_port_aE_Provider, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_In> selectToMePort_Provider(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_In.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.DomainFlow_aE_In_port_aE_Provider, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,86875155-0523-11e9-95f7-3b0c47908608,a/prWLxJsYFHs2XyFumJL+APdqY=] */
