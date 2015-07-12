package cleon.uml.spec.structural.classes.events.javamodel;

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
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.events.javamodel.ICustomEventArgs> selectArgs() {
    return _getList(cleon.uml.spec.structural.classes.events.javamodel.ICustomEventArgs.class, cleon.uml.spec.structural.classes.events.EventsPackage.CustomEvent_args);
  }

  public CustomEvent setArgs(java.util.List<? extends cleon.uml.spec.structural.classes.events.javamodel.ICustomEventArgs> args) {
    _setList(cleon.uml.spec.structural.classes.events.EventsPackage.CustomEvent_args, args);
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.uml.spec.structural.classes.events.javamodel.ICustomEventArgs.class, cleon.uml.spec.structural.classes.events.EventsPackage.CustomEvent_args, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent selectToMeArgs(cleon.uml.spec.structural.classes.events.javamodel.ICustomEventArgs object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent.class, cleon.uml.spec.structural.classes.events.EventsPackage.CustomEvent_args, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c8ba6fcd-d30b-11e4-8b90-c7d981a5f2fd,2PmPmDkbGoS10rTitEFi3PsEmVY=] */
