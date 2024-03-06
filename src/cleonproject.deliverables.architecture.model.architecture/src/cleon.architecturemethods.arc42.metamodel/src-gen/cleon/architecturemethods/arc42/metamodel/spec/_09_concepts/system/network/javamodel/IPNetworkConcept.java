package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IPNetworkConcept extends DynamicResource implements IIPNetworkConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPNetworkConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPNetworkConcept>() {
    
    @Override
    public IIPNetworkConcept create() {
      return new IPNetworkConcept();
    }
    
    @Override
    public IIPNetworkConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IPNetworkConcept(resourceRepository, resource);
    }
  
  };

  public IPNetworkConcept() {
    super(IIPNetworkConcept.TYPE_ID);
  }
  
  public IPNetworkConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIPNetworkConcept.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, chapterPath);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public IPNetworkConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain selectDefaultDomain() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.IPNetworkConcept_defaultDomain);
  }

  public IPNetworkConcept setDefaultDomain(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain defaultDomain) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.IPNetworkConcept_defaultDomain, defaultDomain);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public IPNetworkConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkEnvironment> selectNetworkEnvironment() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.IPNetworkConcept_networkEnvironment);
  }

  public IPNetworkConcept setNetworkEnvironment(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkEnvironment> networkEnvironment) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.IPNetworkConcept_networkEnvironment, networkEnvironment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public IPNetworkConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IPNetworkConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.IPNetworkConcept_defaultDomain, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.IPNetworkConcept_networkEnvironment, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept selectToMeNetworkEnvironment(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkEnvironment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.IPNetworkConcept_networkEnvironment, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept> selectToMeDefaultDomain(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.NetworkPackage.IPNetworkConcept_defaultDomain, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b4d4ca85-4b28-11e9-8338-41c203971ecb,BKUGeIrLPutkSfLxVV0AujeEbME=] */
