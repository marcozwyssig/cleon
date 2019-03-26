package cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.javamodel;

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

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectPurpose() {
    return _getListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose);
  }
    
  public void setPurpose(java.util.List<java.lang.String> purpose) {
     _setListAttribute(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, purpose);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackage selectInto() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageDecomposition_into);
  }

  public TestPackageDecomposition setInto(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackage into) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public TestPackageDecomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition selectPackageUnderTest() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest);
  }

  public TestPackageDecomposition setPackageUnderTest(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition packageUnderTest) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, packageUnderTest);
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
  public cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.javamodel.ITestPackage selectTestPackages() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.javamodel.ITestPackage.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages);
  }

  public TestPackageDecomposition setTestPackages(cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.javamodel.ITestPackage testPackages) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, testPackages);
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
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageDecomposition_into, visitor);
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.javamodel.ITestPackage.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition> selectToMePackageUnderTest(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition selectToMeTestPackages(cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.javamodel.ITestPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6a1dc86a-18fc-11e5-b505-7b16b1341920,Cd/H0BAvtJ8x+MPZ9XEGxnJaRR4=] */
