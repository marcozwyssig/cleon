package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBusinessContinuityConcept extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8d62608b-c93b-11eb-adc4-d18d1353eb6e");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.availability.javamodel.IAvailabilityConcept selectAvailability();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.IBackupConcept selectBackup();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.autonomy.javamodel.IAutonomyConcept selectAutonomy();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8d62608b-c93b-11eb-adc4-d18d1353eb6e,nwguRxoD8xByIftbf2uB3+Z1GtA=] */
