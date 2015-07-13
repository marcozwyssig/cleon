package cleon.epm.spec.organisational.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Organisational extends DynamicResource implements IOrganisational {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisational> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisational>() {
    
    @Override
    public IOrganisational create() {
      return new Organisational();
    }
    
    @Override
    public IOrganisational create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Organisational(resourceRepository, resource);
    }
  
  };

  public Organisational() {
    super(IOrganisational.TYPE_ID);
  }
  
  public Organisational(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrganisational.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.epm.spec.organisational.unit.javamodel.IEnterprise selectOrganisation() {
    return _getSingle(cleon.epm.spec.organisational.unit.javamodel.IEnterprise.class, cleon.epm.spec.organisational.OrganisationalPackage.Organisational_organisation);
  }

  public Organisational setOrganisation(cleon.epm.spec.organisational.unit.javamodel.IEnterprise organisation) {
    _setSingle(cleon.epm.spec.organisational.OrganisationalPackage.Organisational_organisation, organisation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.epm.spec.organisational.role.javamodel.IRole> selectRoles() {
    return _getList(cleon.epm.spec.organisational.role.javamodel.IRole.class, cleon.epm.spec.organisational.OrganisationalPackage.Organisational_roles);
  }

  public Organisational setRoles(java.util.List<? extends cleon.epm.spec.organisational.role.javamodel.IRole> roles) {
    _setList(cleon.epm.spec.organisational.OrganisationalPackage.Organisational_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Organisational setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.epm.spec.organisational.unit.javamodel.IEnterprise.class, cleon.epm.spec.organisational.OrganisationalPackage.Organisational_organisation, visitor);
    _acceptList(cleon.epm.spec.organisational.role.javamodel.IRole.class, cleon.epm.spec.organisational.OrganisationalPackage.Organisational_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.epm.spec.organisational.javamodel.IOrganisational selectToMeRoles(cleon.epm.spec.organisational.role.javamodel.IRole object) {
    return _getToMeSingle(object.getRepository(), cleon.epm.spec.organisational.javamodel.IOrganisational.class, cleon.epm.spec.organisational.OrganisationalPackage.Organisational_roles, object.getResource());
  }
  
  public static cleon.epm.spec.organisational.javamodel.IOrganisational selectToMeOrganisation(cleon.epm.spec.organisational.unit.javamodel.IEnterprise object) {
    return _getToMeSingle(object.getRepository(), cleon.epm.spec.organisational.javamodel.IOrganisational.class, cleon.epm.spec.organisational.OrganisationalPackage.Organisational_organisation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d3a168b2-daa0-11e3-aefe-17a44e29631e,9HKYaTWnL7Hs1kBE53XnUcnzJDs=] */
