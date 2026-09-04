package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InstallationmanualReference extends DynamicResource implements IInstallationmanualReference {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallationmanualReference> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallationmanualReference>() {
    
    @Override
    public IInstallationmanualReference create() {
      return new InstallationmanualReference();
    }
    
    @Override
    public IInstallationmanualReference create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InstallationmanualReference(resourceRepository, resource);
    }
  
  };

  public InstallationmanualReference() {
    super(IInstallationmanualReference.TYPE_ID);
  }
  
  public InstallationmanualReference(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInstallationmanualReference.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDocId() {
    return _getSingleAttribute(java.lang.String.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.AboutPackage.InstallationmanualReference_docId);
  }
    
  public void setDocId(java.lang.String docId) {
     _setSingleAttribute(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.AboutPackage.InstallationmanualReference_docId, docId);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.net.URL selectSource() {
    return _getSingleAttribute(java.net.URL.class, cleon.common.doc.metamodel.spec.chapter.references.ReferencesPackage.Reference_source);
  }
    
  public void setSource(java.net.URL source) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.references.ReferencesPackage.Reference_source, source);
  }

  @Override
  public java.lang.String selectVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version, version);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectInstallationManualForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.AboutPackage.InstallationmanualReference_installationManualForSystemConfiguration);
  }

  public InstallationmanualReference setInstallationManualForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration installationManualForSystemConfiguration) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.AboutPackage.InstallationmanualReference_installationManualForSystemConfiguration, installationManualForSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public InstallationmanualReference setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InstallationmanualReference setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.AboutPackage.InstallationmanualReference_docId, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.net.URL.class, cleon.common.doc.metamodel.spec.chapter.references.ReferencesPackage.Reference_source, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.AboutPackage.InstallationmanualReference_installationManualForSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel.IInstallationmanualReference selectToMeInstallationManualForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel.IInstallationmanualReference.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.AboutPackage.InstallationmanualReference_installationManualForSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7996b5e3-1b34-11e9-ad9a-a143a9cb74e7,kyAOt89Sqj5TYH4kPc5VjhRRPew=] */
