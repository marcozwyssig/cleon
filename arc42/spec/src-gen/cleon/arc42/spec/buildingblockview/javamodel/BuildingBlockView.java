package cleon.arc42.spec.buildingblockview.javamodel;

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

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock> selectBuildingBlocks() {
    return _getList(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.BuildingBlockView_buildingBlocks);
  }

  public BuildingBlockView setBuildingBlocks(java.util.List<? extends cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock> buildingBlocks) {
    _setList(cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.BuildingBlockView_buildingBlocks, buildingBlocks);
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.BuildingBlockView_buildingBlocks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlockView> selectToMeBuildingBlocks(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlockView.class, cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.BuildingBlockView_buildingBlocks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,37b55799-ffcc-11e4-ac0a-959b440f987f,ZEv7iVik/0HRwFutSXLTHgxpmO4=] */
