package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INamedNetwork extends ch.actifsource.core.javamodel.INamedResource, cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b7c5323f-054f-11e9-b814-a133e521728c");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.INamedNetworkNode> selectNetworkNodes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b7c5323f-054f-11e9-b814-a133e521728c,65mQCePIRDagEMIB5W9vyx4ohX0=] */