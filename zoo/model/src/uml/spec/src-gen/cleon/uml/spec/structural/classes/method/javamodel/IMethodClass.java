package cleon.uml.spec.structural.classes.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMethodClass extends ch.actifsource.core.javamodel.IResource, cleon.uml.spec.structural.classes.javamodel.IClassifier, cleon.arc42.spec._05_buildingblockview.javamodel.IOwnBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6a4d70e7-1151-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> selectMethods();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6a4d70e7-1151-11e3-b60e-ab478a3e1eca,bOWUoyMLqEsTUrt0rldshkFJpbA=] */
