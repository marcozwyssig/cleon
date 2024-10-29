package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemDeliverable extends DynamicResource implements ISystemDeliverable {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemDeliverable> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemDeliverable>() {
    
    @Override
    public ISystemDeliverable create() {
      return new SystemDeliverable();
    }
    
    @Override
    public ISystemDeliverable create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemDeliverable(resourceRepository, resource);
    }
  
  };

  public SystemDeliverable() {
    super(ISystemDeliverable.TYPE_ID);
  }
  
  public SystemDeliverable(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemDeliverable.TYPE_ID);
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

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner);
  }

  public SystemDeliverable setOwner(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson owner) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner, owner);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.javamodel.IState selectState() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.javamodel.IState.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.ScopePackage.StateAware_state);
  }

  public SystemDeliverable setState(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.javamodel.IState state) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.ScopePackage.StateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemDeliverable setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.javamodel.IState.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.ScopePackage.StateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,471bb7a7-b467-11e8-bb21-172cc8e5f7cd,9FalfevxgKV+XlMmnrrfrK9CmZA=] */
