package cleon.qa.spec.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestPackageDecomposition extends DynamicResource implements ITestPackageDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPackageDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPackageDecomposition>() {
    
    @Override
    public ITestPackageDecomposition create() {
      return new TestPackageDecomposition();
    }
    
    @Override
    public ITestPackageDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestPackageDecomposition(resourceRepository, resource);
    }
  
  };

  public TestPackageDecomposition() {
    super(ITestPackageDecomposition.TYPE_ID);
  }
  
  public TestPackageDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestPackageDecomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public TestPackageDecomposition setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.ITextParagraph> selectDescription() {
    return _getList(cleon.doc.spec.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description);
  }

  public TestPackageDecomposition setDescription(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.ITextParagraph> description) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, description);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.packages.javamodel.IPackage selectInto() {
    return _getSingle(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.PackageDecomposition_into);
  }

  public TestPackageDecomposition setInto(cleon.uml.spec.structural.packages.javamodel.IPackage into) {
    _setSingle(cleon.uml.spec.structural.packages.PackagesPackage.PackageDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public TestPackageDecomposition setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public TestPackageDecomposition setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition selectPackageUnderTest() {
    return _getSingle(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.qa.spec.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest);
  }

  public TestPackageDecomposition setPackageUnderTest(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition packageUnderTest) {
    _setSingle(cleon.qa.spec.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, packageUnderTest);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public TestPackageDecomposition setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestPackageDecomposition setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.qa.spec.unitests.javamodel.ITestPackage selectTestPackages() {
    return _getSingle(cleon.qa.spec.unitests.javamodel.ITestPackage.class, cleon.qa.spec.unitests.UnitestsPackage.TestPackageDecomposition_testPackages);
  }

  public TestPackageDecomposition setTestPackages(cleon.qa.spec.unitests.javamodel.ITestPackage testPackages) {
    _setSingle(cleon.qa.spec.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, testPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestPackageDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, visitor);
    _acceptSingle(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.PackageDecomposition_into, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptSingle(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.qa.spec.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.qa.spec.unitests.javamodel.ITestPackage.class, cleon.qa.spec.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.qa.spec.unitests.javamodel.ITestPackageDecomposition> selectToMePackageUnderTest(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition object) {
    return _getToMeList(object.getRepository(), cleon.qa.spec.unitests.javamodel.ITestPackageDecomposition.class, cleon.qa.spec.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, object.getResource());
  }
  
  public static cleon.qa.spec.unitests.javamodel.ITestPackageDecomposition selectToMeTestPackages(cleon.qa.spec.unitests.javamodel.ITestPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.qa.spec.unitests.javamodel.ITestPackageDecomposition.class, cleon.qa.spec.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6a1dc86a-18fc-11e5-b505-7b16b1341920,VZGy2UaACE2gFjBWdSRlUe1y84k=] */
