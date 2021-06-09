package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup;

import ch.actifsource.core.Resource;

public class BackupPackage {
  
  public static final Resource BackupConfiguration = new Resource("8d62602e-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupConfiguration_tool = new Resource("8d62602f-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupConfiguration_schedule = new Resource("8d626030-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupConfiguration_RTO_aE_hours = new Resource("8d626031-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupConfiguration_RPO_aE_hours = new Resource("8d626032-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupConfiguration_retention_aE_days = new Resource("8d626033-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource Schedule = new Resource("8d626043-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource Schedule_Daily = new Resource("8d626044-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource Schedule_Weekly = new Resource("8d626045-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource Schedule_Monthly = new Resource("8d626046-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupConcept = new Resource("8d626047-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupConcept_backupConfiguration = new Resource("8d626048-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupConcept_backupBuildingBlock = new Resource("8d62604f-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupBuildingBlock = new Resource("8d62605c-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupBuildingBlock_buildingblockToBackup = new Resource("8d62605d-c93b-11eb-adc4-d18d1353eb6e");
  public static final Resource BackupBuildingBlock_backupConfiguration = new Resource("8d62605e-c93b-11eb-adc4-d18d1353eb6e");
  
  /* Begin Protected Region [[user]] */
  
  /* End Protected Region   [[user]] */
  
  private BackupPackage() {}
  
  public static final String getScopeName() {
    return "cleon.architecturemethods.systemarc42.metamodel";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup";
  }
  
}
/* Actifsource ID=[c1a07b92-fc09-11e0-b756-0dc1d96a76cb,cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup,VPAufJuBrg0TTJWLB+WUDCxPYKQ=] */
