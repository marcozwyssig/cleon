package cleon.architecturemethods.eamod.spec.testing._09_test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestSuccess extends DynamicResource implements ITestSuccess {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSuccess> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSuccess>() {
    
    @Override
    public ITestSuccess create() {
      return new TestSuccess();
    }
    
    @Override
    public ITestSuccess create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestSuccess(resourceRepository, resource);
    }
  
  };

  public TestSuccess() {
    super(ITestSuccess.TYPE_ID);
  }
  
  public TestSuccess(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestSuccess.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestSuccess setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.ITestQualityCriteria selectTestQualityCriteria() {
    return _getSingle(cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.ITestQualityCriteria.class, cleon.architecturemethods.eamod.spec.testing._09_test_execution._09_test_executionPackage.TestResult_testQualityCriteria);
  }

  public TestSuccess setTestQualityCriteria(cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.ITestQualityCriteria testQualityCriteria) {
    _setSingle(cleon.architecturemethods.eamod.spec.testing._09_test_execution._09_test_executionPackage.TestResult_testQualityCriteria, testQualityCriteria);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember selectTester() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.architecturemethods.eamod.spec.testing._09_test_execution._09_test_executionPackage.TestResult_tester);
  }

  public TestSuccess setTester(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember tester) {
    _setSingle(cleon.architecturemethods.eamod.spec.testing._09_test_execution._09_test_executionPackage.TestResult_tester, tester);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestSuccess setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.ITestQualityCriteria.class, cleon.architecturemethods.eamod.spec.testing._09_test_execution._09_test_executionPackage.TestResult_testQualityCriteria, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.architecturemethods.eamod.spec.testing._09_test_execution._09_test_executionPackage.TestResult_tester, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c05894b0-1cf3-11e6-aaba-9db7fdc64d7e,/akgsxRdp3utdaMasfs6Lqx0OgE=] */
