package cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel;

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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
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
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout selectAbout() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about);
  }

  public TestSpecificationDocument setAbout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public TestSpecificationDocument setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable);
  }

  public TestSpecificationDocument setDeliverable(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, deliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public TestSpecificationDocument setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_documentLanguage);
  }

  public TestSpecificationDocument setDocumentLanguage(java.util.List<? extends cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.common.glossary.metamodel.spec.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary);
  }

  public TestSpecificationDocument setGlossary(cleon.common.glossary.metamodel.spec.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestSpecificationDocument setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning selectPlanning() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning);
  }

  public TestSpecificationDocument setPlanning(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning planning) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, planning);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public TestSpecificationDocument setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages selectRequirements_coverage() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_requirements_aE_coverage);
  }

  public TestSpecificationDocument setRequirements_coverage(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages requirements_coverage) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_requirements_aE_coverage, requirements_coverage);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public TestSpecificationDocument setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions selectTestPreconditions() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testPreconditions);
  }

  public TestSpecificationDocument setTestPreconditions(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions testPreconditions) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testPreconditions, testPreconditions);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestSpecifications selectTestSpecifications() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestSpecifications.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications);
  }

  public TestSpecificationDocument setTestSpecifications(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestSpecifications testSpecifications) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications, testSpecifications);
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
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_requirements_aE_coverage, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testPreconditions, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestSpecifications.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument selectToMeTestPreconditions(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testPreconditions, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument selectToMeTestSpecifications(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestSpecifications object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument selectToMeRequirements_coverage(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_requirements_aE_coverage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,88d35210-4f02-11e9-ba59-f1daaff821cc,ghLhAKd/zq8bzHRiyZHrwgNgDqk=] */
