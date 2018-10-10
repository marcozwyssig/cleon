package cleon.architecturemethods.arc42.spec.ddd.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceDekomposition extends DynamicResource implements IServiceDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceDekomposition>() {
    
    @Override
    public IServiceDekomposition create() {
      return new ServiceDekomposition();
    }
    
    @Override
    public IServiceDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceDekomposition(resourceRepository, resource);
    }
  
  };

  public ServiceDekomposition() {
    super(IServiceDekomposition.TYPE_ID);
  }
  
  public ServiceDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceDekomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService selectInto() {
    return _getSingle(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService.class, cleon.architecturemethods.arc42.spec.ddd.services.ServicesPackage.ServiceDekomposition_into);
  }

  public ServiceDekomposition setInto(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService into) {
    _setSingle(cleon.architecturemethods.arc42.spec.ddd.services.ServicesPackage.ServiceDekomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public ServiceDekomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService.class, cleon.architecturemethods.arc42.spec.ddd.services.ServicesPackage.ServiceDekomposition_into, visitor);
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IServiceDekomposition selectToMeInto(cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IServiceDekomposition.class, cleon.architecturemethods.arc42.spec.ddd.services.ServicesPackage.ServiceDekomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f97926d2-266f-11e5-95dc-8f1cdbd9db54,3u35pNMD886bBo0hi3Q4rHFmnPg=] */
