package cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel;

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

  public NetworkConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public NetworkConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel.INetworkEnvironment> selectNetworkNetdomain() {
    return _getMap(cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel.INetworkEnvironment.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkConcept_networkNetdomain);
  }

  public NetworkConcept setNetworkNetdomain(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel.INetworkEnvironment> networkNetdomain) {
    _setMap(cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkConcept_networkNetdomain, networkNetdomain);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public NetworkConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
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
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel.INetworkEnvironment.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkConcept_networkNetdomain, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept selectToMeNetworkNetdomain(cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel.INetworkEnvironment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkConcept_networkNetdomain, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b4d4ca85-4b28-11e9-8338-41c203971ecb,Lq+q1a1sejmfGO30mcz5ieTxzJY=] */
