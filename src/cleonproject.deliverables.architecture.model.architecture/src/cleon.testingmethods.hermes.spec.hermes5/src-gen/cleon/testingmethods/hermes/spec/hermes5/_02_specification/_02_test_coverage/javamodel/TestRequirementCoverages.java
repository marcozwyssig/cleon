package cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestRequirementCoverages extends DynamicResource implements ITestRequirementCoverages {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestRequirementCoverages> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestRequirementCoverages>() {
    
    @Override
    public ITestRequirementCoverages create() {
      return new TestRequirementCoverages();
    }
    
    @Override
    public ITestRequirementCoverages create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestRequirementCoverages(resourceRepository, resource);
    }
  
  };

  public TestRequirementCoverages() {
    super(ITestRequirementCoverages.TYPE_ID);
  }
  
  public TestRequirementCoverages(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestRequirementCoverages.TYPE_ID);
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

  public TestRequirementCoverages setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestRequirementCoverages setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestRequirementCoverages setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.ISubjectAreaCoverage> selectSubjectAreaCoverage() {
    return _getMap(cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.ISubjectAreaCoverage.class, cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.CoveragePackage.RequirementsCoverages_subjectAreaCoverage);
  }

  public TestRequirementCoverages setSubjectAreaCoverage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.ISubjectAreaCoverage> subjectAreaCoverage) {
    _setMap(cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.CoveragePackage.RequirementsCoverages_subjectAreaCoverage, subjectAreaCoverage);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestSubjectAreaCoverage> selectTestSubjectAreaCoverage() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestSubjectAreaCoverage.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage._02_test_coveragePackage.TestRequirementCoverages_testSubjectAreaCoverage);
  }

  public TestRequirementCoverages setTestSubjectAreaCoverage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestSubjectAreaCoverage> testSubjectAreaCoverage) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage._02_test_coveragePackage.TestRequirementCoverages_testSubjectAreaCoverage, testSubjectAreaCoverage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestRequirementCoverages setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.ISubjectAreaCoverage.class, cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.CoveragePackage.RequirementsCoverages_subjectAreaCoverage, visitor);
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestSubjectAreaCoverage.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage._02_test_coveragePackage.TestRequirementCoverages_testSubjectAreaCoverage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverages selectToMeTestSubjectAreaCoverage(cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestSubjectAreaCoverage object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage.javamodel.ITestRequirementCoverages.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._02_test_coverage._02_test_coveragePackage.TestRequirementCoverages_testSubjectAreaCoverage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,adf3787f-5162-11e9-bb61-971a423d31e9,ZVz01ba7z6lxNRToWg3F3hT81X8=] */
