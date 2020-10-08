package cleon.projectmethods.hermes.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Role extends DynamicResource implements IRole {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRole> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRole>() {
    
    @Override
    public IRole create() {
      return new Role();
    }
    
    @Override
    public IRole create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Role(resourceRepository, resource);
    }
  
  };

  public Role() {
    super(IRole.TYPE_ID);
  }
  
  public Role(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRole.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectAuthority() {
    return _getListAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Role_authority);
  }
    
  public void setAuthority(java.util.List<java.lang.String> authority) {
     _setListAttribute(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Role_authority, authority);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectDisplayName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.DisplayName_displayName);
  }
    
  public void setDisplayName(java.lang.String displayName) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.naming.NamingPackage.DisplayName_displayName, displayName);
  }

  @Override
  public java.lang.String selectIdentifier() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.id.IdPackage.StringBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.String identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.StringBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectResponsibility() {
    return _getListAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Role_responsibility);
  }
    
  public void setResponsibility(java.util.List<java.lang.String> responsibility) {
     _setListAttribute(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Role_responsibility, responsibility);
  }

  @Override
  public java.util.List<java.lang.String> selectSkills() {
    return _getListAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Role_skills);
  }
    
  public void setSkills(java.util.List<java.lang.String> skills) {
     _setListAttribute(cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Role_skills, skills);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Role setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Role_authority, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.DisplayName_displayName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.id.IdPackage.StringBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Role_responsibility, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.SpecPackage.Role_skills, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,92f47870-31ca-11e8-8a84-6f139e67278b,VLbXnVvP/ruAPFDnYBdoRfSmFM0=] */
