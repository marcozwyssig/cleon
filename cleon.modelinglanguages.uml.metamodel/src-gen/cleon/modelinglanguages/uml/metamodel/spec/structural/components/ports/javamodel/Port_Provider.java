package cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Port_Provider extends DynamicResource implements IPort_Provider {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPort_Provider> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPort_Provider>() {
    
    @Override
    public IPort_Provider create() {
      return new Port_Provider();
    }
    
    @Override
    public IPort_Provider create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Port_Provider(resourceRepository, resource);
    }
  
  };

  public Port_Provider() {
    super(IPort_Provider.TYPE_ID);
  }
  
  public Port_Provider(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPort_Provider.TYPE_ID);
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
  public java.lang.String selectFormat() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.PortsPackage.Port_aE_Provider_format);
  }
    
  public void setFormat(java.lang.String format) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.PortsPackage.Port_aE_Provider_format, format);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectProtocol() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.PortsPackage.Port_aE_Provider_protocol);
  }
    
  public void setProtocol(java.lang.String protocol) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.PortsPackage.Port_aE_Provider_protocol, protocol);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IInterface selectInterface() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IInterface.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.PortsPackage.Port_aE_Provider_interface);
  }

  public Port_Provider setInterface(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IInterface interface_) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.PortsPackage.Port_aE_Provider_interface, interface_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Port_Provider setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.PortsPackage.Port_aE_Provider_format, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.PortsPackage.Port_aE_Provider_protocol, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IInterface.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.PortsPackage.Port_aE_Provider_interface, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> selectToMeInterface(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IInterface object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.PortsPackage.Port_aE_Provider_interface, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a03165a1-0513-11e9-87b8-094c52ae4c98,SN/Pu6qSIoJbMxhk/CgECJC7Qno=] */
