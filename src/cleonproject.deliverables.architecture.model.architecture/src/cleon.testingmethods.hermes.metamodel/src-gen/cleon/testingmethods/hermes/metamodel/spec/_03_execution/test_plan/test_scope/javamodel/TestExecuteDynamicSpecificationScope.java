package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestExecuteDynamicSpecificationScope extends DynamicResource implements ITestExecuteDynamicSpecificationScope {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecuteDynamicSpecificationScope> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecuteDynamicSpecificationScope>() {
    
    @Override
    public ITestExecuteDynamicSpecificationScope create() {
      return new TestExecuteDynamicSpecificationScope();
    }
    
    @Override
    public ITestExecuteDynamicSpecificationScope create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestExecuteDynamicSpecificationScope(resourceRepository, resource);
    }
  
  };

  public TestExecuteDynamicSpecificationScope() {
    super(ITestExecuteDynamicSpecificationScope.TYPE_ID);
  }
  
  public TestExecuteDynamicSpecificationScope(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestExecuteDynamicSpecificationScope.TYPE_ID);
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

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath, noChapterPath);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public TestExecuteDynamicSpecificationScope setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public TestExecuteDynamicSpecificationScope setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification selectDynamicTestSpecification() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicSpecificationScope_dynamicTestSpecification);
  }

  public TestExecuteDynamicSpecificationScope setDynamicTestSpecification(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification dynamicTestSpecification) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicSpecificationScope_dynamicTestSpecification, dynamicTestSpecification);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public TestExecuteDynamicSpecificationScope setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestExecuteDynamicSpecificationScope setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestExecuteDynamicSpecificationScope setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicTestLevelScope> selectTestDynamicTestLevelScope() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicTestLevelScope.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicSpecificationScope_testDynamicTestLevelScope);
  }

  public TestExecuteDynamicSpecificationScope setTestDynamicTestLevelScope(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicTestLevelScope> testDynamicTestLevelScope) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicSpecificationScope_testDynamicTestLevelScope, testDynamicTestLevelScope);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestExecuteDynamicSpecificationScope setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicSpecificationScope_dynamicTestSpecification, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicTestLevelScope.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicSpecificationScope_testDynamicTestLevelScope, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicSpecificationScope> selectToMeDynamicTestSpecification(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicSpecificationScope.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicSpecificationScope_dynamicTestSpecification, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicSpecificationScope selectToMeTestDynamicTestLevelScope(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicTestLevelScope object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicSpecificationScope.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicSpecificationScope_testDynamicTestLevelScope, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5af877e5-918d-11e9-85e6-a377d9035ee3,Mfe/vCbOom+oRf+iZYrUzI5rRCg=] */
