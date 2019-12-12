package cleon.projectmethods.hermes.spec.detailstudy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDetailstudy extends cleon.common.doc.doc.spec.document.javamodel.INamedDocument, cleon.common.doc.doc.spec.chapter.about.javamodel.IAboutAware, cleon.common.glossary.spec.glossary.javamodel.IGlossaryAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c647eff4-3c0e-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IDrivers selectDrivers();
  
  public cleon.projectmethods.hermes.spec.detailstudy.solutions.javamodel.ISolutions selectSolution();
  
  public cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluations selectEvaluation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c647eff4-3c0e-11e5-9962-cf3035adb922,7Z9+ixfl5TZRr+DBWknAa2sK/0g=] */
