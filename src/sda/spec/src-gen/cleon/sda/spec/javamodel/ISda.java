package cleon.sda.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISda extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ea1700ac-ff9a-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirements selectRequirements();
  
  public cleon.sda.spec.projectmanagement.javamodel.IProject selectProject();
  
  public java.util.List<? extends cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis> selectSolutionAnalysis();
  
  public cleon.sda.spec.manuals.readme.javamodel.IReadme selectReadme();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ea1700ac-ff9a-11e4-ac0a-959b440f987f,jfyzsvfuCR9C98RbFZF/gDYfQ9g=] */
