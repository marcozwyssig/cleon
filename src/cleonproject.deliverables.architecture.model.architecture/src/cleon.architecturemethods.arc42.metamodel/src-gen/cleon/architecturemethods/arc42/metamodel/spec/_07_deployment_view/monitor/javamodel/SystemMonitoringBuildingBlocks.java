package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemMonitoringBuildingBlocks extends DynamicResource implements ISystemMonitoringBuildingBlocks {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemMonitoringBuildingBlocks> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemMonitoringBuildingBlocks>() {
    
    @Override
    public ISystemMonitoringBuildingBlocks create() {
      return new SystemMonitoringBuildingBlocks();
    }
    
    @Override
    public ISystemMonitoringBuildingBlocks create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemMonitoringBuildingBlocks(resourceRepository, resource);
    }
  
  };

  public SystemMonitoringBuildingBlocks() {
    super(ISystemMonitoringBuildingBlocks.TYPE_ID);
  }
  
  public SystemMonitoringBuildingBlocks(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemMonitoringBuildingBlocks.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, chapterPath);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectInterval_aE__aA_s_aC_() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_);
  }
    
  public void setInterval_aE__aA_s_aC_(java.lang.Integer interval_aE__aA_s_aC_) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_, interval_aE__aA_s_aC_);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SystemMonitoringBuildingBlocks setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SystemMonitoringBuildingBlocks setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IMonitoringCompositeBuildingBlocksForSystem> selectForSystems() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IMonitoringCompositeBuildingBlocksForSystem.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SystemMonitoringBuildingBlocks_forSystems);
  }

  public SystemMonitoringBuildingBlocks setForSystems(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IMonitoringCompositeBuildingBlocksForSystem> forSystems) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SystemMonitoringBuildingBlocks_forSystems, forSystems);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock> selectMonitoringBuildingBlocks() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlocks_monitoringBuildingBlocks);
  }

  public SystemMonitoringBuildingBlocks setMonitoringBuildingBlocks(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock> monitoringBuildingBlocks) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlocks_monitoringBuildingBlocks, monitoringBuildingBlocks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SystemMonitoringBuildingBlocks setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemMonitoringBuildingBlocks setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IntervalAware_interval_aE__aA_s_aC_, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IMonitoringCompositeBuildingBlocksForSystem.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SystemMonitoringBuildingBlocks_forSystems, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.ISystemMonitoringBuildingBlocks selectToMeForSystems(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IMonitoringCompositeBuildingBlocksForSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.ISystemMonitoringBuildingBlocks.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SystemMonitoringBuildingBlocks_forSystems, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6037c44c-08a7-11eb-a18e-c7dfa3f96804,tbEHofEMZYYnnp/oBjcyNDgjixY=] */
