package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FWStandardUDPService extends DynamicResource implements IFWStandardUDPService {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFWStandardUDPService> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFWStandardUDPService>() {
    
    @Override
    public IFWStandardUDPService create() {
      return new FWStandardUDPService();
    }
    
    @Override
    public IFWStandardUDPService create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FWStandardUDPService(resourceRepository, resource);
    }
  
  };

  public FWStandardUDPService() {
    super(IFWStandardUDPService.TYPE_ID);
  }
  
  public FWStandardUDPService(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFWStandardUDPService.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectPort() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.PortService_port);
  }
    
  public void setPort(java.lang.String port) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.PortService_port, port);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FWStandardUDPService setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.ServicesPackage.PortService_port, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d64a8a3c-a0e7-11ea-8daa-afb4679c3497,XjgMyxQHyJQSnZ7zMgtBi4i+Fko=] */
