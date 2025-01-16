package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class YamlType extends DynamicResource implements IYamlType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IYamlType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IYamlType>() {
    
    @Override
    public IYamlType create() {
      return new YamlType();
    }
    
    @Override
    public IYamlType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new YamlType(resourceRepository, resource);
    }
  
  };

  public YamlType() {
    super(IYamlType.TYPE_ID);
  }
  
  public YamlType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IYamlType.TYPE_ID);
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

  public YamlType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isNMS()) return visitor.visitNMS();
    if (isTN()) return visitor.visitTN();
    if (isNMSandTN()) return visitor.visitNMSandTN();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isNMS()) {
      visitor.visitNMS();
      return;
    }
    if (isTN()) {
      visitor.visitTN();
      return;
    }
    if (isNMSandTN()) {
      visitor.visitNMSandTN();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isNMS() {
    return getResource().equals(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.YamlType_NMS);
  }
  
  @Override
  public boolean isTN() {
    return getResource().equals(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.YamlType_TN);
  }
  
  @Override
  public boolean isNMSandTN() {
    return getResource().equals(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.YamlType_NMSandTN);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3ad16077-9538-11ec-9b36-7d300415c806,lVfiP/5euyR5b0usB0dc5HEqq0Y=] */
