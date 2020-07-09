package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel;

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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel.ISchedule selectSchedule() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel.ISchedule.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_schedule);
  }

  public BackupConfiguration setSchedule(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel.ISchedule schedule) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_schedule, schedule);
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel.ISchedule.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_schedule, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel.IBackupConfiguration> selectToMeSchedule(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel.ISchedule object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel.IBackupConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_schedule, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0713be48-1e42-11e9-865e-41ef48a95f70,C4w8+Bd6n1t1Lhkd0LpYKIUIAVo=] */
