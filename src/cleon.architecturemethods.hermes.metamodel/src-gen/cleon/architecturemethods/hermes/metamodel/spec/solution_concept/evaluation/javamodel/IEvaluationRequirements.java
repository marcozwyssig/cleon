package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEvaluationRequirements extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0af35fc0-e244-11ef-a500-cb425fc4109d");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirementList selectRequirementList();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirement> selectEvaluationRequirement();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0af35fc0-e244-11ef-a500-cb425fc4109d,Iy4xYj0aRLuWJPoD4d29C2r3aw0=] */
