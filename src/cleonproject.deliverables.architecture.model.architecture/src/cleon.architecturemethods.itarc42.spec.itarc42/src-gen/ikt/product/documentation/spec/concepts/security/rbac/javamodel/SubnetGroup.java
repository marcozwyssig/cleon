package ikt.product.documentation.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SubnetGroup extends DynamicResource implements ISubnetGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubnetGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubnetGroup>() {
    
    @Override
    public ISubnetGroup create() {
      return new SubnetGroup();
    }
    
    @Override
    public ISubnetGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SubnetGroup(resourceRepository, resource);
    }
  
  };

  public SubnetGroup() {
    super(ISubnetGroup.TYPE_ID);
  }
  
  public SubnetGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISubnetGroup.TYPE_ID);
  }

  // relations
  
  @Override
  public ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNetDomainNode selectSupplySubnetNode() {
    return _getSingle(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNetDomainNode.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.SubnetGroup_supplySubnetNode);
  }

  public SubnetGroup setSupplySubnetNode(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNetDomainNode supplySubnetNode) {
    _setSingle(ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.SubnetGroup_supplySubnetNode, supplySubnetNode);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SubnetGroup setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SubnetGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNetDomainNode.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.SubnetGroup_supplySubnetNode, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ikt.product.documentation.spec.concepts.security.rbac.javamodel.ISubnetGroup> selectToMeSupplySubnetNode(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNetDomainNode object) {
    return _getToMeList(object.getRepository(), ikt.product.documentation.spec.concepts.security.rbac.javamodel.ISubnetGroup.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.SubnetGroup_supplySubnetNode, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b1b09ea6-1e06-11e9-834d-77c41fccc6bf,ahEHUyak7bYDrU2ZI9dPDi57uV0=] */
