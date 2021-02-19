package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractNetworkAware extends DynamicResource implements IAbstractNetworkAware {

  // abstract implementation, only used for static method calls
  private AbstractNetworkAware() {
    super(IAbstractNetworkAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkAware selectToMeNetworks(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkAware.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkAware_networks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dba046bb-7ac9-11e9-a70f-4dc03941a024,wq0VRPznNlufAYpZ4gfhrJRwuXM=] */
