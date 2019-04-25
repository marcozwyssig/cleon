package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InputData extends DynamicResource implements IInputData {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInputData> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInputData>() {
    
    @Override
    public IInputData create() {
      return new InputData();
    }
    
    @Override
    public IInputData create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InputData(resourceRepository, resource);
    }
  
  };

  public InputData() {
    super(IInputData.TYPE_ID);
  }
  
  public InputData(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInputData.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InputData setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ffc72fa2-6727-11e9-9ec9-5fbc84faaeb1,Rj+OO9yF5re1ItddR+ZRIEKc08A=] */
