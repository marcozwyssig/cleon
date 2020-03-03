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
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isNone()) return visitor.visitNone();
    if (isVM()) return visitor.visitVM();
    if (isWindows()) return visitor.visitWindows();
    if (isSQL__F_Server()) return visitor.visitSQL__F_Server();
    if (isActive__F_Directory()) return visitor.visitActive__F_Directory();
    if (isExchange()) return visitor.visitExchange();
    if (isDatenablage()) return visitor.visitDatenablage();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isNone()) {
      visitor.visitNone();
      return;
    }
    if (isVM()) {
      visitor.visitVM();
      return;
    }
    if (isWindows()) {
      visitor.visitWindows();
      return;
    }
    if (isSQL__F_Server()) {
      visitor.visitSQL__F_Server();
      return;
    }
    if (isActive__F_Directory()) {
      visitor.visitActive__F_Directory();
      return;
    }
    if (isExchange()) {
      visitor.visitExchange();
      return;
    }
    if (isDatenablage()) {
      visitor.visitDatenablage();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isNone() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_None);
  }
  
  @Override
  public boolean isVM() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_VM);
  }
  
  @Override
  public boolean isWindows() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_Windows);
  }
  
  @Override
  public boolean isSQL__F_Server() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_SQL__F_Server);
  }
  
  @Override
  public boolean isActive__F_Directory() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_Active__F_Directory);
  }
  
  @Override
  public boolean isExchange() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_Exchange);
  }
  
  @Override
  public boolean isDatenablage() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.BackupPackage.BackupConfiguration_Datenablage);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0713be48-1e42-11e9-865e-41ef48a95f70,xVmLtISCcfIgW2e9Ep72cLBUeDs=] */
