package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class MethodClass extends DynamicResource implements IMethodClass {

  // abstract implementation, only used for static method calls
  private MethodClass() {
    super(IMethodClass.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel.IMethodClass selectToMeMethods(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel.IMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel.IMethodClass.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.MethodPackage.MethodClass_methods, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6a4d70e7-1151-11e3-b60e-ab478a3e1eca,dJOhSTUKtSZ3N+JHLhXnG3tEmJA=] */
