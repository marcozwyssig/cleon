package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.bcm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BackupJob extends DynamicResource implements IBackupJob {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupJob> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupJob>() {
    
    @Override
    public IBackupJob create() {
      return new BackupJob();
    }
    
    @Override
    public IBackupJob create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BackupJob(resourceRepository, resource);
    }
  
  };

  public BackupJob() {
    super(IBackupJob.TYPE_ID);
  }
  
  public BackupJob(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBackupJob.TYPE_ID);
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

  public BackupJob setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1baf86c7-a608-11ec-9968-b970a72504b8,BYdGo3E0QsWZqbi3yWEbwf/UENA=] */
