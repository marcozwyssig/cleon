package cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInfrastructures extends DynamicResource implements ITestInfrastructures {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInfrastructures> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInfrastructures>() {
    
    @Override
    public ITestInfrastructures create() {
      return new TestInfrastructures();
    }
    
    @Override
    public ITestInfrastructures create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInfrastructures(resourceRepository, resource);
    }
  
  };

  public TestInfrastructures() {
    super(ITestInfrastructures.TYPE_ID);
  }
  
  public TestInfrastructures(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInfrastructures.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public TestInfrastructures setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITester> selectTesters() {
    return _getList(cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITester.class, cleon.implementation.testing.spec.testing._06_test_infrastructure._06_test_infrastructurePackage.TestInfrastructures_testers);
  }

  public TestInfrastructures setTesters(java.util.List<? extends cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITester> testers) {
    _setList(cleon.implementation.testing.spec.testing._06_test_infrastructure._06_test_infrastructurePackage.TestInfrastructures_testers, testers);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInfrastructures setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptList(cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITester.class, cleon.implementation.testing.spec.testing._06_test_infrastructure._06_test_infrastructurePackage.TestInfrastructures_testers, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITestInfrastructures selectToMeTesters(cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITester object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITestInfrastructures.class, cleon.implementation.testing.spec.testing._06_test_infrastructure._06_test_infrastructurePackage.TestInfrastructures_testers, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b2de291a-20d7-11e6-9368-9172b77c2cff,CyD6TH1LhGF3qSF8WNe2bUwBctk=] */
