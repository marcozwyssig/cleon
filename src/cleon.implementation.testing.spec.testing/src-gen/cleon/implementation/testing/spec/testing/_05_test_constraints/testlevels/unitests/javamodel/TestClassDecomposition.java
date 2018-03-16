package cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestClassDecomposition extends DynamicResource implements ITestClassDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClassDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClassDecomposition>() {
    
    @Override
    public ITestClassDecomposition create() {
      return new TestClassDecomposition();
    }
    
    @Override
    public ITestClassDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestClassDecomposition(resourceRepository, resource);
    }
  
  };

  public TestClassDecomposition() {
    super(ITestClassDecomposition.TYPE_ID);
  }
  
  public TestClassDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestClassDecomposition.TYPE_ID);
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

  // relations
  
  @Override
  public cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition selectClassUnderTest() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest);
  }

  public TestClassDecomposition setClassUnderTest(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition classUnderTest) {
    _setSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest, classUnderTest);
    return this;
  }
    
  @Override
  public cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass selectClasses() {
    return _getSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classes);
  }

  public TestClassDecomposition setClasses(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass classes) {
    _setSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classes, classes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestClassDecomposition setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier selectInto() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into);
  }

  public TestClassDecomposition setInto(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier into) {
    _setSingle(cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestClassDecomposition setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestClassDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest, visitor);
    _acceptSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classes, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.PackageInClassifierDecomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition> selectToMeClassUnderTest(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageInClassifierDecomposition object) {
    return _getToMeList(object.getRepository(), cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classUnderTest, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition selectToMeClasses(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClass object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestClassDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestClassDecomposition_classes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e43712cd-19f3-11e5-a57b-e324953fb3a6,Wk3aUfGp4Hu4SxCa20f4I6UmHQ8=] */
