package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmpciscoasavpnconnections extends DynamicResource implements ISnmpciscoasavpnconnections {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpciscoasavpnconnections> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpciscoasavpnconnections>() {
    
    @Override
    public ISnmpciscoasavpnconnections create() {
      return new Snmpciscoasavpnconnections();
    }
    
    @Override
    public ISnmpciscoasavpnconnections create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmpciscoasavpnconnections(resourceRepository, resource);
    }
  
  };

  public Snmpciscoasavpnconnections() {
    super(ISnmpciscoasavpnconnections.TYPE_ID);
  }
  
  public Snmpciscoasavpnconnections(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpciscoasavpnconnections.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmpciscoasavpnconnections setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4a0d8c-c1eb-11ea-820f-9931558a898c,OYUhzBOvxGZ6FuzhhLCxlOW59Hc=] */
