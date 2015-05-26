package cleon.uml.spec.structural.classes.enums.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnum extends cleon.uml.spec.structural.classes.javamodel.IClassifier, ch.actifsource.core.javamodel.INamedResource, cleon.arc42.spec.buildingblockview.javamodel.IOwnBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("73469c3e-b1bd-11e4-a1b5-85bab1cb6ada");
  
  // relations
  
  public java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnumValue> selectValues();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,73469c3e-b1bd-11e4-a1b5-85bab1cb6ada,pdO3qbyusfsIXhwl+MOwyajo87M=] */
