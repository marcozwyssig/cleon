package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AccessCommunicationTypeWebSecure extends DynamicResource implements IAccessCommunicationTypeWebSecure {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessCommunicationTypeWebSecure> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessCommunicationTypeWebSecure>() {
    
    @Override
    public IAccessCommunicationTypeWebSecure create() {
      return new AccessCommunicationTypeWebSecure();
    }
    
    @Override
    public IAccessCommunicationTypeWebSecure create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AccessCommunicationTypeWebSecure(resourceRepository, resource);
    }
  
  };

  public AccessCommunicationTypeWebSecure() {
    super(IAccessCommunicationTypeWebSecure.TYPE_ID);
  }
  
  public AccessCommunicationTypeWebSecure(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAccessCommunicationTypeWebSecure.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> selectServicesForAccess() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessCommunicationType_servicesForAccess);
  }

  public AccessCommunicationTypeWebSecure setServicesForAccess(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> servicesForAccess) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessCommunicationType_servicesForAccess, servicesForAccess);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AccessCommunicationTypeWebSecure setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,837a9606-c1e6-11eb-8c09-03c14294ecfb,EV3hfCnEsVNXgypkGyzHqOlNOcw=] */
