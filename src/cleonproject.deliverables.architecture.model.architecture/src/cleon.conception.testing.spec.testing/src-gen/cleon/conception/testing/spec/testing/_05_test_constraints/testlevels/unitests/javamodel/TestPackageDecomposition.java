package cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel;

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
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest);
  }

  public TestPackageDecomposition setPackageUnderTest(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition packageUnderTest) {
    _setSingle(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, packageUnderTest);
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
  public cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage selectTestPackages() {
    return _getSingle(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages);
  }

  public TestPackageDecomposition setTestPackages(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage testPackages) {
    _setSingle(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, testPackages);
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
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageDecomposition_into, visitor);
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition> selectToMePackageUnderTest(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition object) {
    return _getToMeList(object.getRepository(), cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, object.getResource());
  }
  
  public static cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition selectToMeTestPackages(cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition.class, cleon.conception.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6a1dc86a-18fc-11e5-b505-7b16b1341920,hV/OxHDooCZuGPbCrwzHFKKAoUk=] */
