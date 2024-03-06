package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentMethodForSystem extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8f18725c-fe3f-11ea-892b-df291bae18c5");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem selectDeploymentForSystem();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForSystemConfiguration> selectDeploymentForSystemConfigurations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8f18725c-fe3f-11ea-892b-df291bae18c5,2wLHnymgbUcz/VQX1HhEhQ9xQgE=] */
