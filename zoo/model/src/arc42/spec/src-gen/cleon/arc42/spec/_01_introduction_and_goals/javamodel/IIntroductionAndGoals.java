package cleon.arc42.spec._01_introduction_and_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * The introduction to the architecture documentation should list the driving
 * forces that software architects must consider in their decisions.
 * This includes on the one hand the fulfillment of functional requirements of the
 * stakeholders, on the other hand the fulfillment of or compliance with required
 * constraints, always in consideration of the architecture goals.
 * 
 * 
 */
public interface IIntroductionAndGoals extends ch.actifsource.core.javamodel.IResource, cleon.doc.spec.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b1708484-11fc-11e5-848b-017a3a98ae34");
  
  // relations
  
  public cleon.arc42.spec._01_introduction_and_goals.javamodel.IRequirements selectRequirements();
  
  public java.util.List<? extends cleon.arc42.spec._01_introduction_and_goals.javamodel.IQualityGoals> selectQualityGoals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b1708484-11fc-11e5-848b-017a3a98ae34,2l0o4vPu3aOaSzkr1pdDMHtTMB4=] */
