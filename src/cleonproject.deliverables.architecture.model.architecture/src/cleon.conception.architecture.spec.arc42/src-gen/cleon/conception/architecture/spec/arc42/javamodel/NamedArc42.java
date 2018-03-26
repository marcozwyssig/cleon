package cleon.conception.architecture.spec.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedArc42 extends DynamicResource implements INamedArc42 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedArc42> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedArc42>() {
    
    @Override
    public INamedArc42 create() {
      return new NamedArc42();
    }
    
    @Override
    public INamedArc42 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedArc42(resourceRepository, resource);
    }
  
  };

  public NamedArc42() {
    super(INamedArc42.TYPE_ID);
  }
  
  public NamedArc42(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedArc42.TYPE_ID);
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
  public cleon.conception.architecture.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals select__V_1_aE_introduction_aE_and_aE_goals() {
    return _getSingle(cleon.conception.architecture.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals.class, cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals);
  }

  public NamedArc42 set__V_1_aE_introduction_aE_and_aE_goals(cleon.conception.architecture.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals __V_1_aE_introduction_aE_and_aE_goals) {
    _setSingle(cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals, __V_1_aE_introduction_aE_and_aE_goals);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42._02_architecture_constraints.javamodel.I__V_2_aE_Architecture_aE_Constraints select__V_2_aE_architecture_aE_constraints() {
    return _getSingle(cleon.conception.architecture.spec.arc42._02_architecture_constraints.javamodel.I__V_2_aE_Architecture_aE_Constraints.class, cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints);
  }

  public NamedArc42 set__V_2_aE_architecture_aE_constraints(cleon.conception.architecture.spec.arc42._02_architecture_constraints.javamodel.I__V_2_aE_Architecture_aE_Constraints __V_2_aE_architecture_aE_constraints) {
    _setSingle(cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints, __V_2_aE_architecture_aE_constraints);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context select__V_3_aE_system_aE_scope_aE_and_aE_context() {
    return _getSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context);
  }

  public NamedArc42 set__V_3_aE_system_aE_scope_aE_and_aE_context(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context __V_3_aE_system_aE_scope_aE_and_aE_context) {
    _setSingle(cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context, __V_3_aE_system_aE_scope_aE_and_aE_context);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.arc42._05_buildingblock_view.javamodel.I__V_5_aE_BuildingBlockView> select__V_5_aE_buildingblockview() {
    return _getList(cleon.conception.architecture.spec.arc42._05_buildingblock_view.javamodel.I__V_5_aE_BuildingBlockView.class, cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview);
  }

  public NamedArc42 set__V_5_aE_buildingblockview(java.util.List<? extends cleon.conception.architecture.spec.arc42._05_buildingblock_view.javamodel.I__V_5_aE_BuildingBlockView> __V_5_aE_buildingblockview) {
    _setList(cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview, __V_5_aE_buildingblockview);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView select__V_7_aE_deploymentview() {
    return _getSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview);
  }

  public NamedArc42 set__V_7_aE_deploymentview(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView __V_7_aE_deploymentview) {
    _setSingle(cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview, __V_7_aE_deploymentview);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public NamedArc42 setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.glossary.spec.glossary.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary);
  }

  public NamedArc42 setGlossary(cleon.common.glossary.spec.glossary.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public NamedArc42 setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public NamedArc42 setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedArc42 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.architecture.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals.class, cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals, visitor);
    _acceptSingle(cleon.conception.architecture.spec.arc42._02_architecture_constraints.javamodel.I__V_2_aE_Architecture_aE_Constraints.class, cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints, visitor);
    _acceptSingle(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context, visitor);
    _acceptList(cleon.conception.architecture.spec.arc42._05_buildingblock_view.javamodel.I__V_5_aE_BuildingBlockView.class, cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview, visitor);
    _acceptSingle(cleon.conception.architecture.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView.class, cleon.conception.architecture.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,58270d36-45a6-11e5-be7f-05f703299ead,a5i1/yoUkaUTfScZ39C32EDDPEo=] */
