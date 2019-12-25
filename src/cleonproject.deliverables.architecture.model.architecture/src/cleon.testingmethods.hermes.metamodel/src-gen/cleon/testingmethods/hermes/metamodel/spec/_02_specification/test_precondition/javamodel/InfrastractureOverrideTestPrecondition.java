package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InfrastractureOverrideTestPrecondition extends DynamicResource implements IInfrastractureOverrideTestPrecondition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastractureOverrideTestPrecondition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastractureOverrideTestPrecondition>() {
    
    @Override
    public IInfrastractureOverrideTestPrecondition create() {
      return new InfrastractureOverrideTestPrecondition();
    }
    
    @Override
    public IInfrastractureOverrideTestPrecondition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InfrastractureOverrideTestPrecondition(resourceRepository, resource);
    }
  
  };

  public InfrastractureOverrideTestPrecondition() {
    super(IInfrastractureOverrideTestPrecondition.TYPE_ID);
  }
  
  public InfrastractureOverrideTestPrecondition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInfrastractureOverrideTestPrecondition.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public InfrastractureOverrideTestPrecondition setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.IAbstractTestInfrastracture selectTestInfrastructure() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.IAbstractTestInfrastracture.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestInfrastractureAware_testInfrastructure);
  }

  public InfrastractureOverrideTestPrecondition setTestInfrastructure(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.IAbstractTestInfrastracture testInfrastructure) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestInfrastractureAware_testInfrastructure, testInfrastructure);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPrecondition selectTestPrecondition() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.OverrideTestPrecondition_testPrecondition);
  }

  public InfrastractureOverrideTestPrecondition setTestPrecondition(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPrecondition testPrecondition) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.OverrideTestPrecondition_testPrecondition, testPrecondition);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InfrastractureOverrideTestPrecondition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.IAbstractTestInfrastracture.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestInfrastractureAware_testInfrastructure, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.OverrideTestPrecondition_testPrecondition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,689dfed3-6d8a-11e9-b84d-d319514e887f,0ms2BMPAzL02ARJbMIDhHAIwVuM=] */
