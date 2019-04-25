package ikt.product.documentation.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RoleSubnetGroup extends DynamicResource implements IRoleSubnetGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleSubnetGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleSubnetGroup>() {
    
    @Override
    public IRoleSubnetGroup create() {
      return new RoleSubnetGroup();
    }
    
    @Override
    public IRoleSubnetGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RoleSubnetGroup(resourceRepository, resource);
    }
  
  };

  public RoleSubnetGroup() {
    super(IRoleSubnetGroup.TYPE_ID);
  }
  
  public RoleSubnetGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoleSubnetGroup.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRole> selectRoles() {
    return _getMap(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRole.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RoleSubnetGroup_roles);
  }

  public RoleSubnetGroup setRoles(java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRole> roles) {
    _setMap(ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RoleSubnetGroup_roles, roles);
    return this;
  }
    
  @Override
  public ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNetDomainNode selectSupplySubnetNode() {
    return _getSingle(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNetDomainNode.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.SubnetGroup_supplySubnetNode);
  }

  public RoleSubnetGroup setSupplySubnetNode(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNetDomainNode supplySubnetNode) {
    _setSingle(ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.SubnetGroup_supplySubnetNode, supplySubnetNode);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RoleSubnetGroup setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RoleSubnetGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRole.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RoleSubnetGroup_roles, visitor);
    _acceptSingle(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNetDomainNode.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.SubnetGroup_supplySubnetNode, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleSubnetGroup selectToMeRoles(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRole object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleSubnetGroup.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RoleSubnetGroup_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,94d1c1e5-1da3-11e9-b601-db75aa6f89a4,/Sp+ih3bVhD8sjDSH3p6MDPtS2U=] */
