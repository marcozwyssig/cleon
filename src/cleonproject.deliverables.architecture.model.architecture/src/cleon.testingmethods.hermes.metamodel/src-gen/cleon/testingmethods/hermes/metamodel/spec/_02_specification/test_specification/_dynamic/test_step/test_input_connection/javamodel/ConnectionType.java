package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ConnectionType extends DynamicResource implements IConnectionType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConnectionType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConnectionType>() {
    
    @Override
    public IConnectionType create() {
      return new ConnectionType();
    }
    
    @Override
    public IConnectionType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ConnectionType(resourceRepository, resource);
    }
  
  };

  public ConnectionType() {
    super(IConnectionType.TYPE_ID);
  }
  
  public ConnectionType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConnectionType.TYPE_ID);
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

  public ConnectionType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isRDP()) return visitor.visitRDP();
    if (isSSH()) return visitor.visitSSH();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isRDP()) {
      visitor.visitRDP();
      return;
    }
    if (isSSH()) {
      visitor.visitSSH();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isRDP() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.ConnectionType_RDP);
  }
  
  @Override
  public boolean isSSH() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.ConnectionType_SSH);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fbcfa2cf-6ce5-11e9-a6d3-775c09e81e2d,U9Qa9ur2MVYZslFRjmeaLoBBm3Y=] */
