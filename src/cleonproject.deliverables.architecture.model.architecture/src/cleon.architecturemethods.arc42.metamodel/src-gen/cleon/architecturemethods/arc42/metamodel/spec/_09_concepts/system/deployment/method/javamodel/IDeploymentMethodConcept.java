package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentMethodConcept extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("64eef162-fe49-11ea-892b-df291bae18c5");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethod> selectDeploymentMethods();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForSystem> selectDeploymentForSystems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,64eef162-fe49-11ea-892b-df291bae18c5,/wqCJJv4eka0CkNbkwEn3FRdCBE=] */
