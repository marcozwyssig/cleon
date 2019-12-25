package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DynamicTestExecutionList extends DynamicResource implements IDynamicTestExecutionList {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestExecutionList> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestExecutionList>() {
    
    @Override
    public IDynamicTestExecutionList create() {
      return new DynamicTestExecutionList();
    }
    
    @Override
    public IDynamicTestExecutionList create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DynamicTestExecutionList(resourceRepository, resource);
    }
  
  };

  public DynamicTestExecutionList() {
    super(IDynamicTestExecutionList.TYPE_ID);
  }
  
  public DynamicTestExecutionList(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDynamicTestExecutionList.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public DynamicTestExecutionList setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DynamicTestExecutionList setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution> selectDynamicTestExecution() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecutionList_dynamicTestExecution);
  }

  public DynamicTestExecutionList setDynamicTestExecution(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution> dynamicTestExecution) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecutionList_dynamicTestExecution, dynamicTestExecution);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public DynamicTestExecutionList setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DynamicTestExecutionList setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DynamicTestExecutionList setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITester selectTester() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITester.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecutionList_tester);
  }

  public DynamicTestExecutionList setTester(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITester tester) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecutionList_tester, tester);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DynamicTestExecutionList setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecutionList_dynamicTestExecution, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITester.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecutionList_tester, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecutionList> selectToMeTester(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITester object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecutionList.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecutionList_tester, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecutionList selectToMeDynamicTestExecution(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecutionList.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecutionList_dynamicTestExecution, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,25396337-90e1-11e9-b8c5-7968e3120b73,pF4k+/tw8Z6Htlzky5D5Ty3RX7g=] */
