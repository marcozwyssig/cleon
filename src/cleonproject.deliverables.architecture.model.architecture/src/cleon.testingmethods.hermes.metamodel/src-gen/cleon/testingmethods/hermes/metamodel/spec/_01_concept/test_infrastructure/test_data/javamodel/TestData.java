package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_data.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestData extends DynamicResource implements ITestData {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestData> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestData>() {
    
    @Override
    public ITestData create() {
      return new TestData();
    }
    
    @Override
    public ITestData create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestData(resourceRepository, resource);
    }
  
  };

  public TestData() {
    super(ITestData.TYPE_ID);
  }
  
  public TestData(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestData.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectData() {
    return _getListAttribute(java.lang.String.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_data.Test_dataPackage.TestData_data);
  }
    
  public void setData(java.util.List<java.lang.String> data) {
     _setListAttribute(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_data.Test_dataPackage.TestData_data, data);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestData setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_data.Test_dataPackage.TestData_data, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,47997f0f-6d6f-11e9-b84d-d319514e887f,2mTdI6+jj50mBi3aeSclFEP0X+M=] */
