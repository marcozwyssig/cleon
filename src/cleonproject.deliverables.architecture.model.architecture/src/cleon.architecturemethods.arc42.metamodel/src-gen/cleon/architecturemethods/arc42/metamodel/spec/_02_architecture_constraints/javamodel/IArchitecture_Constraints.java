package cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Contents
 * Any requirement that constrains software architects in their freedom of design
 * decisions or the development process.
 * 
 * Motivation
 * Architects should know exactly where they are free in their design decisions and
 * where they must adhere to constraints.
 * Constraints must always be dealt with; they may be negotiable, though.
 * 
 * Background information
 * In the optimal case constraints are defined by requirements. In any case, at
 * least the architects must be aware of constraints.
 */
public interface IArchitecture_Constraints extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b06163b8-ffc9-11e5-bd7b-8b0acf27d441");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.ITechnicalConstraints selectTechnicalConstraints();
  
  public cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IOrganizationalConstraints selectOrganizationalConstraints();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b06163b8-ffc9-11e5-bd7b-8b0acf27d441,SqbguNRjNKHnRpTskw6yJ4Kf1+o=] */
