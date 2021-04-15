package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FunctionalDynamicTest extends DynamicResource implements IFunctionalDynamicTest {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionalDynamicTest> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionalDynamicTest>() {
    
    @Override
    public IFunctionalDynamicTest create() {
      return new FunctionalDynamicTest();
    }
    
    @Override
    public IFunctionalDynamicTest create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FunctionalDynamicTest(resourceRepository, resource);
    }
  
  };

  public FunctionalDynamicTest() {
    super(IFunctionalDynamicTest.TYPE_ID);
  }
  
  public FunctionalDynamicTest(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFunctionalDynamicTest.TYPE_ID);
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
  public java.lang.Integer selectExecutionTime_aE__aA_m_aC_() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_executionTime_aE__aA_m_aC_);
  }
    
  public void setExecutionTime_aE__aA_m_aC_(java.lang.Integer executionTime_aE__aA_m_aC_) {
     _setSingleAttribute(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_executionTime_aE__aA_m_aC_, executionTime_aE__aA_m_aC_);
  }

  @Override
  public java.lang.String selectExternalReferenceId() {
    return _getSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_externalReferenceId);
  }
    
  public void setExternalReferenceId(java.lang.String externalReferenceId) {
     _setSingleAttribute(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_externalReferenceId, externalReferenceId);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.Boolean selectIsNegativTest() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTest_isNegativTest);
  }
    
  public void setIsNegativTest(java.lang.Boolean isNegativTest) {
     _setSingleAttribute(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTest_isNegativTest, isNegativTest);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectTestGoals() {
    return _getListAttribute(java.lang.String.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_testGoals);
  }
    
  public void setTestGoals(java.util.List<java.lang.String> testGoals) {
     _setListAttribute(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_testGoals, testGoals);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> selectAuthors() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.PersonsPackage.AuthorsAware_authors);
  }

  public FunctionalDynamicTest setAuthors(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> authors) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.PersonsPackage.AuthorsAware_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public FunctionalDynamicTest setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public FunctionalDynamicTest setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public FunctionalDynamicTest setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public FunctionalDynamicTest setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public FunctionalDynamicTest setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReference selectReference() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReference.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_reference);
  }

  public FunctionalDynamicTest setReference(cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReference reference) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_reference, reference);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup> selectTestGlobalPrecondition() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.GlobalPreconditionsAware_testGlobalPrecondition);
  }

  public FunctionalDynamicTest setTestGlobalPrecondition(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup> testGlobalPrecondition) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.GlobalPreconditionsAware_testGlobalPrecondition, testGlobalPrecondition);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPreconditionStep> selectTestLocalPreconditions() {
    return _getList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPreconditionStep.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestPreconditionAwareList_testLocalPreconditions);
  }

  public FunctionalDynamicTest setTestLocalPreconditions(java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPreconditionStep> testLocalPreconditions) {
    _setList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestPreconditionAwareList_testLocalPreconditions, testLocalPreconditions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep> selectTestSteps() {
    return _getList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTest_testSteps);
  }

  public FunctionalDynamicTest setTestSteps(java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep> testSteps) {
    _setList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTest_testSteps, testSteps);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FunctionalDynamicTest setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_executionTime_aE__aA_m_aC_, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_externalReferenceId, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTest_isNegativTest, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_testGoals, visitor);
    // relations
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.PersonsPackage.AuthorsAware_authors, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReference.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_reference, visitor);
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.GlobalPreconditionsAware_testGlobalPrecondition, visitor);
    _acceptList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPreconditionStep.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestPreconditionAwareList_testLocalPreconditions, visitor);
    _acceptList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTest_testSteps, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dae35cb5-4f8c-11e9-ad5d-977b17aab907,iUzFazich0fwCNFbDzjLQdTN1Jg=] */
