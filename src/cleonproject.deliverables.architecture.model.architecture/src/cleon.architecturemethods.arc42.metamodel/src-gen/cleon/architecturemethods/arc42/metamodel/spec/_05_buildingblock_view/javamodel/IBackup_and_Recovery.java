package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackup_and_Recovery extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0bc5739a-7ed3-11ea-9262-7b7e0e9cb204");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock selectUsedBackupBuildingBlock();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0bc5739a-7ed3-11ea-9262-7b7e0e9cb204,i/rIeftWSWmbhTXJC0hmjh3hVFo=] */
