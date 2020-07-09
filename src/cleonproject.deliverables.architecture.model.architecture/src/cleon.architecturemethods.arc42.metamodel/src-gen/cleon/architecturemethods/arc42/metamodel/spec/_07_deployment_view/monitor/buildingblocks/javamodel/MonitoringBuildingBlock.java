package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MonitoringBuildingBlock extends DynamicResource implements IMonitoringBuildingBlock {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonitoringBuildingBlock> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonitoringBuildingBlock>() {
    
    @Override
    public IMonitoringBuildingBlock create() {
      return new MonitoringBuildingBlock();
    }
    
    @Override
    public IMonitoringBuildingBlock create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MonitoringBuildingBlock(resourceRepository, resource);
    }
  
  };

  public MonitoringBuildingBlock() {
    super(IMonitoringBuildingBlock.TYPE_ID);
  }
  
  public MonitoringBuildingBlock(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMonitoringBuildingBlock.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock> selectBasedOn() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_basedOn);
  }

  public MonitoringBuildingBlock setBasedOn(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock> basedOn) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_basedOn, basedOn);
    return this;
  }
    
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectBuildingblockToMonitor() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_buildingblockToMonitor);
  }

  public MonitoringBuildingBlock setBuildingblockToMonitor(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buildingblockToMonitor) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_buildingblockToMonitor, buildingblockToMonitor);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public MonitoringBuildingBlock setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public MonitoringBuildingBlock setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public MonitoringBuildingBlock setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public MonitoringBuildingBlock setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.ISensor> selectSensor() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.ISensor.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_sensor);
  }

  public MonitoringBuildingBlock setSensor(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.ISensor> sensor) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_sensor, sensor);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public MonitoringBuildingBlock setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MonitoringBuildingBlock setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_basedOn, visitor);
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_buildingblockToMonitor, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.ISensor.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_sensor, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock> selectToMeBuildingblockToMonitor(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_buildingblockToMonitor, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock> selectToMeBasedOn(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_basedOn, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock selectToMeSensor(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.ISensor object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.MonitoringBuildingBlock_sensor, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9fb78914-8fdd-11e8-85d9-314ddfdf57eb,f61dKXCJIM1YnWyfGmh5ulqk7Fk=] */
