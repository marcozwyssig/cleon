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
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IEvents selectEventing() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IEvents.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_eventing);
  }

  public MonitorView setEventing(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IEvents eventing) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_eventing, eventing);
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
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IRules selectRules() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IRules.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_rules);
  }

  public MonitorView setRules(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IRules rules) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_rules, rules);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.ISensors selectSensors() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.ISensors.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_sensors);
  }

  public MonitorView setSensors(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.ISensors sensors) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_sensors, sensors);
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
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IEvents.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_eventing, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IRules.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_rules, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.ISensors.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_sensors, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView selectToMeSensors(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.ISensors object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_sensors, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView selectToMeRules(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IRules object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_rules, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView selectToMeEventing(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IEvents object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IMonitorView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view._07_deployment_viewPackage.MonitorView_eventing, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0e2fd28c-9992-11e8-b347-dd2314b02086,ZwZZlC4np/UZsWB9lA1etctSsYM=] */
