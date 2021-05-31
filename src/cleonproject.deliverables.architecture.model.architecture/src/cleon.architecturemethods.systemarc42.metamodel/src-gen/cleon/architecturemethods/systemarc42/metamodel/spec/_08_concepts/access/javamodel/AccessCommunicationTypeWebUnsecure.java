package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AccessCommunicationTypeWebUnsecure extends DynamicResource implements IAccessCommunicationTypeWebUnsecure {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessCommunicationTypeWebUnsecure> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessCommunicationTypeWebUnsecure>() {
    
    @Override
    public IAccessCommunicationTypeWebUnsecure create() {
      return new AccessCommunicationTypeWebUnsecure();
    }
    
    @Override
    public IAccessCommunicationTypeWebUnsecure create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AccessCommunicationTypeWebUnsecure(resourceRepository, resource);
    }
  
  };

  public AccessCommunicationTypeWebUnsecure() {
    super(IAccessCommunicationTypeWebUnsecure.TYPE_ID);
  }
  
  public AccessCommunicationTypeWebUnsecure(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAccessCommunicationTypeWebUnsecure.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> selectServicesForAccess() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessCommunicationType_servicesForAccess);
  }

  public AccessCommunicationTypeWebUnsecure setServicesForAccess(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> servicesForAccess) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessCommunicationType_servicesForAccess, servicesForAccess);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AccessCommunicationTypeWebUnsecure setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessCommunicationType_servicesForAccess, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9668a0a7-c1e6-11eb-8c09-03c14294ecfb,DJclsTEVnPZc9fRvJh7dgl1gQT4=] */
