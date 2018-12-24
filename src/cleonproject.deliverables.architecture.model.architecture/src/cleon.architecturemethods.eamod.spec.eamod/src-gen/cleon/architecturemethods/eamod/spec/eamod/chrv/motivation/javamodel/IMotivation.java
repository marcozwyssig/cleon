package cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMotivation extends cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementDocument, cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c7277d8d-a950-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.drivers.javamodel.IDrivers selectDrivers();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoals selectGoals();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciples selectPrinciples();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholders selectStakeholders();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c7277d8d-a950-11e5-bda2-a7fc3bd7c783,1oyxGU8MALjZOLipoIKXHd5iq38=] */
