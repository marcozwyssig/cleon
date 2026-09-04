package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVeeamMaster extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f78f6f9e-4819-11f0-bcdd-31d38803078d");
  
  public java.lang.String selectVeeamBkpRepoShareName();
  
  public java.lang.String selectVeeamBkpRepoType();
  
  public java.lang.Integer selectVeeamBkpRepoLimitConcurrentJobs();
  
  public java.lang.String selectVeeamServerinstance();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount selectVeeamESXiUsername();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamMasterUser> selectVeeamMasterUser();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule> selectVeeamSchedules();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobHostProfile> selectVeeamBkpJobHostProfile();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamESXiHost> selectVeeamESXiHosts();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobs> selectVeeamBkpJobs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f78f6f9e-4819-11f0-bcdd-31d38803078d,qVe2kTm7zUtwyFKPRmPdmMepN4I=] */
