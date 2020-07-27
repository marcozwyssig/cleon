package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Netappcdotnic extends DynamicResource implements INetappcdotnic {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetappcdotnic> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetappcdotnic>() {
    
    @Override
    public INetappcdotnic create() {
      return new Netappcdotnic();
    }
    
    @Override
    public INetappcdotnic create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Netappcdotnic(resourceRepository, resource);
    }
  
  };

  public Netappcdotnic() {
    super(INetappcdotnic.TYPE_ID);
  }
  
  public Netappcdotnic(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetappcdotnic.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Netappcdotnic setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db47003e-c1eb-11ea-820f-9931558a898c,8KKWCuHajkXWjQN9Eh0KxOA12Wc=] */
