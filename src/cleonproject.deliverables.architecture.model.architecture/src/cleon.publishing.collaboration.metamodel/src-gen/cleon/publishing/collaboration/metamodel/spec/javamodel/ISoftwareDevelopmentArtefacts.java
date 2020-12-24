package cleon.publishing.collaboration.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwareDevelopmentArtefacts extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ea1700ac-ff9a-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectRequirementManagement();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning selectPlanning();
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy> selectSolutionAnalysis();
  
  public cleon.publishing.collaboration.metamodel.spec.manuals.readme.javamodel.IReadme selectReadme();
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.javamodel.ITestConceptDocument selectTesting();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ea1700ac-ff9a-11e4-ac0a-959b440f987f,3Klrc/MuzWJ+kBlHEbSFIX7T2ZQ=] */
