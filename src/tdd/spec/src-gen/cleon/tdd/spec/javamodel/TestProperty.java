package cleon.tdd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestProperty extends DynamicResource implements ITestProperty {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestProperty> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestProperty>() {
    
    @Override
    public ITestProperty create() {
      return new TestProperty();
    }
    
    @Override
    public ITestProperty create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestProperty(resourceRepository, resource);
    }
  
  };

  public TestProperty() {
    super(ITestProperty.TYPE_ID);
  }
  
  public TestProperty(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestProperty.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectGiven() {
    return _getSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.TestObjekt_given);
  }
    
  public void setGiven(java.lang.String given) {
     _setSingleAttribute(cleon.tdd.spec.SpecPackage.TestObjekt_given, given);
  }

  @Override
  public java.lang.String selectThen() {
    return _getSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.TestObjekt_then);
  }
    
  public void setThen(java.lang.String then) {
     _setSingleAttribute(cleon.tdd.spec.SpecPackage.TestObjekt_then, then);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestProperty setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestProperty setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.fields.javamodel.IProperty selectWhen() {
    return _getSingle(cleon.uml.spec.structural.classes.fields.javamodel.IProperty.class, cleon.tdd.spec.SpecPackage.TestProperty_when);
  }

  public TestProperty setWhen(cleon.uml.spec.structural.classes.fields.javamodel.IProperty when) {
    _setSingle(cleon.tdd.spec.SpecPackage.TestProperty_when, when);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.TestObjekt_given, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.TestObjekt_then, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.fields.javamodel.IProperty.class, cleon.tdd.spec.SpecPackage.TestProperty_when, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.tdd.spec.javamodel.ITestProperty> selectToMeWhen(cleon.uml.spec.structural.classes.fields.javamodel.IProperty object) {
    return _getToMeList(object.getRepository(), cleon.tdd.spec.javamodel.ITestProperty.class, cleon.tdd.spec.SpecPackage.TestProperty_when, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,aec482bc-a397-11e3-9113-ffc7f11b0a42,sLNnumnEkoe4gGKZcXnm1ig3MbE=] */
