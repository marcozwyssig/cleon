package cleon.conception.framework.spec.arc42._03_system_scope_and_context.domain.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DomainFlow extends DynamicResource implements IDomainFlow {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDomainFlow> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDomainFlow>() {
    
    @Override
    public IDomainFlow create() {
      return new DomainFlow();
    }
    
    @Override
    public IDomainFlow create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DomainFlow(resourceRepository, resource);
    }
  
  };

  public DomainFlow() {
    super(IDomainFlow.TYPE_ID);
  }
  
  public DomainFlow(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDomainFlow.TYPE_ID);
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
  public java.lang.Boolean selectDirectionTo() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_directionTo);
  }
    
  public void setDirectionTo(java.lang.Boolean directionTo) {
     _setSingleAttribute(cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_directionTo, directionTo);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
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
  public cleon.conception.framework.spec.arc42._03_system_scope_and_context.javamodel.IMember selectFrom() {
    return _getSingle(cleon.conception.framework.spec.arc42._03_system_scope_and_context.javamodel.IMember.class, cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_from);
  }

  public DomainFlow setFrom(cleon.conception.framework.spec.arc42._03_system_scope_and_context.javamodel.IMember from) {
    _setSingle(cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_from, from);
    return this;
  }
    
  @Override
  public cleon.conception.framework.spec.arc42._03_system_scope_and_context.javamodel.IMember selectTo() {
    return _getSingle(cleon.conception.framework.spec.arc42._03_system_scope_and_context.javamodel.IMember.class, cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_to);
  }

  public DomainFlow setTo(cleon.conception.framework.spec.arc42._03_system_scope_and_context.javamodel.IMember to) {
    _setSingle(cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DomainFlow setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_directionTo, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.conception.framework.spec.arc42._03_system_scope_and_context.javamodel.IMember.class, cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_from, visitor);
    _acceptSingle(cleon.conception.framework.spec.arc42._03_system_scope_and_context.javamodel.IMember.class, cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,16f12ce9-27ef-11e6-b263-9db62e053e59,N6tlpeUqMzQ+mwakIqz9z6Btdko=] */
