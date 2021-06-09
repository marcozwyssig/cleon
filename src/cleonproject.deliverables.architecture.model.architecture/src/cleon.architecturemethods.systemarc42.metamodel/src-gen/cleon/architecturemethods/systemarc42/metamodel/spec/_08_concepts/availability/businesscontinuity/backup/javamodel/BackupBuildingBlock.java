package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BackupBuildingBlock extends DynamicResource implements IBackupBuildingBlock {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupBuildingBlock> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupBuildingBlock>() {
    
    @Override
    public IBackupBuildingBlock create() {
      return new BackupBuildingBlock();
    }
    
    @Override
    public IBackupBuildingBlock create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BackupBuildingBlock(resourceRepository, resource);
    }
  
  };

  public BackupBuildingBlock() {
    super(IBackupBuildingBlock.TYPE_ID);
  }
  
  public BackupBuildingBlock(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBackupBuildingBlock.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.IBackupConfiguration selectBackupConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.IBackupConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.BackupPackage.BackupBuildingBlock_backupConfiguration);
  }

  public BackupBuildingBlock setBackupConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.IBackupConfiguration backupConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.BackupPackage.BackupBuildingBlock_backupConfiguration, backupConfiguration);
    return this;
  }
    
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectBuildingblockToBackup() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.BackupPackage.BackupBuildingBlock_buildingblockToBackup);
  }

  public BackupBuildingBlock setBuildingblockToBackup(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buildingblockToBackup) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.BackupPackage.BackupBuildingBlock_buildingblockToBackup, buildingblockToBackup);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public BackupBuildingBlock setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BackupBuildingBlock setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.IBackupConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.BackupPackage.BackupBuildingBlock_backupConfiguration, visitor);
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.BackupPackage.BackupBuildingBlock_buildingblockToBackup, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.IBackupBuildingBlock selectToMeBuildingblockToBackup(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.IBackupBuildingBlock.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.BackupPackage.BackupBuildingBlock_buildingblockToBackup, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.IBackupBuildingBlock> selectToMeBackupConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.IBackupConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.IBackupBuildingBlock.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.BackupPackage.BackupBuildingBlock_backupConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8d62605c-c93b-11eb-adc4-d18d1353eb6e,X8tXT48hdK+zqHa7mnZNI10tkjw=] */
