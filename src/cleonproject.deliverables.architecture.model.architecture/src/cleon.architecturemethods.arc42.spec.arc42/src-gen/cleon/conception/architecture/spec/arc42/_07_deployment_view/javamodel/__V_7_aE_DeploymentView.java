package cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_7_aE_DeploymentView extends DynamicResource implements I__V_7_aE_DeploymentView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_7_aE_DeploymentView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_7_aE_DeploymentView>() {
    
    @Override
    public I__V_7_aE_DeploymentView create() {
      return new __V_7_aE_DeploymentView();
    }
    
    @Override
    public I__V_7_aE_DeploymentView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_7_aE_DeploymentView(resourceRepository, resource);
    }
  
  };

  public __V_7_aE_DeploymentView() {
    super(I__V_7_aE_DeploymentView.TYPE_ID);
  }
  
  public __V_7_aE_DeploymentView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_7_aE_DeploymentView.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IBuildView selectBuildView() {
    return _getSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IBuildView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_buildView);
  }

  public __V_7_aE_DeploymentView setBuildView(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IBuildView buildView) {
    _setSingle(cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_buildView, buildView);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IDeployView selectDeployView() {
    return _getSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IDeployView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_deployView);
  }

  public __V_7_aE_DeploymentView setDeployView(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IDeployView deployView) {
    _setSingle(cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_deployView, deployView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public __V_7_aE_DeploymentView setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IMonitorView selectMonitorView() {
    return _getSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IMonitorView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_monitorView);
  }

  public __V_7_aE_DeploymentView setMonitorView(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IMonitorView monitorView) {
    _setSingle(cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_monitorView, monitorView);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IPackageView selectPackageView() {
    return _getSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IPackageView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_packageView);
  }

  public __V_7_aE_DeploymentView setPackageView(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IPackageView packageView) {
    _setSingle(cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_packageView, packageView);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.ITestView selectTestView() {
    return _getSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.ITestView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_testView);
  }

  public __V_7_aE_DeploymentView setTestView(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.ITestView testView) {
    _setSingle(cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_testView, testView);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_7_aE_DeploymentView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IBuildView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_buildView, visitor);
    _acceptSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IDeployView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_deployView, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IMonitorView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_monitorView, visitor);
    _acceptSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IPackageView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_packageView, visitor);
    _acceptSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.ITestView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_testView, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView selectToMeBuildView(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IBuildView object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_buildView, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView selectToMePackageView(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IPackageView object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_packageView, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView selectToMeTestView(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.ITestView object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_testView, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView selectToMeDeployView(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IDeployView object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_deployView, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView selectToMeMonitorView(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.IMonitorView object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.conception.architecture.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_monitorView, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b47acb73-314c-11e5-bd99-eda9ce254b0b,co7s+292OS2PayLcVvsvZcvZgp8=] */
