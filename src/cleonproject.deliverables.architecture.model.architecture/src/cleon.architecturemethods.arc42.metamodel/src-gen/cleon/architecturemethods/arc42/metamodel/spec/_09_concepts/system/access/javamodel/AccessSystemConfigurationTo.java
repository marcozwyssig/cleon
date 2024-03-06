package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AccessSystemConfigurationTo extends DynamicResource implements IAccessSystemConfigurationTo {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessSystemConfigurationTo> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessSystemConfigurationTo>() {
    
    @Override
    public IAccessSystemConfigurationTo create() {
      return new AccessSystemConfigurationTo();
    }
    
    @Override
    public IAccessSystemConfigurationTo create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AccessSystemConfigurationTo(resourceRepository, resource);
    }
  
  };

  public AccessSystemConfigurationTo() {
    super(IAccessSystemConfigurationTo.TYPE_ID);
  }
  
  public AccessSystemConfigurationTo(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAccessSystemConfigurationTo.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultFalseAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultFalseAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.Boolean selectUseIP() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_useIP);
  }
    
  public void setUseIP(java.lang.Boolean useIP) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_useIP, useIP);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> selectAccessConfigurationRDP() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationRDP);
  }

  public AccessSystemConfigurationTo setAccessConfigurationRDP(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> accessConfigurationRDP) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationRDP, accessConfigurationRDP);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> selectAccessConfigurationSSH() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationSSH);
  }

  public AccessSystemConfigurationTo setAccessConfigurationSSH(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> accessConfigurationSSH) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationSSH, accessConfigurationSSH);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> selectAccessConfigurationVNC() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationVNC);
  }

  public AccessSystemConfigurationTo setAccessConfigurationVNC(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> accessConfigurationVNC) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationVNC, accessConfigurationVNC);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWeb> selectAccessConfigurationWeb() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWeb.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationWeb);
  }

  public AccessSystemConfigurationTo setAccessConfigurationWeb(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWeb> accessConfigurationWeb) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationWeb, accessConfigurationWeb);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource selectSourceForAccess() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_sourceForAccess);
  }

  public AccessSystemConfigurationTo setSourceForAccess(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource sourceForAccess) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_sourceForAccess, sourceForAccess);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AccessSystemConfigurationTo setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AccessSystemConfigurationTo setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_useIP, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationRDP, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationSSH, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationVNC, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWeb.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationWeb, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_sourceForAccess, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo> selectToMeSourceForAccess(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_sourceForAccess, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo selectToMeAccessConfigurationRDP(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationRDP, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo selectToMeAccessConfigurationVNC(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationVNC, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo selectToMeAccessConfigurationWeb(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWeb object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationWeb, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo selectToMeAccessConfigurationSSH(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationSSH, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,885b4821-19c4-11eb-8585-65084a06c07f,tNoiUSCrbBYo1/S5d2vNxlyUT5Y=] */