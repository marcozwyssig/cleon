package cleon.actifsource.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Model extends DynamicResource implements IModel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModel>() {
    
    @Override
    public IModel create() {
      return new Model();
    }
    
    @Override
    public IModel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Model(resourceRepository, resource);
    }
  
  };

  public Model() {
    super(IModel.TYPE_ID);
  }
  
  public Model(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModel.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectGeneratedJavaModel() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_generatedJavaModel);
  }
    
  public void setGeneratedJavaModel(java.lang.Boolean generatedJavaModel) {
     _setSingleAttribute(cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_generatedJavaModel, generatedJavaModel);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName, shortName);
  }

  @Override
  public java.lang.String selectVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_version, version);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Model setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose);
  }

  public Model setDecompose(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> decompose) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public Model setDecomposePackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.javamodel.IProjectDependency> selectDependsOn() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.javamodel.IProjectDependency.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_dependsOn);
  }

  public Model setDependsOn(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.javamodel.IProjectDependency> dependsOn) {
    _setList(cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.javamodel.IPackage> selectExportPackage() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.javamodel.IPackage.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_exportPackage);
  }

  public Model setExportPackage(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.javamodel.IPackage> exportPackage) {
    _setList(cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_exportPackage, exportPackage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.uml.spec.structural.components.javamodel.IComponentDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public Model setHasDependency(java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition selectNoPackages() {
    return _getSingle(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.Component_noPackages);
  }

  public Model setNoPackages(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition noPackages) {
    _setSingle(cleon.uml.spec.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Model setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Model setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.javamodel.IResource> selectResources() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.javamodel.IResource.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_resources);
  }

  public Model setResources(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.javamodel.IResource> resources) {
    _setList(cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_resources, resources);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.actifsource.spec._05_buildingblockview.javamodel.ITargetPath> selectTargetPaths() {
    return _getMap(cleon.actifsource.spec._05_buildingblockview.javamodel.ITargetPath.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_targetPaths);
  }

  public Model setTargetPaths(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.actifsource.spec._05_buildingblockview.javamodel.ITargetPath> targetPaths) {
    _setMap(cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_targetPaths, targetPaths);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Model setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_generatedJavaModel, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_version, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, visitor);
    _acceptList(cleon.actifsource.spec._05_buildingblockview.javamodel.IProjectDependency.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_dependsOn, visitor);
    _acceptList(cleon.actifsource.spec._05_buildingblockview.javamodel.IPackage.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_exportPackage, visitor);
    _acceptList(cleon.uml.spec.structural.components.javamodel.IComponentDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, visitor);
    _acceptSingle(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.Component_noPackages, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptList(cleon.actifsource.spec._05_buildingblockview.javamodel.IResource.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_resources, visitor);
    _acceptMap(cleon.actifsource.spec._05_buildingblockview.javamodel.ITargetPath.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_targetPaths, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eab1ce0a-1005-11e5-865e-55f33dbc76dc,nsbi/M2J3ereqEHwA3IqZThQrTM=] */
