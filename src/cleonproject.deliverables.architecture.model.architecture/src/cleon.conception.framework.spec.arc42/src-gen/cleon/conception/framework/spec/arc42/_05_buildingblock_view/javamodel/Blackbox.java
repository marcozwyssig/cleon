package cleon.conception.framework.spec.arc42._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Blackbox extends DynamicResource implements IBlackbox {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBlackbox> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBlackbox>() {
    
    @Override
    public IBlackbox create() {
      return new Blackbox();
    }
    
    @Override
    public IBlackbox create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Blackbox(resourceRepository, resource);
    }
  
  };

  public Blackbox() {
    super(IBlackbox.TYPE_ID);
  }
  
  public Blackbox(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBlackbox.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IBuildingBlock selectBuildingblock() {
    return _getSingle(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.framework.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Blackbox_buildingblock);
  }

  public Blackbox setBuildingblock(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IBuildingBlock buildingblock) {
    _setSingle(cleon.conception.framework.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Blackbox_buildingblock, buildingblock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Blackbox setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Blackbox setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.framework.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Blackbox_buildingblock, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.framework.spec.arc42._05_buildingblock_view.javamodel.IBlackbox> selectToMeBuildingblock(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.conception.framework.spec.arc42._05_buildingblock_view.javamodel.IBlackbox.class, cleon.conception.framework.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.Blackbox_buildingblock, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d58842b6-2858-11e8-9af4-b7d7a3bbddc1,ZPh5fvBOvnOM2Oeq24QOAVzth/I=] */
