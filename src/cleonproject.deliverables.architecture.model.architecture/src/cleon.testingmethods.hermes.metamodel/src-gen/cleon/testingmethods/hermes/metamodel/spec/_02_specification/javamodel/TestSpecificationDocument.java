package cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestSpecificationDocument extends DynamicResource implements ITestSpecificationDocument {

  // abstract implementation, only used for static method calls
  private TestSpecificationDocument() {
    super(ITestSpecificationDocument.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument selectToMeTestPreconditions(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testPreconditions, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument selectToMeTestSpecifications(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestSpecifications object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocument_testSpecifications, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,88d35210-4f02-11e9-ba59-f1daaff821cc,2SyE/4LyR7f5XY8OptEDv3zVAaE=] */
