package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AuthZBuildingBlockForBackupJobs extends DynamicResource implements IAuthZBuildingBlockForBackupJobs {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAuthZBuildingBlockForBackupJobs> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAuthZBuildingBlockForBackupJobs>() {
    
    @Override
    public IAuthZBuildingBlockForBackupJobs create() {
      return new AuthZBuildingBlockForBackupJobs();
    }
    
    @Override
    public IAuthZBuildingBlockForBackupJobs create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AuthZBuildingBlockForBackupJobs(resourceRepository, resource);
    }
  
  };

  public AuthZBuildingBlockForBackupJobs() {
    super(IAuthZBuildingBlockForBackupJobs.TYPE_ID);
  }
  
  public AuthZBuildingBlockForBackupJobs(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAuthZBuildingBlockForBackupJobs.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.bcm.javamodel.IBackupJob selectBackupJob() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.bcm.javamodel.IBackupJob.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForBackupJobs_backupJob);
  }

  public AuthZBuildingBlockForBackupJobs setBackupJob(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.bcm.javamodel.IBackupJob backupJob) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForBackupJobs_backupJob, backupJob);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AuthZBuildingBlockForBackupJobs setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AuthZBuildingBlockForBackupJobs setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.bcm.javamodel.IBackupJob.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForBackupJobs_backupJob, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForBackupJobs> selectToMeBackupJob(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.bcm.javamodel.IBackupJob object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForBackupJobs.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForBackupJobs_backupJob, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,12f44f26-a609-11ec-9968-b970a72504b8,q0DFwzp9Jb42aGmccZbHsMciGPo=] */
