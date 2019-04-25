package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackupSystemConfiguration extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f2bd0e83-1e3f-11e9-865e-41ef48a95f70");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration selectSystemConfiguration();
  
  public cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.backup.javamodel.IBackupConfiguration selectBackupConfiguration();
  
  public cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.backup.javamodel.ISchedule selectSchedule();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f2bd0e83-1e3f-11e9-865e-41ef48a95f70,KuO7mkoyKSvnzDUJpF8aFW9KwsE=] */
