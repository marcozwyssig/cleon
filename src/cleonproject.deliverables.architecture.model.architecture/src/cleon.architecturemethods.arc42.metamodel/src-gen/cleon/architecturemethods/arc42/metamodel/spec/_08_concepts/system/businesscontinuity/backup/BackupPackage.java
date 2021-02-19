package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup;

import ch.actifsource.core.Resource;

public class BackupPackage {
  
  public static final Resource BackupConcept = new Resource("ce6a4faa-0eaf-11e9-9f19-6d15636f4ecc");
  public static final Resource BackupBuildingBlock = new Resource("f2bd0e83-1e3f-11e9-865e-41ef48a95f70");
  public static final Resource BackupConcept_backupBuildingBlock = new Resource("f8ee2475-1e3f-11e9-865e-41ef48a95f70");
  public static final Resource BackupBuildingBlock_buildingblockToBackup = new Resource("d67fd4e4-1e41-11e9-865e-41ef48a95f70");
  public static final Resource BackupConfiguration = new Resource("0713be48-1e42-11e9-865e-41ef48a95f70");
  public static final Resource BackupBuildingBlock_backupConfiguration = new Resource("18b8d82c-1e43-11e9-865e-41ef48a95f70");
  public static final Resource Schedule = new Resource("68bd338d-1e44-11e9-865e-41ef48a95f70");
  public static final Resource BackupConfiguration_schedule = new Resource("7f912a88-1e44-11e9-865e-41ef48a95f70");
  public static final Resource Schedule_Daily = new Resource("85dcf2e4-1e44-11e9-865e-41ef48a95f70");
  public static final Resource Schedule_Weekly = new Resource("87f0b810-1e44-11e9-865e-41ef48a95f70");
  public static final Resource Schedule_Monthly = new Resource("89761f40-1e44-11e9-865e-41ef48a95f70");
  public static final Resource BackupConcept_backupConfiguration = new Resource("00031db4-c1ca-11ea-b956-0ffede25a02d");
  public static final Resource BackupConfiguration_tool = new Resource("3e0fd22f-c1ca-11ea-b956-0ffede25a02d");
  public static final Resource BackupConfiguration_RTO_aE_hours = new Resource("d5e14cb4-c1cd-11ea-b956-0ffede25a02d");
  public static final Resource BackupConfiguration_RPO_aE_hours = new Resource("e073722f-c1cd-11ea-b956-0ffede25a02d");
  public static final Resource BackupConfiguration_retention_aE_days = new Resource("e76e8e37-c1cd-11ea-b956-0ffede25a02d");
  
  /* Begin Protected Region [[user]] */
  
  /* End Protected Region   [[user]] */
  
  private BackupPackage() {}
  
  public static final String getScopeName() {
    return "cleon.architecturemethods.arc42.metamodel";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup";
  }
  
}
/* Actifsource ID=[c1a07b92-fc09-11e0-b756-0dc1d96a76cb,cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup,f91hQOtHiIUHNwPhvU9dqzaCF5o=] */
