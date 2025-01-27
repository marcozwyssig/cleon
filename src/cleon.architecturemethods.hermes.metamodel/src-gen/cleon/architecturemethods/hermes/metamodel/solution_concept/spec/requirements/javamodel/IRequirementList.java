package cleon.architecturemethods.hermes.metamodel.solution_concept.spec.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementList extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.architecturemethods.hermes.metamodel.solution_concept.spec.requirements.javamodel.IRequirementShortNameAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db7b0419-d33e-11ef-802e-175af1a41dfa");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.solution_concept.spec.requirements.javamodel.IRequirement> selectRequirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db7b0419-d33e-11ef-802e-175af1a41dfa,upBsP2MCP/Pp0T728CT/ButjNb0=] */
