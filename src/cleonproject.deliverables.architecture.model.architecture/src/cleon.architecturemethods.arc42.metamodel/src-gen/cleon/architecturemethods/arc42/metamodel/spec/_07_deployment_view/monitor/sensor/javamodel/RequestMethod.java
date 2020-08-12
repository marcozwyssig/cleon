package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequestMethod extends DynamicResource implements IRequestMethod {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequestMethod> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequestMethod>() {
    
    @Override
    public IRequestMethod create() {
      return new RequestMethod();
    }
    
    @Override
    public IRequestMethod create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequestMethod(resourceRepository, resource);
    }
  
  };

  public RequestMethod() {
    super(IRequestMethod.TYPE_ID);
  }
  
  public RequestMethod(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequestMethod.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequestMethod setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isGET()) return visitor.visitGET();
    if (isPOST()) return visitor.visitPOST();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isGET()) {
      visitor.visitGET();
      return;
    }
    if (isPOST()) {
      visitor.visitPOST();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isGET() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.RequestMethod_GET);
  }
  
  @Override
  public boolean isPOST() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.RequestMethod_POST);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4c6592d2-dc79-11ea-a169-cb4c6ff66798,aFhml0CMKbbo7Yca6o8KereA1y4=] */
