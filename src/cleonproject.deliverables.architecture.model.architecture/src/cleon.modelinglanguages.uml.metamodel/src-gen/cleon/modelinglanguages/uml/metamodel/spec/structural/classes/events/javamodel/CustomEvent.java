package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CustomEvent extends DynamicResource implements ICustomEvent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICustomEvent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICustomEvent>() {
    
    @Override
    public ICustomEvent create() {
      return new CustomEvent();
    }
    
    @Override
    public ICustomEvent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CustomEvent(resourceRepository, resource);
    }
  
  };

  public CustomEvent() {
    super(ICustomEvent.TYPE_ID);
  }
  
  public CustomEvent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICustomEvent.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEventArgs> selectArgs() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEventArgs.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.EventsPackage.CustomEvent_args);
  }

  public CustomEvent setArgs(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEventArgs> args) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.EventsPackage.CustomEvent_args, args);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CustomEvent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEventArgs.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.EventsPackage.CustomEvent_args, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEvent selectToMeArgs(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEventArgs object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEvent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.EventsPackage.CustomEvent_args, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c8ba6fcd-d30b-11e4-8b90-c7d981a5f2fd,BxBBcfumI9ZlE3g2Kt2P+iwr2n8=] */
