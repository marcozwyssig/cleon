package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourceInSubSecurityZoneByNetwork extends DynamicResource implements ISourceInSubSecurityZoneByNetwork {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceInSubSecurityZoneByNetwork> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceInSubSecurityZoneByNetwork>() {
    
    @Override
    public ISourceInSubSecurityZoneByNetwork create() {
      return new SourceInSubSecurityZoneByNetwork();
    }
    
    @Override
    public ISourceInSubSecurityZoneByNetwork create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourceInSubSecurityZoneByNetwork(resourceRepository, resource);
    }
  
  };

  public SourceInSubSecurityZoneByNetwork() {
    super(ISourceInSubSecurityZoneByNetwork.TYPE_ID);
  }
  
  public SourceInSubSecurityZoneByNetwork(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourceInSubSecurityZoneByNetwork.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> selectOnlyCommunicatesWith() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_onlyCommunicatesWith);
  }

  public SourceInSubSecurityZoneByNetwork setOnlyCommunicatesWith(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> onlyCommunicatesWith) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_onlyCommunicatesWith, onlyCommunicatesWith);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IImplementationState selectState() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IImplementationState.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_state);
  }

  public SourceInSubSecurityZoneByNetwork setState(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IImplementationState state) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_state, state);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy selectSubZoneAccessPolicy() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_subZoneAccessPolicy);
  }

  public SourceInSubSecurityZoneByNetwork setSubZoneAccessPolicy(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_subZoneAccessPolicy, subZoneAccessPolicy);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SourceInSubSecurityZoneByNetwork setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.threatmitigation.javamodel.IThreatMitigation> selectThreatMitigations() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.threatmitigation.javamodel.IThreatMitigation.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_threatMitigations);
  }

  public SourceInSubSecurityZoneByNetwork setThreatMitigations(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.threatmitigation.javamodel.IThreatMitigation> threatMitigations) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_threatMitigations, threatMitigations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourceInSubSecurityZoneByNetwork setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_onlyCommunicatesWith, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IImplementationState.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_state, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_subZoneAccessPolicy, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.threatmitigation.javamodel.IThreatMitigation.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.SourceInSubSecurityZone_threatMitigations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3b9e263c-c776-11ea-b0b6-e5df79e86bc2,j0gQixqlnatKmZWFNWdWSZAIgD0=] */
