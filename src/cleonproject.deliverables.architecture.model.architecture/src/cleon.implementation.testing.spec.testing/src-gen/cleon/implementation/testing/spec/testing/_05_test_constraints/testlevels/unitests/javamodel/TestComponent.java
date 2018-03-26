package cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestComponent extends DynamicResource implements ITestComponent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestComponent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestComponent>() {
    
    @Override
    public ITestComponent create() {
      return new TestComponent();
    }
    
    @Override
    public ITestComponent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestComponent(resourceRepository, resource);
    }
  
  };

  public TestComponent() {
    super(ITestComponent.TYPE_ID);
  }
  
  public TestComponent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestComponent.TYPE_ID);
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
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponentDependency selectComponentUnderTest() {
    return _getSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponentDependency.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponent_componentUnderTest);
  }

  public TestComponent setComponentUnderTest(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponentDependency componentUnderTest) {
    _setSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponent_componentUnderTest, componentUnderTest);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public TestComponent setDecompose(java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public TestComponent setDecomposePackages(java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestComponent setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public TestComponent setHasDependency(java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition> selectTestPackages() {
    return _getMap(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponent_testPackages);
  }

  public TestComponent setTestPackages(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition> testPackages) {
    _setMap(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponent_testPackages, testPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestComponent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptSingle(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponentDependency.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponent_componentUnderTest, visitor);
    _acceptList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, visitor);
    _acceptMap(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponent_testPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponent selectToMeTestPackages(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponent.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponent_testPackages, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponent selectToMeComponentUnderTest(cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponentDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponent.class, cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponent_componentUnderTest, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a5ae6ce6-df47-11e2-b229-cd1bd4a07953,L3do6+etVcnxBUuHhN7AODYZ3nE=] */
