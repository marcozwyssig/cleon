package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Corestate extends DynamicResource implements ICorestate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICorestate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICorestate>() {
    
    @Override
    public ICorestate create() {
      return new Corestate();
    }
    
    @Override
    public ICorestate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Corestate(resourceRepository, resource);
    }
  
  };

  public Corestate() {
    super(ICorestate.TYPE_ID);
  }
  
  public Corestate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICorestate.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Corestate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db426bde-c1eb-11ea-820f-9931558a898c,ClNUHrPo2U7VA9MxbzPbaO0bLGU=] */
