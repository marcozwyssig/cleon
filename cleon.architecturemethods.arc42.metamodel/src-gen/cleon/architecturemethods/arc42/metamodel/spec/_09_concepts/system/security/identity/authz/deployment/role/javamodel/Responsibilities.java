package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Responsibilities extends DynamicResource implements IResponsibilities {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResponsibilities> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResponsibilities>() {
    
    @Override
    public IResponsibilities create() {
      return new Responsibilities();
    }
    
    @Override
    public IResponsibilities create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Responsibilities(resourceRepository, resource);
    }
  
  };

  public Responsibilities() {
    super(IResponsibilities.TYPE_ID);
  }
  
  public Responsibilities(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResponsibilities.TYPE_ID);
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
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities selectBasedOn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.Responsibilities_basedOn);
  }

  public Responsibilities setBasedOn(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities basedOn) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.Responsibilities_basedOn, basedOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibility> selectResponsibilities() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibility.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.Responsibilities_responsibilities);
  }

  public Responsibilities setResponsibilities(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibility> responsibilities) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.Responsibilities_responsibilities, responsibilities);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Responsibilities setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.Responsibilities_basedOn, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibility.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.Responsibilities_responsibilities, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities selectToMeResponsibilities(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibility object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.Responsibilities_responsibilities, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities> selectToMeBasedOn(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.Responsibilities_basedOn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,081f405d-809c-11e9-8e65-f3f639e40a34,5AIVz0zBqpuaqF6IYKvQrsIbKAo=] */
