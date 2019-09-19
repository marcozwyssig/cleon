package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NetworkSubZone extends DynamicResource implements INetworkSubZone {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkSubZone> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkSubZone>() {
    
    @Override
    public INetworkSubZone create() {
      return new NetworkSubZone();
    }
    
    @Override
    public INetworkSubZone create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NetworkSubZone(resourceRepository, resource);
    }
  
  };

  public NetworkSubZone() {
    super(INetworkSubZone.TYPE_ID);
  }
  
  public NetworkSubZone(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetworkSubZone.TYPE_ID);
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

  public NetworkSubZone setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_Mask selectCidr() {
    return _getSingle(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_Mask.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidr);
  }

  public NetworkSubZone setCidr(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_Mask cidr) {
    _setSingle(cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidr, cidr);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public NetworkSubZone setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> selectGroups() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups);
  }

  public NetworkSubZone setGroups(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> groups) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, groups);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public NetworkSubZone setNoChapters(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkNode> selectNode() {
    return _getMap(cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkNode.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractPhysicalNetwork_node);
  }

  public NetworkSubZone setNode(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkNode> node) {
    _setMap(cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractPhysicalNetwork_node, node);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public NetworkSubZone setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone selectSecuritySubZone() {
    return _getSingle(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.NetworkSubZone_securitySubZone);
  }

  public NetworkSubZone setSecuritySubZone(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone securitySubZone) {
    _setSingle(cleon.modelinglanguages.network.spec.network.NetworkPackage.NetworkSubZone_securitySubZone, securitySubZone);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public NetworkSubZone setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NetworkSubZone setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_Mask.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidr, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, visitor);
    _acceptMap(cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkNode.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractPhysicalNetwork_node, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.NetworkSubZone_securitySubZone, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.network.spec.network.javamodel.INetworkSubZone> selectToMeSecuritySubZone(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.network.spec.network.javamodel.INetworkSubZone.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.NetworkSubZone_securitySubZone, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1f0c1a61-4b29-11e9-8338-41c203971ecb,YRFfZLWG85bSLp2gRoYOddZhRZM=] */
