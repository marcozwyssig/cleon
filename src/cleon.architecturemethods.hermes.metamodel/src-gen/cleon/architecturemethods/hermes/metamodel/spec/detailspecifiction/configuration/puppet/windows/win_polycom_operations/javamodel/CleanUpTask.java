package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CleanUpTask extends DynamicResource implements ICleanUpTask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICleanUpTask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICleanUpTask>() {
    
    @Override
    public ICleanUpTask create() {
      return new CleanUpTask();
    }
    
    @Override
    public ICleanUpTask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CleanUpTask(resourceRepository, resource);
    }
  
  };

  public CleanUpTask() {
    super(ICleanUpTask.TYPE_ID);
  }
  
  public CleanUpTask(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICleanUpTask.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectCleanuptarget() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_cleanuptarget);
  }
    
  public void setCleanuptarget(java.lang.String cleanuptarget) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_cleanuptarget, cleanuptarget);
  }

  @Override
  public java.util.List<java.lang.String> selectExclude() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_exclude);
  }
    
  public void setExclude(java.util.List<java.lang.String> exclude) {
     _setListAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_exclude, exclude);
  }

  @Override
  public java.util.List<java.lang.String> selectExcluderootfolder() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_excluderootfolder);
  }
    
  public void setExcluderootfolder(java.util.List<java.lang.String> excluderootfolder) {
     _setListAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_excluderootfolder, excluderootfolder);
  }

  @Override
  public java.lang.Integer selectFileage() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_fileage);
  }
    
  public void setFileage(java.lang.Integer fileage) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_fileage, fileage);
  }

  @Override
  public java.lang.String selectLogonAs() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_logonAs);
  }
    
  public void setLogonAs(java.lang.String logonAs) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_logonAs, logonAs);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectRecursive() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_recursive);
  }
    
  public void setRecursive(java.lang.Boolean recursive) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_recursive, recursive);
  }

  @Override
  public java.lang.String selectStarttime() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_starttime);
  }
    
  public void setStarttime(java.lang.String starttime) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_starttime, starttime);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount selectServiceAccount() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_serviceAccount);
  }

  public CleanUpTask setServiceAccount(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount serviceAccount) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_serviceAccount, serviceAccount);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CleanUpTask setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_cleanuptarget, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_exclude, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_excluderootfolder, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_fileage, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_logonAs, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_recursive, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_starttime, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_serviceAccount, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel.ICleanUpTask> selectToMeServiceAccount(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel.ICleanUpTask.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.CleanUpTask_serviceAccount, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,93803197-2759-11f0-b32f-851840d4a5f4,Ya5KqFOaCiieLf9cVqJqPkW2F08=] */
