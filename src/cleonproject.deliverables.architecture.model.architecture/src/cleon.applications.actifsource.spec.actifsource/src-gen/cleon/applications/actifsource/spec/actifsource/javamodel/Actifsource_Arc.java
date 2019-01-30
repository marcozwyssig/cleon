package cleon.applications.actifsource.spec.actifsource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Actifsource_Arc extends DynamicResource implements IActifsource_Arc {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActifsource_Arc> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActifsource_Arc>() {
    
    @Override
    public IActifsource_Arc create() {
      return new Actifsource_Arc();
    }
    
    @Override
    public IActifsource_Arc create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Actifsource_Arc(resourceRepository, resource);
    }
  
  };

  public Actifsource_Arc() {
    super(IActifsource_Arc.TYPE_ID);
  }
  
  public Actifsource_Arc(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActifsource_Arc.TYPE_ID);
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
  public cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals select__V_1_aE_introduction_aE_and_aE_goals() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals);
  }

  public Actifsource_Arc set__V_1_aE_introduction_aE_and_aE_goals(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals __V_1_aE_introduction_aE_and_aE_goals) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals, __V_1_aE_introduction_aE_and_aE_goals);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IArchitecture_Constraints select__V_2_aE_architecture_aE_constraints() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IArchitecture_Constraints.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints);
  }

  public Actifsource_Arc set__V_2_aE_architecture_aE_constraints(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IArchitecture_Constraints __V_2_aE_architecture_aE_constraints) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints, __V_2_aE_architecture_aE_constraints);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context select__V_3_aE_system_aE_scope_aE_and_aE_context() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context);
  }

  public Actifsource_Arc set__V_3_aE_system_aE_scope_aE_and_aE_context(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context __V_3_aE_system_aE_scope_aE_and_aE_context) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context, __V_3_aE_system_aE_scope_aE_and_aE_context);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.ISolution_Strategy select__V_4_aE_solution_aE_strategy() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.ISolution_Strategy.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_4_aE_solution_aE_strategy);
  }

  public Actifsource_Arc set__V_4_aE_solution_aE_strategy(cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.ISolution_Strategy __V_4_aE_solution_aE_strategy) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_4_aE_solution_aE_strategy, __V_4_aE_solution_aE_strategy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView select__V_5_aE_buildingblockview() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview);
  }

  public Actifsource_Arc set__V_5_aE_buildingblockview(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView __V_5_aE_buildingblockview) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview, __V_5_aE_buildingblockview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView select__V_7_aE_deploymentview() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview);
  }

  public Actifsource_Arc set__V_7_aE_deploymentview(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView __V_7_aE_deploymentview) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview, __V_7_aE_deploymentview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.IConcepts select__V_8_aE_concepts() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.IConcepts.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_8_aE_concepts);
  }

  public Actifsource_Arc set__V_8_aE_concepts(cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.IConcepts __V_8_aE_concepts) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_8_aE_concepts, __V_8_aE_concepts);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDesignDecision select__V_9_aE_designdecision() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDesignDecision.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_9_aE_designdecision);
  }

  public Actifsource_Arc set__V_9_aE_designdecision(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDesignDecision __V_9_aE_designdecision) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_9_aE_designdecision, __V_9_aE_designdecision);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.IQuality_Scenarios select__W_0_aE_quality_aE_scenarios() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.IQuality_Scenarios.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_0_aE_quality_aE_scenarios);
  }

  public Actifsource_Arc set__W_0_aE_quality_aE_scenarios(cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.IQuality_Scenarios __W_0_aE_quality_aE_scenarios) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_0_aE_quality_aE_scenarios, __W_0_aE_quality_aE_scenarios);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.ITechnical_Risks select__W_1_aE_technical_aE_risks() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.ITechnical_Risks.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_1_aE_technical_aE_risks);
  }

  public Actifsource_Arc set__W_1_aE_technical_aE_risks(cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.ITechnical_Risks __W_1_aE_technical_aE_risks) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_1_aE_technical_aE_risks, __W_1_aE_technical_aE_risks);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductView select__W_2_aE_productview() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_2_aE_productview);
  }

  public Actifsource_Arc set__W_2_aE_productview(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductView __W_2_aE_productview) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_2_aE_productview, __W_2_aE_productview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IArc42RequirementCoverages select__W_3_aE_requirements_aE_coverage() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IArc42RequirementCoverages.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_3_aE_requirements_aE_coverage);
  }

  public Actifsource_Arc set__W_3_aE_requirements_aE_coverage(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IArc42RequirementCoverages __W_3_aE_requirements_aE_coverage) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_3_aE_requirements_aE_coverage, __W_3_aE_requirements_aE_coverage);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout selectAbout() {
    return _getSingle(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout.class, cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about);
  }

  public Actifsource_Arc setAbout(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public Actifsource_Arc setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Actifsource_Arc setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.renderlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.spec.doc.renderlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage);
  }

  public Actifsource_Arc setDocumentLanguage(java.util.List<? extends cleon.common.doc.spec.doc.renderlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.common.glossary.spec.glossary.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary);
  }

  public Actifsource_Arc setGlossary(cleon.common.glossary.spec.glossary.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Actifsource_Arc setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public Actifsource_Arc setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public Actifsource_Arc setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Actifsource_Arc setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IArchitecture_Constraints.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.ISolution_Strategy.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_4_aE_solution_aE_strategy, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.IConcepts.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_8_aE_concepts, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDesignDecision.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_9_aE_designdecision, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.IQuality_Scenarios.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_0_aE_quality_aE_scenarios, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.ITechnical_Risks.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_1_aE_technical_aE_risks, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_2_aE_productview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IArc42RequirementCoverages.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_3_aE_requirements_aE_coverage, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout.class, cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.renderlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d16b593e-ce8a-11e5-b193-7398541c035e,zlfAefJ5vxNgdYm2u76sngInnmo=] */
