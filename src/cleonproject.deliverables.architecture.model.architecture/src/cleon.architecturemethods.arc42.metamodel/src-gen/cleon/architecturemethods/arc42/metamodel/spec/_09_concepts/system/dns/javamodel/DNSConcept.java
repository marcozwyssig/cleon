package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DNSConcept extends DynamicResource implements IDNSConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDNSConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDNSConcept>() {
    
    @Override
    public IDNSConcept create() {
      return new DNSConcept();
    }
    
    @Override
    public IDNSConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DNSConcept(resourceRepository, resource);
    }
  
  };

  public DNSConcept() {
    super(IDNSConcept.TYPE_ID);
  }
  
  public DNSConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDNSConcept.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public DNSConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> selectCustomChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.DnsPackage.DNSConcept_customChapters);
  }

  public DNSConcept setCustomChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> customChapters) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.DnsPackage.DNSConcept_customChapters, customChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DNSConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSIntegration selectIntegration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSIntegration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.DnsPackage.DNSConcept_integration);
  }

  public DNSConcept setIntegration(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSIntegration integration) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.DnsPackage.DNSConcept_integration, integration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DNSConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DNSConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.DnsPackage.DNSConcept_customChapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSIntegration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.DnsPackage.DNSConcept_integration, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSConcept selectToMeCustomChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.DnsPackage.DNSConcept_customChapters, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSConcept selectToMeIntegration(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSIntegration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.DnsPackage.DNSConcept_integration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1475e2c0-c7b9-11ec-a6a4-0b12dcfbdf90,egZZKGFu6NKokXPPhHZ9eJIyT/E=] */
