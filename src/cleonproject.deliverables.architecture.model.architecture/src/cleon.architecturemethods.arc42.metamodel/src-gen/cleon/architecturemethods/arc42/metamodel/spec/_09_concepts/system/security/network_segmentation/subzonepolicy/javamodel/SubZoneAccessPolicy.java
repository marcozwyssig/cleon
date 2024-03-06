package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SubZoneAccessPolicy extends DynamicResource implements ISubZoneAccessPolicy {

  // abstract implementation, only used for static method calls
  private SubZoneAccessPolicy() {
    super(ISubZoneAccessPolicy.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> selectToMePolicyForDestinationSecuritySubZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.SubzonepolicyPackage.SubZoneAccessPolicy_policyForDestinationSecuritySubZone, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> selectToMeDestinationCommunication(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestination object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.SubzonepolicyPackage.SubZoneAccessPolicy_destinationCommunication, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,80913edf-b844-11e9-8760-2d4a9d15ec14,imC5nW8y++krI7iYHkCY6UMNfaQ=] */
