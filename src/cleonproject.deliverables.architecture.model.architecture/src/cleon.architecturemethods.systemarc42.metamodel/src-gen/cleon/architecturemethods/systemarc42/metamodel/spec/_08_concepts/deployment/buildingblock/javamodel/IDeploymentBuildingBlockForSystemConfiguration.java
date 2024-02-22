package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentBuildingBlockForSystemConfiguration extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeployOnConfiguration, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0223c676-fe4c-11ea-892b-df291bae18c5");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration selectDeploymentBuildingBlockForSystemConfiguration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0223c676-fe4c-11ea-892b-df291bae18c5,EkL7Vg7ZbfSklYRlqr7O1BYt6n0=] */
