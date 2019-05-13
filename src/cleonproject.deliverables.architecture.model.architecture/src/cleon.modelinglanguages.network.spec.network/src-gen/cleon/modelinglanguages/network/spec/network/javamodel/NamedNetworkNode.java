package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedNetworkNode extends DynamicResource implements INamedNetworkNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedNetworkNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedNetworkNode>() {
    
    @Override
    public INamedNetworkNode create() {
      return new NamedNetworkNode();
    }
    
    @Override
    public INamedNetworkNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedNetworkNode(resourceRepository, resource);
    }
  
  };

  public NamedNetworkNode() {
    super(INamedNetworkNode.TYPE_ID);
  }
  
  public NamedNetworkNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedNetworkNode.TYPE_ID);
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
  public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_D selectIPv4_D() {
    return _getSingle(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworkNode_iPv4_aE_D);
  }

  public NamedNetworkNode setIPv4_D(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_D iPv4_D) {
    _setSingle(cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworkNode_iPv4_aE_D, iPv4_D);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public NamedNetworkNode setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedNetworkNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworkNode_iPv4_aE_D, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a4e6496f-7403-11e9-8765-0925552fc2b7,cjIzBlTapXKptlbRKDGOKjksHDY=] */
