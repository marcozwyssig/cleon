package cleon.collaboration.sample.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISampleBuildingBlock extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecompositionBuildingBlock, ch.actifsource.core.javamodel.INamedResource, cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDependentBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a19c100c-4376-11e6-a9d7-97cf4f7c398b");
  
  // relations
  
  public java.util.List<? extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite> selectDecompose();
  
  public java.util.List<? extends cleon.collaboration.sample.arc42.javamodel.ISampleDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a19c100c-4376-11e6-a9d7-97cf4f7c398b,70Yfnz+buJYIp1DKb4vsXbMTqo0=] */
