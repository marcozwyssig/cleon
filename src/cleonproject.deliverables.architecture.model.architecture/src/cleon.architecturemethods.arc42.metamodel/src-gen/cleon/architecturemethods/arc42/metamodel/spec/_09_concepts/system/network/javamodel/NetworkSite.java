package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NetworkSite extends DynamicResource implements INetworkSite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkSite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkSite>() {
    
    @Override
    public INetworkSite create() {
      return new NetworkSite();
    }
    
    @Override
    public INetworkSite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NetworkSite(resourceRepository, resource);
    }
  
  };

  public NetworkSite() {
    super(INetworkSite.TYPE_ID);
  }
  
  public NetworkSite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetworkSite.TYPE_ID);
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
  public java.lang.Boolean selectExportADSite() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_exportADSite);
  }
    
  public void setExportADSite(java.lang.Boolean exportADSite) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_exportADSite, exportADSite);
  }

  @Override
  public java.lang.Boolean selectExportOU() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_exportOU);
  }
    
  public void setExportOU(java.lang.Boolean exportOU) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_exportOU, exportOU);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath, noChapterPath);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public NetworkSite setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> selectCidrs() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs);
  }

  public NetworkSite setCidrs(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> cidrs) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs, cidrs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public NetworkSite setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> selectExcludeCIDRForADSite() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_excludeCIDRForADSite);
  }

  public NetworkSite setExcludeCIDRForADSite(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> excludeCIDRForADSite) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_excludeCIDRForADSite, excludeCIDRForADSite);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone> selectNetworkSubZone() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_networkSubZone);
  }

  public NetworkSite setNetworkSubZone(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone> networkSubZone) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_networkSubZone, networkSubZone);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> selectNetworks() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkAware_networks);
  }

  public NetworkSite setNetworks(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> networks) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkAware_networks, networks);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public NetworkSite setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public NetworkSite setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public NetworkSite setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite selectSite() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_site);
  }

  public NetworkSite setSite(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite site) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_site, site);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public NetworkSite setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NetworkSite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_exportADSite, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_exportOU, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_isEnabled, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs, visitor);
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_excludeCIDRForADSite, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_networkSubZone, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_site, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> selectToMeSite(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_site, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite selectToMeNetworkSubZone(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_networkSubZone, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> selectToMeExcludeCIDRForADSite(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.NetworkSite_excludeCIDRForADSite, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,398f37f2-928a-11e9-959e-8115c2f9e41e,lhCyI8ZMySw/GACU6csJ9QSCD/Q=] */
