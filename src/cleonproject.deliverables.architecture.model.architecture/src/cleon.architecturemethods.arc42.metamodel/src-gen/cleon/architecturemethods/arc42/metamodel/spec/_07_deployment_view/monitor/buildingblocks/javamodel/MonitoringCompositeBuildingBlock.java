package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MonitoringCompositeBuildingBlock extends DynamicResource implements IMonitoringCompositeBuildingBlock {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonitoringCompositeBuildingBlock> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonitoringCompositeBuildingBlock>() {
    
    @Override
    public IMonitoringCompositeBuildingBlock create() {
      return new MonitoringCompositeBuildingBlock();
    }
    
    @Override
    public IMonitoringCompositeBuildingBlock create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MonitoringCompositeBuildingBlock(resourceRepository, resource);
    }
  
  };

  public MonitoringCompositeBuildingBlock() {
    super(IMonitoringCompositeBuildingBlock.TYPE_ID);
  }
  
  public MonitoringCompositeBuildingBlock(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMonitoringCompositeBuildingBlock.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock> selectAggregates() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringCompositeBuildingBlock_aggregates);
  }

  public MonitoringCompositeBuildingBlock setAggregates(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock> aggregates) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringCompositeBuildingBlock_aggregates, aggregates);
    return this;
  }
    
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectBuildingblockToMonitor() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.AbstractMonitoringBuildingBlock_buildingblockToMonitor);
  }

  public MonitoringCompositeBuildingBlock setBuildingblockToMonitor(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buildingblockToMonitor) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.AbstractMonitoringBuildingBlock_buildingblockToMonitor, buildingblockToMonitor);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public MonitoringCompositeBuildingBlock setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public MonitoringCompositeBuildingBlock setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public MonitoringCompositeBuildingBlock setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public MonitoringCompositeBuildingBlock setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MonitoringCompositeBuildingBlock setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringCompositeBuildingBlock_aggregates, visitor);
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.AbstractMonitoringBuildingBlock_buildingblockToMonitor, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringCompositeBuildingBlock selectToMeAggregates(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringCompositeBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringCompositeBuildingBlock_aggregates, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ccef247f-088c-11eb-a7cb-ffd76bc14ff3,3bhfDi15E79V7hno01+84F7HeJU=] */
