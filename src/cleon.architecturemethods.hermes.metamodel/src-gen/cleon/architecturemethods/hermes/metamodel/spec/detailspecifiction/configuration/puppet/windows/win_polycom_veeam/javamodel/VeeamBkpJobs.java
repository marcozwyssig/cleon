package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VeeamBkpJobs extends DynamicResource implements IVeeamBkpJobs {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVeeamBkpJobs> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVeeamBkpJobs>() {
    
    @Override
    public IVeeamBkpJobs create() {
      return new VeeamBkpJobs();
    }
    
    @Override
    public IVeeamBkpJobs create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VeeamBkpJobs(resourceRepository, resource);
    }
  
  };

  public VeeamBkpJobs() {
    super(IVeeamBkpJobs.TYPE_ID);
  }
  
  public VeeamBkpJobs(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVeeamBkpJobs.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectRetaindays() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_retaindays);
  }
    
  public void setRetaindays(java.lang.Integer retaindays) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_retaindays, retaindays);
  }

  @Override
  public java.lang.Integer selectRetaindaystokeep() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_retaindaystokeep);
  }
    
  public void setRetaindaystokeep(java.lang.Integer retaindaystokeep) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_retaindaystokeep, retaindaystokeep);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectProxy() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_proxy);
  }

  public VeeamBkpJobs setProxy(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost proxy) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_proxy, proxy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectRepo() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_repo);
  }

  public VeeamBkpJobs setRepo(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost repo) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_repo, repo);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule selectSchedule() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_schedule);
  }

  public VeeamBkpJobs setSchedule(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule schedule) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_schedule, schedule);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public VeeamBkpJobs setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VeeamBkpJobs setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBackupVM> selectVeeamBackupVMs() {
    return _getMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBackupVM.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_veeamBackupVMs);
  }

  public VeeamBkpJobs setVeeamBackupVMs(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBackupVM> veeamBackupVMs) {
    _setMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_veeamBackupVMs, veeamBackupVMs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost selectVeeamESXiHost() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_veeamESXiHost);
  }

  public VeeamBkpJobs setVeeamESXiHost(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost veeamESXiHost) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_veeamESXiHost, veeamESXiHost);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_retaindays, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_retaindaystokeep, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_proxy, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_repo, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_schedule, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBackupVM.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_veeamBackupVMs, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_veeamESXiHost, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs> selectToMeVeeamESXiHost(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_veeamESXiHost, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs> selectToMeSchedule(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_schedule, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs> selectToMeProxy(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_proxy, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs> selectToMeRepo(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_repo, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs selectToMeVeeamBackupVMs(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBackupVM object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamBkpJobs_veeamBackupVMs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a15fea03-4a72-11f0-8aad-e18ef03c09ec,GPxgtRlicXVs8zbelGFoaSgD6AI=] */
