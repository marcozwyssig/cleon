package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MicrosoftLicenseType extends DynamicResource implements IMicrosoftLicenseType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMicrosoftLicenseType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMicrosoftLicenseType>() {
    
    @Override
    public IMicrosoftLicenseType create() {
      return new MicrosoftLicenseType();
    }
    
    @Override
    public IMicrosoftLicenseType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MicrosoftLicenseType(resourceRepository, resource);
    }
  
  };

  public MicrosoftLicenseType() {
    super(IMicrosoftLicenseType.TYPE_ID);
  }
  
  public MicrosoftLicenseType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMicrosoftLicenseType.TYPE_ID);
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

  public MicrosoftLicenseType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isMicrosoft__F_SQL__F_Server__F_License__F_Terms()) return visitor.visitMicrosoft__F_SQL__F_Server__F_License__F_Terms();
    if (isMicrosoftSoftwareLicenseTerms()) return visitor.visitMicrosoftSoftwareLicenseTerms();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isMicrosoft__F_SQL__F_Server__F_License__F_Terms()) {
      visitor.visitMicrosoft__F_SQL__F_Server__F_License__F_Terms();
      return;
    }
    if (isMicrosoftSoftwareLicenseTerms()) {
      visitor.visitMicrosoftSoftwareLicenseTerms();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isMicrosoft__F_SQL__F_Server__F_License__F_Terms() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.MicrosoftLicenseType_Microsoft__F_SQL__F_Server__F_License__F_Terms);
  }
  
  @Override
  public boolean isMicrosoftSoftwareLicenseTerms() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.MicrosoftLicenseType_MicrosoftSoftwareLicenseTerms);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,30588f8a-dfcb-11ef-b0be-9b4cac321140,rbjohBkKi8+OZkXFwA5Jh8qHQKE=] */
