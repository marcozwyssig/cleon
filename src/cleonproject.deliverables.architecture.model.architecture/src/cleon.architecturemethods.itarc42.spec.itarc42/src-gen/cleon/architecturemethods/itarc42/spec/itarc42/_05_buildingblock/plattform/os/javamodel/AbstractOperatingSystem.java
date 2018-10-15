package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractOperatingSystem extends DynamicResource implements IAbstractOperatingSystem {

  // abstract implementation, only used for static method calls
  private AbstractOperatingSystem() {
    super(IAbstractOperatingSystem.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,70076639-d0ae-11e8-b005-f7630e4c29c0,HAi23oEWc2ipbnm5CrLsQ3Lcilk=] */
