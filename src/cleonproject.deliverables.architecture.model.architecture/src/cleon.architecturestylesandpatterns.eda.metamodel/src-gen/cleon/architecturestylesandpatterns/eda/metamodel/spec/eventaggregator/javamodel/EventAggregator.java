package cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EventAggregator extends DynamicResource implements IEventAggregator {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEventAggregator> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEventAggregator>() {
    
    @Override
    public IEventAggregator create() {
      return new EventAggregator();
    }
    
    @Override
    public IEventAggregator create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EventAggregator(resourceRepository, resource);
    }
  
  };

  public EventAggregator() {
    super(IEventAggregator.TYPE_ID);
  }
  
  public EventAggregator(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEventAggregator.TYPE_ID);
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
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier selectContext() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier.class, cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.EventaggregatorPackage.EventAggregator_context);
  }

  public EventAggregator setContext(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier context) {
    _setSingle(cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.EventaggregatorPackage.EventAggregator_context, context);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IPubSubEvent> selectEvents() {
    return _getMap(cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IPubSubEvent.class, cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.EventaggregatorPackage.EventAggregator_events);
  }

  public EventAggregator setEvents(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IPubSubEvent> events) {
    _setMap(cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.EventaggregatorPackage.EventAggregator_events, events);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EventAggregator setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier.class, cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.EventaggregatorPackage.EventAggregator_context, visitor);
    _acceptMap(cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IPubSubEvent.class, cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.EventaggregatorPackage.EventAggregator_events, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IEventAggregator selectToMeEvents(cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IPubSubEvent object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IEventAggregator.class, cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.EventaggregatorPackage.EventAggregator_events, object.getResource());
  }
  
  public static java.util.List<cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IEventAggregator> selectToMeContext(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IEventAggregator.class, cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.EventaggregatorPackage.EventAggregator_context, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3a134cb4-d22a-11e4-8b90-c7d981a5f2fd,uND1NNvEADkNs0EPYy49ImSiYvs=] */
