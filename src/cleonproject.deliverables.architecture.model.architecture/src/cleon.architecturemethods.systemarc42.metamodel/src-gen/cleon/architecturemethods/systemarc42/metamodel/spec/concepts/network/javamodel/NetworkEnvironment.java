package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel;

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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public NetworkEnvironment setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment selectEnvironment() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkEnvironment_environment);
  }

  public NetworkEnvironment setEnvironment(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment environment) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkEnvironment_environment, environment);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkNetdomain> selectNetworkNetdomain() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkNetdomain.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkEnvironment_networkNetdomain);
  }

  public NetworkEnvironment setNetworkNetdomain(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkNetdomain> networkNetdomain) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkEnvironment_networkNetdomain, networkNetdomain);
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
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkEnvironment_environment, visitor);
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroup.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.GroupAware_groups, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkNetdomain.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkEnvironment_networkNetdomain, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworks_range, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkEnvironment> selectToMeEnvironment(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkEnvironment_environment, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkEnvironment selectToMeNetworkNetdomain(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkNetdomain object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkEnvironment_networkNetdomain, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7ad5fb03-7adf-11e9-a70f-4dc03941a024,ZJXwropA6vWz3ttwXP9QtIbSfDE=] */
