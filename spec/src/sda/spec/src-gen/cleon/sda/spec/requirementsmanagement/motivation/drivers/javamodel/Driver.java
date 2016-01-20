package cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Driver extends DynamicResource implements IDriver {

  // abstract implementation, only used for static method calls
  private Driver() {
    super(IDriver.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver> selectToMeOriginatesFromPrinciple(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver.class, cleon.sda.spec.requirementsmanagement.motivation.drivers.DriversPackage.Driver_originatesFromPrinciple, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver> selectToMeOriginatesFromSource(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver.class, cleon.sda.spec.requirementsmanagement.motivation.drivers.DriversPackage.Driver_originatesFromSource, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f1c309ff-a281-11e5-9332-1b5893de4362,v2ij4Kx62RHum3IAB48ZokB8FLY=] */
