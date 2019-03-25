package cleon.architecturemethods.eamod.spec.test._01_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestConceptDocument extends DynamicResource implements ITestConceptDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestConceptDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestConceptDocument>() {
    
    @Override
    public ITestConceptDocument create() {
      return new TestConceptDocument();
    }
    
    @Override
    public ITestConceptDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestConceptDocument(resourceRepository, resource);
    }
  
  };

  public TestConceptDocument() {
    super(ITestConceptDocument.TYPE_ID);
  }
  
  public TestConceptDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestConceptDocument.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public TestConceptDocument setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestConceptDocument setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage);
  }

  public TestConceptDocument setDocumentLanguage(java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestConceptDocument setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectPlanningDocument() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_planningDocument);
  }

  public TestConceptDocument setPlanningDocument(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument planningDocument) {
    _setSingle(cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_planningDocument, planningDocument);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public TestConceptDocument setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public TestConceptDocument setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.test._01_concept._01_test_goals.javamodel.ITestGoals selectTestGoals() {
    return _getSingle(cleon.architecturemethods.eamod.spec.test._01_concept._01_test_goals.javamodel.ITestGoals.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testGoals);
  }

  public TestConceptDocument setTestGoals(cleon.architecturemethods.eamod.spec.test._01_concept._01_test_goals.javamodel.ITestGoals testGoals) {
    _setSingle(cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testGoals, testGoals);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.test._01_concept._06_test_infrastructure.javamodel.ITestInfrastructures selectTestInfrastructures() {
    return _getSingle(cleon.architecturemethods.eamod.spec.test._01_concept._06_test_infrastructure.javamodel.ITestInfrastructures.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testInfrastructures);
  }

  public TestConceptDocument setTestInfrastructures(cleon.architecturemethods.eamod.spec.test._01_concept._06_test_infrastructure.javamodel.ITestInfrastructures testInfrastructures) {
    _setSingle(cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testInfrastructures, testInfrastructures);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.test._01_concept._03_test_methods.javamodel.ITestMethods selectTestMethods() {
    return _getSingle(cleon.architecturemethods.eamod.spec.test._01_concept._03_test_methods.javamodel.ITestMethods.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testMethods);
  }

  public TestConceptDocument setTestMethods(cleon.architecturemethods.eamod.spec.test._01_concept._03_test_methods.javamodel.ITestMethods testMethods) {
    _setSingle(cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testMethods, testMethods);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.test._01_concept._02_test_objects.javamodel.ITestObjects selectTestObjects() {
    return _getSingle(cleon.architecturemethods.eamod.spec.test._01_concept._02_test_objects.javamodel.ITestObjects.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testObjects);
  }

  public TestConceptDocument setTestObjects(cleon.architecturemethods.eamod.spec.test._01_concept._02_test_objects.javamodel.ITestObjects testObjects) {
    _setSingle(cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testObjects, testObjects);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestConceptDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_planningDocument, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.test._01_concept._01_test_goals.javamodel.ITestGoals.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testGoals, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.test._01_concept._06_test_infrastructure.javamodel.ITestInfrastructures.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testInfrastructures, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.test._01_concept._03_test_methods.javamodel.ITestMethods.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testMethods, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.test._01_concept._02_test_objects.javamodel.ITestObjects.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testObjects, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument selectToMeTestGoals(cleon.architecturemethods.eamod.spec.test._01_concept._01_test_goals.javamodel.ITestGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testGoals, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument selectToMeTestObjects(cleon.architecturemethods.eamod.spec.test._01_concept._02_test_objects.javamodel.ITestObjects object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testObjects, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument selectToMeTestMethods(cleon.architecturemethods.eamod.spec.test._01_concept._03_test_methods.javamodel.ITestMethods object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testMethods, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument selectToMeTestInfrastructures(cleon.architecturemethods.eamod.spec.test._01_concept._06_test_infrastructure.javamodel.ITestInfrastructures object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_testInfrastructures, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument> selectToMePlanningDocument(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument.class, cleon.architecturemethods.eamod.spec.test._01_concept._01_conceptPackage.TestConceptDocument_planningDocument, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c050d74c-d400-11e5-9dfc-cf0f3e030023,+u1Dk4NL/Ix8z0miQModurK9vZc=] */
