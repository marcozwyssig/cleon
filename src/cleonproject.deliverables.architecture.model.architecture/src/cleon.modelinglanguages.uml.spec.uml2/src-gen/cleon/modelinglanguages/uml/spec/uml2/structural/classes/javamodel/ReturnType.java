package cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ReturnType extends DynamicResource implements IReturnType {

  // abstract implementation, only used for static method calls
  private ReturnType() {
    super(IReturnType.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IReturnType> selectToMeReturnType(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IReturnType.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.ReturnType_returnType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c8ffee0f-356d-11e3-974d-d19f8c167114,8sBqhVKKbIKpvNWfE14K8wZo3qY=] */
