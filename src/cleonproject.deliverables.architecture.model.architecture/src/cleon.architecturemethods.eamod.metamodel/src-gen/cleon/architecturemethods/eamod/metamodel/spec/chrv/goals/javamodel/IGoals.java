package cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Mit den Zielen werden die geforderten Fähigkeiten festgelegt, um eine spätere
 * allfällige Zielerreichung beurteilen zu können.
 * Ziele sind in der Regel Unternehmensziele. Jedes Ziel kann einer Quelle
 * zugeordnet werden. Jedes Ziel adressiert im Minimum einen Treiber.
 */
public interface IGoals extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("18cfe197-a951-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoal> selectGoals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,18cfe197-a951-11e5-bda2-a7fc3bd7c783,WlBI/YIFqBNT5Fc60is19VztQ5A=] */
