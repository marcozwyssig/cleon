package cleon.sda.spec.requirementsmanagement.motivation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMotivation extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.doc.spec.chapter.javamodel.INoChapters, cleon.sda.spec.requirementsmanagement.javamodel.IRequirementDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c7277d8d-a950-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciples selectPrinciples();
  
  public cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISources selectSources();
  
  public cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDrivers selectDrivers();
  
  public cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoals selectGoals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c7277d8d-a950-11e5-bda2-a7fc3bd7c783,lcZNqxXQzVaH4YrYXa1J4F2FI2c=] */
