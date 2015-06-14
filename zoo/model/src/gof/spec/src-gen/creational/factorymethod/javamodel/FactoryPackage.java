package creational.factorymethod.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FactoryPackage extends DynamicResource implements IFactoryPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFactoryPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFactoryPackage>() {
    
    @Override
    public IFactoryPackage create() {
      return new FactoryPackage();
    }
    
    @Override
    public IFactoryPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FactoryPackage(resourceRepository, resource);
    }
  
  };

  public FactoryPackage() {
    super(IFactoryPackage.TYPE_ID);
  }
  
  public FactoryPackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFactoryPackage.TYPE_ID);
  }

  // attributes
  
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

  public FactoryPackage setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassifier> selectClasses() {
    return _getList(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes);
  }

  public FactoryPackage setClasses(java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassifier> classes) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, classes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public FactoryPackage setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public creational.factorymethod.javamodel.IFactoryCreator selectFactory() {
    return _getSingle(creational.factorymethod.javamodel.IFactoryCreator.class, creational.factorymethod.FactorymethodPackage.FactoryPackage_factory);
  }

  public FactoryPackage setFactory(creational.factorymethod.javamodel.IFactoryCreator factory) {
    _setSingle(creational.factorymethod.FactorymethodPackage.FactoryPackage_factory, factory);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes);
  }

  public FactoryPackage setParagraphes(java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> selectSubPackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages);
  }

  public FactoryPackage setSubPackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> subPackages) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, subPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FactoryPackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> selectUseDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions);
  }

  public FactoryPackage setUseDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> useDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, useDecompositions);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(creational.factorymethod.javamodel.IFactoryCreator.class, creational.factorymethod.FactorymethodPackage.FactoryPackage_factory, visitor);
    _acceptList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, visitor);
  }

  // toMeRelations
  
  public static creational.factorymethod.javamodel.IFactoryPackage selectToMeFactory(creational.factorymethod.javamodel.IFactoryCreator object) {
    return _getToMeSingle(object.getRepository(), creational.factorymethod.javamodel.IFactoryPackage.class, creational.factorymethod.FactorymethodPackage.FactoryPackage_factory, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,46daf4f0-ddd3-11e4-b0b5-6911fa4e24e5,pu1nnM2GxaS5gQHT6CgU3taudB0=] */
