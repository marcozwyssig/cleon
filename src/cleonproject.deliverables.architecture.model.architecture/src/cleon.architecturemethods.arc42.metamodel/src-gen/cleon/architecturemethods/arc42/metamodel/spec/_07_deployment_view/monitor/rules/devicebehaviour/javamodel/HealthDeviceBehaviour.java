package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class HealthDeviceBehaviour extends DynamicResource implements IHealthDeviceBehaviour {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHealthDeviceBehaviour> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHealthDeviceBehaviour>() {
    
    @Override
    public IHealthDeviceBehaviour create() {
      return new HealthDeviceBehaviour();
    }
    
    @Override
    public IHealthDeviceBehaviour create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new HealthDeviceBehaviour(resourceRepository, resource);
    }
  
  };

  public HealthDeviceBehaviour() {
    super(IHealthDeviceBehaviour.TYPE_ID);
  }
  
  public HealthDeviceBehaviour(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHealthDeviceBehaviour.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public HealthDeviceBehaviour setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectDevice() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthDeviceBehaviour_device);
  }

  public HealthDeviceBehaviour setDevice(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock device) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthDeviceBehaviour_device, device);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public HealthDeviceBehaviour setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthComponentBehaviour> selectHealthComponent() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthComponentBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthDeviceBehaviour_healthComponent);
  }

  public HealthDeviceBehaviour setHealthComponent(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthComponentBehaviour> healthComponent) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthDeviceBehaviour_healthComponent, healthComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public HealthDeviceBehaviour setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public HealthDeviceBehaviour setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public HealthDeviceBehaviour setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthDeviceBehaviour_device, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthComponentBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthDeviceBehaviour_healthComponent, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthDeviceBehaviour selectToMeHealthComponent(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthComponentBehaviour object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthDeviceBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthDeviceBehaviour_healthComponent, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthDeviceBehaviour> selectToMeDevice(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthDeviceBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthDeviceBehaviour_device, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8d68bcb5-8f5a-11e8-9cc3-93ddcbb0b144,qjtZ+98kOr8/BmPPuJNNIUv+LTM=] */
