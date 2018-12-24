package cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Contents
 * The top three (max five) goals for the architecture and/or constraints whose
 * fulfillment is of highest importance to the major stakeholders. Goals that
 * define the architecture’s quality could be:
 * 
 * * availability
 * * modifiability
 * * performance
 * * security
 * * testability
 * * usability
 * 
 * Motivation
 * If you as an architect do not know how the quality of your work can be judged …
 * 
 * Form
 * Simple tabular representation, ordered by priorities
 * 
 * Background Information
 * *NEVER* start developing an architecture if these goals have not been put into
 * writing and have not been signed by the major stakeholders.
 */
public interface IQualityGoals extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f73da048-11fc-11e5-848b-017a3a98ae34");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoal> selectQualityGoals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f73da048-11fc-11e5-848b-017a3a98ae34,lVXysfBel3DdV9gq79p+a3iwtzc=] */
