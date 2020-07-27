package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Wmisqlserver2016 extends DynamicResource implements IWmisqlserver2016 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWmisqlserver2016> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWmisqlserver2016>() {
    
    @Override
    public IWmisqlserver2016 create() {
      return new Wmisqlserver2016();
    }
    
    @Override
    public IWmisqlserver2016 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Wmisqlserver2016(resourceRepository, resource);
    }
  
  };

  public Wmisqlserver2016() {
    super(IWmisqlserver2016.TYPE_ID);
  }
  
  public Wmisqlserver2016(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWmisqlserver2016.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Wmisqlserver2016 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db51ae6a-c1eb-11ea-820f-9931558a898c,IcTX9n/qum7Jzb1NP90ZJd8ofAU=] */
