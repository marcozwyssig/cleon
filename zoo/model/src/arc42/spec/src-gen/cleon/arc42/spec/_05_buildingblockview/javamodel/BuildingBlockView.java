package cleon.arc42.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BuildingBlockView extends DynamicResource implements IBuildingBlockView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingBlockView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingBlockView>() {
    
    @Override
    public IBuildingBlockView create() {
      return new BuildingBlockView();
    }
    
    @Override
    public IBuildingBlockView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BuildingBlockView(resourceRepository, resource);
    }
  
  };

  public BuildingBlockView() {
    super(IBuildingBlockView.TYPE_ID);
  }
  
  public BuildingBlockView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBuildingBlockView.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> selectBuildingBlocks() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlockView_buildingBlocks);
  }

  public BuildingBlockView setBuildingBlocks(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> buildingBlocks) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlockView_buildingBlocks, buildingBlocks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public BuildingBlockView setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public BuildingBlockView setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BuildingBlockView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlockView_buildingBlocks, visitor);
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlockView selectToMeBuildingBlocks(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlockView.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlockView_buildingBlocks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,37b55799-ffcc-11e4-ac0a-959b440f987f,ZHUnyhz4la7ObgaeKUdJdaA74cg=] */
