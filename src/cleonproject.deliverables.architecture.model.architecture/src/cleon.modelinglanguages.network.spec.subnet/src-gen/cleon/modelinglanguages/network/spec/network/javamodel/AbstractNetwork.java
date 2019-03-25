package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractNetwork extends DynamicResource implements IAbstractNetwork {

  // abstract implementation, only used for static method calls
  private AbstractNetwork() {
    super(IAbstractNetwork.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork selectToMeNetworkNodes(cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkNode object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetwork_networkNodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,74d72409-092f-11e9-8c40-11db3668c0c9,DJfiwdCuBpDGcoc1XK+1SxiR7Ms=] */
