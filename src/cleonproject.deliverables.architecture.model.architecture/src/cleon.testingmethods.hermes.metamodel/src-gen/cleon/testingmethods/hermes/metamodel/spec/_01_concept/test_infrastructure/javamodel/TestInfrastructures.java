package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInfrastructures extends DynamicResource implements ITestInfrastructures {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInfrastructures> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInfrastructures>() {
    
    @Override
    public ITestInfrastructures create() {
      return new TestInfrastructures();
    }
    
    @Override
    public ITestInfrastructures create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInfrastructures(resourceRepository, resource);
    }
  
  };

  public TestInfrastructures() {
    super(ITestInfrastructures.TYPE_ID);
  }
  
  public TestInfrastructures(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInfrastructures.TYPE_ID);
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

  public TestInfrastructures setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public TestInfrastructures setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestInfrastructures setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_data.javamodel.ITestDatas selectTestDatas() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_data.javamodel.ITestDatas.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testDatas);
  }

  public TestInfrastructures setTestDatas(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_data.javamodel.ITestDatas testDatas) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testDatas, testDatas);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironments selectTestEnvironments() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironments.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testEnvironments);
  }

  public TestInfrastructures setTestEnvironments(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironments testEnvironments) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testEnvironments, testEnvironments);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_tools.javamodel.ITestTools selectTestTools() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_tools.javamodel.ITestTools.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testTools);
  }

  public TestInfrastructures setTestTools(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_tools.javamodel.ITestTools testTools) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testTools, testTools);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUsers selectTestUsers() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUsers.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testUsers);
  }

  public TestInfrastructures setTestUsers(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUsers testUsers) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testUsers, testUsers);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInfrastructures setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_data.javamodel.ITestDatas.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testDatas, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironments.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testEnvironments, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_tools.javamodel.ITestTools.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testTools, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUsers.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testUsers, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.ITestInfrastructures selectToMeTestUsers(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUsers object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.ITestInfrastructures.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testUsers, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.ITestInfrastructures selectToMeTestEnvironments(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironments object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.ITestInfrastructures.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testEnvironments, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.ITestInfrastructures selectToMeTestTools(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_tools.javamodel.ITestTools object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.ITestInfrastructures.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testTools, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.ITestInfrastructures selectToMeTestDatas(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_data.javamodel.ITestDatas object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.ITestInfrastructures.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.Test_infrastructurePackage.TestInfrastructures_testDatas, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b2de291a-20d7-11e6-9368-9172b77c2cff,JIewT6ydqEgU7pOWagJSHfXpHFQ=] */
