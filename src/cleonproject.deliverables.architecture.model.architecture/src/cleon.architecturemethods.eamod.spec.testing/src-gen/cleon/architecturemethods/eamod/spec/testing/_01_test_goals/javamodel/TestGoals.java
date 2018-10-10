package cleon.architecturemethods.eamod.spec.testing._01_test_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestGoals extends DynamicResource implements ITestGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestGoals>() {
    
    @Override
    public ITestGoals create() {
      return new TestGoals();
    }
    
    @Override
    public ITestGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestGoals(resourceRepository, resource);
    }
  
  };

  public TestGoals() {
    super(ITestGoals.TYPE_ID);
  }
  
  public TestGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestGoals.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestGoals setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.testing._01_test_goals.javamodel.ITestGoal> selectTestGoals() {
    return _getList(cleon.architecturemethods.eamod.spec.testing._01_test_goals.javamodel.ITestGoal.class, cleon.architecturemethods.eamod.spec.testing._01_test_goals._01_test_goalsPackage.TestGoals_testGoals);
  }

  public TestGoals setTestGoals(java.util.List<? extends cleon.architecturemethods.eamod.spec.testing._01_test_goals.javamodel.ITestGoal> testGoals) {
    _setList(cleon.architecturemethods.eamod.spec.testing._01_test_goals._01_test_goalsPackage.TestGoals_testGoals, testGoals);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.testing._01_test_goals.javamodel.ITestGoal.class, cleon.architecturemethods.eamod.spec.testing._01_test_goals._01_test_goalsPackage.TestGoals_testGoals, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.testing._01_test_goals.javamodel.ITestGoals selectToMeTestGoals(cleon.architecturemethods.eamod.spec.testing._01_test_goals.javamodel.ITestGoal object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.testing._01_test_goals.javamodel.ITestGoals.class, cleon.architecturemethods.eamod.spec.testing._01_test_goals._01_test_goalsPackage.TestGoals_testGoals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6b104a80-d406-11e5-8556-8f55ceb91287,mnINttbIUViXfh6qJ7YX7hRXLtA=] */
