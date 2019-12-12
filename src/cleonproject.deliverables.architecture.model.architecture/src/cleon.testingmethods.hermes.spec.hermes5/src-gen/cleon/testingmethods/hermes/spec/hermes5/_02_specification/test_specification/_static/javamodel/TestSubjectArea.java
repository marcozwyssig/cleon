package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestSubjectArea extends DynamicResource implements ITestSubjectArea {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSubjectArea> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSubjectArea>() {
    
    @Override
    public ITestSubjectArea create() {
      return new TestSubjectArea();
    }
    
    @Override
    public ITestSubjectArea create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestSubjectArea(resourceRepository, resource);
    }
  
  };

  public TestSubjectArea() {
    super(ITestSubjectArea.TYPE_ID);
  }
  
  public TestSubjectArea(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestSubjectArea.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public TestSubjectArea setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public TestSubjectArea setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestSubjectArea setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea selectSubjectArea() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static._staticPackage.TestSubjectArea_subjectArea);
  }

  public TestSubjectArea setSubjectArea(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea subjectArea) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static._staticPackage.TestSubjectArea_subjectArea, subjectArea);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestSubjectArea setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.IStaticTest> selectTestRequirements() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.IStaticTest.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static._staticPackage.TestSubjectArea_testRequirements);
  }

  public TestSubjectArea setTestRequirements(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.IStaticTest> testRequirements) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static._staticPackage.TestSubjectArea_testRequirements, testRequirements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestSubjectArea setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static._staticPackage.TestSubjectArea_subjectArea, visitor);
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.IStaticTest.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static._staticPackage.TestSubjectArea_testRequirements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.ITestSubjectArea> selectToMeSubjectArea(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.ITestSubjectArea.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static._staticPackage.TestSubjectArea_subjectArea, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.ITestSubjectArea selectToMeTestRequirements(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.IStaticTest object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.ITestSubjectArea.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static._staticPackage.TestSubjectArea_testRequirements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cfa22ec4-1cf0-11e6-aaba-9db7fdc64d7e,vFsFjiVFJDCLi/Bea3SmSgOV4IE=] */
