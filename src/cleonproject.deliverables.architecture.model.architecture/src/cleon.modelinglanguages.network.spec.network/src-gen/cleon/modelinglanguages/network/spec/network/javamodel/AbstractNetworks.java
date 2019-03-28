package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractNetworks extends DynamicResource implements IAbstractNetworks {

  // abstract implementation, only used for static method calls
  private AbstractNetworks() {
    super(IAbstractNetworks.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworks selectToMeNetworks(cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworks.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.AbstractNetworks_networks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,66edbc85-092f-11e9-8c40-11db3668c0c9,obByl44w7PAeLFxBl2Yxk8s5gck=] */
