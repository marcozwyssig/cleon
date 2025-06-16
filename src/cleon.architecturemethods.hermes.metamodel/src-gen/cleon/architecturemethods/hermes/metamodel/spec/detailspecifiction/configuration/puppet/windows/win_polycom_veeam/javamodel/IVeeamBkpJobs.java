package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVeeamBkpJobs extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a15fea03-4a72-11f0-8aad-e18ef03c09ec");
  
  public java.lang.Integer selectRetaindays();
  
  public java.lang.Integer selectRetaindaystokeep();
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost selectVeeamESXiHost();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule selectSchedule();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectProxy();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectRepo();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBackupVM> selectVeeamBackupVMs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a15fea03-4a72-11f0-8aad-e18ef03c09ec,cnsmjkKuNt5/1VPk4+XQNMZHgsY=] */
