package cleon.implementation.testing.spec.testing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Testing extends DynamicResource implements ITesting {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITesting> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITesting>() {
    
    @Override
    public ITesting create() {
      return new Testing();
    }
    
    @Override
    public ITesting create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Testing(resourceRepository, resource);
    }
  
  };

  public Testing() {
    super(ITesting.TYPE_ID);
  }
  
  public Testing(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITesting.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public Testing setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public Testing setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public Testing setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestExecutions selectTestExecutions() {
    return _getSingle(cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestExecutions.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testExecutions);
  }

  public Testing setTestExecutions(cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestExecutions testExecutions) {
    _setSingle(cleon.implementation.testing.spec.testing.TestingPackage.Testing_testExecutions, testExecutions);
    return this;
  }
    
  @Override
  public cleon.implementation.testing.spec.testing._01_test_goals.javamodel.ITestGoals selectTestGoals() {
    return _getSingle(cleon.implementation.testing.spec.testing._01_test_goals.javamodel.ITestGoals.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testGoals);
  }

  public Testing setTestGoals(cleon.implementation.testing.spec.testing._01_test_goals.javamodel.ITestGoals testGoals) {
    _setSingle(cleon.implementation.testing.spec.testing.TestingPackage.Testing_testGoals, testGoals);
    return this;
  }
    
  @Override
  public cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITestInfrastructures selectTestInfrastructures() {
    return _getSingle(cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITestInfrastructures.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testInfrastructures);
  }

  public Testing setTestInfrastructures(cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITestInfrastructures testInfrastructures) {
    _setSingle(cleon.implementation.testing.spec.testing.TestingPackage.Testing_testInfrastructures, testInfrastructures);
    return this;
  }
    
  @Override
  public cleon.implementation.testing.spec.testing._03_test_methods.javamodel.ITestMethods selectTestMethods() {
    return _getSingle(cleon.implementation.testing.spec.testing._03_test_methods.javamodel.ITestMethods.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testMethods);
  }

  public Testing setTestMethods(cleon.implementation.testing.spec.testing._03_test_methods.javamodel.ITestMethods testMethods) {
    _setSingle(cleon.implementation.testing.spec.testing.TestingPackage.Testing_testMethods, testMethods);
    return this;
  }
    
  @Override
  public cleon.implementation.testing.spec.testing._02_test_objects.javamodel.ITestObjects selectTestObjects() {
    return _getSingle(cleon.implementation.testing.spec.testing._02_test_objects.javamodel.ITestObjects.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testObjects);
  }

  public Testing setTestObjects(cleon.implementation.testing.spec.testing._02_test_objects.javamodel.ITestObjects testObjects) {
    _setSingle(cleon.implementation.testing.spec.testing.TestingPackage.Testing_testObjects, testObjects);
    return this;
  }
    
  @Override
  public cleon.implementation.testing.spec.testing._07_testspecification.javamodel.ITestSpecifications selectTestSpecifications() {
    return _getSingle(cleon.implementation.testing.spec.testing._07_testspecification.javamodel.ITestSpecifications.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testSpecifications);
  }

  public Testing setTestSpecifications(cleon.implementation.testing.spec.testing._07_testspecification.javamodel.ITestSpecifications testSpecifications) {
    _setSingle(cleon.implementation.testing.spec.testing.TestingPackage.Testing_testSpecifications, testSpecifications);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Testing setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestExecutions.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testExecutions, visitor);
    _acceptSingle(cleon.implementation.testing.spec.testing._01_test_goals.javamodel.ITestGoals.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testGoals, visitor);
    _acceptSingle(cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITestInfrastructures.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testInfrastructures, visitor);
    _acceptSingle(cleon.implementation.testing.spec.testing._03_test_methods.javamodel.ITestMethods.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testMethods, visitor);
    _acceptSingle(cleon.implementation.testing.spec.testing._02_test_objects.javamodel.ITestObjects.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testObjects, visitor);
    _acceptSingle(cleon.implementation.testing.spec.testing._07_testspecification.javamodel.ITestSpecifications.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testSpecifications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.implementation.testing.spec.testing.javamodel.ITesting selectToMeTestGoals(cleon.implementation.testing.spec.testing._01_test_goals.javamodel.ITestGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing.javamodel.ITesting.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testGoals, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing.javamodel.ITesting selectToMeTestObjects(cleon.implementation.testing.spec.testing._02_test_objects.javamodel.ITestObjects object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing.javamodel.ITesting.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testObjects, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing.javamodel.ITesting selectToMeTestMethods(cleon.implementation.testing.spec.testing._03_test_methods.javamodel.ITestMethods object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing.javamodel.ITesting.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testMethods, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing.javamodel.ITesting selectToMeTestSpecifications(cleon.implementation.testing.spec.testing._07_testspecification.javamodel.ITestSpecifications object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing.javamodel.ITesting.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testSpecifications, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing.javamodel.ITesting selectToMeTestInfrastructures(cleon.implementation.testing.spec.testing._06_test_infrastructure.javamodel.ITestInfrastructures object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing.javamodel.ITesting.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testInfrastructures, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing.javamodel.ITesting selectToMeTestExecutions(cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestExecutions object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing.javamodel.ITesting.class, cleon.implementation.testing.spec.testing.TestingPackage.Testing_testExecutions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c050d74c-d400-11e5-9dfc-cf0f3e030023,j+ETn4tJxaoZQLyarugMR9/G0do=] */
