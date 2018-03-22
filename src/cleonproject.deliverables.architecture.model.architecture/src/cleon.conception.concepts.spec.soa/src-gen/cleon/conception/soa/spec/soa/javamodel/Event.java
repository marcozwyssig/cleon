package cleon.conception.soa.spec.soa.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Event extends DynamicResource implements IEvent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvent>() {
    
    @Override
    public IEvent create() {
      return new Event();
    }
    
    @Override
    public IEvent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Event(resourceRepository, resource);
    }
  
  };

  public Event() {
    super(IEvent.TYPE_ID);
  }
  
  public Event(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEvent.TYPE_ID);
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
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier> selectEventType() {
    return _getList(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.soa.spec.soa.SoaPackage.Event_eventType);
  }

  public Event setEventType(java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier> eventType) {
    _setList(cleon.conception.soa.spec.soa.SoaPackage.Event_eventType, eventType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Event setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.soa.spec.soa.SoaPackage.Event_eventType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.soa.spec.soa.javamodel.IEvent> selectToMeEventType(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.conception.soa.spec.soa.javamodel.IEvent.class, cleon.conception.soa.spec.soa.SoaPackage.Event_eventType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3789a935-a3ba-11e3-8095-f11af53ab806,6CQ3TYVt5lXIKMKya5OQTuECO28=] */
