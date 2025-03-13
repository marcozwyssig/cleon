package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourcePlanningNodeConcept extends DynamicResource implements IResourcePlanningNodeConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourcePlanningNodeConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourcePlanningNodeConcept>() {
    
    @Override
    public IResourcePlanningNodeConcept create() {
      return new ResourcePlanningNodeConcept();
    }
    
    @Override
    public IResourcePlanningNodeConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourcePlanningNodeConcept(resourceRepository, resource);
    }
  
  };

  public ResourcePlanningNodeConcept() {
    super(IResourcePlanningNodeConcept.TYPE_ID);
  }
  
  public ResourcePlanningNodeConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourcePlanningNodeConcept.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.Double> selectBruttoDiskGB() {
    return _getListAttribute(java.lang.Double.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoDiskGB);
  }
    
  public void setBruttoDiskGB(java.util.List<java.lang.Double> bruttoDiskGB) {
     _setListAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoDiskGB, bruttoDiskGB);
  }

  @Override
  public java.lang.Integer selectBruttoMHz_CPU() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoMHz_aE_CPU);
  }
    
  public void setBruttoMHz_CPU(java.lang.Integer bruttoMHz_CPU) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoMHz_aE_CPU, bruttoMHz_CPU);
  }

  @Override
  public java.lang.Integer selectBruttoMemoryGB() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoMemoryGB);
  }
    
  public void setBruttoMemoryGB(java.lang.Integer bruttoMemoryGB) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoMemoryGB, bruttoMemoryGB);
  }

  @Override
  public java.lang.Integer selectBruttoTotalMHz_CPU_Core() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoTotalMHz_aE_CPU_aE_Core);
  }
    
  public void setBruttoTotalMHz_CPU_Core(java.lang.Integer bruttoTotalMHz_CPU_Core) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoTotalMHz_aE_CPU_aE_Core, bruttoTotalMHz_CPU_Core);
  }

  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
  }

  @Override
  public java.lang.Integer selectCountOfVMs() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_countOfVMs);
  }
    
  public void setCountOfVMs(java.lang.Integer countOfVMs) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_countOfVMs, countOfVMs);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.Integer selectNettoDiskGB_VM() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoDiskGB_aE_VM);
  }
    
  public void setNettoDiskGB_VM(java.lang.Integer nettoDiskGB_VM) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoDiskGB_aE_VM, nettoDiskGB_VM);
  }

  @Override
  public java.lang.Integer selectNettoMGHz_VM() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoMGHz_aE_VM);
  }
    
  public void setNettoMGHz_VM(java.lang.Integer nettoMGHz_VM) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoMGHz_aE_VM, nettoMGHz_VM);
  }

  @Override
  public java.lang.Integer selectNettoMHz_CPU() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoMHz_aE_CPU);
  }
    
  public void setNettoMHz_CPU(java.lang.Integer nettoMHz_CPU) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoMHz_aE_CPU, nettoMHz_CPU);
  }

  @Override
  public java.lang.Integer selectNettoMemoryGB() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoMemoryGB);
  }
    
  public void setNettoMemoryGB(java.lang.Integer nettoMemoryGB) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoMemoryGB, nettoMemoryGB);
  }

  @Override
  public java.lang.Integer selectNettoTotalMHz_CPU_Core() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoTotalMHz_aE_CPU_aE_Core);
  }
    
  public void setNettoTotalMHz_CPU_Core(java.lang.Integer nettoTotalMHz_CPU_Core) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoTotalMHz_aE_CPU_aE_Core, nettoTotalMHz_CPU_Core);
  }

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath, noChapterPath);
  }

  @Override
  public java.lang.Integer selectReserveDiskGB() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_reserveDiskGB);
  }
    
  public void setReserveDiskGB(java.lang.Integer reserveDiskGB) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_reserveDiskGB, reserveDiskGB);
  }

  @Override
  public java.lang.Integer selectReserveMGHz_VM() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_reserveMGHz_aE_VM);
  }
    
  public void setReserveMGHz_VM(java.lang.Integer reserveMGHz_VM) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_reserveMGHz_aE_VM, reserveMGHz_VM);
  }

  @Override
  public java.lang.Integer selectReserveNettoMemoryGB() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_reserveNettoMemoryGB);
  }
    
  public void setReserveNettoMemoryGB(java.lang.Integer reserveNettoMemoryGB) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_reserveNettoMemoryGB, reserveNettoMemoryGB);
  }

  @Override
  public java.lang.Integer selectTotalNettoDiskGB() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_totalNettoDiskGB);
  }
    
  public void setTotalNettoDiskGB(java.lang.Integer totalNettoDiskGB) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_totalNettoDiskGB, totalNettoDiskGB);
  }

  @Override
  public java.lang.Integer selectTotalNettoMemoryGB_VM() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_totalNettoMemoryGB_aE_VM);
  }
    
  public void setTotalNettoMemoryGB_VM(java.lang.Integer totalNettoMemoryGB_VM) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_totalNettoMemoryGB_aE_VM, totalNettoMemoryGB_VM);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ResourcePlanningNodeConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public ResourcePlanningNodeConcept setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ResourcePlanningNodeConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public ResourcePlanningNodeConcept setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ResourcePlanningNodeConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode selectResourcePlanningForNode() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_resourcePlanningForNode);
  }

  public ResourcePlanningNodeConcept setResourcePlanningForNode(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode resourcePlanningForNode) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_resourcePlanningForNode, resourcePlanningForNode);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ResourcePlanningNodeConcept setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourcePlanningNodeConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.Double.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoDiskGB, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoMHz_aE_CPU, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoMemoryGB, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_bruttoTotalMHz_aE_CPU_aE_Core, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_countOfVMs, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoDiskGB_aE_VM, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoMGHz_aE_VM, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoMHz_aE_CPU, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoMemoryGB, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_nettoTotalMHz_aE_CPU_aE_Core, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_reserveDiskGB, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_reserveMGHz_aE_VM, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_reserveNettoMemoryGB, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_totalNettoDiskGB, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_totalNettoMemoryGB_aE_VM, visitor);
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_resourcePlanningForNode, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningNodeConcept selectToMeResourcePlanningForNode(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningNodeConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningNodeConcept_resourcePlanningForNode, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,69dd239f-dfef-11eb-93d3-9f230e4bb32b,jSromQReZvN8mcAK/8pNiWmc6Zg=] */
