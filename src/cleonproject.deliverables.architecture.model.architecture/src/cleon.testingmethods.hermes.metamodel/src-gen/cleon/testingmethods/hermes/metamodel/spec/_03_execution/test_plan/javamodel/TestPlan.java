package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestPlan extends DynamicResource implements ITestPlan {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPlan> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPlan>() {
    
    @Override
    public ITestPlan create() {
      return new TestPlan();
    }
    
    @Override
    public ITestPlan create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestPlan(resourceRepository, resource);
    }
  
  };

  public TestPlan() {
    super(ITestPlan.TYPE_ID);
  }
  
  public TestPlan(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestPlan.TYPE_ID);
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

  public TestPlan setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public TestPlan setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestPlan setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITestScheduling selectTestScheduling() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITestScheduling.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.Test_planPackage.TestPlan_testScheduling);
  }

  public TestPlan setTestScheduling(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITestScheduling testScheduling) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.Test_planPackage.TestPlan_testScheduling, testScheduling);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteScope selectTestScope() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteScope.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.Test_planPackage.TestPlan_testScope);
  }

  public TestPlan setTestScope(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteScope testScope) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.Test_planPackage.TestPlan_testScope, testScope);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestPlan setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITestScheduling.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.Test_planPackage.TestPlan_testScheduling, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteScope.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.Test_planPackage.TestPlan_testScope, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.javamodel.ITestPlan selectToMeTestScope(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteScope object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.javamodel.ITestPlan.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.Test_planPackage.TestPlan_testScope, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.javamodel.ITestPlan selectToMeTestScheduling(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITestScheduling object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.javamodel.ITestPlan.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.Test_planPackage.TestPlan_testScheduling, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8bf93951-eabe-11e5-838a-6dbe7118dd11,Uf4SrIp7P54VIm7SV/w7gdpopLM=] */
