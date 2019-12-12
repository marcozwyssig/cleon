package cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Short description of the functional requirements.
 * Digest (or abstract) of the requirements documents.
 * Reference to complete requirements documents (incl. version identification and
 * location).
 * 
 * Contents
 * A compact summary of the functional environment of the system. Answers the
 * following questions (at least approximately):
 * 
 * * What happens in the system’s environment?
 * * Why should the system exist? 
 * * Why is the system valuable or important? 
 * * Which problems does the system solve?
 * 
 * Motivation
 * From the point of view of the end users a system is created or modified to
 * improve execution of a business activity.
 * This essential architecture driver must not be neglected even though the quality
 * of an architecture is mostly judged by its level of fulfillment of
 * non-functional requirements.
 * 
 * Form
 * Short textual description, probably in tabular use-case format.
 * The business context should in any case refer to the corresponding requirements
 * documents.
 * 
 * Examples
 * Short descriptions of the most important:
 * 
 * * business processes
 * * functional requirements
 * * non-functional requirements and other constraints (the most important ones
 * must be covered as architecture goals or are listed in the “Constraints”
 * section), and/or
 * * quantity structures
 * * background information
 * 
 * Here you can reuse parts of the requirements documents – but keep these
 * excerpts short and balance readability against avoidance of redundancy.
 */
public interface IRequirements extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d9906e1c-11fc-11e5-848b-017a3a98ae34");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsDocument selectRequirementsManagement();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea> selectSubjectAreas();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d9906e1c-11fc-11e5-848b-017a3a98ae34,yaifdboTPfWT1IV89tIbrarPsLM=] */
