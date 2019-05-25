package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemComponent extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentComposition, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IBuildingBlockRequirementCoverage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c0436bff-d0b2-11e8-b005-f7630e4c29c0");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfigurationDecomposite> selectDecomposeSystemConfiguration();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemComponentDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c0436bff-d0b2-11e8-b005-f7630e4c29c0,v0okZhbM7cXHhDSdAgwXyIeUJUU=] */
