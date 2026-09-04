package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackupMethod extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapterPath {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0713be48-1e42-11e9-865e-41ef48a95f70");
  
  // attributes
  
  public java.lang.String selectName();
  
  public java.lang.Integer selectRetention_days();
  
  public java.lang.Integer selectFullBackupEvery();
  
  public java.lang.Integer selectIntervalBackupEvery();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule selectSchedule();
  
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant selectUsingProductForBackup();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0713be48-1e42-11e9-865e-41ef48a95f70,3AQr04E9wrEnb2GRElnJsPgYFBQ=] */
