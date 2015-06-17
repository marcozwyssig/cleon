package cleon.tdd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestClass extends DynamicResource implements ITestClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClass>() {
    
    @Override
    public ITestClass create() {
      return new TestClass();
    }
    
    @Override
    public ITestClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestClass(resourceRepository, resource);
    }
  
  };

  public TestClass() {
    super(ITestClass.TYPE_ID);
  }
  
  public TestClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestClass.TYPE_ID);
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
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public TestClass setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectClasses() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.tdd.spec.SpecPackage.TestClass_classes);
  }

  public TestClass setClasses(cleon.uml.spec.structural.classes.javamodel.IClassifier classes) {
    _setSingle(cleon.tdd.spec.SpecPackage.TestClass_classes, classes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public TestClass setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> selectOwnDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.OwnBuildingBlock_ownDecompositions);
  }

  public TestClass setOwnDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> ownDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.OwnBuildingBlock_ownDecompositions, ownDecompositions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestClass setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestMethod> selectTestMethods() {
    return _getMultiMap(cleon.tdd.spec.javamodel.ITestMethod.class, cleon.tdd.spec.SpecPackage.TestClass_testMethods);
  }

  public TestClass setTestMethods(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestMethod> testMethods) {
    _setMultiMap(cleon.tdd.spec.SpecPackage.TestClass_testMethods, testMethods);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestProperty> selectTestProperties() {
    return _getMultiMap(cleon.tdd.spec.javamodel.ITestProperty.class, cleon.tdd.spec.SpecPackage.TestClass_testProperties);
  }

  public TestClass setTestProperties(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestProperty> testProperties) {
    _setMultiMap(cleon.tdd.spec.SpecPackage.TestClass_testProperties, testProperties);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> selectUseDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions);
  }

  public TestClass setUseDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> useDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, useDecompositions);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.tdd.spec.SpecPackage.TestClass_classes, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.OwnBuildingBlock_ownDecompositions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptMultiMap(cleon.tdd.spec.javamodel.ITestMethod.class, cleon.tdd.spec.SpecPackage.TestClass_testMethods, visitor);
    _acceptMultiMap(cleon.tdd.spec.javamodel.ITestProperty.class, cleon.tdd.spec.SpecPackage.TestClass_testProperties, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.tdd.spec.javamodel.ITestClass> selectToMeClasses(cleon.uml.spec.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.tdd.spec.javamodel.ITestClass.class, cleon.tdd.spec.SpecPackage.TestClass_classes, object.getResource());
  }
  
  public static cleon.tdd.spec.javamodel.ITestClass selectToMeTestMethods(cleon.tdd.spec.javamodel.ITestMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.tdd.spec.javamodel.ITestClass.class, cleon.tdd.spec.SpecPackage.TestClass_testMethods, object.getResource());
  }
  
  public static cleon.tdd.spec.javamodel.ITestClass selectToMeTestProperties(cleon.tdd.spec.javamodel.ITestProperty object) {
    return _getToMeSingle(object.getRepository(), cleon.tdd.spec.javamodel.ITestClass.class, cleon.tdd.spec.SpecPackage.TestClass_testProperties, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c17728d0-df47-11e2-b229-cd1bd4a07953,Ln9Lv7JvPdqVJH1vJtvxOiHBNEA=] */
