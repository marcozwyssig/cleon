package cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractComponent extends cleon.common.modularity.spec.buildingblock.javamodel.IDecompositionBuildingBlock, cleon.common.modularity.spec.buildingblock.javamodel.IDependentBuildingBlock, cleon.common.modularity.spec.buildingblock.javamodel.IInteractiveBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1090955f-85c1-11e3-be33-79789cf5eae3");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required> selectPorts_In();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1090955f-85c1-11e3-be33-79789cf5eae3,DGHorJgTjvv8OruapDCo1Ou3zEI=] */
