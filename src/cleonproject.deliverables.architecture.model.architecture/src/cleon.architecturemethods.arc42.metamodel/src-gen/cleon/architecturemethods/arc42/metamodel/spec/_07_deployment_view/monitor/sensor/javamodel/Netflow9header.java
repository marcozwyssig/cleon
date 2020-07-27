package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Netflow9header extends DynamicResource implements INetflow9header {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetflow9header> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetflow9header>() {
    
    @Override
    public INetflow9header create() {
      return new Netflow9header();
    }
    
    @Override
    public INetflow9header create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Netflow9header(resourceRepository, resource);
    }
  
  };

  public Netflow9header() {
    super(INetflow9header.TYPE_ID);
  }
  
  public Netflow9header(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetflow9header.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Netflow9header setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db470068-c1eb-11ea-820f-9931558a898c,8KsvBFUO0ry6KHO3L1BOvxAtVdY=] */
