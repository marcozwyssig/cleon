package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class IPv4_Mask_Aware extends DynamicResource implements IIPv4_Mask_Aware {

  // abstract implementation, only used for static method calls
  private IPv4_Mask_Aware() {
    super(IIPv4_Mask_Aware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask_Aware selectToMeCidr(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask_Aware.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidr, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8d46e8a9-0932-11e9-8c40-11db3668c0c9,bgt9GIxIQ25Pnwu48bfkC/N8/EI=] */
