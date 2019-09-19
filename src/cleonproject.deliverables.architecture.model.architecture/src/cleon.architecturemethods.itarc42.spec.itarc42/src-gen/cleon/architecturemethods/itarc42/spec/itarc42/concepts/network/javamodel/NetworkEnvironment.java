package cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel;

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

  public NetworkEnvironment setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public NetworkEnvironment setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.IEnvironment selectEnvironment() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.IEnvironment.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.NetworkEnvironment_environment);
  }

  public NetworkEnvironment setEnvironment(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.IEnvironment environment) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.NetworkEnvironment_environment, environment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> selectGroups() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups);
  }

  public NetworkEnvironment setGroups(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> groups) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, groups);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNetdomain> selectNetworkNetdomain() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNetdomain.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.NetworkEnvironment_networkNetdomain);
  }

  public NetworkEnvironment setNetworkNetdomain(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNetdomain> networkNetdomain) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.NetworkEnvironment_networkNetdomain, networkNetdomain);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork> selectNetworks() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworkAware_networks);
  }

  public NetworkEnvironment setNetworks(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork> networks) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworkAware_networks, networks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public NetworkEnvironment setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange selectRange() {
    return _getSingle(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworks_range);
  }

  public NetworkEnvironment setRange(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange range) {
    _setSingle(cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworks_range, range);
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
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.IEnvironment.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.NetworkEnvironment_environment, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNetdomain.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.NetworkEnvironment_networkNetdomain, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworks_range, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkEnvironment> selectToMeEnvironment(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.IEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkEnvironment.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.NetworkEnvironment_environment, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkEnvironment selectToMeNetworkNetdomain(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNetdomain object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkEnvironment.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.NetworkPackage.NetworkEnvironment_networkNetdomain, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7ad5fb03-7adf-11e9-a70f-4dc03941a024,BynUvWCyooiKZTJ8U117FDdGdO8=] */
