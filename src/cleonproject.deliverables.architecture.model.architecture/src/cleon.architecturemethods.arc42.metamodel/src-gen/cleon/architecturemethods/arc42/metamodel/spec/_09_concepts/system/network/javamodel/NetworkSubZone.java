package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel;

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
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath, noChapterPath);
  }

  @Override
  public java.lang.Integer selectOverrideVLAN() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_overrideVLAN);
  }
    
  public void setOverrideVLAN(java.lang.Integer overrideVLAN) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_overrideVLAN, overrideVLAN);
  }

  @Override
  public java.lang.String selectVlan() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_vlan);
  }
    
  public void setVlan(java.lang.String vlan) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_vlan, vlan);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public NetworkSubZone setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> selectCidrs() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs);
  }

  public NetworkSubZone setCidrs(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> cidrs) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs, cidrs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public NetworkSubZone setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public NetworkSubZone setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public NetworkSubZone setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> selectNodes() {
    return _getMap(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractPhysicalNetwork_nodes);
  }

  public NetworkSubZone setNodes(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> nodes) {
    _setMap(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractPhysicalNetwork_nodes, nodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public NetworkSubZone setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectSecuritySubZone() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_securitySubZone);
  }

  public NetworkSubZone setSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_securitySubZone, securitySubZone);
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
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite selectTopologySite() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_topologySite);
  }

  public NetworkSubZone setTopologySite(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite topologySite) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_topologySite, topologySite);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN> selectTopologySiteMSS() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_topologySiteMSS);
  }

  public NetworkSubZone setTopologySiteMSS(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN> topologySiteMSS) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_topologySiteMSS, topologySiteMSS);
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
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_overrideVLAN, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_vlan, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs, visitor);
    _acceptMap(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractPhysicalNetwork_nodes, visitor);
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_securitySubZone, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_topologySite, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_topologySiteMSS, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone> selectToMeTopologySite(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_topologySite, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone> selectToMeTopologySiteMSS(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_topologySiteMSS, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone> selectToMeSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSubZone_securitySubZone, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1f0c1a61-4b29-11e9-8338-41c203971ecb,CrtOzopZyLfbgmllyXPvXCi7+wQ=] */
