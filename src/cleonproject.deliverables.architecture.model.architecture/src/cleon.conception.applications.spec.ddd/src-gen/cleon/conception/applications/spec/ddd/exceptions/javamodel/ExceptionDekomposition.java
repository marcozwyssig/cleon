package cleon.conception.applications.spec.ddd.exceptions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ExceptionDekomposition extends DynamicResource implements IExceptionDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExceptionDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExceptionDekomposition>() {
    
    @Override
    public IExceptionDekomposition create() {
      return new ExceptionDekomposition();
    }
    
    @Override
    public IExceptionDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ExceptionDekomposition(resourceRepository, resource);
    }
  
  };

  public ExceptionDekomposition() {
    super(IExceptionDekomposition.TYPE_ID);
  }
  
  public ExceptionDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExceptionDekomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.applications.spec.ddd.exceptions.javamodel.IDomainException selectInto() {
    return _getSingle(cleon.conception.applications.spec.ddd.exceptions.javamodel.IDomainException.class, cleon.conception.applications.spec.ddd.exceptions.ExceptionsPackage.ExceptionDekomposition_into);
  }

  public ExceptionDekomposition setInto(cleon.conception.applications.spec.ddd.exceptions.javamodel.IDomainException into) {
    _setSingle(cleon.conception.applications.spec.ddd.exceptions.ExceptionsPackage.ExceptionDekomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public ExceptionDekomposition setIntoBuildingBlock(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ExceptionDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.applications.spec.ddd.exceptions.javamodel.IDomainException.class, cleon.conception.applications.spec.ddd.exceptions.ExceptionsPackage.ExceptionDekomposition_into, visitor);
    _acceptSingle(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.applications.spec.ddd.exceptions.javamodel.IExceptionDekomposition selectToMeInto(cleon.conception.applications.spec.ddd.exceptions.javamodel.IDomainException object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.applications.spec.ddd.exceptions.javamodel.IExceptionDekomposition.class, cleon.conception.applications.spec.ddd.exceptions.ExceptionsPackage.ExceptionDekomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,510327f6-266d-11e5-95dc-8f1cdbd9db54,VElDI3o+euVIwTTDxsdyRsjr/dA=] */
