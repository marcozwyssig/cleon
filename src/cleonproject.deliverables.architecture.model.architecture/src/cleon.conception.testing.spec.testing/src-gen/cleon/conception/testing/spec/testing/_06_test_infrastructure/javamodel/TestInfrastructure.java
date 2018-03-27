package cleon.conception.testing.spec.testing._06_test_infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInfrastructure extends DynamicResource implements ITestInfrastructure {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInfrastructure> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInfrastructure>() {
    
    @Override
    public ITestInfrastructure create() {
      return new TestInfrastructure();
    }
    
    @Override
    public ITestInfrastructure create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInfrastructure(resourceRepository, resource);
    }
  
  };

  public TestInfrastructure() {
    super(ITestInfrastructure.TYPE_ID);
  }
  
  public TestInfrastructure(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInfrastructure.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public TestInfrastructure setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInfrastructure setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b9d15599-20d7-11e6-9368-9172b77c2cff,Gn353AKmxvlckex6lDvXYLEqINs=] */
