package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DNSScope extends DynamicResource implements IDNSScope {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDNSScope> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDNSScope>() {
    
    @Override
    public IDNSScope create() {
      return new DNSScope();
    }
    
    @Override
    public IDNSScope create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DNSScope(resourceRepository, resource);
    }
  
  };

  public DNSScope() {
    super(IDNSScope.TYPE_ID);
  }
  
  public DNSScope(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDNSScope.TYPE_ID);
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

  public DNSScope setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel.IDNSSystemScope> selectDnsSystemScope() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel.IDNSSystemScope.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSScope_dnsSystemScope);
  }

  public DNSScope setDnsSystemScope(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel.IDNSSystemScope> dnsSystemScope) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSScope_dnsSystemScope, dnsSystemScope);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DNSScope setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DNSScope setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcept> selectSystemConcept() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.ConceptForSystem_systemConcept);
  }

  public DNSScope setSystemConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcept> systemConcept) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.ConceptForSystem_systemConcept, systemConcept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DNSScope setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel.IDNSSystemScope.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSScope_dnsSystemScope, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel.IDNSScope selectToMeDnsSystemScope(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel.IDNSSystemScope object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel.IDNSScope.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage.DNSScope_dnsSystemScope, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a778a5c4-cad1-11ec-896e-55850dc397b1,QvWF4XFqvY5+/7emjk0ixvUhPSI=] */
