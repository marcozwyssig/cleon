package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILaunchingSystemConfiguration extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IProcessSystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("68435c3e-1a63-11e9-b1cd-355f2e2f05a9");
  
  // relations
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IPreqrequisites selectPreqrequisites();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunching selectLaunching();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingQualityAssurance selectQualityAssurance();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IRequirementsSystemAcceptance selectRequirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,68435c3e-1a63-11e9-b1cd-355f2e2f05a9,wIrbfCyE+WKWz+KuP9NlO/E5wJc=] */
