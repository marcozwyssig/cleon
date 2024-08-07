package cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DriverAware extends DynamicResource implements IDriverAware {

  // abstract implementation, only used for static method calls
  private DriverAware() {
    super(IDriverAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDriverAware> selectToMeAddresses(cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDriver object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDriverAware.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.DriversPackage.DriverAware_addresses, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,20cfa824-0abf-11e6-85a2-61e22bb4d1e3,Djet0aJJXP5TLy2NW24LT3qyBNY=] */
