package cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * In der Einführung werden die treibenden Kräfte aufgeführt, die die Architekten
 * bei ihren Entscheidungen berücksichtigen müssen. Dies beinhaltet zum einen die
 * Erfüllung der funktionalen Anforderungen der Stakeholder, zum anderen die
 * Erfüllung oder Einhaltung der erforderlichen Einschränkungen, immer unter
 * Berücksichtigung der Architekturziele. 
 * 
 */
public interface IIntroductionAndGoals extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b1708484-11fc-11e5-848b-017a3a98ae34");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals.javamodel.IRequirements selectRequirementsOverview();
  
  public cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals.javamodel.IQualityGoals selectQualityGoals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b1708484-11fc-11e5-848b-017a3a98ae34,clghdwuqTdI6mUjHCosKQOLSn2Q=] */
