package cleon.architecturemethods.arc42.spec.ddd.repository.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RepositoryDecomposition extends DynamicResource implements IRepositoryDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepositoryDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepositoryDecomposition>() {
    
    @Override
    public IRepositoryDecomposition create() {
      return new RepositoryDecomposition();
    }
    
    @Override
    public IRepositoryDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RepositoryDecomposition(resourceRepository, resource);
    }
  
  };

  public RepositoryDecomposition() {
    super(IRepositoryDecomposition.TYPE_ID);
  }
  
  public RepositoryDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRepositoryDecomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepository selectInto() {
    return _getSingle(cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepository.class, cleon.architecturemethods.arc42.spec.ddd.repository.RepositoryPackage.RepositoryDecomposition_into);
  }

  public RepositoryDecomposition setInto(cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepository into) {
    _setSingle(cleon.architecturemethods.arc42.spec.ddd.repository.RepositoryPackage.RepositoryDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public RepositoryDecomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RepositoryDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepository.class, cleon.architecturemethods.arc42.spec.ddd.repository.RepositoryPackage.RepositoryDecomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepositoryDecomposition selectToMeInto(cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepository object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepositoryDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.repository.RepositoryPackage.RepositoryDecomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,43b7a073-28b4-11e5-8b63-33a353e42346,+K+UdtNc3mzm1WR0/do/plci8DI=] */
