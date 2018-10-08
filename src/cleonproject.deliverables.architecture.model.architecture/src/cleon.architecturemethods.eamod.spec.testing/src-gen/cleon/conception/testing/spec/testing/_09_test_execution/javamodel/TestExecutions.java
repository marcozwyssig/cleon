package cleon.conception.testing.spec.testing._09_test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestExecutions extends DynamicResource implements ITestExecutions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecutions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecutions>() {
    
    @Override
    public ITestExecutions create() {
      return new TestExecutions();
    }
    
    @Override
    public ITestExecutions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestExecutions(resourceRepository, resource);
    }
  
  };

  public TestExecutions() {
    super(ITestExecutions.TYPE_ID);
  }
  
  public TestExecutions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestExecutions.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestExecutions setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._09_test_execution._static.javamodel.IStaticTestExecution> selectStaticTestExecutions() {
    return _getMap(cleon.conception.testing.spec.testing._09_test_execution._static.javamodel.IStaticTestExecution.class, cleon.conception.testing.spec.testing._09_test_execution._09_test_executionPackage.TestExecutions_staticTestExecutions);
  }

  public TestExecutions setStaticTestExecutions(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._09_test_execution._static.javamodel.IStaticTestExecution> staticTestExecutions) {
    _setMap(cleon.conception.testing.spec.testing._09_test_execution._09_test_executionPackage.TestExecutions_staticTestExecutions, staticTestExecutions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestExecutions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptMap(cleon.conception.testing.spec.testing._09_test_execution._static.javamodel.IStaticTestExecution.class, cleon.conception.testing.spec.testing._09_test_execution._09_test_executionPackage.TestExecutions_staticTestExecutions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.testing.spec.testing._09_test_execution.javamodel.ITestExecutions selectToMeStaticTestExecutions(cleon.conception.testing.spec.testing._09_test_execution._static.javamodel.IStaticTestExecution object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.testing.spec.testing._09_test_execution.javamodel.ITestExecutions.class, cleon.conception.testing.spec.testing._09_test_execution._09_test_executionPackage.TestExecutions_staticTestExecutions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,624c64dc-20d7-11e6-9368-9172b77c2cff,EQnO4NdydA3KbIpEZK9XOglSyBk=] */
