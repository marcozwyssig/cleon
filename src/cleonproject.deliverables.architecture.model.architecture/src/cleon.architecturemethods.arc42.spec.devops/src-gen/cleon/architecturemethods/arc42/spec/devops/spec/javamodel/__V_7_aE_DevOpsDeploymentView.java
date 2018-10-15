package cleon.architecturemethods.arc42.spec.devops.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_7_aE_DevOpsDeploymentView extends DynamicResource implements I__V_7_aE_DevOpsDeploymentView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_7_aE_DevOpsDeploymentView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_7_aE_DevOpsDeploymentView>() {
    
    @Override
    public I__V_7_aE_DevOpsDeploymentView create() {
      return new __V_7_aE_DevOpsDeploymentView();
    }
    
    @Override
    public I__V_7_aE_DevOpsDeploymentView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_7_aE_DevOpsDeploymentView(resourceRepository, resource);
    }
  
  };

  public __V_7_aE_DevOpsDeploymentView() {
    super(I__V_7_aE_DevOpsDeploymentView.TYPE_ID);
  }
  
  public __V_7_aE_DevOpsDeploymentView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_7_aE_DevOpsDeploymentView.TYPE_ID);
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
  public cleon.architecturemethods.arc42.spec.devops.spec.build.javamodel.IBuild selectBuild() {
    return _getSingle(cleon.architecturemethods.arc42.spec.devops.spec.build.javamodel.IBuild.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build);
  }

  public __V_7_aE_DevOpsDeploymentView setBuild(cleon.architecturemethods.arc42.spec.devops.spec.build.javamodel.IBuild build) {
    _setSingle(cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build, build);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IBuildView selectBuildView() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IBuildView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_buildView);
  }

  public __V_7_aE_DevOpsDeploymentView setBuildView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IBuildView buildView) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_buildView, buildView);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICode selectCode() {
    return _getSingle(cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICode.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code);
  }

  public __V_7_aE_DevOpsDeploymentView setCode(cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICode code) {
    _setSingle(cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code, code);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.devops.spec.deploy.javamodel.IDeploy> selectDeploy() {
    return _getList(cleon.architecturemethods.arc42.spec.devops.spec.deploy.javamodel.IDeploy.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy);
  }

  public __V_7_aE_DevOpsDeploymentView setDeploy(java.util.List<? extends cleon.architecturemethods.arc42.spec.devops.spec.deploy.javamodel.IDeploy> deploy) {
    _setList(cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy, deploy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.deployview.javamodel.IDeployView selectDeployView() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.deployview.javamodel.IDeployView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_deployView);
  }

  public __V_7_aE_DevOpsDeploymentView setDeployView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.deployview.javamodel.IDeployView deployView) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_deployView, deployView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public __V_7_aE_DevOpsDeploymentView setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IMonitorView selectMonitorView() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IMonitorView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_monitorView);
  }

  public __V_7_aE_DevOpsDeploymentView setMonitorView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IMonitorView monitorView) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_monitorView, monitorView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.devops.spec.operate.javamodel.IOperate> selectOperates() {
    return _getList(cleon.architecturemethods.arc42.spec.devops.spec.operate.javamodel.IOperate.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates);
  }

  public __V_7_aE_DevOpsDeploymentView setOperates(java.util.List<? extends cleon.architecturemethods.arc42.spec.devops.spec.operate.javamodel.IOperate> operates) {
    _setList(cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates, operates);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IPackageView selectPackageView() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IPackageView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_packageView);
  }

  public __V_7_aE_DevOpsDeploymentView setPackageView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IPackageView packageView) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_packageView, packageView);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IRelease selectRelease() {
    return _getSingle(cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IRelease.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release);
  }

  public __V_7_aE_DevOpsDeploymentView setRelease(cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IRelease release) {
    _setSingle(cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release, release);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.devops.spec.test.javamodel.ITest> selectTest() {
    return _getList(cleon.architecturemethods.arc42.spec.devops.spec.test.javamodel.ITest.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test);
  }

  public __V_7_aE_DevOpsDeploymentView setTest(java.util.List<? extends cleon.architecturemethods.arc42.spec.devops.spec.test.javamodel.ITest> test) {
    _setList(cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test, test);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.ITestView selectTestView() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.ITestView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_testView);
  }

  public __V_7_aE_DevOpsDeploymentView setTestView(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.ITestView testView) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_testView, testView);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_7_aE_DevOpsDeploymentView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.arc42.spec.devops.spec.build.javamodel.IBuild.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IBuildView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_buildView, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICode.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.devops.spec.deploy.javamodel.IDeploy.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.deployview.javamodel.IDeployView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_deployView, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IMonitorView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_monitorView, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.devops.spec.operate.javamodel.IOperate.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IPackageView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_packageView, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IRelease.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.devops.spec.test.javamodel.ITest.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.ITestView.class, cleon.architecturemethods.arc42.spec.arc42._07_deployment_view._07_deployment_viewPackage.__V_7_aE_DeploymentView_testView, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView selectToMeCode(cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView selectToMeBuild(cleon.architecturemethods.arc42.spec.devops.spec.build.javamodel.IBuild object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView> selectToMeTest(cleon.architecturemethods.arc42.spec.devops.spec.test.javamodel.ITest object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView selectToMeRelease(cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IRelease object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView> selectToMeDeploy(cleon.architecturemethods.arc42.spec.devops.spec.deploy.javamodel.IDeploy object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView> selectToMeOperates(cleon.architecturemethods.arc42.spec.devops.spec.operate.javamodel.IOperate object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.spec.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.architecturemethods.arc42.spec.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a574eba1-41b4-11e5-a2b3-edc7f3343844,TZ1wgUhLWRnD5DrjnDdDC+7MNlI=] */
