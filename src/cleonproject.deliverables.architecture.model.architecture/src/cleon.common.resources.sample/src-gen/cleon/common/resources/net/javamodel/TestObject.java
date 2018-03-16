package cleon.common.resources.net.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestObject extends DynamicResource implements ITestObject {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestObject> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestObject>() {
    
    @Override
    public ITestObject create() {
      return new TestObject();
    }
    
    @Override
    public ITestObject create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestObject(resourceRepository, resource);
    }
  
  };

  public TestObject() {
    super(ITestObject.TYPE_ID);
  }
  
  public TestObject(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestObject.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.net.URL selectUrl() {
    return _getSingleAttribute(java.net.URL.class, cleon.common.resources.net.NetPackage.TestObject_url);
  }
    
  public void setUrl(java.net.URL url) {
     _setSingleAttribute(cleon.common.resources.net.NetPackage.TestObject_url, url);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestObject setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.net.URL.class, cleon.common.resources.net.NetPackage.TestObject_url, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5aaac29e-b791-11e6-85e2-39e149963066,OjpfY0rBR8AD5fdpDXOyFGi1wOM=] */
