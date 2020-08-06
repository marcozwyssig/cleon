package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Netappcdotlif extends DynamicResource implements INetappcdotlif {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetappcdotlif> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetappcdotlif>() {
    
    @Override
    public INetappcdotlif create() {
      return new Netappcdotlif();
    }
    
    @Override
    public INetappcdotlif create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Netappcdotlif(resourceRepository, resource);
    }
  
  };

  public Netappcdotlif() {
    super(INetappcdotlif.TYPE_ID);
  }
  
  public Netappcdotlif(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetappcdotlif.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Netappcdotlif setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db470032-c1eb-11ea-820f-9931558a898c,NRoPTktFebqI4c/lLWVTfZWwmlY=] */