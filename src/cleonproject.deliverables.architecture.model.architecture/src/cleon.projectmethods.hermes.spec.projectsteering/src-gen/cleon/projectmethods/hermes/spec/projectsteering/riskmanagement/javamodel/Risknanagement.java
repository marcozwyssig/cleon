package cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Risknanagement extends DynamicResource implements IRisknanagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRisknanagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRisknanagement>() {
    
    @Override
    public IRisknanagement create() {
      return new Risknanagement();
    }
    
    @Override
    public IRisknanagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Risknanagement(resourceRepository, resource);
    }
  
  };

  public Risknanagement() {
    super(IRisknanagement.TYPE_ID);
  }
  
  public Risknanagement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRisknanagement.TYPE_ID);
  }

  // attributes
  
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
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessments> selectAssessments() {
    return _getList(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessments.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_assessments);
  }

  public Risknanagement setAssessments(java.util.List<? extends cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessments> assessments) {
    _setList(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_assessments, assessments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public Risknanagement setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Risknanagement setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public Risknanagement setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRiskClassification selectRiskClassification() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRiskClassification.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_riskClassification);
  }

  public Risknanagement setRiskClassification(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRiskClassification riskClassification) {
    _setSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_riskClassification, riskClassification);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisks selectRisks() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisks.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_risks);
  }

  public Risknanagement setRisks(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisks risks) {
    _setSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_risks, risks);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public Risknanagement setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Risknanagement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessments.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_assessments, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRiskClassification.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_riskClassification, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisks.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_risks, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRisknanagement selectToMeRiskClassification(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRiskClassification object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRisknanagement.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_riskClassification, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRisknanagement selectToMeRisks(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel.IRisks object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRisknanagement.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_risks, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRisknanagement selectToMeAssessments(cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessments object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.javamodel.IRisknanagement.class, cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.RiskmanagementPackage.Risknanagement_assessments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,be6ee992-3249-11e6-ab4d-73a9260c8088,ic2HawzfI8Fflxj0ChGeZZtnw6c=] */
