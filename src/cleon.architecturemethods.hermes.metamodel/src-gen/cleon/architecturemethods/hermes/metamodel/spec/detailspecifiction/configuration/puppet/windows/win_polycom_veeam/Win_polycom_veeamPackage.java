package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam;

import ch.actifsource.core.Resource;

public class Win_polycom_veeamPackage {
  
  public static final Resource VeeamMaster = new Resource("f78f6f9e-4819-11f0-bcdd-31d38803078d");
  public static final Resource VeeamProxy = new Resource("e3972c2a-481a-11f0-98fa-27341f0ccbf7");
  public static final Resource VeeamProxy_veeamPScmdlet = new Resource("d767db36-481b-11f0-98fa-27341f0ccbf7");
  public static final Resource VeeamProxy_veeamMaster = new Resource("efecb662-481b-11f0-98fa-27341f0ccbf7");
  public static final Resource VeeamMaster_veeamESXiUsername = new Resource("0653066f-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamMaster_veeamBkpRepoShareName = new Resource("22bb5d5e-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamMaster_veeamBkpRepoType = new Resource("28b4c132-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamMaster_veeamBkpRepoLimitConcurrentJobs = new Resource("2d36c645-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamMaster_veeamServerinstance = new Resource("3bb65318-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamMasterUser = new Resource("559b0bbf-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamMaster_veeamMasterUser = new Resource("5c3ee039-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamMasterUser_veeamESXiUsername = new Resource("84178770-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamSchedule = new Resource("d9f61a02-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamMaster_veeamSchedules = new Resource("dd2ed6ff-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamSchedule_time = new Resource("e8bfa7c1-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamSchedule_days = new Resource("f936975a-4860-11f0-ab73-2116b4504ace");
  public static final Resource VeeamSchedule_transformToSyntethicDays = new Resource("317adbab-4864-11f0-ab73-2116b4504ace");
  public static final Resource VeeamBkpJobHostProfile = new Resource("7a5a8f18-4864-11f0-ab73-2116b4504ace");
  public static final Resource VeeamMaster_veeamBkpJobHostProfile = new Resource("7e534087-4864-11f0-ab73-2116b4504ace");
  public static final Resource VeeamBkpJobHostProfile_adIntegrated = new Resource("a2bbee35-4864-11f0-ab73-2116b4504ace");
  public static final Resource VeeamBkpJobHostProfile_includedDisks = new Resource("aaee7914-4864-11f0-ab73-2116b4504ace");
  public static final Resource VeeamESXiHost = new Resource("53453086-4867-11f0-ab73-2116b4504ace");
  public static final Resource VeeamMaster_veeamESXiHosts = new Resource("59b01a8d-4867-11f0-ab73-2116b4504ace");
  public static final Resource VeeamESXiHost_vmhHost = new Resource("a5611694-4867-11f0-ab73-2116b4504ace");
  public static final Resource VeeamESXiHost_veeamMasterUser = new Resource("005e95da-4869-11f0-ab73-2116b4504ace");
  public static final Resource VeeamBkpJobs = new Resource("a15fea03-4a72-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamMaster_veeamBkpJobs = new Resource("ae1b7f50-4a72-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamBkpJobs_veeamESXiHost = new Resource("b7a7312b-4a72-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamBkpJobs_schedule = new Resource("cc6d564b-4a72-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamBkpJobs_proxy = new Resource("4c6335ef-4a73-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamBkpJobs_repo = new Resource("88ba4b1b-4a73-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamBkpJobs_retaindays = new Resource("c67f9609-4a73-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamBkpJobs_retaindaystokeep = new Resource("d07f665c-4a73-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamBackupVM = new Resource("3bd87a93-4a74-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamBkpJobs_veeamBackupVMs = new Resource("451dd507-4a74-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamBackupVM_buildNode = new Resource("7e28097d-4a74-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamBackupVM_bkpJobHostProfile = new Resource("9fcc66ad-4a74-11f0-8aad-e18ef03c09ec");
  public static final Resource VeeamProxy_veeamUsername = new Resource("8f3a8d14-5330-11f0-9301-032f11813eba");
  
  /* Begin Protected Region [[user]] */
  
  /* End Protected Region   [[user]] */
  
  private Win_polycom_veeamPackage() {}
  
  public static final String getScopeName() {
    return "cleon.architecturemethods.hermes.metamodel";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam";
  }
  
}
/* Actifsource ID=[c1a07b92-fc09-11e0-b756-0dc1d96a76cb,cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam,0Ezl+vyoFnN+fV2N/K4NMjLPWio=] */
