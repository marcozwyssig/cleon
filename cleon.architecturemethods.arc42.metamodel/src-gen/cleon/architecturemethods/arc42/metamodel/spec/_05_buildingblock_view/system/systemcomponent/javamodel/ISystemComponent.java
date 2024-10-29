package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemComponent extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.architecturemethods.arc42.metamodel.spec._14_requirements_coverage.javamodel.IBuildingBlockRequirementCoverage, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationCompositionAware, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IGenericShortNameAware, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystemOrSystemComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c0436bff-d0b2-11e8-b005-f7630e4c29c0");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponentDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c0436bff-d0b2-11e8-b005-f7630e4c29c0,OPRtYvcoOC+1Jh0w70DyWCxCSsU=] */
