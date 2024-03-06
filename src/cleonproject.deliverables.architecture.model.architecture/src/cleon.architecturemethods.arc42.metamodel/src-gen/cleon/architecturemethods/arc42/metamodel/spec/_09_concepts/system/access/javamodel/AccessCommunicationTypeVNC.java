package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AccessCommunicationTypeVNC extends DynamicResource implements IAccessCommunicationTypeVNC {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessCommunicationTypeVNC> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessCommunicationTypeVNC>() {
    
    @Override
    public IAccessCommunicationTypeVNC create() {
      return new AccessCommunicationTypeVNC();
    }
    
    @Override
    public IAccessCommunicationTypeVNC create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AccessCommunicationTypeVNC(resourceRepository, resource);
    }
  
  };

  public AccessCommunicationTypeVNC() {
    super(IAccessCommunicationTypeVNC.TYPE_ID);
  }
  
  public AccessCommunicationTypeVNC(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAccessCommunicationTypeVNC.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortService> selectServicesForAccess() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessCommunicationType_servicesForAccess);
  }

  public AccessCommunicationTypeVNC setServicesForAccess(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortService> servicesForAccess) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessCommunicationType_servicesForAccess, servicesForAccess);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AccessCommunicationTypeVNC setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessCommunicationType_servicesForAccess, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3077ebb4-1ea3-11eb-9eef-0dadb2b460da,uJWZEo2usW9X6vNQfjfiqmX3bXM=] */
