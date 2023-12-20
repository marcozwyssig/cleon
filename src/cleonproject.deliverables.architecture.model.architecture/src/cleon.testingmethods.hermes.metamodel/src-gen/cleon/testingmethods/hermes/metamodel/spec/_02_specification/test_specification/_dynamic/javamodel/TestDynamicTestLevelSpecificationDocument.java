package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestDynamicTestLevelSpecificationDocument extends DynamicResource implements ITestDynamicTestLevelSpecificationDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestDynamicTestLevelSpecificationDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestDynamicTestLevelSpecificationDocument>() {
    
    @Override
    public ITestDynamicTestLevelSpecificationDocument create() {
      return new TestDynamicTestLevelSpecificationDocument();
    }
    
    @Override
    public ITestDynamicTestLevelSpecificationDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestDynamicTestLevelSpecificationDocument(resourceRepository, resource);
    }
  
  };

  public TestDynamicTestLevelSpecificationDocument() {
    super(ITestDynamicTestLevelSpecificationDocument.TYPE_ID);
  }
  
  public TestDynamicTestLevelSpecificationDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestDynamicTestLevelSpecificationDocument.TYPE_ID);
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

  public TestDynamicTestLevelSpecificationDocument setAbout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public TestDynamicTestLevelSpecificationDocument setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public TestDynamicTestLevelSpecificationDocument setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings);
  }

  public TestDynamicTestLevelSpecificationDocument setLanguageSettings(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestDynamicTestLevelSpecificationDocument setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public TestDynamicTestLevelSpecificationDocument setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public TestDynamicTestLevelSpecificationDocument setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestDynamicTestLevelSpecificationDocument setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_types.javamodel.ITestLevelForDynamicObject selectTestLevelForDynamicObject() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_types.javamodel.ITestLevelForDynamicObject.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.TestDynamicTestLevelSpecificationDocument_testLevelForDynamicObject);
  }

  public TestDynamicTestLevelSpecificationDocument setTestLevelForDynamicObject(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_types.javamodel.ITestLevelForDynamicObject testLevelForDynamicObject) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.TestDynamicTestLevelSpecificationDocument_testLevelForDynamicObject, testLevelForDynamicObject);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions selectTestPreconditions() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testPreconditions);
  }

  public TestDynamicTestLevelSpecificationDocument setTestPreconditions(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions testPreconditions) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testPreconditions, testPreconditions);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestCaseSpecifications selectTestSpecifications() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestCaseSpecifications.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications);
  }

  public TestDynamicTestLevelSpecificationDocument setTestSpecifications(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestCaseSpecifications testSpecifications) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications, testSpecifications);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestDynamicTestLevelSpecificationDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_types.javamodel.ITestLevelForDynamicObject.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.TestDynamicTestLevelSpecificationDocument_testLevelForDynamicObject, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testPreconditions, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestCaseSpecifications.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument> selectToMeTestLevelForDynamicObject(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_types.javamodel.ITestLevelForDynamicObject object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.TestDynamicTestLevelSpecificationDocument_testLevelForDynamicObject, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6d73f012-5157-11e9-bb61-971a423d31e9,MiN5RyBSdHkn3KN1aKG0oeJjsTM=] */
