package cleon.uml.spec.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFieldClass extends cleon.uml.spec.structural.classes.javamodel.IClassifier, cleon.arc42.spec.buildingblockview.javamodel.IOwnBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("866ff33c-13c7-11e3-bec7-f1e135382475");
  
  // relations
  
  public java.util.List<? extends cleon.uml.spec.structural.classes.fields.javamodel.IField> selectFields();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,866ff33c-13c7-11e3-bec7-f1e135382475,VrGzG6a1ZHNAJnCkOWcXukThEno=] */
