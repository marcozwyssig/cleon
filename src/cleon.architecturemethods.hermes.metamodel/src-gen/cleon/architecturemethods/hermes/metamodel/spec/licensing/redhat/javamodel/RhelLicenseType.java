package cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RhelLicenseType extends DynamicResource implements IRhelLicenseType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRhelLicenseType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRhelLicenseType>() {
    
    @Override
    public IRhelLicenseType create() {
      return new RhelLicenseType();
    }
    
    @Override
    public IRhelLicenseType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RhelLicenseType(resourceRepository, resource);
    }
  
  };

  public RhelLicenseType() {
    super(IRhelLicenseType.TYPE_ID);
  }
  
  public RhelLicenseType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRhelLicenseType.TYPE_ID);
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

  public RhelLicenseType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isHost__S_Based()) return visitor.visitHost__S_Based();
    if (isVM__S_Based()) return visitor.visitVM__S_Based();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isHost__S_Based()) {
      visitor.visitHost__S_Based();
      return;
    }
    if (isVM__S_Based()) {
      visitor.visitVM__S_Based();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isHost__S_Based() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.RedhatPackage.RhelLicenseType_Host__S_Based);
  }
  
  @Override
  public boolean isVM__S_Based() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.RedhatPackage.RhelLicenseType_VM__S_Based);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9b193b6e-dfed-11ef-8b41-bffcdee4ee9e,LELm2kHSu9g3Sto5W2mxw8VJSjc=] */
