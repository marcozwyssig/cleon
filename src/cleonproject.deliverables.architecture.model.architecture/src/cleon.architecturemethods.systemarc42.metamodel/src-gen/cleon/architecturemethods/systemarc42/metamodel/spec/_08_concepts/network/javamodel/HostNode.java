package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class HostNode extends DynamicResource implements IHostNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHostNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHostNode>() {
    
    @Override
    public IHostNode create() {
      return new HostNode();
    }
    
    @Override
    public IHostNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new HostNode(resourceRepository, resource);
    }
  
  };

  public HostNode() {
    super(IHostNode.TYPE_ID);
  }
  
  public HostNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHostNode.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

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

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost selectHost() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.HostNode_host);
  }

  public HostNode setHost(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.HostNode_host, host);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D selectIPv4_D() {
    return _getSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_iPv4_aE_D);
  }

  public HostNode setIPv4_D(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D iPv4_D) {
    _setSingle(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_iPv4_aE_D, iPv4_D);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain> selectRestrictToDomains() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.HostNode_restrictToDomains);
  }

  public HostNode setRestrictToDomains(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain> restrictToDomains) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.HostNode_restrictToDomains, restrictToDomains);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public HostNode setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public HostNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_exportDNSRecord, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.HostNode_host, visitor);
    _acceptSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_iPv4_aE_D, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.HostNode_restrictToDomains, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> selectToMeHost(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.HostNode_host, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> selectToMeRestrictToDomains(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.HostNode_restrictToDomains, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1580b55d-92a0-11e9-b2b4-f340ae70802c,7mG8h8zZi+FmOBFgQtYmoTRLALo=] */
