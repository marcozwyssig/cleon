package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestToolAware extends DynamicResource implements ITestToolAware {

  // abstract implementation, only used for static method calls
  private TestToolAware() {
    super(ITestToolAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestToolAware> selectToMeTestTool(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_tools.javamodel.ITestTool object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestToolAware.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestToolAware_testTool, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fbf7c466-0bce-11ec-a9b2-833cb3ed3ab5,HNzcbzmeR1c+vaY20prjRqd4tso=] */
