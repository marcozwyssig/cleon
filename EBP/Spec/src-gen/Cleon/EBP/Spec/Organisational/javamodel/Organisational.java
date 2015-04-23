package Cleon.EBP.Spec.Organisational.javamodel;

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
  public Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise selectOrganisation() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise.class, Cleon.EBP.Spec.Organisational.OrganisationalPackage.Organisational_organisation);
  }

  public Organisational setOrganisation(Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise organisation) {
    _setSingle(Cleon.EBP.Spec.Organisational.OrganisationalPackage.Organisational_organisation, organisation);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IRole> selectRoles() {
    return _getList(Cleon.EBP.Spec.Organisational.Role.javamodel.IRole.class, Cleon.EBP.Spec.Organisational.OrganisationalPackage.Organisational_roles);
  }

  public Organisational setRoles(java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IRole> roles) {
    _setList(Cleon.EBP.Spec.Organisational.OrganisationalPackage.Organisational_roles, roles);
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
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise.class, Cleon.EBP.Spec.Organisational.OrganisationalPackage.Organisational_organisation, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Role.javamodel.IRole.class, Cleon.EBP.Spec.Organisational.OrganisationalPackage.Organisational_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static Cleon.EBP.Spec.Organisational.javamodel.IOrganisational selectToMeRoles(Cleon.EBP.Spec.Organisational.Role.javamodel.IRole object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.javamodel.IOrganisational.class, Cleon.EBP.Spec.Organisational.OrganisationalPackage.Organisational_roles, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.javamodel.IOrganisational selectToMeOrganisation(Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.javamodel.IOrganisational.class, Cleon.EBP.Spec.Organisational.OrganisationalPackage.Organisational_organisation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d3a168b2-daa0-11e3-aefe-17a44e29631e,Nzpw/5tG8lkxFFxDwGnz1+3ZDC0=] */
