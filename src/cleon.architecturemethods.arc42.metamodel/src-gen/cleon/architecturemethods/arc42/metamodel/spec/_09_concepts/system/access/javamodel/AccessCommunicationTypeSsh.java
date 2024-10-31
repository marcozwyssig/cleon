package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AccessCommunicationTypeSsh extends DynamicResource implements IAccessCommunicationTypeSsh {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessCommunicationTypeSsh> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessCommunicationTypeSsh>() {
    
    @Override
    public IAccessCommunicationTypeSsh create() {
      return new AccessCommunicationTypeSsh();
    }
    
    @Override
    public IAccessCommunicationTypeSsh create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AccessCommunicationTypeSsh(resourceRepository, resource);
    }
  
  };

  public AccessCommunicationTypeSsh() {
    super(IAccessCommunicationTypeSsh.TYPE_ID);
  }
  
  public AccessCommunicationTypeSsh(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAccessCommunicationTypeSsh.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortService> selectServicesForAccess() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessCommunicationType_servicesForAccess);
  }

  public AccessCommunicationTypeSsh setServicesForAccess(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortService> servicesForAccess) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessCommunicationType_servicesForAccess, servicesForAccess);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AccessCommunicationTypeSsh setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,084f9d76-1ea3-11eb-9eef-0dadb2b460da,zmjWQhbxi08szEJ/DLBiPHlvMqo=] */
