package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.ou.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISetOfOU extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ed5994f6-05ac-11f0-a7b1-53303e9b84a9");
  
  // attributes
  
  public java.lang.String selectPath();
  
  public java.util.List<java.lang.String> selectCustom_units();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectSites();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectCmp_units();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectExclude_cmp_units();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ed5994f6-05ac-11f0-a7b1-53303e9b84a9,uH2iZIlVYgju+vkgvEMhZwSmbM0=] */
