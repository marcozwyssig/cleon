package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OverrideTestPrecondition extends DynamicResource implements IOverrideTestPrecondition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOverrideTestPrecondition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOverrideTestPrecondition>() {
    
    @Override
    public IOverrideTestPrecondition create() {
      return new OverrideTestPrecondition();
    }
    
    @Override
    public IOverrideTestPrecondition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OverrideTestPrecondition(resourceRepository, resource);
    }
  
  };

  public OverrideTestPrecondition() {
    super(IOverrideTestPrecondition.TYPE_ID);
  }
  
  public OverrideTestPrecondition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOverrideTestPrecondition.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public OverrideTestPrecondition setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel.ITestInfrastracture selectTestInfrastructure() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel.ITestInfrastracture.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.AbstractTestPrecondition_testInfrastructure);
  }

  public OverrideTestPrecondition setTestInfrastructure(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel.ITestInfrastracture testInfrastructure) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.AbstractTestPrecondition_testInfrastructure, testInfrastructure);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition selectTestPrecondition() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.OverrideTestPrecondition_testPrecondition);
  }

  public OverrideTestPrecondition setTestPrecondition(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition testPrecondition) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.OverrideTestPrecondition_testPrecondition, testPrecondition);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OverrideTestPrecondition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel.ITestInfrastracture.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.AbstractTestPrecondition_testInfrastructure, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.OverrideTestPrecondition_testPrecondition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition> selectToMeTestPrecondition(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.OverrideTestPrecondition_testPrecondition, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,64ed6b39-67ea-11e9-9ec9-5fbc84faaeb1,TDaNS0j7S3XQ5XK1j1zNjrniUoY=] */
