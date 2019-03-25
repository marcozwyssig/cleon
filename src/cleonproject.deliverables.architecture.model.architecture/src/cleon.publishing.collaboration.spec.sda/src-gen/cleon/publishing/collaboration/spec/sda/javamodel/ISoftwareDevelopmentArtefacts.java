package cleon.publishing.collaboration.spec.sda.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwareDevelopmentArtefacts extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ea1700ac-ff9a-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument selectRequirementManagement();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectPlanning();
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.javamodel.IDetailstudy> selectSolutionAnalysis();
  
  public cleon.publishing.collaboration.spec.sda.manuals.readme.javamodel.IReadme selectReadme();
  
  public cleon.architecturemethods.eamod.spec.test._01_concept.javamodel.ITestConceptDocument selectTesting();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ea1700ac-ff9a-11e4-ac0a-959b440f987f,fN8RBzFAUXgeUCI6zCJcD3opt6g=] */
