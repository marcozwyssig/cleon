package cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel;

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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public TestPackage setDecompose(java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition> selectDecomposeClasses() {
    return _getList(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.Package_decomposeClasses);
  }

  public TestPackage setDecomposeClasses(java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition> decomposeClasses) {
    _setList(cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.Package_decomposeClasses, decomposeClasses);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestPackage setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition> selectSubPackages() {
    return _getList(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.Package_subPackages);
  }

  public TestPackage setSubPackages(java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition> subPackages) {
    _setList(cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.Package_subPackages, subPackages);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition> selectTestClasses() {
    return _getMap(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackage_testClasses);
  }

  public TestPackage setTestClasses(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition> testClasses) {
    _setMap(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackage_testClasses, testClasses);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition> selectTestPackages() {
    return _getMap(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackage_testPackages);
  }

  public TestPackage setTestPackages(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition> testPackages) {
    _setMap(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackage_testPackages, testPackages);
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
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.Package_decomposeClasses, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptMap(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackage_testClasses, visitor);
    _acceptMap(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackage_testPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage selectToMeTestPackages(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackage_testPackages, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage selectToMeTestClasses(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackage_testClasses, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8faff353-9a2f-11e3-8bcf-e973a9ae2871,HXbyEkiqIhkIhFo0hpVVlnLusYQ=] */
