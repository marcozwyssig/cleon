package cleon.uml.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentComposition extends DynamicResource implements IComponentComposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentComposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentComposition>() {
    
    @Override
    public IComponentComposition create() {
      return new ComponentComposition();
    }
    
    @Override
    public IComponentComposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentComposition(resourceRepository, resource);
    }
  
  };

  public ComponentComposition() {
    super(IComponentComposition.TYPE_ID);
  }
  
  public ComponentComposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentComposition.TYPE_ID);
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
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public ComponentComposition setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IAbstractComponent> selectComponents() {
    return _getList(cleon.uml.spec.structural.components.javamodel.IAbstractComponent.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentComposition_components);
  }

  public ComponentComposition setComponents(java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IAbstractComponent> components) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentComposition_components, components);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ComponentComposition setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentCompositionDependency> selectHas() {
    return _getList(cleon.uml.spec.structural.components.javamodel.IComponentCompositionDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentComposition_has);
  }

  public ComponentComposition setHas(java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentCompositionDependency> has) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentComposition_has, has);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDependency.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DependentBuildingBlock_hasDependency);
  }

  public ComponentComposition setHasDependency(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDependency> hasDependency) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DependentBuildingBlock_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentComposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> selectUseDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions);
  }

  public ComponentComposition setUseDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> useDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, useDecompositions);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.uml.spec.structural.components.javamodel.IAbstractComponent.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentComposition_components, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.uml.spec.structural.components.javamodel.IComponentCompositionDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentComposition_has, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDependency.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DependentBuildingBlock_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.structural.components.javamodel.IComponentComposition selectToMeComponents(cleon.uml.spec.structural.components.javamodel.IAbstractComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.components.javamodel.IComponentComposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentComposition_components, object.getResource());
  }
  
  public static cleon.uml.spec.structural.components.javamodel.IComponentComposition selectToMeHas(cleon.uml.spec.structural.components.javamodel.IComponentCompositionDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.components.javamodel.IComponentComposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentComposition_has, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,18a510ec-85c1-11e3-be33-79789cf5eae3,o3IHdr2QwJqhrCR9dQd2In2wUj0=] */
