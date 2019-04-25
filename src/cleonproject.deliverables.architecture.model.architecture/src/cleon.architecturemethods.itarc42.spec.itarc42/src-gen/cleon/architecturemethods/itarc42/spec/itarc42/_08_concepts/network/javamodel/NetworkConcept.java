package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NetworkConcept extends DynamicResource implements INetworkConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkConcept>() {
    
    @Override
    public INetworkConcept create() {
      return new NetworkConcept();
    }
    
    @Override
    public INetworkConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NetworkConcept(resourceRepository, resource);
    }
  
  };

  public NetworkConcept() {
    super(INetworkConcept.TYPE_ID);
  }
  
  public NetworkConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetworkConcept.TYPE_ID);
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

  public NetworkConcept setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public NetworkConcept setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> selectGroups() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups);
  }

  public NetworkConcept setGroups(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> groups) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, groups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel.INetwork> selectNetworks() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel.INetwork.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.NetworkPackage.NetworkConcept_networks);
  }

  public NetworkConcept setNetworks(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel.INetwork> networks) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.NetworkPackage.NetworkConcept_networks, networks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public NetworkConcept setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NetworkConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel.INetwork.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.NetworkPackage.NetworkConcept_networks, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel.INetworkConcept selectToMeNetworks(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel.INetwork object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel.INetworkConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.NetworkPackage.NetworkConcept_networks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b4d4ca85-4b28-11e9-8338-41c203971ecb,D3WdZBOESg+dQ/ctiSsoXS2XKrA=] */
