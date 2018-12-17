package cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel;

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
  public java.util.List<java.lang.String> selectPurpose() {
    return _getListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose);
  }
    
  public void setPurpose(java.util.List<java.lang.String> purpose) {
     _setListAttribute(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, purpose);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition selectClassUnderTest() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest);
  }

  public TestClassDecomposition setClassUnderTest(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition classUnderTest) {
    _setSingle(cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest, classUnderTest);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass selectClasses() {
    return _getSingle(cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass.class, cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classes);
  }

  public TestClassDecomposition setClasses(cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass classes) {
    _setSingle(cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classes, classes);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier selectInto() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into);
  }

  public TestClassDecomposition setInto(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier into) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public TestClassDecomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
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
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass.class, cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classes, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.spec.uml2.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, visitor);
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition> selectToMeClassUnderTest(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageInClassifierDecomposition object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition.class, cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition selectToMeClasses(cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition.class, cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e43712cd-19f3-11e5-a57b-e324953fb3a6,xQw7iptR+VoRec7S2S7MBqhOfgg=] */
