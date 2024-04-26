package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractNetworkNode extends DynamicResource implements IAbstractNetworkNode {

  // abstract implementation, only used for static method calls
  private AbstractNetworkNode() {
    super(IAbstractNetworkNode.TYPE_ID);
  }
  
  public static java.util.List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> selectToMeIp(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_ip, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d8caf2bc-0930-11e9-8c40-11db3668c0c9,Cf2WXMjL2VBSUprocKvOMt+WM74=] */
