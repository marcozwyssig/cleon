package cleon.tdd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Test extends DynamicResource implements ITest {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITest> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITest>() {
    
    @Override
    public ITest create() {
      return new Test();
    }
    
    @Override
    public ITest create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Test(resourceRepository, resource);
    }
  
  };

  public Test() {
    super(ITest.TYPE_ID);
  }
  
  public Test(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITest.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectGiven() {
    return _getSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.Test_given);
  }
    
  public void setGiven(java.lang.String given) {
     _setSingleAttribute(cleon.tdd.spec.SpecPackage.Test_given, given);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  @Override
  public java.lang.String selectThen() {
    return _getSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.Test_then);
  }
    
  public void setThen(java.lang.String then) {
     _setSingleAttribute(cleon.tdd.spec.SpecPackage.Test_then, then);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Test setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Test setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.Test_given, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.Test_then, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27a0e91c-a398-11e3-9113-ffc7f11b0a42,CBpMxvp6HBvwTnvSop74J0htMhQ=] */
