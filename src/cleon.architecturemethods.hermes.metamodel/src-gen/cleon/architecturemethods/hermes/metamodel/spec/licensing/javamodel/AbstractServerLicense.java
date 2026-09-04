package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractServerLicense extends DynamicResource implements IAbstractServerLicense {

  // abstract implementation, only used for static method calls
  private AbstractServerLicense() {
    super(IAbstractServerLicense.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractServerLicense selectToMeServerHostLicensing(cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractServerHostLicensing object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractServerLicense.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractServerLicense_serverHostLicensing, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0c7d7650-dfdd-11ef-b0be-9b4cac321140,kehpR3IcIely5Q7VX0eWa5O/TYk=] */
