package cleon.architecturemethods.arc42.spec.ddd.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceDecomposition extends DynamicResource implements IServiceDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceDecomposition>() {
    
    @Override
    public IServiceDecomposition create() {
      return new ServiceDecomposition();
    }
    
    @Override
    public IServiceDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceDecomposition(resourceRepository, resource);
    }
  
  };

  public ServiceDecomposition() {
    super(IServiceDecomposition.TYPE_ID);
  }
  
  public ServiceDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceDecomposition.TYPE_ID);
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
  public cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService selectInto() {
    return _getSingle(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService.class, cleon.architecturemethods.arc42.spec.ddd.services.ServicesPackage.ServiceDecomposition_into);
  }

  public ServiceDecomposition setInto(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService into) {
    _setSingle(cleon.architecturemethods.arc42.spec.ddd.services.ServicesPackage.ServiceDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public ServiceDecomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService.class, cleon.architecturemethods.arc42.spec.ddd.services.ServicesPackage.ServiceDecomposition_into, visitor);
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IServiceDecomposition selectToMeInto(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IServiceDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.services.ServicesPackage.ServiceDecomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f97926d2-266f-11e5-95dc-8f1cdbd9db54,Ydx5oSq79tQ0oyJcuvHrgjzWeek=] */
