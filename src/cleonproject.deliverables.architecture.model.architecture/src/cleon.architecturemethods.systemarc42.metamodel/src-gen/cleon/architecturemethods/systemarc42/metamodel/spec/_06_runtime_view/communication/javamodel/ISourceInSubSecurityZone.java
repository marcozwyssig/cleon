package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISourceInSubSecurityZone extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IIsTemporaryAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("df9fa746-c773-11ea-b0b6-e5df79e86bc2");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.threatmitigation.javamodel.IThreatMitigation> selectThreatMitigations();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy selectSubZoneAccessPolicy();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementationState selectState();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> selectOnlyCommunicatesWith();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain> selectUsedInDomains();
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectSourceSubSecurityZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,df9fa746-c773-11ea-b0b6-e5df79e86bc2,Q027Dn5f+ox3LLvXSfcA/tS6Amk=] */
