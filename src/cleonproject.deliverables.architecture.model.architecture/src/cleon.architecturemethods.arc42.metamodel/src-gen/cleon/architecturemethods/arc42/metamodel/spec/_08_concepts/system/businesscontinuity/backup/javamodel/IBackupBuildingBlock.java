package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackupBuildingBlock extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f2bd0e83-1e3f-11e9-865e-41ef48a95f70");
  
  // relations
  
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectBuildingblockToBackup();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration selectBackupConfiguration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f2bd0e83-1e3f-11e9-865e-41ef48a95f70,6awSi5/rLUNlZKOv5j7QEC+STSc=] */
