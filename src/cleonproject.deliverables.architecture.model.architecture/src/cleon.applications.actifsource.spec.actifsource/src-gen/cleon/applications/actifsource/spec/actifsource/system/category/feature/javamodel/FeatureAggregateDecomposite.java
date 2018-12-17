package cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FeatureAggregateDecomposite extends DynamicResource implements IFeatureAggregateDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeatureAggregateDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeatureAggregateDecomposite>() {
    
    @Override
    public IFeatureAggregateDecomposite create() {
      return new FeatureAggregateDecomposite();
    }
    
    @Override
    public IFeatureAggregateDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FeatureAggregateDecomposite(resourceRepository, resource);
    }
  
  };

  public FeatureAggregateDecomposite() {
    super(IFeatureAggregateDecomposite.TYPE_ID);
  }
  
  public FeatureAggregateDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFeatureAggregateDecomposite.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectPurpose() {
    return _getListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose);
  }
    
  public void setPurpose(java.util.List<java.lang.String> purpose) {
     _setListAttribute(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, purpose);
  }

  // relations
  
  @Override
  public cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeature selectInto() {
    return _getSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeature.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.FeaturePackage.FeatureAggregateDecomposite_into);
  }

  public FeatureAggregateDecomposite setInto(cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeature into) {
    _setSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.FeaturePackage.FeatureAggregateDecomposite_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public FeatureAggregateDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public FeatureAggregateDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FeatureAggregateDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeature.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.FeaturePackage.FeatureAggregateDecomposite_into, visitor);
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeatureAggregateDecomposite selectToMeInto(cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeature object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeatureAggregateDecomposite.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.FeaturePackage.FeatureAggregateDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8d2a9526-f986-11e5-a7fd-010f93305101,lfXSGlUhQNgnEJWJ4k1kwfJ2RAQ=] */
