package cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Field extends DynamicResource implements IField {

  // abstract implementation, only used for static method calls
  private Field() {
    super(IField.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField> selectToMeType(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField.class, cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Field_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,809747d2-2758-11e3-a600-d180349bca70,3bT8YjNeyZ5OeQE/Pqaq8BbTfiU=] */
