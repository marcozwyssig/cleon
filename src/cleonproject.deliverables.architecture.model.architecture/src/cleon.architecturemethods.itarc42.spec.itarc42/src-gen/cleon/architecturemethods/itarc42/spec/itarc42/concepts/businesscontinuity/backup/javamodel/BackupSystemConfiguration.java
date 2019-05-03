package cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BackupSystemConfiguration extends DynamicResource implements IBackupSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupSystemConfiguration>() {
    
    @Override
    public IBackupSystemConfiguration create() {
      return new BackupSystemConfiguration();
    }
    
    @Override
    public IBackupSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BackupSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public BackupSystemConfiguration() {
    super(IBackupSystemConfiguration.TYPE_ID);
  }
  
  public BackupSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBackupSystemConfiguration.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupConfiguration selectBackupConfiguration() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_backupConfiguration);
  }

  public BackupSystemConfiguration setBackupConfiguration(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupConfiguration backupConfiguration) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_backupConfiguration, backupConfiguration);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.ISchedule selectSchedule() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.ISchedule.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_schedule);
  }

  public BackupSystemConfiguration setSchedule(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.ISchedule schedule) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_schedule, schedule);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration selectSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_systemConfiguration);
  }

  public BackupSystemConfiguration setSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_systemConfiguration, systemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public BackupSystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BackupSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_backupConfiguration, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.ISchedule.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_schedule, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_systemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupSystemConfiguration> selectToMeSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupSystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_systemConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupSystemConfiguration> selectToMeBackupConfiguration(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupSystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_backupConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupSystemConfiguration> selectToMeSchedule(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.ISchedule object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackupSystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.BackupPackage.BackupSystemConfiguration_schedule, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f2bd0e83-1e3f-11e9-865e-41ef48a95f70,ANMN6WEmc09OeFQVNnIhh6f0a+E=] */
