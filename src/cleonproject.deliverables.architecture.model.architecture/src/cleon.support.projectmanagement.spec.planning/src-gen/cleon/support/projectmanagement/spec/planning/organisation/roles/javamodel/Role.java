package cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel;

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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.support.projectmanagement.spec.resource.organisations.javamodel.IOrganisation selectOrganisation() {
    return _getSingle(cleon.support.projectmanagement.spec.resource.organisations.javamodel.IOrganisation.class, cleon.support.projectmanagement.spec.planning.organisation.roles.RolesPackage.Role_organisation);
  }

  public Role setOrganisation(cleon.support.projectmanagement.spec.resource.organisations.javamodel.IOrganisation organisation) {
    _setSingle(cleon.support.projectmanagement.spec.planning.organisation.roles.RolesPackage.Role_organisation, organisation);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.ISkillUtilization> selectRequiredSkills() {
    return _getMap(cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.ISkillUtilization.class, cleon.support.projectmanagement.spec.planning.organisation.roles.RolesPackage.Role_requiredSkills);
  }

  public Role setRequiredSkills(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.ISkillUtilization> requiredSkills) {
    _setMap(cleon.support.projectmanagement.spec.planning.organisation.roles.RolesPackage.Role_requiredSkills, requiredSkills);
    return this;
  }
    
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.support.projectmanagement.spec.resource.organisations.javamodel.IOrganisation.class, cleon.support.projectmanagement.spec.planning.organisation.roles.RolesPackage.Role_organisation, visitor);
    _acceptMap(cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.ISkillUtilization.class, cleon.support.projectmanagement.spec.planning.organisation.roles.RolesPackage.Role_requiredSkills, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.IRole> selectToMeOrganisation(cleon.support.projectmanagement.spec.resource.organisations.javamodel.IOrganisation object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.IRole.class, cleon.support.projectmanagement.spec.planning.organisation.roles.RolesPackage.Role_organisation, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.IRole selectToMeRequiredSkills(cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.ISkillUtilization object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.IRole.class, cleon.support.projectmanagement.spec.planning.organisation.roles.RolesPackage.Role_requiredSkills, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ee77c649-bc93-11e6-904c-8bf6f8927ff0,zikGkwUlN8KbDZu/sfI+SJWSrdY=] */
