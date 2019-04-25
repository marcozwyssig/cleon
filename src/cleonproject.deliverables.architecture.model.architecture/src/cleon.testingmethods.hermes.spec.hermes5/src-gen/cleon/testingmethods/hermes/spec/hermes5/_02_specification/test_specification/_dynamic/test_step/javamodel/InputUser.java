package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InputUser extends DynamicResource implements IInputUser {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInputUser> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInputUser>() {
    
    @Override
    public IInputUser create() {
      return new InputUser();
    }
    
    @Override
    public IInputUser create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InputUser(resourceRepository, resource);
    }
  
  };

  public InputUser() {
    super(IInputUser.TYPE_ID);
  }
  
  public InputUser(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInputUser.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InputUser setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4dc43ad2-6724-11e9-9ec9-5fbc84faaeb1,r3wvnHzXoGVuXRg+sI/vpJoJEcs=] */
