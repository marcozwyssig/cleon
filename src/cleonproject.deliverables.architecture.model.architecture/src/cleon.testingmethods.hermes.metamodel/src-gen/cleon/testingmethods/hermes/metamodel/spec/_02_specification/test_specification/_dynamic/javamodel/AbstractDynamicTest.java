package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractDynamicTest extends DynamicResource implements IAbstractDynamicTest {

  // abstract implementation, only used for static method calls
  private AbstractDynamicTest() {
    super(IAbstractDynamicTest.TYPE_ID);
  }
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest> selectToMeReference(cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReference object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_reference, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,49894707-7544-11e9-8ca5-a73df0698911,S4qAyjMMXWeC3OXBDfXHN8eZYlo=] */
