package cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ExceptionDecomposition extends DynamicResource implements IExceptionDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExceptionDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExceptionDecomposition>() {
    
    @Override
    public IExceptionDecomposition create() {
      return new ExceptionDecomposition();
    }
    
    @Override
    public IExceptionDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ExceptionDecomposition(resourceRepository, resource);
    }
  
  };

  public ExceptionDecomposition() {
    super(IExceptionDecomposition.TYPE_ID);
  }
  
  public ExceptionDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExceptionDecomposition.TYPE_ID);
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
  public cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IDomainException selectInto() {
    return _getSingle(cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IDomainException.class, cleon.architecturemethods.arc42.spec.ddd.exceptions.ExceptionsPackage.ExceptionDecomposition_into);
  }

  public ExceptionDecomposition setInto(cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IDomainException into) {
    _setSingle(cleon.architecturemethods.arc42.spec.ddd.exceptions.ExceptionsPackage.ExceptionDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public ExceptionDecomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ExceptionDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IDomainException.class, cleon.architecturemethods.arc42.spec.ddd.exceptions.ExceptionsPackage.ExceptionDecomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IExceptionDecomposition selectToMeInto(cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IDomainException object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IExceptionDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.exceptions.ExceptionsPackage.ExceptionDecomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,510327f6-266d-11e5-95dc-8f1cdbd9db54,M12VupEit3eXO5ATbC6MNs5beJU=] */
