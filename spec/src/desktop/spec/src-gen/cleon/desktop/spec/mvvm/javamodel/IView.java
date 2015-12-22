package cleon.desktop.spec.mvvm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IView extends cleon.uml.spec.structural.classes.javamodel.IClass, ch.actifsource.core.javamodel.INamedResource, cleon.desktop.spec.mvvm.binding.javamodel.IBindable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("497ab35f-5286-11e3-999a-25b1389b65ab");
  
  // relations
  
  public cleon.desktop.spec.mvvm.javamodel.IView selectExtends();
  
  public cleon.desktop.spec.mvvm.javamodel.IViewModelDependency selectViewModel();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,497ab35f-5286-11e3-999a-25b1389b65ab,sSr6vqUZYeTD+RwplIIdHNWC8ek=] */
