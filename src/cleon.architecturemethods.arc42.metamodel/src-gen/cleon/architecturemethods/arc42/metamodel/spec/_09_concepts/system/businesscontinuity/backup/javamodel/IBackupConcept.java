package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackupConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.javamodel.IAbstractBusinessContinuityConcept, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ce6a4faa-0eaf-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration> selectBackupAndRecoveryStategies();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock> selectBackupAndRecovery();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ce6a4faa-0eaf-11e9-9f19-6d15636f4ecc,fatqkeeKdBSFuVVkt37+owVkmKo=] */
