package cleon.uml.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedComponentWithPackage extends DynamicResource implements INamedComponentWithPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedComponentWithPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedComponentWithPackage>() {
    
    @Override
    public INamedComponentWithPackage create() {
      return new NamedComponentWithPackage();
    }
    
    @Override
    public INamedComponentWithPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedComponentWithPackage(resourceRepository, resource);
    }
  
  };

  public NamedComponentWithPackage() {
    super(INamedComponentWithPackage.TYPE_ID);
  }
  
  public NamedComponentWithPackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedComponentWithPackage.TYPE_ID);
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
  public java.util.List<java.lang.String> selectDescription() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.chapter.ChapterPackage.Description_description);
  }
    
  public void setDescription(java.util.List<java.lang.String> description) {
     _setListAttribute(cleon.doc.spec.chapter.ChapterPackage.Description_description, description);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName, shortName);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public NamedComponentWithPackage setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose);
  }

  public NamedComponentWithPackage setDecompose(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> decompose) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public NamedComponentWithPackage setDecomposePackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.uml.spec.structural.components.javamodel.IComponentDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public NamedComponentWithPackage setHasDependency(java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public NamedComponentWithPackage setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public NamedComponentWithPackage setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedComponentWithPackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.chapter.ChapterPackage.Description_description, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, visitor);
    _acceptList(cleon.uml.spec.structural.components.javamodel.IComponentDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,46835629-41b0-11e5-86f2-816f5628b22b,dJ2TUmoUUUueKCjzljvbyVa3fDA=] */
