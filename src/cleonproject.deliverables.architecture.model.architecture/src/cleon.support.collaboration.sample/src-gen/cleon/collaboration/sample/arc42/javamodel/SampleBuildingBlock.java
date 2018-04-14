package cleon.collaboration.sample.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SampleBuildingBlock extends DynamicResource implements ISampleBuildingBlock {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISampleBuildingBlock> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISampleBuildingBlock>() {
    
    @Override
    public ISampleBuildingBlock create() {
      return new SampleBuildingBlock();
    }
    
    @Override
    public ISampleBuildingBlock create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SampleBuildingBlock(resourceRepository, resource);
    }
  
  };

  public SampleBuildingBlock() {
    super(ISampleBuildingBlock.TYPE_ID);
  }
  
  public SampleBuildingBlock(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISampleBuildingBlock.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.collaboration.sample.arc42.Arc42Package.SampleBuildingBlock_decompose);
  }

  public SampleBuildingBlock setDecompose(java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.collaboration.sample.arc42.Arc42Package.SampleBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.collaboration.sample.arc42.javamodel.ISampleDependency> selectHasDependency() {
    return _getList(cleon.collaboration.sample.arc42.javamodel.ISampleDependency.class, cleon.collaboration.sample.arc42.Arc42Package.SampleBuildingBlock_hasDependency);
  }

  public SampleBuildingBlock setHasDependency(java.util.List<? extends cleon.collaboration.sample.arc42.javamodel.ISampleDependency> hasDependency) {
    _setList(cleon.collaboration.sample.arc42.Arc42Package.SampleBuildingBlock_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SampleBuildingBlock setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.collaboration.sample.arc42.Arc42Package.SampleBuildingBlock_decompose, visitor);
    _acceptList(cleon.collaboration.sample.arc42.javamodel.ISampleDependency.class, cleon.collaboration.sample.arc42.Arc42Package.SampleBuildingBlock_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.collaboration.sample.arc42.javamodel.ISampleBuildingBlock selectToMeDecompose(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.collaboration.sample.arc42.javamodel.ISampleBuildingBlock.class, cleon.collaboration.sample.arc42.Arc42Package.SampleBuildingBlock_decompose, object.getResource());
  }
  
  public static cleon.collaboration.sample.arc42.javamodel.ISampleBuildingBlock selectToMeHasDependency(cleon.collaboration.sample.arc42.javamodel.ISampleDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.collaboration.sample.arc42.javamodel.ISampleBuildingBlock.class, cleon.collaboration.sample.arc42.Arc42Package.SampleBuildingBlock_hasDependency, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a19c100c-4376-11e6-a9d7-97cf4f7c398b,b+ZB/Gx+gICxBBoqQltsfeu9itY=] */
