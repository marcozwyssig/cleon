package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class GatewayNode extends DynamicResource implements IGatewayNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGatewayNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGatewayNode>() {
    
    @Override
    public IGatewayNode create() {
      return new GatewayNode();
    }
    
    @Override
    public IGatewayNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new GatewayNode(resourceRepository, resource);
    }
  
  };

  public GatewayNode() {
    super(IGatewayNode.TYPE_ID);
  }
  
  public GatewayNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGatewayNode.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectExportDNSRecord() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_exportDNSRecord);
  }
    
  public void setExportDNSRecord(java.lang.Boolean exportDNSRecord) {
     _setSingleAttribute(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_exportDNSRecord, exportDNSRecord);
  }

  @Override
  public java.lang.Integer selectNodeNo() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.GatewayNode_nodeNo);
  }
    
  public void setNodeNo(java.lang.Integer nodeNo) {
     _setSingleAttribute(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.GatewayNode_nodeNo, nodeNo);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D selectIPv4_D() {
    return _getSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_iPv4_aE_D);
  }

  public GatewayNode setIPv4_D(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D iPv4_D) {
    _setSingle(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_iPv4_aE_D, iPv4_D);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public GatewayNode setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public GatewayNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_exportDNSRecord, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.GatewayNode_nodeNo, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_iPv4_aE_D, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7c1f6c45-7b8d-11e9-94aa-f1ea7ea33f46,3QDJYr5ijZkH6HJdAx56TFpW0gI=] */
