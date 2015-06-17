package cleon.tdd.spec.javamodel;

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
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> selectOwnDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.OwnBuildingBlock_ownDecompositions);
  }

  public TestPackage setOwnDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> ownDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.OwnBuildingBlock_ownDecompositions, ownDecompositions);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.packages.javamodel.IPackage selectPackage() {
    return _getSingle(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.tdd.spec.SpecPackage.TestPackage_package);
  }

  public TestPackage setPackage(cleon.uml.spec.structural.packages.javamodel.IPackage package_) {
    _setSingle(cleon.tdd.spec.SpecPackage.TestPackage_package, package_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestPackage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestClass> selectTestClasses() {
    return _getMap(cleon.tdd.spec.javamodel.ITestClass.class, cleon.tdd.spec.SpecPackage.TestPackage_testClasses);
  }

  public TestPackage setTestClasses(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestClass> testClasses) {
    _setMap(cleon.tdd.spec.SpecPackage.TestPackage_testClasses, testClasses);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestPackage> selectTestPackage() {
    return _getMap(cleon.tdd.spec.javamodel.ITestPackage.class, cleon.tdd.spec.SpecPackage.TestPackage_testPackage);
  }

  public TestPackage setTestPackage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestPackage> testPackage) {
    _setMap(cleon.tdd.spec.SpecPackage.TestPackage_testPackage, testPackage);
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
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.OwnBuildingBlock_ownDecompositions, visitor);
    _acceptSingle(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.tdd.spec.SpecPackage.TestPackage_package, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptMap(cleon.tdd.spec.javamodel.ITestClass.class, cleon.tdd.spec.SpecPackage.TestPackage_testClasses, visitor);
    _acceptMap(cleon.tdd.spec.javamodel.ITestPackage.class, cleon.tdd.spec.SpecPackage.TestPackage_testPackage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.tdd.spec.javamodel.ITestPackage selectToMeTestClasses(cleon.tdd.spec.javamodel.ITestClass object) {
    return _getToMeSingle(object.getRepository(), cleon.tdd.spec.javamodel.ITestPackage.class, cleon.tdd.spec.SpecPackage.TestPackage_testClasses, object.getResource());
  }
  
  public static cleon.tdd.spec.javamodel.ITestPackage selectToMeTestPackage(cleon.tdd.spec.javamodel.ITestPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.tdd.spec.javamodel.ITestPackage.class, cleon.tdd.spec.SpecPackage.TestPackage_testPackage, object.getResource());
  }
  
  public static java.util.List<cleon.tdd.spec.javamodel.ITestPackage> selectToMePackage(cleon.uml.spec.structural.packages.javamodel.IPackage object) {
    return _getToMeList(object.getRepository(), cleon.tdd.spec.javamodel.ITestPackage.class, cleon.tdd.spec.SpecPackage.TestPackage_package, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8faff353-9a2f-11e3-8bcf-e973a9ae2871,4Cb7xDgLPsvej8YA1Eeb9zD9wxQ=] */
