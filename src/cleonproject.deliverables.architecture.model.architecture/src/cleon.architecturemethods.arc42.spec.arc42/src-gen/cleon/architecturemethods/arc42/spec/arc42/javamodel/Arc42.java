package cleon.architecturemethods.arc42.spec.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Arc42 extends DynamicResource implements IArc42 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArc42> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArc42>() {
    
    @Override
    public IArc42 create() {
      return new Arc42();
    }
    
    @Override
    public IArc42 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Arc42(resourceRepository, resource);
    }
  
  };

  public Arc42() {
    super(IArc42.TYPE_ID);
  }
  
  public Arc42(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IArc42.TYPE_ID);
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
  public cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals select__V_1_aE_introduction_aE_and_aE_goals() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals);
  }

  public Arc42 set__V_1_aE_introduction_aE_and_aE_goals(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals __V_1_aE_introduction_aE_and_aE_goals) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals, __V_1_aE_introduction_aE_and_aE_goals);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.I__V_2_aE_Architecture_aE_Constraints select__V_2_aE_architecture_aE_constraints() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.I__V_2_aE_Architecture_aE_Constraints.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints);
  }

  public Arc42 set__V_2_aE_architecture_aE_constraints(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.I__V_2_aE_Architecture_aE_Constraints __V_2_aE_architecture_aE_constraints) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints, __V_2_aE_architecture_aE_constraints);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context select__V_3_aE_system_aE_scope_aE_and_aE_context() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context);
  }

  public Arc42 set__V_3_aE_system_aE_scope_aE_and_aE_context(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context __V_3_aE_system_aE_scope_aE_and_aE_context) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context, __V_3_aE_system_aE_scope_aE_and_aE_context);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.I__V_4_aE_Solution_aE_Strategy select__V_4_aE_solutuion_aE_strategy() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.I__V_4_aE_Solution_aE_Strategy.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_4_aE_solutuion_aE_strategy);
  }

  public Arc42 set__V_4_aE_solutuion_aE_strategy(cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.I__V_4_aE_Solution_aE_Strategy __V_4_aE_solutuion_aE_strategy) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_4_aE_solutuion_aE_strategy, __V_4_aE_solutuion_aE_strategy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.I__V_5_aE_BuildingBlockView select__V_5_aE_buildingblockview() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.I__V_5_aE_BuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview);
  }

  public Arc42 set__V_5_aE_buildingblockview(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.I__V_5_aE_BuildingBlockView __V_5_aE_buildingblockview) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview, __V_5_aE_buildingblockview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView select__V_7_aE_deploymentview() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview);
  }

  public Arc42 set__V_7_aE_deploymentview(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView __V_7_aE_deploymentview) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview, __V_7_aE_deploymentview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.I__V_8_aE_Concepts select__V_8_aE_concepts() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.I__V_8_aE_Concepts.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_8_aE_concepts);
  }

  public Arc42 set__V_8_aE_concepts(cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.I__V_8_aE_Concepts __V_8_aE_concepts) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_8_aE_concepts, __V_8_aE_concepts);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.I__V_9_aE_DesignDecision select__V_9_aE_designdecision() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.I__V_9_aE_DesignDecision.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_9_aE_designdecision);
  }

  public Arc42 set__V_9_aE_designdecision(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.I__V_9_aE_DesignDecision __V_9_aE_designdecision) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_9_aE_designdecision, __V_9_aE_designdecision);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.I__W_0_aE_Quality_aE_Scenarios select__W_0_aE_quality_aE_scenarios() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.I__W_0_aE_Quality_aE_Scenarios.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_0_aE_quality_aE_scenarios);
  }

  public Arc42 set__W_0_aE_quality_aE_scenarios(cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.I__W_0_aE_Quality_aE_Scenarios __W_0_aE_quality_aE_scenarios) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_0_aE_quality_aE_scenarios, __W_0_aE_quality_aE_scenarios);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.I__W_1_aE_Technical_aE_Risks select__W_1_aE_technical_aE_risks() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.I__W_1_aE_Technical_aE_Risks.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_1_aE_technical_aE_risks);
  }

  public Arc42 set__W_1_aE_technical_aE_risks(cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.I__W_1_aE_Technical_aE_Risks __W_1_aE_technical_aE_risks) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_1_aE_technical_aE_risks, __W_1_aE_technical_aE_risks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Arc42 setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.glossary.spec.glossary.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary);
  }

  public Arc42 setGlossary(cleon.common.glossary.spec.glossary.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public Arc42 setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public Arc42 setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Arc42 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.I__V_2_aE_Architecture_aE_Constraints.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.I__V_4_aE_Solution_aE_Strategy.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_4_aE_solutuion_aE_strategy, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.I__V_5_aE_BuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.I__V_8_aE_Concepts.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_8_aE_concepts, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.I__V_9_aE_DesignDecision.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_9_aE_designdecision, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.I__W_0_aE_Quality_aE_Scenarios.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_0_aE_quality_aE_scenarios, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.I__W_1_aE_Technical_aE_Risks.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_1_aE_technical_aE_risks, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_1_aE_introduction_aE_and_aE_goals(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_2_aE_architecture_aE_constraints(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.I__V_2_aE_Architecture_aE_Constraints object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_3_aE_system_aE_scope_aE_and_aE_context(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_4_aE_solutuion_aE_strategy(cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.I__V_4_aE_Solution_aE_Strategy object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_4_aE_solutuion_aE_strategy, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_5_aE_buildingblockview(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.I__V_5_aE_BuildingBlockView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_7_aE_deploymentview(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_8_aE_concepts(cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.I__V_8_aE_Concepts object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_8_aE_concepts, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_9_aE_designdecision(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.I__V_9_aE_DesignDecision object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_9_aE_designdecision, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__W_0_aE_quality_aE_scenarios(cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.I__W_0_aE_Quality_aE_Scenarios object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_0_aE_quality_aE_scenarios, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__W_1_aE_technical_aE_risks(cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.I__W_1_aE_Technical_aE_Risks object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_1_aE_technical_aE_risks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2cbcf671-ffcc-11e4-ac0a-959b440f987f,T/fFoUDWWOludKdXdPTBXXSRnCM=] */
