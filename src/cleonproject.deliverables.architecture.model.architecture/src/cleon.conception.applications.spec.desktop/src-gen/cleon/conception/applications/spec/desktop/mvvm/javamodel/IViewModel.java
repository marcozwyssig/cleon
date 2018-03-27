package cleon.conception.applications.spec.desktop.mvvm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IViewModel extends cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClass, cleon.conception.architecture.spec.uml.structural.classes.interfaces.javamodel.IInterface {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("349382f4-5284-11e3-999a-25b1389b65ab");
  
  public java.lang.Boolean selectGenerateFieldForDisplay();
  
  // relations
  
  public cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier selectDisplay();
  
  public cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel selectExtends();
  
  public java.util.List<? extends cleon.conception.applications.spec.desktop.mvvm.javamodel.IDelegateCommand> selectDelegateCommands();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.applications.spec.desktop.mvvm.javamodel.IForwardPropertyDependency> selectForwardPropertys();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,349382f4-5284-11e3-999a-25b1389b65ab,S8V1yruu4VPJMQMBrUerkSnj8j0=] */
