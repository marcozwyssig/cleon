package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInputString extends DynamicResource implements ITestInputString {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputString> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputString>() {
    
    @Override
    public ITestInputString create() {
      return new TestInputString();
    }
    
    @Override
    public ITestInputString create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInputString(resourceRepository, resource);
    }
  
  };

  public TestInputString() {
    super(ITestInputString.TYPE_ID);
  }
  
  public TestInputString(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInputString.TYPE_ID);
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

  @Override
  public java.lang.String selectValue() {
    return _getSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputString_value);
  }
    
  public void setValue(java.lang.String value) {
     _setSingleAttribute(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputString_value, value);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInputString setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestInputString_value, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,540d4479-6724-11e9-9ec9-5fbc84faaeb1,dydunMBWR+SvzxU13oV4UIR/cH4=] */
