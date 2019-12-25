package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SecurityZone extends DynamicResource implements ISecurityZone {

  // abstract implementation, only used for static method calls
  private SecurityZone() {
    super(ISecurityZone.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone selectToMeSecuritySubZones(cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecuritySubZone object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.SecurityZone_securitySubZones, object.getResource());
  }
  
  public static java.util.List<cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone> selectToMeAllowed(cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.SecurityZone_allowed, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,32beba1e-0b75-11e9-a136-69d076e48ed1,tmYMUoVlRXivwp+uYLm+6lFsW/M=] */
