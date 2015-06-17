package cleon.tdd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestMethod extends DynamicResource implements ITestMethod {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestMethod> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestMethod>() {
    
    @Override
    public ITestMethod create() {
      return new TestMethod();
    }
    
    @Override
    public ITestMethod create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestMethod(resourceRepository, resource);
    }
  
  };

  public TestMethod() {
    super(ITestMethod.TYPE_ID);
  }
  
  public TestMethod(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestMethod.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectGiven() {
    return _getSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.Test_given);
  }
    
  public void setGiven(java.lang.String given) {
     _setSingleAttribute(cleon.tdd.spec.SpecPackage.Test_given, given);
  }

  @Override
  public java.lang.Boolean selectIsAsync() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.tdd.spec.SpecPackage.TestMethod_isAsync);
  }
    
  public void setIsAsync(java.lang.Boolean isAsync) {
     _setSingleAttribute(cleon.tdd.spec.SpecPackage.TestMethod_isAsync, isAsync);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  @Override
  public java.lang.String selectThen() {
    return _getSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.Test_then);
  }
    
  public void setThen(java.lang.String then) {
     _setSingleAttribute(cleon.tdd.spec.SpecPackage.Test_then, then);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestMethod setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestMethod setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.method.javamodel.IMethod selectWhen() {
    return _getSingle(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.tdd.spec.SpecPackage.TestMethod_when);
  }

  public TestMethod setWhen(cleon.uml.spec.structural.classes.method.javamodel.IMethod when) {
    _setSingle(cleon.tdd.spec.SpecPackage.TestMethod_when, when);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.Test_given, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.tdd.spec.SpecPackage.TestMethod_isAsync, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.Test_then, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.tdd.spec.SpecPackage.TestMethod_when, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.tdd.spec.javamodel.ITestMethod> selectToMeWhen(cleon.uml.spec.structural.classes.method.javamodel.IMethod object) {
    return _getToMeList(object.getRepository(), cleon.tdd.spec.javamodel.ITestMethod.class, cleon.tdd.spec.SpecPackage.TestMethod_when, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ef10e4c2-df47-11e2-b229-cd1bd4a07953,fxNpIulmgzQrG2FfuxweeilE8LE=] */
