package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemcomponent.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemComponent extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.architecturemethods.arc42.metamodel.spec._14_requirements_coverage.javamodel.IBuildingBlockRequirementCoverage, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfigurationCompositionAware, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IOverrideShortNameAware, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystemOrSystemComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c0436bff-d0b2-11e8-b005-f7630e4c29c0");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemcomponent.javamodel.ISystemComponentDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c0436bff-d0b2-11e8-b005-f7630e4c29c0,g28IR0rTNfF4tZLFadBSilHUt/Y=] */
