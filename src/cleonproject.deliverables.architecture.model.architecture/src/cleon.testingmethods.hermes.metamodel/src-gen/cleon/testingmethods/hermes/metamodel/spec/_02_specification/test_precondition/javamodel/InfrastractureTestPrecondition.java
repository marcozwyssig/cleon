package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InfrastractureTestPrecondition extends DynamicResource implements IInfrastractureTestPrecondition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastractureTestPrecondition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastractureTestPrecondition>() {
    
    @Override
    public IInfrastractureTestPrecondition create() {
      return new InfrastractureTestPrecondition();
    }
    
    @Override
    public IInfrastractureTestPrecondition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InfrastractureTestPrecondition(resourceRepository, resource);
    }
  
  };

  public InfrastractureTestPrecondition() {
    super(IInfrastractureTestPrecondition.TYPE_ID);
  }
  
  public InfrastractureTestPrecondition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInfrastractureTestPrecondition.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.IAbstractTestInfrastracture selectTestInfrastructure() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.IAbstractTestInfrastracture.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestInfrastractureAware_testInfrastructure);
  }

  public InfrastractureTestPrecondition setTestInfrastructure(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.IAbstractTestInfrastracture testInfrastructure) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestInfrastractureAware_testInfrastructure, testInfrastructure);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InfrastractureTestPrecondition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,261a417f-6d8a-11e9-b84d-d319514e887f,gHFdPOiTNve2nc/wP4fRRXii2r0=] */
