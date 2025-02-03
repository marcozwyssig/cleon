package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEvaluationRequirement extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7b37266c-e244-11ef-a500-cb425fc4109d");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirement selectRequirement();
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectFullfilled();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7b37266c-e244-11ef-a500-cb425fc4109d,maKSuFE+7LbJPWTw85ObWEkQ9ac=] */
