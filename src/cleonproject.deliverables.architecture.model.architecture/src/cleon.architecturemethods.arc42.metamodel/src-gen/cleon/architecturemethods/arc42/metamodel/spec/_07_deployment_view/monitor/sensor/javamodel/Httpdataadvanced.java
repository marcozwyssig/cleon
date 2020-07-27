package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Httpdataadvanced extends DynamicResource implements IHttpdataadvanced {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHttpdataadvanced> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHttpdataadvanced>() {
    
    @Override
    public IHttpdataadvanced create() {
      return new Httpdataadvanced();
    }
    
    @Override
    public IHttpdataadvanced create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Httpdataadvanced(resourceRepository, resource);
    }
  
  };

  public Httpdataadvanced() {
    super(IHttpdataadvanced.TYPE_ID);
  }
  
  public Httpdataadvanced(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHttpdataadvanced.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Httpdataadvanced setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4578f0-c1eb-11ea-820f-9931558a898c,KM4dj4KsyaV8S0tqcjwaZod103A=] */
