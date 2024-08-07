package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRiskAnalysis extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6bb1d559-2f04-11e6-8bd9-a77b8d2a3a0e");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel.IProbabilityOfOccurrence selectProbability();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel.IImpactRate selectImpactRate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6bb1d559-2f04-11e6-8bd9-a77b8d2a3a0e,u110CD6/PCGDebFGV5oJnJtXSE0=] */
