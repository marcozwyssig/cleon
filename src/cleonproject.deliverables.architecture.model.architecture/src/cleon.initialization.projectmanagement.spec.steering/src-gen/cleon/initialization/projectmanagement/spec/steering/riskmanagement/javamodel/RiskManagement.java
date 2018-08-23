package cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RiskManagement extends DynamicResource implements IRiskManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRiskManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRiskManagement>() {
    
    @Override
    public IRiskManagement create() {
      return new RiskManagement();
    }
    
    @Override
    public IRiskManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RiskManagement(resourceRepository, resource);
    }
  
  };

  public RiskManagement() {
    super(IRiskManagement.TYPE_ID);
  }
  
  public RiskManagement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRiskManagement.TYPE_ID);
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

  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.javamodel.IAssessments> selectAssessments() {
    return _getList(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.javamodel.IAssessments.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_assessments);
  }

  public RiskManagement setAssessments(java.util.List<? extends cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.javamodel.IAssessments> assessments) {
    _setList(cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_assessments, assessments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public RiskManagement setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public RiskManagement setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification selectRiskClassification() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_riskClassification);
  }

  public RiskManagement setRiskClassification(cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification riskClassification) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_riskClassification, riskClassification);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisks selectRisks() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisks.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_risks);
  }

  public RiskManagement setRisks(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisks risks) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_risks, risks);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public RiskManagement setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RiskManagement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.javamodel.IAssessments.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_assessments, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_riskClassification, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisks.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_risks, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskManagement selectToMeRiskClassification(cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskManagement.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_riskClassification, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskManagement selectToMeRisks(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisks object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskManagement.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_risks, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskManagement selectToMeAssessments(cleon.initialization.projectmanagement.spec.steering.riskmanagement.assessments.javamodel.IAssessments object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskManagement.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.RiskmanagementPackage.RiskManagement_assessments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,be6ee992-3249-11e6-ab4d-73a9260c8088,Gr3LlAVNq3yyxAvkDTQneEZ9bGw=] */
