package cleon.conception.eamod.spec.chrv.motivation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMotivation extends cleon.conception.eamod.spec.chrv.javamodel.IRequirementDocument, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c7277d8d-a950-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISources selectSources();
  
  public cleon.conception.eamod.spec.chrv.motivation.drivers.javamodel.IDrivers selectDrivers();
  
  public cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoals selectGoals();
  
  public cleon.conception.eamod.spec.chrv.motivation.principles.javamodel.IPrinciples selectPrinciples();
  
  public cleon.conception.eamod.spec.chrv.motivation.stakeholder.javamodel.IStakeholders selectStakeholders();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c7277d8d-a950-11e5-bda2-a7fc3bd7c783,oTBPurCcxKBR3fuUFCstOK7yME0=] */
