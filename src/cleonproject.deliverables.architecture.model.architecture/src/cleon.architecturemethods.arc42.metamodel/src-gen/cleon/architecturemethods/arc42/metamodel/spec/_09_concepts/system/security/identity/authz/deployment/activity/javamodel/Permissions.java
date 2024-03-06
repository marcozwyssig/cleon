package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Permissions extends DynamicResource implements IPermissions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPermissions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPermissions>() {
    
    @Override
    public IPermissions create() {
      return new Permissions();
    }
    
    @Override
    public IPermissions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Permissions(resourceRepository, resource);
    }
  
  };

  public Permissions() {
    super(IPermissions.TYPE_ID);
  }
  
  public Permissions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPermissions.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissions> selectBasedOn() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissions.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.ActivityPackage.Permissions_basedOn);
  }

  public Permissions setBasedOn(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissions> basedOn) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.ActivityPackage.Permissions_basedOn, basedOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermission> selectPermissions() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.ActivityPackage.Permissions_permissions);
  }

  public Permissions setPermissions(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermission> permissions) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.ActivityPackage.Permissions_permissions, permissions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Permissions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissions.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.ActivityPackage.Permissions_basedOn, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.ActivityPackage.Permissions_permissions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissions selectToMePermissions(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermission object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissions.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.ActivityPackage.Permissions_permissions, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissions> selectToMeBasedOn(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissions object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissions.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.ActivityPackage.Permissions_basedOn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a1b6bd66-8099-11e9-8e65-f3f639e40a34,mu5FsyHMzr5IWjW614e5NF8ixXg=] */
