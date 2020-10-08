package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestSkip extends DynamicResource implements ITestSkip {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSkip> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSkip>() {
    
    @Override
    public ITestSkip create() {
      return new TestSkip();
    }
    
    @Override
    public ITestSkip create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestSkip(resourceRepository, resource);
    }
  
  };

  public TestSkip() {
    super(ITestSkip.TYPE_ID);
  }
  
  public TestSkip(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestSkip.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestSkip setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0c45a4c3-91a6-11e9-81d0-77e569e4aa61,oMfBUSDpF+c2XfUf8ZI4Q6ooODc=] */
