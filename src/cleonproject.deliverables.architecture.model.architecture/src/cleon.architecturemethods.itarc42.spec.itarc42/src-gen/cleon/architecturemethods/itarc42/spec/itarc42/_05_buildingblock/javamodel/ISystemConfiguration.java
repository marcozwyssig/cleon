package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemConfiguration extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponent, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IBuildingBlockRequirementCoverage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4e0a6f85-e0fb-11e8-8499-a3b0fb3cad90");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDependency> selectHasDependency();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_productView.javamodel.IProduct> selectProduct();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4e0a6f85-e0fb-11e8-8499-a3b0fb3cad90,dPhHTYGOEvjC/WcMBMl9kcN8GFw=] */
