package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AccessCommunicationType extends DynamicResource implements IAccessCommunicationType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessCommunicationType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessCommunicationType>() {
    
    @Override
    public IAccessCommunicationType create() {
      return new AccessCommunicationType();
    }
    
    @Override
    public IAccessCommunicationType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AccessCommunicationType(resourceRepository, resource);
    }
  
  };

  public AccessCommunicationType() {
    super(IAccessCommunicationType.TYPE_ID);
  }
  
  public AccessCommunicationType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAccessCommunicationType.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> selectServicesForAccess() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessCommunicationType_servicesForAccess);
  }

  public AccessCommunicationType setServicesForAccess(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> servicesForAccess) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessCommunicationType_servicesForAccess, servicesForAccess);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AccessCommunicationType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessCommunicationType_servicesForAccess, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> selectToMeServicesForAccess(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessCommunicationType_servicesForAccess, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a028c2b5-1e98-11eb-9eef-0dadb2b460da,uhiuk2q98WLc56IT3Suj85aqYo0=] */
