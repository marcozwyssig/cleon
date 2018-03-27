package cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnum extends cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("73469c3e-b1bd-11e4-a1b5-85bab1cb6ada");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel.IEnumValue> selectValues();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,73469c3e-b1bd-11e4-a1b5-85bab1cb6ada,YXsbDhsPEJEliqUkkhs5YPmHUJU=] */
