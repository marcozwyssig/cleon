package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Jflowheader extends DynamicResource implements IJflowheader {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IJflowheader> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IJflowheader>() {
    
    @Override
    public IJflowheader create() {
      return new Jflowheader();
    }
    
    @Override
    public IJflowheader create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Jflowheader(resourceRepository, resource);
    }
  
  };

  public Jflowheader() {
    super(IJflowheader.TYPE_ID);
  }
  
  public Jflowheader(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IJflowheader.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Jflowheader setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db45795c-c1eb-11ea-820f-9931558a898c,wCJkTnqAJUTcFBeYShHZ7tfStKc=] */
