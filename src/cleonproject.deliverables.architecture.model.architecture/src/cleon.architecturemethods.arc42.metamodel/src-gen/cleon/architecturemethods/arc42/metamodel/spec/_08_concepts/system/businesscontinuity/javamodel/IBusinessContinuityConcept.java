package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBusinessContinuityConcept extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e2395fff-0eae-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailability selectAvailability();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackup selectBackup();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e2395fff-0eae-11e9-9f19-6d15636f4ecc,UCEAg4gX2bdujdhgTYoGaIgCkp8=] */
