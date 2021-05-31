package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

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

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> selectAccessConfigurationRDP() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationRDP);
  }

  public AccessSystemConfigurationTo setAccessConfigurationRDP(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> accessConfigurationRDP) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationRDP, accessConfigurationRDP);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> selectAccessConfigurationSSH() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationSSH);
  }

  public AccessSystemConfigurationTo setAccessConfigurationSSH(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> accessConfigurationSSH) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationSSH, accessConfigurationSSH);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> selectAccessConfigurationVNC() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationVNC);
  }

  public AccessSystemConfigurationTo setAccessConfigurationVNC(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> accessConfigurationVNC) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationVNC, accessConfigurationVNC);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationWeb> selectAccessConfigurationWeb() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationWeb.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationWeb);
  }

  public AccessSystemConfigurationTo setAccessConfigurationWeb(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationWeb> accessConfigurationWeb) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationWeb, accessConfigurationWeb);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource selectSource() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_source);
  }

  public AccessSystemConfigurationTo setSource(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_source, source);
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
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationRDP, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationSSH, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationVNC, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationWeb.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationWeb, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_source, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo> selectToMeSource(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_source, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo selectToMeAccessConfigurationRDP(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationRDP, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo selectToMeAccessConfigurationVNC(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationVNC, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo selectToMeAccessConfigurationWeb(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationWeb object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationWeb, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo selectToMeAccessConfigurationSSH(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessSystemConfigurationTo_accessConfigurationSSH, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,885b4821-19c4-11eb-8585-65084a06c07f,hbZyx4H5WKB8413AhJCUS8KRB5k=] */
