package cleon.conception.architecture.spec.eamod.chrv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementsManagement extends DynamicResource implements IRequirementsManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementsManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementsManagement>() {
    
    @Override
    public IRequirementsManagement create() {
      return new RequirementsManagement();
    }
    
    @Override
    public IRequirementsManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementsManagement(resourceRepository, resource);
    }
  
  };

  public RequirementsManagement() {
    super(IRequirementsManagement.TYPE_ID);
  }
  
  public RequirementsManagement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementsManagement.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
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
  public cleon.conception.architecture.spec.eamod.chrv.distinction.javamodel.IDistinctions selectDestinctions() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.distinction.javamodel.IDistinctions.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_destinctions);
  }

  public RequirementsManagement setDestinctions(cleon.conception.architecture.spec.eamod.chrv.distinction.javamodel.IDistinctions destinctions) {
    _setSingle(cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_destinctions, destinctions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public RequirementsManagement setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.glossary.spec.glossary.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary);
  }

  public RequirementsManagement setGlossary(cleon.common.glossary.spec.glossary.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.introduction.javamodel.IIntroduction selectIntroduction() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.introduction.javamodel.IIntroduction.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_introduction);
  }

  public RequirementsManagement setIntroduction(cleon.conception.architecture.spec.eamod.chrv.introduction.javamodel.IIntroduction introduction) {
    _setSingle(cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_introduction, introduction);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssues selectIssues() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssues.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_issues);
  }

  public RequirementsManagement setIssues(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssues issues) {
    _setSingle(cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_issues, issues);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.motivation.javamodel.IMotivation selectMotivation() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.motivation.javamodel.IMotivation.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_motivation);
  }

  public RequirementsManagement setMotivation(cleon.conception.architecture.spec.eamod.chrv.motivation.javamodel.IMotivation motivation) {
    _setSingle(cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_motivation, motivation);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public RequirementsManagement setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea selectRequirements() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_requirements);
  }

  public RequirementsManagement setRequirements(cleon.conception.architecture.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea requirements) {
    _setSingle(cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_requirements, requirements);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public RequirementsManagement setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementsManagement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.distinction.javamodel.IDistinctions.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_destinctions, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.introduction.javamodel.IIntroduction.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_introduction, visitor);
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssues.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_issues, visitor);
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.motivation.javamodel.IMotivation.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_motivation, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_requirements, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementsManagement selectToMeIntroduction(cleon.conception.architecture.spec.eamod.chrv.introduction.javamodel.IIntroduction object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementsManagement.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_introduction, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementsManagement selectToMeMotivation(cleon.conception.architecture.spec.eamod.chrv.motivation.javamodel.IMotivation object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementsManagement.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_motivation, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementsManagement selectToMeRequirements(cleon.conception.architecture.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementsManagement.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_requirements, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementsManagement selectToMeDestinctions(cleon.conception.architecture.spec.eamod.chrv.distinction.javamodel.IDistinctions object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementsManagement.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_destinctions, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementsManagement selectToMeIssues(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssues object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementsManagement.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.RequirementsManagement_issues, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4bcb71bd-a950-11e5-bda2-a7fc3bd7c783,9NG+2YMLB1WTM3S5skP37WZJyPE=] */
