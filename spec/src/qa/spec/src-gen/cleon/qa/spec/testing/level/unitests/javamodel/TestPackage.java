package cleon.qa.spec.testing.level.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestPackage extends DynamicResource implements ITestPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPackage>() {
    
    @Override
    public ITestPackage create() {
      return new TestPackage();
    }
    
    @Override
    public ITestPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestPackage(resourceRepository, resource);
    }
  
  };

  public TestPackage() {
    super(ITestPackage.TYPE_ID);
  }
  
  public TestPackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestPackage.TYPE_ID);
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

  public TestPackage setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose);
  }

  public TestPackage setDecompose(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> decompose) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition> selectDecomposeClasses() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_decomposeClasses);
  }

  public TestPackage setDecomposeClasses(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition> decomposeClasses) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_decomposeClasses, decomposeClasses);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public TestPackage setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public TestPackage setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> selectSubPackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages);
  }

  public TestPackage setSubPackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> subPackages) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, subPackages);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.qa.spec.testing.level.unitests.javamodel.ITestClassDecomposition> selectTestClasses() {
    return _getMap(cleon.qa.spec.testing.level.unitests.javamodel.ITestClassDecomposition.class, cleon.qa.spec.testing.level.unitests.UnitestsPackage.TestPackage_testClasses);
  }

  public TestPackage setTestClasses(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.qa.spec.testing.level.unitests.javamodel.ITestClassDecomposition> testClasses) {
    _setMap(cleon.qa.spec.testing.level.unitests.UnitestsPackage.TestPackage_testClasses, testClasses);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.qa.spec.testing.level.unitests.javamodel.ITestPackageDecomposition> selectTestPackages() {
    return _getMap(cleon.qa.spec.testing.level.unitests.javamodel.ITestPackageDecomposition.class, cleon.qa.spec.testing.level.unitests.UnitestsPackage.TestPackage_testPackages);
  }

  public TestPackage setTestPackages(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.qa.spec.testing.level.unitests.javamodel.ITestPackageDecomposition> testPackages) {
    _setMap(cleon.qa.spec.testing.level.unitests.UnitestsPackage.TestPackage_testPackages, testPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestPackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_decomposeClasses, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptMap(cleon.qa.spec.testing.level.unitests.javamodel.ITestClassDecomposition.class, cleon.qa.spec.testing.level.unitests.UnitestsPackage.TestPackage_testClasses, visitor);
    _acceptMap(cleon.qa.spec.testing.level.unitests.javamodel.ITestPackageDecomposition.class, cleon.qa.spec.testing.level.unitests.UnitestsPackage.TestPackage_testPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.qa.spec.testing.level.unitests.javamodel.ITestPackage selectToMeTestPackages(cleon.qa.spec.testing.level.unitests.javamodel.ITestPackageDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.qa.spec.testing.level.unitests.javamodel.ITestPackage.class, cleon.qa.spec.testing.level.unitests.UnitestsPackage.TestPackage_testPackages, object.getResource());
  }
  
  public static cleon.qa.spec.testing.level.unitests.javamodel.ITestPackage selectToMeTestClasses(cleon.qa.spec.testing.level.unitests.javamodel.ITestClassDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.qa.spec.testing.level.unitests.javamodel.ITestPackage.class, cleon.qa.spec.testing.level.unitests.UnitestsPackage.TestPackage_testClasses, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8faff353-9a2f-11e3-8bcf-e973a9ae2871,zzbARb5eB8H3vi96qchnPQO70a0=] */
