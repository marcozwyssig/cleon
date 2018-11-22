package cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_5_aE_SolutionBuildingBlockView extends DynamicResource implements I__V_5_aE_SolutionBuildingBlockView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_5_aE_SolutionBuildingBlockView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_5_aE_SolutionBuildingBlockView>() {
    
    @Override
    public I__V_5_aE_SolutionBuildingBlockView create() {
      return new __V_5_aE_SolutionBuildingBlockView();
    }
    
    @Override
    public I__V_5_aE_SolutionBuildingBlockView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_5_aE_SolutionBuildingBlockView(resourceRepository, resource);
    }
  
  };

  public __V_5_aE_SolutionBuildingBlockView() {
    super(I__V_5_aE_SolutionBuildingBlockView.TYPE_ID);
  }
  
  public __V_5_aE_SolutionBuildingBlockView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_5_aE_SolutionBuildingBlockView.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public __V_5_aE_SolutionBuildingBlockView setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_1() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1);
  }

  public __V_5_aE_SolutionBuildingBlockView setLevel_1(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> level_1) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1, level_1);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_2() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2);
  }

  public __V_5_aE_SolutionBuildingBlockView setLevel_2(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> level_2) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2, level_2);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_3() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3);
  }

  public __V_5_aE_SolutionBuildingBlockView setLevel_3(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> level_3) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3, level_3);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_4() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4);
  }

  public __V_5_aE_SolutionBuildingBlockView setLevel_4(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> level_4) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4, level_4);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_5() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5);
  }

  public __V_5_aE_SolutionBuildingBlockView setLevel_5(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> level_5) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5, level_5);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_5_aE_SolutionBuildingBlockView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bef90829-2d6f-11e6-959f-d1cef44ff5fd,w2Kg5QpuNsEAf9VDZOn/lqstGak=] */
