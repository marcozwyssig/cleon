package cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Port_Required extends DynamicResource implements IPort_Required {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPort_Required> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPort_Required>() {
    
    @Override
    public IPort_Required create() {
      return new Port_Required();
    }
    
    @Override
    public IPort_Required create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Port_Required(resourceRepository, resource);
    }
  
  };

  public Port_Required() {
    super(IPort_Required.TYPE_ID);
  }
  
  public Port_Required(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPort_Required.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider selectPort_Provider() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.PortsPackage.Port_aE_Required_port_aE_Provider);
  }

  public Port_Required setPort_Provider(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider port_Provider) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.PortsPackage.Port_aE_Required_port_aE_Provider, port_Provider);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Port_Required setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Port_Required setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.PortsPackage.Port_aE_Required_port_aE_Provider, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required> selectToMePort_Provider(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.PortsPackage.Port_aE_Required_port_aE_Provider, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b52c5641-0513-11e9-87b8-094c52ae4c98,Hcs+vGTbQpHvDwi8GOoWOG8+pt0=] */
