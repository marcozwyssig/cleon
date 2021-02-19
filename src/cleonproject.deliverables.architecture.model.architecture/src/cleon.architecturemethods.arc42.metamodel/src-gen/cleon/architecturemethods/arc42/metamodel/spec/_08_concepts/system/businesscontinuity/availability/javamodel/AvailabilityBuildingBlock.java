package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AvailabilityBuildingBlock extends DynamicResource implements IAvailabilityBuildingBlock {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailabilityBuildingBlock> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailabilityBuildingBlock>() {
    
    @Override
    public IAvailabilityBuildingBlock create() {
      return new AvailabilityBuildingBlock();
    }
    
    @Override
    public IAvailabilityBuildingBlock create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AvailabilityBuildingBlock(resourceRepository, resource);
    }
  
  };

  public AvailabilityBuildingBlock() {
    super(IAvailabilityBuildingBlock.TYPE_ID);
  }
  
  public AvailabilityBuildingBlock(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAvailabilityBuildingBlock.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityConfiguration selectAvailability() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityBuildingBlock_availability);
  }

  public AvailabilityBuildingBlock setAvailability(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityConfiguration availability) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityBuildingBlock_availability, availability);
    return this;
  }
    
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectAvailabilityBuildingBlock() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityBuildingBlock_availabilityBuildingBlock);
  }

  public AvailabilityBuildingBlock setAvailabilityBuildingBlock(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock availabilityBuildingBlock) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityBuildingBlock_availabilityBuildingBlock, availabilityBuildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AvailabilityBuildingBlock setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AvailabilityBuildingBlock setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityBuildingBlock_availability, visitor);
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityBuildingBlock_availabilityBuildingBlock, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityBuildingBlock selectToMeAvailabilityBuildingBlock(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityBuildingBlock_availabilityBuildingBlock, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityBuildingBlock> selectToMeAvailability(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityBuildingBlock_availability, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,68803d0a-1e37-11e9-865e-41ef48a95f70,HuVEqXHMzT+Qlur/jcx5yMwgQzg=] */
