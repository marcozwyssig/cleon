package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class KeyUsage extends DynamicResource implements IKeyUsage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKeyUsage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKeyUsage>() {
    
    @Override
    public IKeyUsage create() {
      return new KeyUsage();
    }
    
    @Override
    public IKeyUsage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new KeyUsage(resourceRepository, resource);
    }
  
  };

  public KeyUsage() {
    super(IKeyUsage.TYPE_ID);
  }
  
  public KeyUsage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IKeyUsage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

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

  public KeyUsage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isDigitalSignature()) return visitor.visitDigitalSignature();
    if (isNonRepudiation()) return visitor.visitNonRepudiation();
    if (isKeyEncipherment()) return visitor.visitKeyEncipherment();
    if (isDataEncipherment()) return visitor.visitDataEncipherment();
    if (isKeyAgreement()) return visitor.visitKeyAgreement();
    if (isKeyCertSign()) return visitor.visitKeyCertSign();
    if (isCRLSign()) return visitor.visitCRLSign();
    if (isEncipherOnly()) return visitor.visitEncipherOnly();
    if (isDecipherOnly()) return visitor.visitDecipherOnly();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isDigitalSignature()) {
      visitor.visitDigitalSignature();
      return;
    }
    if (isNonRepudiation()) {
      visitor.visitNonRepudiation();
      return;
    }
    if (isKeyEncipherment()) {
      visitor.visitKeyEncipherment();
      return;
    }
    if (isDataEncipherment()) {
      visitor.visitDataEncipherment();
      return;
    }
    if (isKeyAgreement()) {
      visitor.visitKeyAgreement();
      return;
    }
    if (isKeyCertSign()) {
      visitor.visitKeyCertSign();
      return;
    }
    if (isCRLSign()) {
      visitor.visitCRLSign();
      return;
    }
    if (isEncipherOnly()) {
      visitor.visitEncipherOnly();
      return;
    }
    if (isDecipherOnly()) {
      visitor.visitDecipherOnly();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isDigitalSignature() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.KeyUsage_digitalSignature);
  }
  
  @Override
  public boolean isNonRepudiation() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.KeyUsage_nonRepudiation);
  }
  
  @Override
  public boolean isKeyEncipherment() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.KeyUsage_keyEncipherment);
  }
  
  @Override
  public boolean isDataEncipherment() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.KeyUsage_dataEncipherment);
  }
  
  @Override
  public boolean isKeyAgreement() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.KeyUsage_keyAgreement);
  }
  
  @Override
  public boolean isKeyCertSign() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.KeyUsage_keyCertSign);
  }
  
  @Override
  public boolean isCRLSign() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.KeyUsage_cRLSign);
  }
  
  @Override
  public boolean isEncipherOnly() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.KeyUsage_encipherOnly);
  }
  
  @Override
  public boolean isDecipherOnly() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.Lin_polycom_operationsPackage.KeyUsage_decipherOnly);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f3a668cb-4d10-11f0-954b-b579526ae084,QAnXmf2C0xThart0FLI6gJqyFlk=] */
