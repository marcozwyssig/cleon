package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InstallationMode extends DynamicResource implements IInstallationMode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallationMode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallationMode>() {
    
    @Override
    public IInstallationMode create() {
      return new InstallationMode();
    }
    
    @Override
    public IInstallationMode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InstallationMode(resourceRepository, resource);
    }
  
  };

  public InstallationMode() {
    super(IInstallationMode.TYPE_ID);
  }
  
  public InstallationMode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInstallationMode.TYPE_ID);
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

  public InstallationMode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isManual()) return visitor.visitManual();
    if (isAutomatic()) return visitor.visitAutomatic();
    if (isAutomaticUpdate()) return visitor.visitAutomaticUpdate();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isManual()) {
      visitor.visitManual();
      return;
    }
    if (isAutomatic()) {
      visitor.visitAutomatic();
      return;
    }
    if (isAutomaticUpdate()) {
      visitor.visitAutomaticUpdate();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isManual() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.InstallationMode_Manual);
  }
  
  @Override
  public boolean isAutomatic() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.InstallationMode_Automatic);
  }
  
  @Override
  public boolean isAutomaticUpdate() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.InstallationMode_AutomaticUpdate);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e0506385-23fc-11ef-86fc-7d48003eb647,KJqi97ef5jV2grti53aXvKbZoE0=] */
