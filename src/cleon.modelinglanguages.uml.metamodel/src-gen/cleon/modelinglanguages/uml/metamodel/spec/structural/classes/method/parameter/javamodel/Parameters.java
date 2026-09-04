package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Parameters extends DynamicResource implements IParameters {

  // abstract implementation, only used for static method calls
  private Parameters() {
    super(IParameters.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel.IParameters selectToMeParameters(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel.IParameter object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel.IParameters.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.ParameterPackage.Parameters_parameters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8418889f-0415-11f0-b041-cf872c9c3703,qm59UIlTpplkhMerkAIWX3JYD4M=] */
