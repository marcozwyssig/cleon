package cleon.ddd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PubSubEvent extends DynamicResource implements IPubSubEvent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPubSubEvent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPubSubEvent>() {
    
    @Override
    public IPubSubEvent create() {
      return new PubSubEvent();
    }
    
    @Override
    public IPubSubEvent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PubSubEvent(resourceRepository, resource);
    }
  
  };

  public PubSubEvent() {
    super(IPubSubEvent.TYPE_ID);
  }
  
  public PubSubEvent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPubSubEvent.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.uml.spec.structural.classes.events.javamodel.IEvent selectEvent() {
    return _getSingle(cleon.uml.spec.structural.classes.events.javamodel.IEvent.class, cleon.ddd.spec.SpecPackage.PubSubEvent_event);
  }

  public PubSubEvent setEvent(cleon.uml.spec.structural.classes.events.javamodel.IEvent event) {
    _setSingle(cleon.ddd.spec.SpecPackage.PubSubEvent_event, event);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public PubSubEvent setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PubSubEvent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.uml.spec.structural.classes.events.javamodel.IEvent.class, cleon.ddd.spec.SpecPackage.PubSubEvent_event, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.ddd.spec.javamodel.IPubSubEvent> selectToMeEvent(cleon.uml.spec.structural.classes.events.javamodel.IEvent object) {
    return _getToMeList(object.getRepository(), cleon.ddd.spec.javamodel.IPubSubEvent.class, cleon.ddd.spec.SpecPackage.PubSubEvent_event, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,98ea7936-d22a-11e4-8b90-c7d981a5f2fd,tCeDE/DWK42qIoSGm/SBFcDD1t0=] */
