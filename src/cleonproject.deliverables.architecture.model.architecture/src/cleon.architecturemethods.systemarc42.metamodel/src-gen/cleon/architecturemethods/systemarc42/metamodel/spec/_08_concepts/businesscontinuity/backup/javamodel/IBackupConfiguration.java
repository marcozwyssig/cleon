package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackupConfiguration extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0713be48-1e42-11e9-865e-41ef48a95f70");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel.ISchedule selectSchedule();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0713be48-1e42-11e9-865e-41ef48a95f70,cUegeX5nzgrFuO8IeVyeC4k+hbY=] */
