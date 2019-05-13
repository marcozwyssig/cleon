package cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBusinessContinuityConcept extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e2395fff-0eae-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.availability.javamodel.IAvailability selectAvailability();
  
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.backup.javamodel.IBackup selectBackup();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e2395fff-0eae-11e9-9f19-6d15636f4ecc,J95JbhYC5Hssld9cPLuG3nN1doU=] */