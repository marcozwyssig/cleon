package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Wmisqlserver2005 extends DynamicResource implements IWmisqlserver2005 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWmisqlserver2005> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWmisqlserver2005>() {
    
    @Override
    public IWmisqlserver2005 create() {
      return new Wmisqlserver2005();
    }
    
    @Override
    public IWmisqlserver2005 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Wmisqlserver2005(resourceRepository, resource);
    }
  
  };

  public Wmisqlserver2005() {
    super(IWmisqlserver2005.TYPE_ID);
  }
  
  public Wmisqlserver2005(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWmisqlserver2005.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Wmisqlserver2005 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db51ae52-c1eb-11ea-820f-9931558a898c,70fI+EaEO9PAvKk1eBGgV1IzKXk=] */
