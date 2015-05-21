package cleon.uml.spec.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Class extends DynamicResource implements IClass {

  // abstract implementation, only used for static method calls
  private Class() {
    super(IClass.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.uml.spec.structural.classes.javamodel.IClass> selectToMeExtends(cleon.uml.spec.structural.classes.javamodel.IClass object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.structural.classes.javamodel.IClass.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_extends, object.getResource());
  }
  
  public static cleon.uml.spec.structural.classes.javamodel.IClass selectToMeFieldEvents(cleon.uml.spec.structural.classes.events.javamodel.IEventForField object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.classes.javamodel.IClass.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_fieldEvents, object.getResource());
  }
  
  public static cleon.uml.spec.structural.classes.javamodel.IClass selectToMeCustomEvents(cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.classes.javamodel.IClass.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_customEvents, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,accc5089-2f5a-11e3-b966-57aab741cf17,vHfNlLS83WHl8j8g2o2XIbr2Bcs=] */
