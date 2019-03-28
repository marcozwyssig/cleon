package cleon.testingmethods.hermes.spec.hermes5._02_specification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestSpecificationDocument extends DynamicResource implements ITestSpecificationDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSpecificationDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSpecificationDocument>() {
    
    @Override
    public ITestSpecificationDocument create() {
      return new TestSpecificationDocument();
    }
    
    @Override
    public ITestSpecificationDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestSpecificationDocument(resourceRepository, resource);
    }
  
  };

  public TestSpecificationDocument() {
    super(ITestSpecificationDocument.TYPE_ID);
  }
  
  public TestSpecificationDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestSpecificationDocument.TYPE_ID);
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

  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout selectAbout() {
    return _getSingle(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout.class, cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about);
  }

  public TestSpecificationDocument setAbout(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public TestSpecificationDocument setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestSpecificationDocument setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage);
  }

  public TestSpecificationDocument setDocumentLanguage(java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.common.glossary.spec.glossary.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary);
  }

  public TestSpecificationDocument setGlossary(cleon.common.glossary.spec.glossary.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestSpecificationDocument setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public TestSpecificationDocument setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverages selectRequirements_coverage() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverages.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_requirements_aE_coverage);
  }

  public TestSpecificationDocument setRequirements_coverage(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverages requirements_coverage) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_requirements_aE_coverage, requirements_coverage);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public TestSpecificationDocument setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.ITestConceptDocument selectTestConceptDocument() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.ITestConceptDocument.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_testConceptDocument);
  }

  public TestSpecificationDocument setTestConceptDocument(cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.ITestConceptDocument testConceptDocument) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_testConceptDocument, testConceptDocument);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecifications selectTestSpecifications() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecifications.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications);
  }

  public TestSpecificationDocument setTestSpecifications(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecifications testSpecifications) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications, testSpecifications);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestSpecificationDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout.class, cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverages.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_requirements_aE_coverage, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.ITestConceptDocument.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_testConceptDocument, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecifications.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.javamodel.ITestSpecificationDocument> selectToMeTestConceptDocument(cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.ITestConceptDocument object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.javamodel.ITestSpecificationDocument.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_testConceptDocument, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification.javamodel.ITestSpecificationDocument selectToMeTestSpecifications(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecifications object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.javamodel.ITestSpecificationDocument.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification.javamodel.ITestSpecificationDocument selectToMeRequirements_coverage(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverages object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.javamodel.ITestSpecificationDocument.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_specificationPackage.TestSpecificationDocument_requirements_aE_coverage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,88d35210-4f02-11e9-ba59-f1daaff821cc,udlkDymeTe/nXE3E6yKyaSABmIg=] */
