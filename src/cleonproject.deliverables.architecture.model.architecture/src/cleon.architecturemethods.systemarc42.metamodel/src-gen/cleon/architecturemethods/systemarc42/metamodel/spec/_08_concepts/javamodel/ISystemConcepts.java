package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemConcepts extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IConcepts, cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology selectTopologyConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.schedule.javamodel.IScheduleConcept selectScheduleConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IBandwithAndQoSConcept selectQosConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept selectSecurityConcept();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept selectBusinessContinuityConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IIPNetworkConcept selectNetworkConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.javamodel.IResourceConcept selectResourceConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept selectDeploymentConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConcept selectAccessConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel.IDNSConcept selectDnsConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.time_synchronization.javamodel.ITimeSynchronizationConcept selectTimeSynchronizationConcept();
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> selectChapters();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortServices selectPortServiceConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05,8tzMxqsFJxniRDPu2Eannni8mpU=] */
