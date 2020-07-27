package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Remotedesktop extends DynamicResource implements IRemotedesktop {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRemotedesktop> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRemotedesktop>() {
    
    @Override
    public IRemotedesktop create() {
      return new Remotedesktop();
    }
    
    @Override
    public IRemotedesktop create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Remotedesktop(resourceRepository, resource);
    }
  
  };

  public Remotedesktop() {
    super(IRemotedesktop.TYPE_ID);
  }
  
  public Remotedesktop(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRemotedesktop.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Remotedesktop setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db48877a-c1eb-11ea-820f-9931558a898c,cnCorl/qzP58E68TVc3CvzFyl4c=] */
