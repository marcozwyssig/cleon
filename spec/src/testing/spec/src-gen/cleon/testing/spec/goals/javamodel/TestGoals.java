package cleon.testing.spec.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestGoals extends DynamicResource implements ITestGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestGoals>() {
    
    @Override
    public ITestGoals create() {
      return new TestGoals();
    }
    
    @Override
    public ITestGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestGoals(resourceRepository, resource);
    }
  
  };

  public TestGoals() {
    super(ITestGoals.TYPE_ID);
  }
  
  public TestGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestGoals.TYPE_ID);
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

  public TestGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6b104a80-d406-11e5-8556-8f55ceb91287,PfBAPsc9Vdub78fwUK2i3yLnUK4=] */
