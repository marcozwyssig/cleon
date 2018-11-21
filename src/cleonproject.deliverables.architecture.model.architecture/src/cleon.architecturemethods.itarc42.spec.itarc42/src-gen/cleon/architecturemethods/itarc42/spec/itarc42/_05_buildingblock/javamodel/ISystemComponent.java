package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemComponent extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.INamedComponentComposition, cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage.javamodel.IComponentRequirementCoverage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c0436bff-d0b2-11e8-b005-f7630e4c29c0");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._12_productView.javamodel.IProduct> selectProduct();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDecomposite> selectDecomposeSystemConfiguration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c0436bff-d0b2-11e8-b005-f7630e4c29c0,M+mwakQkgEs1i1wBkcm4WhcSUL8=] */
