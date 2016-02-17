package cleon.actifsource.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActifsourceProjects extends ch.actifsource.core.javamodel.INamedResource, cleon.arc42.spec._05_buildingblockview.javamodel.IDecompositionBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("28f43850-e9ba-11e4-848b-0509e3792151");
  
  // relations
  
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IProjectUseDecomposite> selectDecompose();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,28f43850-e9ba-11e4-848b-0509e3792151,WI6oKoWgB3jByUIRP4ujF6gSir8=] */
