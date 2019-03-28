package cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestSubjectAreaCoverage extends DynamicResource implements ITestSubjectAreaCoverage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSubjectAreaCoverage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSubjectAreaCoverage>() {
    
    @Override
    public ITestSubjectAreaCoverage create() {
      return new TestSubjectAreaCoverage();
    }
    
    @Override
    public ITestSubjectAreaCoverage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestSubjectAreaCoverage(resourceRepository, resource);
    }
  
  };

  public TestSubjectAreaCoverage() {
    super(ITestSubjectAreaCoverage.TYPE_ID);
  }
  
  public TestSubjectAreaCoverage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestSubjectAreaCoverage.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public TestSubjectAreaCoverage setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestSubjectAreaCoverage setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestSubjectAreaCoverage setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverage> selectRequirementCoverage() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverage.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage._02_test_coveragePackage.TestSubjectAreaCoverage_requirementCoverage);
  }

  public TestSubjectAreaCoverage setRequirementCoverage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverage> requirementCoverage) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage._02_test_coveragePackage.TestSubjectAreaCoverage_requirementCoverage, requirementCoverage);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea selectSubjectArea() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea.class, cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.CoveragePackage.SubjectAreaCoverage_subjectArea);
  }

  public TestSubjectAreaCoverage setSubjectArea(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea subjectArea) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.CoveragePackage.SubjectAreaCoverage_subjectArea, subjectArea);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestSubjectAreaCoverage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestSubjectAreaCoverage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverage.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage._02_test_coveragePackage.TestSubjectAreaCoverage_requirementCoverage, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea.class, cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.CoveragePackage.SubjectAreaCoverage_subjectArea, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestSubjectAreaCoverage selectToMeRequirementCoverage(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverage object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestSubjectAreaCoverage.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage._02_test_coveragePackage.TestSubjectAreaCoverage_requirementCoverage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2498cbe6-5169-11e9-bb61-971a423d31e9,+62r8NULtl5xgPJdqoPimqJ4KWc=] */
