package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BackupConfiguration extends DynamicResource implements IBackupConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupConfiguration>() {
    
    @Override
    public IBackupConfiguration create() {
      return new BackupConfiguration();
    }
    
    @Override
    public IBackupConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BackupConfiguration(resourceRepository, resource);
    }
  
  };

  public BackupConfiguration() {
    super(IBackupConfiguration.TYPE_ID);
  }
  
  public BackupConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBackupConfiguration.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectRPO_hours() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_RPO_aE_hours);
  }
    
  public void setRPO_hours(java.lang.Integer rPO_hours) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_RPO_aE_hours, rPO_hours);
  }

  @Override
  public java.lang.Integer selectRTO_hours() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_RTO_aE_hours);
  }
    
  public void setRTO_hours(java.lang.Integer rTO_hours) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_RTO_aE_hours, rTO_hours);
  }

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
  public java.lang.Integer selectRetention_days() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_retention_aE_days);
  }
    
  public void setRetention_days(java.lang.Integer retention_days) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_retention_aE_days, retention_days);
  }

  @Override
  public java.lang.String selectTool() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_tool);
  }
    
  public void setTool(java.lang.String tool) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_tool, tool);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule selectSchedule() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_schedule);
  }

  public BackupConfiguration setSchedule(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule schedule) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_schedule, schedule);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BackupConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_RPO_aE_hours, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_RTO_aE_hours, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_retention_aE_days, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_tool, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_schedule, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration> selectToMeSchedule(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConfiguration_schedule, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0713be48-1e42-11e9-865e-41ef48a95f70,ZGb0Y94npjubmo1JdUdbFygluQc=] */
