package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentBuildingBlockForSystem extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5918a15b-fe4b-11ea-892b-df291bae18c5");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem selectDeploymentBuildingBlockForSystem();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.buildingblock.javamodel.IDeploymentBuildingBlockForSystemConfiguration> selectDeploymentBuildingBlockForSystemConfigurations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5918a15b-fe4b-11ea-892b-df291bae18c5,ybeeOlEYS9irj+u5tX48NsEBDTg=] */
