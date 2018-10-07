package cleon.initialization.projectmanagement.spec.resource.persons.roles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RolePerson extends DynamicResource implements IRolePerson {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRolePerson> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRolePerson>() {
    
    @Override
    public IRolePerson create() {
      return new RolePerson();
    }
    
    @Override
    public IRolePerson create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RolePerson(resourceRepository, resource);
    }
  
  };

  public RolePerson() {
    super(IRolePerson.TYPE_ID);
  }
  
  public RolePerson(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRolePerson.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRole selectRole() {
    return _getSingle(cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRole.class, cleon.initialization.projectmanagement.spec.resource.persons.roles.RolesPackage.RolePerson_role);
  }

  public RolePerson setRole(cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRole role) {
    _setSingle(cleon.initialization.projectmanagement.spec.resource.persons.roles.RolesPackage.RolePerson_role, role);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RolePerson setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RolePerson setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRole.class, cleon.initialization.projectmanagement.spec.resource.persons.roles.RolesPackage.RolePerson_role, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.resource.persons.roles.javamodel.IRolePerson> selectToMeRole(cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRole object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.resource.persons.roles.javamodel.IRolePerson.class, cleon.initialization.projectmanagement.spec.resource.persons.roles.RolesPackage.RolePerson_role, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,464eda4e-bb5f-11e8-921b-c1cf01226512,2YC7wcJKZeIbKB3Nx5D8THn7Qhs=] */
