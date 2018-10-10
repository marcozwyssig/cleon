package cleon.architecturemethods.arc42.spec.devops.spec.operate.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Operate extends DynamicResource implements IOperate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperate>() {
    
    @Override
    public IOperate create() {
      return new Operate();
    }
    
    @Override
    public IOperate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Operate(resourceRepository, resource);
    }
  
  };

  public Operate() {
    super(IOperate.TYPE_ID);
  }
  
  public Operate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOperate.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Operate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8b95d58f-4072-11e5-b5f0-5b1ce9c3de3e,E2refWWOcQ7keJdYy68QuK/MkFI=] */
