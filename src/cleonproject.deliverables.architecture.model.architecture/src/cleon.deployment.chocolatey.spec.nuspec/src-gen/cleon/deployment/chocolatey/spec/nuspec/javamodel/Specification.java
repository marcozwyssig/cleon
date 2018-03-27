package cleon.deployment.chocolatey.spec.nuspec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Specification extends DynamicResource implements ISpecification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpecification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpecification>() {
    
    @Override
    public ISpecification create() {
      return new Specification();
    }
    
    @Override
    public ISpecification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Specification(resourceRepository, resource);
    }
  
  };

  public Specification() {
    super(ISpecification.TYPE_ID);
  }
  
  public Specification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISpecification.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDisplayName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.DisplayName_displayName);
  }
    
  public void setDisplayName(java.lang.String displayName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.DisplayName_displayName, displayName);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectRequireLicenseAcceptance() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.deployment.chocolatey.spec.nuspec.NuspecPackage.Specification_requireLicenseAcceptance);
  }
    
  public void setRequireLicenseAcceptance(java.lang.Boolean requireLicenseAcceptance) {
     _setSingleAttribute(cleon.deployment.chocolatey.spec.nuspec.NuspecPackage.Specification_requireLicenseAcceptance, requireLicenseAcceptance);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> selectAuthors() {
    return _getList(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.AuthorsAware_authors);
  }

  public Specification setAuthors(java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> authors) {
    _setList(cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.AuthorsAware_authors, authors);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner);
  }

  public Specification setOwner(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson owner) {
    _setSingle(cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, owner);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Specification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion selectVersion() {
    return _getSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version);
  }

  public Specification setVersion(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion version) {
    _setSingle(cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, version);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.DisplayName_displayName, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.deployment.chocolatey.spec.nuspec.NuspecPackage.Specification_requireLicenseAcceptance, visitor);
    // relations
    _acceptList(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.AuthorsAware_authors, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4652f766-4d0b-11e6-9043-01b29b61e580,2507sFgb4XkIcv9HUAa2HgK5PDw=] */
