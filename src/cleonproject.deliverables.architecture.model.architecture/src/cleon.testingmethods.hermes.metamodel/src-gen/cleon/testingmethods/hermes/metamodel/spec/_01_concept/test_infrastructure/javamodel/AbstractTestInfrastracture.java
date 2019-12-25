package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractTestInfrastracture extends DynamicResource implements IAbstractTestInfrastracture {

  // abstract implementation, only used for static method calls
  private AbstractTestInfrastracture() {
    super(IAbstractTestInfrastracture.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,52ef47e0-6748-11e9-9ec9-5fbc84faaeb1,ywJrmA3VntKFpGdDP3JzXcrwf88=] */
