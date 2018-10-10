package cleon.architecturemethods.eamod.spec.testing._03_test_methods.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestMethods extends DynamicResource implements ITestMethods {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestMethods> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestMethods>() {
    
    @Override
    public ITestMethods create() {
      return new TestMethods();
    }
    
    @Override
    public ITestMethods create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestMethods(resourceRepository, resource);
    }
  
  };

  public TestMethods() {
    super(ITestMethods.TYPE_ID);
  }
  
  public TestMethods(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestMethods.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestMethods setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.testing._03_test_methods.javamodel.ITestMethod> selectTestMethods() {
    return _getList(cleon.architecturemethods.eamod.spec.testing._03_test_methods.javamodel.ITestMethod.class, cleon.architecturemethods.eamod.spec.testing._03_test_methods._03_test_methodsPackage.TestMethods_testMethods);
  }

  public TestMethods setTestMethods(java.util.List<? extends cleon.architecturemethods.eamod.spec.testing._03_test_methods.javamodel.ITestMethod> testMethods) {
    _setList(cleon.architecturemethods.eamod.spec.testing._03_test_methods._03_test_methodsPackage.TestMethods_testMethods, testMethods);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestMethods setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.testing._03_test_methods.javamodel.ITestMethod.class, cleon.architecturemethods.eamod.spec.testing._03_test_methods._03_test_methodsPackage.TestMethods_testMethods, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.testing._03_test_methods.javamodel.ITestMethods selectToMeTestMethods(cleon.architecturemethods.eamod.spec.testing._03_test_methods.javamodel.ITestMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.testing._03_test_methods.javamodel.ITestMethods.class, cleon.architecturemethods.eamod.spec.testing._03_test_methods._03_test_methodsPackage.TestMethods_testMethods, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9de9654b-264b-11e6-ae54-e50d44645ae7,AxkSiyphVLoSWFJr1aQX3ttpVx0=] */
