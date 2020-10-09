package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AuthZBuildingBlockForPermission extends DynamicResource implements IAuthZBuildingBlockForPermission {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAuthZBuildingBlockForPermission> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAuthZBuildingBlockForPermission>() {
    
    @Override
    public IAuthZBuildingBlockForPermission create() {
      return new AuthZBuildingBlockForPermission();
    }
    
    @Override
    public IAuthZBuildingBlockForPermission create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AuthZBuildingBlockForPermission(resourceRepository, resource);
    }
  
  };

  public AuthZBuildingBlockForPermission() {
    super(IAuthZBuildingBlockForPermission.TYPE_ID);
  }
  
  public AuthZBuildingBlockForPermission(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAuthZBuildingBlockForPermission.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermission selectPermission() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockForPermission_permission);
  }

  public AuthZBuildingBlockForPermission setPermission(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermission permission) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockForPermission_permission, permission);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AuthZBuildingBlockForPermission setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AuthZBuildingBlockForPermission setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockForPermission_permission, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.javamodel.IAuthZBuildingBlockForPermission> selectToMePermission(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermission object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.javamodel.IAuthZBuildingBlockForPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.BuildingblockPackage.AuthZBuildingBlockForPermission_permission, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e2629021-0a00-11eb-a857-d17d567fc174,vEIU0e7Ipy6aVwldShSwb65M+iU=] */
