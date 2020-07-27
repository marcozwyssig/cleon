package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmpciscocbqos extends DynamicResource implements ISnmpciscocbqos {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpciscocbqos> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpciscocbqos>() {
    
    @Override
    public ISnmpciscocbqos create() {
      return new Snmpciscocbqos();
    }
    
    @Override
    public ISnmpciscocbqos create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmpciscocbqos(resourceRepository, resource);
    }
  
  };

  public Snmpciscocbqos() {
    super(ISnmpciscocbqos.TYPE_ID);
  }
  
  public Snmpciscocbqos(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpciscocbqos.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmpciscocbqos setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4a0d9e-c1eb-11ea-820f-9931558a898c,hT7cWc4wgqTv6/QHKXv4gaJOUmE=] */
