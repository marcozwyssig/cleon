package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Source extends DynamicResource implements ISource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISource>() {
    
    @Override
    public ISource create() {
      return new Source();
    }
    
    @Override
    public ISource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Source(resourceRepository, resource);
    }
  
  };

  public Source() {
    super(ISource.TYPE_ID);
  }
  
  public Source(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISource.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone> selectAccessAllowed() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_accessAllowed);
  }

  public Source setAccessAllowed(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone> accessAllowed) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_accessAllowed, accessAllowed);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IAction selectAction() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IAction.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_action);
  }

  public Source setAction(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IAction action) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_action, action);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> selectCommunicatesWith() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_communicatesWith);
  }

  public Source setCommunicatesWith(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> communicatesWith) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_communicatesWith, communicatesWith);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectSourceSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_sourceSystemConfiguration);
  }

  public Source setSourceSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration sourceSystemConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_sourceSystemConfiguration, sourceSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Source setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ITrack selectTrack() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ITrack.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_track);
  }

  public Source setTrack(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ITrack track) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_track, track);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Source setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.IsTemporaryAware_isTemporary, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_accessAllowed, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IAction.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_action, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_communicatesWith, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_sourceSystemConfiguration, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ITrack.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_track, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> selectToMeSourceSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_sourceSystemConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> selectToMeCommunicatesWith(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_communicatesWith, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource selectToMeAccessAllowed(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_accessAllowed, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> selectToMeTrack(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ITrack object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_track, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> selectToMeAction(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IAction object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage.Source_action, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bf998613-877a-11e9-a61b-279ebde48b48,2Fo/b6jMbbJw65hs+zJNZcVAtzQ=] */
