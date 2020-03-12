package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MonitorView extends DynamicResource implements IMonitorView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonitorView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMonitorView>() {
    
    @Override
    public IMonitorView create() {
      return new MonitorView();
    }
    
    @Override
    public IMonitorView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MonitorView(resourceRepository, resource);
    }
  
  };

  public MonitorView() {
    super(IMonitorView.TYPE_ID);
  }
  
  public MonitorView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMonitorView.TYPE_ID);
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
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IAlarmingView selectAlarmingView() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IAlarmingView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_alarmingView);
  }

  public MonitorView setAlarmingView(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IAlarmingView alarmingView) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_alarmingView, alarmingView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public MonitorView setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public MonitorView setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IHealth selectHealth() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IHealth.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_health);
  }

  public MonitorView setHealth(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IHealth health) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_health, health);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlocks selectMonitoringscomponents() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlocks.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_monitoringscomponents);
  }

  public MonitorView setMonitoringscomponents(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlocks monitoringscomponents) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_monitoringscomponents, monitoringscomponents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public MonitorView setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MonitorView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IAlarmingView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_alarmingView, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IHealth.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_health, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlocks.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_monitoringscomponents, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView selectToMeMonitoringscomponents(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlocks object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_monitoringscomponents, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView selectToMeAlarmingView(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IAlarmingView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_alarmingView, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView selectToMeHealth(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IHealth object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_health, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0e2fd28c-9992-11e8-b347-dd2314b02086,9R/hOVdakHqlvJxwcfdUdATlg9U=] */
