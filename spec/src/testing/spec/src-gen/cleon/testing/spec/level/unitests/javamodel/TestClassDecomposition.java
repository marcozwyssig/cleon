package cleon.testing.spec.level.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestClassDecomposition extends DynamicResource implements ITestClassDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClassDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClassDecomposition>() {
    
    @Override
    public ITestClassDecomposition create() {
      return new TestClassDecomposition();
    }
    
    @Override
    public ITestClassDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestClassDecomposition(resourceRepository, resource);
    }
  
  };

  public TestClassDecomposition() {
    super(ITestClassDecomposition.TYPE_ID);
  }
  
  public TestClassDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestClassDecomposition.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public TestClassDecomposition setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition selectClassUnderTest() {
    return _getSingle(cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.testing.spec.level.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest);
  }

  public TestClassDecomposition setClassUnderTest(cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition classUnderTest) {
    _setSingle(cleon.testing.spec.level.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest, classUnderTest);
    return this;
  }
    
  @Override
  public cleon.testing.spec.level.unitests.javamodel.ITestClass selectClasses() {
    return _getSingle(cleon.testing.spec.level.unitests.javamodel.ITestClass.class, cleon.testing.spec.level.unitests.UnitestsPackage.TestClassDecomposition_classes);
  }

  public TestClassDecomposition setClasses(cleon.testing.spec.level.unitests.javamodel.ITestClass classes) {
    _setSingle(cleon.testing.spec.level.unitests.UnitestsPackage.TestClassDecomposition_classes, classes);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectInto() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into);
  }

  public TestClassDecomposition setInto(cleon.uml.spec.structural.classes.javamodel.IClassifier into) {
    _setSingle(cleon.uml.spec.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public TestClassDecomposition setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public TestClassDecomposition setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public TestClassDecomposition setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestClassDecomposition setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestClassDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.testing.spec.level.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest, visitor);
    _acceptSingle(cleon.testing.spec.level.unitests.javamodel.ITestClass.class, cleon.testing.spec.level.unitests.UnitestsPackage.TestClassDecomposition_classes, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testing.spec.level.unitests.javamodel.ITestClassDecomposition> selectToMeClassUnderTest(cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition object) {
    return _getToMeList(object.getRepository(), cleon.testing.spec.level.unitests.javamodel.ITestClassDecomposition.class, cleon.testing.spec.level.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest, object.getResource());
  }
  
  public static cleon.testing.spec.level.unitests.javamodel.ITestClassDecomposition selectToMeClasses(cleon.testing.spec.level.unitests.javamodel.ITestClass object) {
    return _getToMeSingle(object.getRepository(), cleon.testing.spec.level.unitests.javamodel.ITestClassDecomposition.class, cleon.testing.spec.level.unitests.UnitestsPackage.TestClassDecomposition_classes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e43712cd-19f3-11e5-a57b-e324953fb3a6,0FEJy4HL8eyHjspGWeo97mIXuN4=] */
