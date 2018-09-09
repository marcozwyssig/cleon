package cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IModuleControlling extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2ad5f88a-bdfd-11e6-a3f0-c7681ee45a3f");
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome selectModule();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModuleRisks selectRisks();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModuleImpediments selectImpediments();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp selectQuality();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp selectDeadline();
  
  public cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp selectRisk();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2ad5f88a-bdfd-11e6-a3f0-c7681ee45a3f,4uOhg2WBnAjxBn/kzZd9rxvojww=] */
