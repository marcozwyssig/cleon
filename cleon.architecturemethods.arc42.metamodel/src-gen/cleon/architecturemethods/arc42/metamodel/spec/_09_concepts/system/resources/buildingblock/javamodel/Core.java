package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Core extends DynamicResource implements ICore {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICore> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICore>() {
    
    @Override
    public ICore create() {
      return new Core();
    }
    
    @Override
    public ICore create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Core(resourceRepository, resource);
    }
  
  };

  public Core() {
    super(ICore.TYPE_ID);
  }
  
  public Core(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICore.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectAmount() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.Processor_amount);
  }
    
  public void setAmount(java.lang.Integer amount) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.Processor_amount, amount);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Core setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept> selectUsedIn() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.Core_usedIn);
  }

  public Core setUsedIn(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept> usedIn) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.Core_usedIn, usedIn);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.Processor_amount, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.Core_usedIn, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore> selectToMeUsedIn(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.Core_usedIn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,139f456b-2b00-11e9-9692-65766bc2daa5,QwwohiyGMZJea/QxIk+1+tAVNC8=] */
