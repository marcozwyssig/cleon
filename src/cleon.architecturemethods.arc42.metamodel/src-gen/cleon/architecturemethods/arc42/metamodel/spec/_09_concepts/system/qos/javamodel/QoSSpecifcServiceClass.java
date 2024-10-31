package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QoSSpecifcServiceClass extends DynamicResource implements IQoSSpecifcServiceClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoSSpecifcServiceClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoSSpecifcServiceClass>() {
    
    @Override
    public IQoSSpecifcServiceClass create() {
      return new QoSSpecifcServiceClass();
    }
    
    @Override
    public IQoSSpecifcServiceClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QoSSpecifcServiceClass(resourceRepository, resource);
    }
  
  };

  public QoSSpecifcServiceClass() {
    super(IQoSSpecifcServiceClass.TYPE_ID);
  }
  
  public QoSSpecifcServiceClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQoSSpecifcServiceClass.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService selectService() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSpecifcServiceClass_service);
  }

  public QoSSpecifcServiceClass setService(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService service) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSpecifcServiceClass_service, service);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IDSCP selectServiceClass() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IDSCP.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.ServiceClassAware_serviceClass);
  }

  public QoSSpecifcServiceClass setServiceClass(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IDSCP serviceClass) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.ServiceClassAware_serviceClass, serviceClass);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public QoSSpecifcServiceClass setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QoSSpecifcServiceClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSpecifcServiceClass_service, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IDSCP.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.ServiceClassAware_serviceClass, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSpecifcServiceClass> selectToMeService(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSpecifcServiceClass.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.QoSSpecifcServiceClass_service, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3ac9c52b-02e6-11ef-90b2-b7186629189e,jQcQeOvreHV/XHm1qqP7lzQBSMw=] */
