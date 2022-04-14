package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NetworkEnvironment extends DynamicResource implements INetworkEnvironment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkEnvironment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkEnvironment>() {
    
    @Override
    public INetworkEnvironment create() {
      return new NetworkEnvironment();
    }
    
    @Override
    public INetworkEnvironment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NetworkEnvironment(resourceRepository, resource);
    }
  
  };

  public NetworkEnvironment() {
    super(INetworkEnvironment.TYPE_ID);
  }
  
  public NetworkEnvironment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetworkEnvironment.TYPE_ID);
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
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public NetworkEnvironment setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> selectCidrs() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs);
  }

  public NetworkEnvironment setCidrs(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> cidrs) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs, cidrs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public NetworkEnvironment setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode selectEnvironmentForNetwork() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.NetworkEnvironment_environmentForNetwork);
  }

  public NetworkEnvironment setEnvironmentForNetwork(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environmentForNetwork) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.NetworkEnvironment_environmentForNetwork, environmentForNetwork);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroup> selectGroups() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroup.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.GroupAware_groups);
  }

  public NetworkEnvironment setGroups(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroup> groups) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.GroupAware_groups, groups);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> selectNetworkSite() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.NetworkEnvironment_networkSite);
  }

  public NetworkEnvironment setNetworkSite(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSite) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.NetworkEnvironment_networkSite, networkSite);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> selectNetworks() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkAware_networks);
  }

  public NetworkEnvironment setNetworks(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> networks) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkAware_networks, networks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public NetworkEnvironment setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange selectRange() {
    return _getSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworks_range);
  }

  public NetworkEnvironment setRange(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange range) {
    _setSingle(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworks_range, range);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public NetworkEnvironment setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NetworkEnvironment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.NetworkEnvironment_environmentForNetwork, visitor);
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroup.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.GroupAware_groups, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.NetworkEnvironment_networkSite, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworks_range, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment> selectToMeEnvironmentForNetwork(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.NetworkEnvironment_environmentForNetwork, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment selectToMeNetworkSite(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.NetworkPackage.NetworkEnvironment_networkSite, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8df2f5fa-053f-11ea-b1c2-9163c84d2612,gjPlQmju0DrJsfT+QYhJyt86EZ8=] */
