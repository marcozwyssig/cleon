package cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Network extends DynamicResource implements INetwork {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetwork> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetwork>() {
    
    @Override
    public INetwork create() {
      return new Network();
    }
    
    @Override
    public INetwork create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Network(resourceRepository, resource);
    }
  
  };

  public Network() {
    super(INetwork.TYPE_ID);
  }
  
  public Network(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetwork.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectVLAN() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_VLAN);
  }
    
  public void setVLAN(java.lang.Integer vLAN) {
     _setSingleAttribute(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_VLAN, vLAN);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public Network setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Network setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.ip.javamodel.IIPv4 selectGateway() {
    return _getSingle(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_gateway);
  }

  public Network setGateway(cleon.common.resources.spec.resources.ip.javamodel.IIPv4 gateway) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_gateway, gateway);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> selectGroups() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups);
  }

  public Network setGroups(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> groups) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, groups);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Mask selectIPv4_Mask() {
    return _getSingle(cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Mask.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Mask_aE_Aware_iPv4_aE_Mask);
  }

  public Network setIPv4_Mask(cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Mask iPv4_Mask) {
    _setSingle(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Mask_aE_Aware_iPv4_aE_Mask, iPv4_Mask);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.resources.spec.resources.ip.javamodel.IIPv4> selectIPv4s() {
    return _getList(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s);
  }

  public Network setIPv4s(java.util.List<? extends cleon.common.resources.spec.resources.ip.javamodel.IIPv4> iPv4s) {
    _setList(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s, iPv4s);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.ip.javamodel.IIPv4 selectNetwork() {
    return _getSingle(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_network);
  }

  public Network setNetwork(cleon.common.resources.spec.resources.ip.javamodel.IIPv4 network) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_network, network);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNode> selectNetworkNodes() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNode.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_networkNodes);
  }

  public Network setNetworkNodes(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNode> networkNodes) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_networkNodes, networkNodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Network setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone selectSecuritySubZone() {
    return _getSingle(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_securitySubZone);
  }

  public Network setSecuritySubZone(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone securitySubZone) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_securitySubZone, securitySubZone);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Network setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Network setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_VLAN, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_gateway, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Mask.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Mask_aE_Aware_iPv4_aE_Mask, visitor);
    _acceptList(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_network, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNode.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_networkNodes, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_securitySubZone, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetwork> selectToMeSecuritySubZone(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetwork.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_securitySubZone, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetwork selectToMeNetwork(cleon.common.resources.spec.resources.ip.javamodel.IIPv4 object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetwork.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_network, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetwork selectToMeGateway(cleon.common.resources.spec.resources.ip.javamodel.IIPv4 object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetwork.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_gateway, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetwork selectToMeNetworkNodes(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetwork.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.Network_networkNodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1f0c1a61-4b29-11e9-8338-41c203971ecb,S4o8OmlBzLxjVDeON/VDh5fz1to=] */
