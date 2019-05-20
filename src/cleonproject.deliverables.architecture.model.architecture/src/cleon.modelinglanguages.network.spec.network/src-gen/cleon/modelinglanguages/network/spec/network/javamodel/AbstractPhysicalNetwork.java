package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractPhysicalNetwork extends DynamicResource implements IAbstractPhysicalNetwork {

  // abstract implementation, only used for static method calls
  private AbstractPhysicalNetwork() {
    super(IAbstractPhysicalNetwork.TYPE_ID);
  }
  
  public static cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork selectToMeNode(cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkNode object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractPhysicalNetwork_node, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,679da3a6-7ac9-11e9-a70f-4dc03941a024,b5mxolPQDeqqnDSfJ2IlK+uNcIw=] */
