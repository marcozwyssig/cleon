package cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestEnvironment extends DynamicResource implements ITestEnvironment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestEnvironment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestEnvironment>() {
    
    @Override
    public ITestEnvironment create() {
      return new TestEnvironment();
    }
    
    @Override
    public ITestEnvironment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestEnvironment(resourceRepository, resource);
    }
  
  };

  public TestEnvironment() {
    super(ITestEnvironment.TYPE_ID);
  }
  
  public TestEnvironment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestEnvironment.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public TestEnvironment setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestEnvironment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0681f04a-eabf-11e5-838a-6dbe7118dd11,qr4Vi4zkVa1T0kpNJDLs1sfXe+Q=] */
