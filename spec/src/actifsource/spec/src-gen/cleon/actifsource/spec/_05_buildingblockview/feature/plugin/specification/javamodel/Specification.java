package cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Specification extends DynamicResource implements ISpecification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpecification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpecification>() {
    
    @Override
    public ISpecification create() {
      return new Specification();
    }
    
    @Override
    public ISpecification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Specification(resourceRepository, resource);
    }
  
  };

  public Specification() {
    super(ISpecification.TYPE_ID);
  }
  
  public Specification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISpecification.TYPE_ID);
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
    return _getSingleAttribute(java.lang.Boolean.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_generatedJavaModel);
  }
    
  public void setGeneratedJavaModel(java.lang.Boolean generatedJavaModel) {
     _setSingleAttribute(cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_generatedJavaModel, generatedJavaModel);
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
    return _getSingleAttribute(java.lang.String.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_version, version);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Specification setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose);
  }

  public Specification setDecompose(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> decompose) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public Specification setDecomposePackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPluginDependency> selectDependsOn() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPluginDependency.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_dependsOn);
  }

  public Specification setDependsOn(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPluginDependency> dependsOn) {
    _setList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.diagram.javamodel.IDiagram> selectDiagrams() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.diagram.javamodel.IDiagram.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_diagrams);
  }

  public Specification setDiagrams(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.diagram.javamodel.IDiagram> diagrams) {
    _setList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_diagrams, diagrams);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPackage> selectExportPackage() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPackage.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_exportPackage);
  }

  public Specification setExportPackage(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPackage> exportPackage) {
    _setList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_exportPackage, exportPackage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.uml.spec.structural.components.javamodel.IComponentDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public Specification setHasDependency(java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.model.javamodel.IModel> selectModel() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.model.javamodel.IModel.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_model);
  }

  public Specification setModel(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.model.javamodel.IModel> model) {
    _setList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_model, model);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Specification setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition selectNoPackages() {
    return _getSingle(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.Component_noPackages);
  }

  public Specification setNoPackages(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition noPackages) {
    _setSingle(cleon.uml.spec.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> selectOwnDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.ReferenceOwnDecomposite_ownDecompositions);
  }

  public Specification setOwnDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> ownDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.ReferenceOwnDecomposite_ownDecompositions, ownDecompositions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Specification setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Specification setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IResource> selectResources() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IResource.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_resources);
  }

  public Specification setResources(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IResource> resources) {
    _setList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_resources, resources);
    return this;
  }
    
  @Override
  public cleon.actifsource.spec._05_buildingblockview.feature.plugin.sample.javamodel.ISample selectSample() {
    return _getSingle(cleon.actifsource.spec._05_buildingblockview.feature.plugin.sample.javamodel.ISample.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_sample);
  }

  public Specification setSample(cleon.actifsource.spec._05_buildingblockview.feature.plugin.sample.javamodel.ISample sample) {
    _setSingle(cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_sample, sample);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.ITargetPath> selectTargetPaths() {
    return _getMap(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.ITargetPath.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_targetPaths);
  }

  public Specification setTargetPaths(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.ITargetPath> targetPaths) {
    _setMap(cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_targetPaths, targetPaths);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.template.javamodel.ITemplate> selectTemplates() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.template.javamodel.ITemplate.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_templates);
  }

  public Specification setTemplates(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.template.javamodel.ITemplate> templates) {
    _setList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_templates, templates);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Specification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_generatedJavaModel, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_version, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, visitor);
    _acceptList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPluginDependency.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_dependsOn, visitor);
    _acceptList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.diagram.javamodel.IDiagram.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_diagrams, visitor);
    _acceptList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPackage.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_exportPackage, visitor);
    _acceptList(cleon.uml.spec.structural.components.javamodel.IComponentDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, visitor);
    _acceptList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.model.javamodel.IModel.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_model, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptSingle(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.Component_noPackages, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.ReferenceOwnDecomposite_ownDecompositions, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IResource.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_resources, visitor);
    _acceptSingle(cleon.actifsource.spec._05_buildingblockview.feature.plugin.sample.javamodel.ISample.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_sample, visitor);
    _acceptMap(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.ITargetPath.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_targetPaths, visitor);
    _acceptList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.template.javamodel.ITemplate.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_templates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification selectToMeModel(cleon.actifsource.spec._05_buildingblockview.feature.plugin.model.javamodel.IModel object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_model, object.getResource());
  }
  
  public static cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification selectToMeTemplates(cleon.actifsource.spec._05_buildingblockview.feature.plugin.template.javamodel.ITemplate object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_templates, object.getResource());
  }
  
  public static cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification selectToMeSample(cleon.actifsource.spec._05_buildingblockview.feature.plugin.sample.javamodel.ISample object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_sample, object.getResource());
  }
  
  public static cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification selectToMeDiagrams(cleon.actifsource.spec._05_buildingblockview.feature.plugin.diagram.javamodel.IDiagram object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.Specification_diagrams, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2cdf0732-e9ba-11e4-848b-0509e3792151,EGpRJ0sUc9hPGIOhqA8368X9OQE=] */
