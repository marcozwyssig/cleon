package cleon.conception.uml.spec.uml.structural.classes.method.messageExchange.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OneWay extends DynamicResource implements IOneWay {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOneWay> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOneWay>() {
    
    @Override
    public IOneWay create() {
      return new OneWay();
    }
    
    @Override
    public IOneWay create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OneWay(resourceRepository, resource);
    }
  
  };

  public OneWay() {
    super(IOneWay.TYPE_ID);
  }
  
  public OneWay(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOneWay.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OneWay setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0c6fb202-a437-11e3-a07f-f96d34c3de8f,hSLbTG87h7VK/ZHgzTFDOZKqKTo=] */
