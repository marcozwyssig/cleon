package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Netappcdotsnapmirror extends DynamicResource implements INetappcdotsnapmirror {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetappcdotsnapmirror> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetappcdotsnapmirror>() {
    
    @Override
    public INetappcdotsnapmirror create() {
      return new Netappcdotsnapmirror();
    }
    
    @Override
    public INetappcdotsnapmirror create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Netappcdotsnapmirror(resourceRepository, resource);
    }
  
  };

  public Netappcdotsnapmirror() {
    super(INetappcdotsnapmirror.TYPE_ID);
  }
  
  public Netappcdotsnapmirror(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetappcdotsnapmirror.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Netappcdotsnapmirror setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db47004a-c1eb-11ea-820f-9931558a898c,5x99EV7dWpIF/t1Ns7QqvkylhW0=] */
