package cleon.deployment.devops.spec.javamodel;

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
  public cleon.deployment.devops.spec.build.javamodel.IBuild selectBuild() {
    return _getSingle(cleon.deployment.devops.spec.build.javamodel.IBuild.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build);
  }

  public __V_7_aE_DevOpsDeploymentView setBuild(cleon.deployment.devops.spec.build.javamodel.IBuild build) {
    _setSingle(cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build, build);
    return this;
  }
    
  @Override
  public cleon.deployment.devops.spec.code.javamodel.ICode selectCode() {
    return _getSingle(cleon.deployment.devops.spec.code.javamodel.ICode.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code);
  }

  public __V_7_aE_DevOpsDeploymentView setCode(cleon.deployment.devops.spec.code.javamodel.ICode code) {
    _setSingle(cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code, code);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.deployment.devops.spec.deploy.javamodel.IDeploy> selectDeploy() {
    return _getList(cleon.deployment.devops.spec.deploy.javamodel.IDeploy.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy);
  }

  public __V_7_aE_DevOpsDeploymentView setDeploy(java.util.List<? extends cleon.deployment.devops.spec.deploy.javamodel.IDeploy> deploy) {
    _setList(cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy, deploy);
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
  public java.util.List<? extends cleon.deployment.devops.spec.operate.javamodel.IOperate> selectOperates() {
    return _getList(cleon.deployment.devops.spec.operate.javamodel.IOperate.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates);
  }

  public __V_7_aE_DevOpsDeploymentView setOperates(java.util.List<? extends cleon.deployment.devops.spec.operate.javamodel.IOperate> operates) {
    _setList(cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates, operates);
    return this;
  }
    
  @Override
  public cleon.deployment.devops.spec.release.javamodel.IRelease selectRelease() {
    return _getSingle(cleon.deployment.devops.spec.release.javamodel.IRelease.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release);
  }

  public __V_7_aE_DevOpsDeploymentView setRelease(cleon.deployment.devops.spec.release.javamodel.IRelease release) {
    _setSingle(cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release, release);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.deployment.devops.spec.test.javamodel.ITest> selectTest() {
    return _getList(cleon.deployment.devops.spec.test.javamodel.ITest.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test);
  }

  public __V_7_aE_DevOpsDeploymentView setTest(java.util.List<? extends cleon.deployment.devops.spec.test.javamodel.ITest> test) {
    _setList(cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test, test);
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
    _acceptSingle(cleon.deployment.devops.spec.build.javamodel.IBuild.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build, visitor);
    _acceptSingle(cleon.deployment.devops.spec.code.javamodel.ICode.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code, visitor);
    _acceptList(cleon.deployment.devops.spec.deploy.javamodel.IDeploy.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.deployment.devops.spec.operate.javamodel.IOperate.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates, visitor);
    _acceptSingle(cleon.deployment.devops.spec.release.javamodel.IRelease.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release, visitor);
    _acceptList(cleon.deployment.devops.spec.test.javamodel.ITest.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView selectToMeCode(cleon.deployment.devops.spec.code.javamodel.ICode object) {
    return _getToMeSingle(object.getRepository(), cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_code, object.getResource());
  }
  
  public static cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView selectToMeBuild(cleon.deployment.devops.spec.build.javamodel.IBuild object) {
    return _getToMeSingle(object.getRepository(), cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_build, object.getResource());
  }
  
  public static java.util.List<cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView> selectToMeTest(cleon.deployment.devops.spec.test.javamodel.ITest object) {
    return _getToMeList(object.getRepository(), cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_test, object.getResource());
  }
  
  public static cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView selectToMeRelease(cleon.deployment.devops.spec.release.javamodel.IRelease object) {
    return _getToMeSingle(object.getRepository(), cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_release, object.getResource());
  }
  
  public static java.util.List<cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView> selectToMeDeploy(cleon.deployment.devops.spec.deploy.javamodel.IDeploy object) {
    return _getToMeList(object.getRepository(), cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_deploy, object.getResource());
  }
  
  public static java.util.List<cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView> selectToMeOperates(cleon.deployment.devops.spec.operate.javamodel.IOperate object) {
    return _getToMeList(object.getRepository(), cleon.deployment.devops.spec.javamodel.I__V_7_aE_DevOpsDeploymentView.class, cleon.deployment.devops.spec.SpecPackage.__V_7_aE_DevOpsDeploymentView_operates, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a574eba1-41b4-11e5-a2b3-edc7f3343844,VjPQ08mb9da9w9uLCLxhzRmPRj4=] */
