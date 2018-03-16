package cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestPackageDecomposition extends DynamicResource implements ITestPackageDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPackageDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestPackageDecomposition>() {
    
    @Override
    public ITestPackageDecomposition create() {
      return new TestPackageDecomposition();
    }
    
    @Override
    public ITestPackageDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestPackageDecomposition(resourceRepository, resource);
    }
  
  };

  public TestPackageDecomposition() {
    super(ITestPackageDecomposition.TYPE_ID);
  }
  
  public TestPackageDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestPackageDecomposition.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestPackageDecomposition setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage selectInto() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.PackageDecomposition_into);
  }

  public TestPackageDecomposition setInto(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage into) {
    _setSingle(cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.PackageDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition selectPackageUnderTest() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest);
  }

  public TestPackageDecomposition setPackageUnderTest(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition packageUnderTest) {
    _setSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, packageUnderTest);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestPackageDecomposition setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage selectTestPackages() {
    return _getSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages);
  }

  public TestPackageDecomposition setTestPackages(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage testPackages) {
    _setSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, testPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestPackageDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.PackageDecomposition_into, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition> selectToMePackageUnderTest(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition object) {
    return _getToMeList(object.getRepository(), cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_packageUnderTest, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition selectToMeTestPackages(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestPackageDecomposition_testPackages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6a1dc86a-18fc-11e5-b505-7b16b1341920,Qy2BzyNuW54d0IxRYt10fDVipGY=] */
