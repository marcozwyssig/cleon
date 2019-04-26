package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class UsedTestGlobalPreconditionGroup extends DynamicResource implements IUsedTestGlobalPreconditionGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUsedTestGlobalPreconditionGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUsedTestGlobalPreconditionGroup>() {
    
    @Override
    public IUsedTestGlobalPreconditionGroup create() {
      return new UsedTestGlobalPreconditionGroup();
    }
    
    @Override
    public IUsedTestGlobalPreconditionGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new UsedTestGlobalPreconditionGroup(resourceRepository, resource);
    }
  
  };

  public UsedTestGlobalPreconditionGroup() {
    super(IUsedTestGlobalPreconditionGroup.TYPE_ID);
  }
  
  public UsedTestGlobalPreconditionGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IUsedTestGlobalPreconditionGroup.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition> selectOverrideTestStep() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.UsedTestGlobalPreconditionGroup_overrideTestStep);
  }

  public UsedTestGlobalPreconditionGroup setOverrideTestStep(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition> overrideTestStep) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.UsedTestGlobalPreconditionGroup_overrideTestStep, overrideTestStep);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public UsedTestGlobalPreconditionGroup setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup selectTestGlobalPrecondition() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.UsedTestGlobalPreconditionGroup_testGlobalPrecondition);
  }

  public UsedTestGlobalPreconditionGroup setTestGlobalPrecondition(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup testGlobalPrecondition) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.UsedTestGlobalPreconditionGroup_testGlobalPrecondition, testGlobalPrecondition);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public UsedTestGlobalPreconditionGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.UsedTestGlobalPreconditionGroup_overrideTestStep, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.UsedTestGlobalPreconditionGroup_testGlobalPrecondition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup> selectToMeTestGlobalPrecondition(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.UsedTestGlobalPreconditionGroup_testGlobalPrecondition, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup selectToMeOverrideTestStep(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.UsedTestGlobalPreconditionGroup_overrideTestStep, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b32136ac-67e9-11e9-9ec9-5fbc84faaeb1,r9XX1LLG9225gWJHtBeDf0q66fY=] */
