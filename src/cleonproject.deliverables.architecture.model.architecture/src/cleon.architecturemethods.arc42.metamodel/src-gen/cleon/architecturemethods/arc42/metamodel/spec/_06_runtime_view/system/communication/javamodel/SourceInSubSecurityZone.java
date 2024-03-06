package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SourceInSubSecurityZone extends DynamicResource implements ISourceInSubSecurityZone {

  // abstract implementation, only used for static method calls
  private SourceInSubSecurityZone() {
    super(ISourceInSubSecurityZone.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone> selectToMeThreatMitigations(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.threatmitigation.javamodel.IThreatMitigation object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.SourceInSubSecurityZone_threatMitigations, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone> selectToMeSubZoneAccessPolicy(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.SourceInSubSecurityZone_subZoneAccessPolicy, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone selectToMeState(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state.javamodel.IImplementationState object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.SourceInSubSecurityZone_state, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone> selectToMeOnlyCommunicatesWith(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.SourceInSubSecurityZone_onlyCommunicatesWith, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone> selectToMeUsedInDomains(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.SourceInSubSecurityZone_usedInDomains, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone> selectToMeSourceSubSecurityZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.SourceInSubSecurityZone_sourceSubSecurityZone, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone> selectToMeDestinationSubSecurityZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage.SourceInSubSecurityZone_destinationSubSecurityZone, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,df9fa746-c773-11ea-b0b6-e5df79e86bc2,I3cPxp0J/y7N+1sNT6cEOnj1kl8=] */
