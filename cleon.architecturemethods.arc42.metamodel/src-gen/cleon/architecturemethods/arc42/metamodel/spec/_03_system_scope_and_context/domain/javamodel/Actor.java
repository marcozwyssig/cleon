package cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Actor extends DynamicResource implements IActor {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActor> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActor>() {
    
    @Override
    public IActor create() {
      return new Actor();
    }
    
    @Override
    public IActor create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Actor(resourceRepository, resource);
    }
  
  };

  public Actor() {
    super(IActor.TYPE_ID);
  }
  
  public Actor(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActor.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
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
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_In> selectDomainFlow_In() {
    return _getMultiMap(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_In.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.Actor_domainFlow_aE_In);
  }

  public Actor setDomainFlow_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_In> domainFlow_In) {
    _setMultiMap(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.Actor_domainFlow_aE_In, domainFlow_In);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_Out> selectDomainFlow_Out() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_Out.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.Actor_domainFlow_aE_Out);
  }

  public Actor setDomainFlow_Out(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_Out> domainFlow_Out) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.Actor_domainFlow_aE_Out, domainFlow_Out);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Actor setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMultiMap(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_In.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.Actor_domainFlow_aE_In, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_Out.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.Actor_domainFlow_aE_Out, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectToMeDomainFlow_Out(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_Out object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.Actor_domainFlow_aE_Out, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectToMeDomainFlow_In(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainFlow_In object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage.Actor_domainFlow_aE_In, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a037dbde-2660-11e6-ae54-e50d44645ae7,n/eladpFZlEj0rAPptRa02/mLVY=] */
