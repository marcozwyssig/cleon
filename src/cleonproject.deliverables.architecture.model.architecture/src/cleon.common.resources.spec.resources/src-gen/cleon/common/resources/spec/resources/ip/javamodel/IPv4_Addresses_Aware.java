package cleon.common.resources.spec.resources.ip.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class IPv4_Addresses_Aware extends DynamicResource implements IIPv4_Addresses_Aware {

  // abstract implementation, only used for static method calls
  private IPv4_Addresses_Aware() {
    super(IIPv4_Addresses_Aware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Addresses_Aware selectToMeIPv4s(cleon.common.resources.spec.resources.ip.javamodel.IIPv4 object) {
    return _getToMeSingle(object.getRepository(), cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Addresses_Aware.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fbcaa90e-09a4-11e9-8c40-11db3668c0c9,t/n8LYBJ6gp7sY8XzuTawzIXWw4=] */
