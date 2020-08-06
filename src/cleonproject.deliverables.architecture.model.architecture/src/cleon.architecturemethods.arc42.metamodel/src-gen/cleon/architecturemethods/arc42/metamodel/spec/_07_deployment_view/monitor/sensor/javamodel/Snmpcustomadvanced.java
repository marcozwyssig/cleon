package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmpcustomadvanced extends DynamicResource implements ISnmpcustomadvanced {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpcustomadvanced> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpcustomadvanced>() {
    
    @Override
    public ISnmpcustomadvanced create() {
      return new Snmpcustomadvanced();
    }
    
    @Override
    public ISnmpcustomadvanced create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmpcustomadvanced(resourceRepository, resource);
    }
  
  };

  public Snmpcustomadvanced() {
    super(ISnmpcustomadvanced.TYPE_ID);
  }
  
  public Snmpcustomadvanced(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpcustomadvanced.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmpcustomadvanced setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4b946e-c1eb-11ea-820f-9931558a898c,+UJNLEZyfzx3zfZTNJa5UTzcHwc=] */