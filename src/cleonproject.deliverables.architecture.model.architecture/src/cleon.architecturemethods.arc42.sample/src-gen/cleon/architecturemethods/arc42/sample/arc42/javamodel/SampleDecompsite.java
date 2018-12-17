package cleon.architecturemethods.arc42.sample.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SampleDecompsite extends DynamicResource implements ISampleDecompsite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISampleDecompsite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISampleDecompsite>() {
    
    @Override
    public ISampleDecompsite create() {
      return new SampleDecompsite();
    }
    
    @Override
    public ISampleDecompsite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SampleDecompsite(resourceRepository, resource);
    }
  
  };

  public SampleDecompsite() {
    super(ISampleDecompsite.TYPE_ID);
  }
  
  public SampleDecompsite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISampleDecompsite.TYPE_ID);
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
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public SampleDecompsite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public SampleDecompsite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleBuildingBlock selectIntoSample() {
    return _getSingle(cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleBuildingBlock.class, cleon.architecturemethods.arc42.sample.arc42.Arc42Package.SampleDecompsite_intoSample);
  }

  public SampleDecompsite setIntoSample(cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleBuildingBlock intoSample) {
    _setSingle(cleon.architecturemethods.arc42.sample.arc42.Arc42Package.SampleDecompsite_intoSample, intoSample);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SampleDecompsite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleBuildingBlock.class, cleon.architecturemethods.arc42.sample.arc42.Arc42Package.SampleDecompsite_intoSample, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleDecompsite selectToMeIntoSample(cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.sample.arc42.javamodel.ISampleDecompsite.class, cleon.architecturemethods.arc42.sample.arc42.Arc42Package.SampleDecompsite_intoSample, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dd37274c-4376-11e6-a9d7-97cf4f7c398b,rf/akQ5RtEKx09u2rWVa7GZMDQU=] */
