package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourceInSubSecurityZoneByHost extends DynamicResource implements ISourceInSubSecurityZoneByHost {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceInSubSecurityZoneByHost> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceInSubSecurityZoneByHost>() {
    
    @Override
    public ISourceInSubSecurityZoneByHost create() {
      return new SourceInSubSecurityZoneByHost();
    }
    
    @Override
    public ISourceInSubSecurityZoneByHost create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourceInSubSecurityZoneByHost(resourceRepository, resource);
    }
  
  };

  public SourceInSubSecurityZoneByHost() {
    super(ISourceInSubSecurityZoneByHost.TYPE_ID);
  }
  
  public SourceInSubSecurityZoneByHost(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourceInSubSecurityZoneByHost.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsTemporary() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.IsTemporaryAware_isTemporary);
  }
    
  public void setIsTemporary(java.lang.Boolean isTemporary) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.IsTemporaryAware_isTemporary, isTemporary);
  }

  @Override
  public java.lang.String selectRestricteHostGroupForSiteToDestination() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZoneByHost_restricteHostGroupForSiteToDestination);
  }
    
  public void setRestricteHostGroupForSiteToDestination(java.lang.String restricteHostGroupForSiteToDestination) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZoneByHost_restricteHostGroupForSiteToDestination, restricteHostGroupForSiteToDestination);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> selectOnlyCommunicatesWith() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_onlyCommunicatesWith);
  }

  public SourceInSubSecurityZoneByHost setOnlyCommunicatesWith(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> onlyCommunicatesWith) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_onlyCommunicatesWith, onlyCommunicatesWith);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementationState selectState() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementationState.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_state);
  }

  public SourceInSubSecurityZoneByHost setState(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementationState state) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_state, state);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy selectSubZoneAccessPolicy() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_subZoneAccessPolicy);
  }

  public SourceInSubSecurityZoneByHost setSubZoneAccessPolicy(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_subZoneAccessPolicy, subZoneAccessPolicy);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SourceInSubSecurityZoneByHost setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.threatmitigation.javamodel.IThreatMitigation> selectThreatMitigations() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.threatmitigation.javamodel.IThreatMitigation.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_threatMitigations);
  }

  public SourceInSubSecurityZoneByHost setThreatMitigations(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.threatmitigation.javamodel.IThreatMitigation> threatMitigations) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_threatMitigations, threatMitigations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourceInSubSecurityZoneByHost setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain> selectUsedInDomains() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_usedInDomains);
  }

  public SourceInSubSecurityZoneByHost setUsedInDomains(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain> usedInDomains) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_usedInDomains, usedInDomains);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.IsTemporaryAware_isTemporary, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZoneByHost_restricteHostGroupForSiteToDestination, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_onlyCommunicatesWith, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementationState.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_state, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_subZoneAccessPolicy, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.threatmitigation.javamodel.IThreatMitigation.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_threatMitigations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_usedInDomains, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,70b3c6f7-b218-11e9-b89e-1728aee30149,yetPEFPVrnOIaFCpQLWRctoN1L0=] */
