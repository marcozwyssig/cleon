package cleon.tdd.spec.javamodel;

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

  // relations
  
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectClass() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class);
  }

  public TestClassDecomposition setClass(cleon.uml.spec.structural.classes.javamodel.IClassifier class_) {
    _setSingle(cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, class_);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.packages.javamodel.IClassifierDecomposition selectClassUnderTest() {
    return _getSingle(cleon.uml.spec.structural.packages.javamodel.IClassifierDecomposition.class, cleon.tdd.spec.SpecPackage.TestClassDecomposition_classUnderTest);
  }

  public TestClassDecomposition setClassUnderTest(cleon.uml.spec.structural.packages.javamodel.IClassifierDecomposition classUnderTest) {
    _setSingle(cleon.tdd.spec.SpecPackage.TestClassDecomposition_classUnderTest, classUnderTest);
    return this;
  }
    
  @Override
  public cleon.tdd.spec.javamodel.ITestClass selectClasses() {
    return _getSingle(cleon.tdd.spec.javamodel.ITestClass.class, cleon.tdd.spec.SpecPackage.TestClassDecomposition_classes);
  }

  public TestClassDecomposition setClasses(cleon.tdd.spec.javamodel.ITestClass classes) {
    _setSingle(cleon.tdd.spec.SpecPackage.TestClassDecomposition_classes, classes);
    return this;
  }
    
  @Override
  public cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock selectDecompose() {
    return _getSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose);
  }

  public TestClassDecomposition setDecompose(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock decompose) {
    _setSingle(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, decompose);
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
    // relations
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.ClassifierDecomposition_class, visitor);
    _acceptSingle(cleon.uml.spec.structural.packages.javamodel.IClassifierDecomposition.class, cleon.tdd.spec.SpecPackage.TestClassDecomposition_classUnderTest, visitor);
    _acceptSingle(cleon.tdd.spec.javamodel.ITestClass.class, cleon.tdd.spec.SpecPackage.TestClassDecomposition_classes, visitor);
    _acceptSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseDecomposite_decompose, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.tdd.spec.javamodel.ITestClassDecomposition> selectToMeClassUnderTest(cleon.uml.spec.structural.packages.javamodel.IClassifierDecomposition object) {
    return _getToMeList(object.getRepository(), cleon.tdd.spec.javamodel.ITestClassDecomposition.class, cleon.tdd.spec.SpecPackage.TestClassDecomposition_classUnderTest, object.getResource());
  }
  
  public static cleon.tdd.spec.javamodel.ITestClassDecomposition selectToMeClasses(cleon.tdd.spec.javamodel.ITestClass object) {
    return _getToMeSingle(object.getRepository(), cleon.tdd.spec.javamodel.ITestClassDecomposition.class, cleon.tdd.spec.SpecPackage.TestClassDecomposition_classes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e43712cd-19f3-11e5-a57b-e324953fb3a6,Urvw72LrFmIm60VX7njwTavQW6g=] */
