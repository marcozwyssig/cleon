package cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestView extends DynamicResource implements ITestView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestView>() {
    
    @Override
    public ITestView create() {
      return new TestView();
    }
    
    @Override
    public ITestView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestView(resourceRepository, resource);
    }
  
  };

  public TestView() {
    super(ITestView.TYPE_ID);
  }
  
  public TestView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestView.TYPE_ID);
  }

  // attributes
  
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

  public TestView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dbcd90d8-9991-11e8-b347-dd2314b02086,cmNMMI5Ub/KQpZUKtJC2sAGpPqw=] */
