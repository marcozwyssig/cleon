package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Zone extends DynamicResource implements IZone {

  // abstract implementation, only used for static method calls
  private Zone() {
    super(IZone.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.network.metamodel.spec.javamodel.IZone selectToMeZones(cleon.modelinglanguages.network.metamodel.spec.javamodel.IZone object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.IZone.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.Zone_zones, object.getResource());
  }
  
  public static java.util.List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IZone> selectToMeAllowed(cleon.modelinglanguages.network.metamodel.spec.javamodel.IZone object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.javamodel.IZone.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.Zone_allowed, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fb4a0fa3-0b73-11e9-a136-69d076e48ed1,ZZTdpgo2BYg1PclGDlUs59S+h+M=] */
