package cleon.sda.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BusinessObjectId extends DynamicResource implements IBusinessObjectId {

  // abstract implementation, only used for static method calls
  private BusinessObjectId() {
    super(IBusinessObjectId.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,133424cf-be0b-11e5-ad6f-979cbb78853e,Ecbf1343+lnL3AYJoOnWbMNnS5s=] */
