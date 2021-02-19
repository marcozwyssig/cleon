package cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEventAggregator extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IInterface, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3a134cb4-d22a-11e4-8b90-c7d981a5f2fd");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IPubSubEvent> selectEvents();
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier selectContext();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3a134cb4-d22a-11e4-8b90-c7d981a5f2fd,Sh2QrPXUrPKphiA4s9WpH0hUS8c=] */
