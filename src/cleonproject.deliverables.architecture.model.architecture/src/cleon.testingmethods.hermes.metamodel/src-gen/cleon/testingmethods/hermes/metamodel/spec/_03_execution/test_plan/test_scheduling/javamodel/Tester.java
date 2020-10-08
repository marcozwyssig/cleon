package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Tester extends DynamicResource implements ITester {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITester> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITester>() {
    
    @Override
    public ITester create() {
      return new Tester();
    }
    
    @Override
    public ITester create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Tester(resourceRepository, resource);
    }
  
  };

  public Tester() {
    super(ITester.TYPE_ID);
  }
  
  public Tester(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITester.TYPE_ID);
  }

  // attributes
  
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

  public Tester setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Tester setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Tester setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Tester setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson selectPerson() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.Test_schedulingPackage.Tester_person);
  }

  public Tester setPerson(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson person) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.Test_schedulingPackage.Tester_person, person);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Tester setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest> selectTests() {
    return _getList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.Test_schedulingPackage.Tester_tests);
  }

  public Tester setTests(java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest> tests) {
    _setList(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.Test_schedulingPackage.Tester_tests, tests);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Tester setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.Test_schedulingPackage.Tester_person, visitor);
    _acceptList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.Test_schedulingPackage.Tester_tests, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITester> selectToMeTests(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITester.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.Test_schedulingPackage.Tester_tests, object.getResource());
  }
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITester> selectToMePerson(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel.ITester.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.Test_schedulingPackage.Tester_person, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3edf4b87-9190-11e9-85e6-a377d9035ee3,t8d9FeFF9hFDtQq/q2Po2WsRWAY=] */
