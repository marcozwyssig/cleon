package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.bcm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackupSystemConfiguration extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bae618be-09f5-11e9-abef-3d869859c931");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.bcm.javamodel.IBackupJob> selectBackupJobs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bae618be-09f5-11e9-abef-3d869859c931,iTtmyfxL19RhU19WYw/IPjEo6/M=] */
