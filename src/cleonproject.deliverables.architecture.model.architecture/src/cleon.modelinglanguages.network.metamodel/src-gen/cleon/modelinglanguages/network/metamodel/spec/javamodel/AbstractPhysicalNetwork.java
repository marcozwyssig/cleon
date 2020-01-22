package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractPhysicalNetwork extends DynamicResource implements IAbstractPhysicalNetwork {

  // abstract implementation, only used for static method calls
  private AbstractPhysicalNetwork() {
    super(IAbstractPhysicalNetwork.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractPhysicalNetwork selectToMeNodes(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractPhysicalNetwork.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractPhysicalNetwork_nodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,679da3a6-7ac9-11e9-a70f-4dc03941a024,yzCF5dUc6qVWVYT4UJVCx6utNBc=] */
