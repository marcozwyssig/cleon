package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirement extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d08939f9-d33b-11ef-802e-175af1a41dfa");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph> selectRequirementParagraphs();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IUserStory> selectUserStories();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d08939f9-d33b-11ef-802e-175af1a41dfa,XzbvTddYsWK/vhH66l5gyFMUlE4=] */
