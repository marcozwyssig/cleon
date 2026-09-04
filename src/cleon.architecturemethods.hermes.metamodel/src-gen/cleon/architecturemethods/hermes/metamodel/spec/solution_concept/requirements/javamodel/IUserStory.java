package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IUserStory extends cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName, cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("88ee0704-3caf-11f1-9432-65d6b2716831");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IAcceptanceCriteria> selectAcceptanceCriterias();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,88ee0704-3caf-11f1-9432-65d6b2716831,dDOxdLuKdpCWHrG4ciLafL2bUDo=] */
