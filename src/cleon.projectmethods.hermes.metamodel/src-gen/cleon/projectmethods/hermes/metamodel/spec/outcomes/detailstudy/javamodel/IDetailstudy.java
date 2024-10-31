package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDetailstudy extends cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument, cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAboutAware, cleon.common.glossary.metamodel.spec.javamodel.IGlossaryAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c647eff4-3c0e-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers selectDrivers();
  
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolutions selectSolution();
  
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IEvaluations selectEvaluation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c647eff4-3c0e-11e5-9962-cf3035adb922,kK1aLSmkR1MhA0soBJTaoedGRyk=] */
