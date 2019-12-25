package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class GlobalPreconditionsAware extends DynamicResource implements IGlobalPreconditionsAware {

  // abstract implementation, only used for static method calls
  private GlobalPreconditionsAware() {
    super(IGlobalPreconditionsAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IGlobalPreconditionsAware selectToMeTestGlobalPrecondition(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IGlobalPreconditionsAware.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.GlobalPreconditionsAware_testGlobalPrecondition, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,be5256c2-718f-11e9-98e0-2719d32d2629,Efsp2T3O5rhjzwnliq9pIJfqnGA=] */
