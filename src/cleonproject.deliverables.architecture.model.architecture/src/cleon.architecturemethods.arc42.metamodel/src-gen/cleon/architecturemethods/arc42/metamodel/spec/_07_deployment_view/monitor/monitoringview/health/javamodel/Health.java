package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Health extends DynamicResource implements IHealth {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHealth> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHealth>() {
    
    @Override
    public IHealth create() {
      return new Health();
    }
    
    @Override
    public IHealth create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Health(resourceRepository, resource);
    }
  
  };

  public Health() {
    super(IHealth.TYPE_ID);
  }
  
  public Health(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHealth.TYPE_ID);
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

  public Health setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel.IDeviceBehaviours selectDeviceBehaviours() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel.IDeviceBehaviours.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_deviceBehaviours);
  }

  public Health setDeviceBehaviours(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel.IDeviceBehaviours deviceBehaviours) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_deviceBehaviours, deviceBehaviours);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Health setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.javamodel.IOperators selectOperators() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.javamodel.IOperators.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_operators);
  }

  public Health setOperators(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.javamodel.IOperators operators) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_operators, operators);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Health setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IScripts selectScripts() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IScripts.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_scripts);
  }

  public Health setScripts(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IScripts scripts) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_scripts, scripts);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Health setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel.IDeviceBehaviours.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_deviceBehaviours, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.javamodel.IOperators.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_operators, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IScripts.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_scripts, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.javamodel.IHealth selectToMeOperators(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.javamodel.IOperators object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.javamodel.IHealth.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_operators, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.javamodel.IHealth selectToMeScripts(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IScripts object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.javamodel.IHealth.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_scripts, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.javamodel.IHealth selectToMeDeviceBehaviours(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel.IDeviceBehaviours object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.javamodel.IHealth.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.HealthPackage.Health_deviceBehaviours, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0bb30754-8993-11e8-8250-d9b67f7d5f7f,nJg/sWqKhBqd7L+3qyW7n+Cntas=] */
