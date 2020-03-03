package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SituationAnalysis extends DynamicResource implements ISituationAnalysis {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISituationAnalysis> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISituationAnalysis>() {
    
    @Override
    public ISituationAnalysis create() {
      return new SituationAnalysis();
    }
    
    @Override
    public ISituationAnalysis create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SituationAnalysis(resourceRepository, resource);
    }
  
  };

  public SituationAnalysis() {
    super(ISituationAnalysis.TYPE_ID);
  }
  
  public SituationAnalysis(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISituationAnalysis.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SituationAnalysis setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponentView selectComponentView() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponentView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_componentView);
  }

  public SituationAnalysis setComponentView(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponentView componentView) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_componentView, componentView);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.javamodel.IDeploymentView selectDeploymentView() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_deploymentView);
  }

  public SituationAnalysis setDeploymentView(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.javamodel.IDeploymentView deploymentView) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_deploymentView, deploymentView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SituationAnalysis setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_documentLanguage);
  }

  public SituationAnalysis setDocumentLanguage(java.util.List<? extends cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringView selectMonitoringView() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_monitoringView);
  }

  public SituationAnalysis setMonitoringView(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringView monitoringView) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_monitoringView, monitoringView);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public SituationAnalysis setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public SituationAnalysis setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SituationAnalysis setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponentView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_componentView, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_deploymentView, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringView.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_monitoringView, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.ISituationAnalysis selectToMeComponentView(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponentView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.ISituationAnalysis.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_componentView, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.ISituationAnalysis selectToMeDeploymentView(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.javamodel.IDeploymentView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.ISituationAnalysis.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_deploymentView, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.ISituationAnalysis selectToMeMonitoringView(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.ISituationAnalysis.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.MonitorPackage.SituationAnalysis_monitoringView, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8412f1bf-8990-11e8-8250-d9b67f7d5f7f,D2P7Vcc7POtevnFzRwofyQXuCVk=] */
