package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInputTool extends DynamicResource implements ITestInputTool {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputTool> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputTool>() {
    
    @Override
    public ITestInputTool create() {
      return new TestInputTool();
    }
    
    @Override
    public ITestInputTool create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInputTool(resourceRepository, resource);
    }
  
  };

  public TestInputTool() {
    super(ITestInputTool.TYPE_ID);
  }
  
  public TestInputTool(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInputTool.TYPE_ID);
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

  // relations
  
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_tools.javamodel.ITestTool selectTestTool() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_tools.javamodel.ITestTool.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputTool_testTool);
  }

  public TestInputTool setTestTool(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_tools.javamodel.ITestTool testTool) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputTool_testTool, testTool);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInputTool setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_tools.javamodel.ITestTool.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputTool_testTool, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestInputTool> selectToMeTestTool(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_tools.javamodel.ITestTool object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestInputTool.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputTool_testTool, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c024bfff-6a81-11e9-bd30-87fcf852dea7,oHV6HjdfsLqCT38o5naWQ0m2Sk0=] */
