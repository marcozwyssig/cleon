package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementList extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirementShortNameAware, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapterPath {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db7b0419-d33e-11ef-802e-175af1a41dfa");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirement> selectRequirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db7b0419-d33e-11ef-802e-175af1a41dfa,2Kgk15ltpx3OPU7rnqNj2LcBKOk=] */
