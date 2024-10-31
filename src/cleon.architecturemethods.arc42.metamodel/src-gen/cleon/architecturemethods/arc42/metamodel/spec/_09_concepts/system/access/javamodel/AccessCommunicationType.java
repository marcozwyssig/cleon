package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AccessCommunicationType extends DynamicResource implements IAccessCommunicationType {

  // abstract implementation, only used for static method calls
  private AccessCommunicationType() {
    super(IAccessCommunicationType.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType> selectToMeServicesForAccess(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessCommunicationType_servicesForAccess, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a028c2b5-1e98-11eb-9eef-0dadb2b460da,H8QhrR0FlISOPTxA1ayauR2b7wU=] */
