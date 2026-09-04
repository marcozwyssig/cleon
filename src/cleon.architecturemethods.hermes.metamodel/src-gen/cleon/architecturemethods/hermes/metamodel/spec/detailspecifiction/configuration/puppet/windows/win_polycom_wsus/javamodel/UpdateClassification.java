package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class UpdateClassification extends DynamicResource implements IUpdateClassification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUpdateClassification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUpdateClassification>() {
    
    @Override
    public IUpdateClassification create() {
      return new UpdateClassification();
    }
    
    @Override
    public IUpdateClassification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new UpdateClassification(resourceRepository, resource);
    }
  
  };

  public UpdateClassification() {
    super(IUpdateClassification.TYPE_ID);
  }
  
  public UpdateClassification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IUpdateClassification.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectIdentifier() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.id.IdPackage.StringBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.String identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.StringBusinessObjectId_identifier, identifier);
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

  public UpdateClassification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.id.IdPackage.StringBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isAnwendungen()) return visitor.visitAnwendungen();
    if (isDefinitionsupdates()) return visitor.visitDefinitionsupdates();
    if (isFeature__F_Packs()) return visitor.visitFeature__F_Packs();
    if (isService__F_Packs()) return visitor.visitService__F_Packs();
    if (isSicherheitsupdates__F___U___F_Security__F_Updates()) return visitor.visitSicherheitsupdates__F___U___F_Security__F_Updates();
    if (isTools()) return visitor.visitTools();
    if (isTreiber()) return visitor.visitTreiber();
    if (isTreibersätze()) return visitor.visitTreibersätze();
    if (isUpdate__S_Rollups()) return visitor.visitUpdate__S_Rollups();
    if (isUpdates()) return visitor.visitUpdates();
    if (isUpgrades()) return visitor.visitUpgrades();
    if (isWichtige__F_Updates__F___U___F_Critical__F_Updates()) return visitor.visitWichtige__F_Updates__F___U___F_Critical__F_Updates();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isAnwendungen()) {
      visitor.visitAnwendungen();
      return;
    }
    if (isDefinitionsupdates()) {
      visitor.visitDefinitionsupdates();
      return;
    }
    if (isFeature__F_Packs()) {
      visitor.visitFeature__F_Packs();
      return;
    }
    if (isService__F_Packs()) {
      visitor.visitService__F_Packs();
      return;
    }
    if (isSicherheitsupdates__F___U___F_Security__F_Updates()) {
      visitor.visitSicherheitsupdates__F___U___F_Security__F_Updates();
      return;
    }
    if (isTools()) {
      visitor.visitTools();
      return;
    }
    if (isTreiber()) {
      visitor.visitTreiber();
      return;
    }
    if (isTreibersätze()) {
      visitor.visitTreibersätze();
      return;
    }
    if (isUpdate__S_Rollups()) {
      visitor.visitUpdate__S_Rollups();
      return;
    }
    if (isUpdates()) {
      visitor.visitUpdates();
      return;
    }
    if (isUpgrades()) {
      visitor.visitUpgrades();
      return;
    }
    if (isWichtige__F_Updates__F___U___F_Critical__F_Updates()) {
      visitor.visitWichtige__F_Updates__F___U___F_Critical__F_Updates();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isAnwendungen() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Anwendungen);
  }
  
  @Override
  public boolean isDefinitionsupdates() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Definitionsupdates);
  }
  
  @Override
  public boolean isFeature__F_Packs() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Feature__F_Packs);
  }
  
  @Override
  public boolean isService__F_Packs() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Service__F_Packs);
  }
  
  @Override
  public boolean isSicherheitsupdates__F___U___F_Security__F_Updates() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Sicherheitsupdates__F___U___F_Security__F_Updates);
  }
  
  @Override
  public boolean isTools() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Tools);
  }
  
  @Override
  public boolean isTreiber() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Treiber);
  }
  
  @Override
  public boolean isTreibersätze() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Treibersätze);
  }
  
  @Override
  public boolean isUpdate__S_Rollups() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Update__S_Rollups);
  }
  
  @Override
  public boolean isUpdates() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Updates);
  }
  
  @Override
  public boolean isUpgrades() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Upgrades);
  }
  
  @Override
  public boolean isWichtige__F_Updates__F___U___F_Critical__F_Updates() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.UpdateClassification_Wichtige__F_Updates__F___U___F_Critical__F_Updates);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c5fbc60e-5331-11f0-9301-032f11813eba,43d5ko5mR6nA9oGofLzYzicIssk=] */
