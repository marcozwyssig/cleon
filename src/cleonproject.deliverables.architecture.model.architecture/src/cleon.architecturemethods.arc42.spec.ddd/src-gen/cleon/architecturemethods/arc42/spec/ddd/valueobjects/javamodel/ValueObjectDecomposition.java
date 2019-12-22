package cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ValueObjectDecomposition extends DynamicResource implements IValueObjectDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValueObjectDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValueObjectDecomposition>() {
    
    @Override
    public IValueObjectDecomposition create() {
      return new ValueObjectDecomposition();
    }
    
    @Override
    public IValueObjectDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ValueObjectDecomposition(resourceRepository, resource);
    }
  
  };

  public ValueObjectDecomposition() {
    super(IValueObjectDecomposition.TYPE_ID);
  }
  
  public ValueObjectDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IValueObjectDecomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObject selectInto() {
    return _getSingle(cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObject.class, cleon.architecturemethods.arc42.spec.ddd.valueobjects.ValueobjectsPackage.ValueObjectDecomposition_into);
  }

  public ValueObjectDecomposition setInto(cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObject into) {
    _setSingle(cleon.architecturemethods.arc42.spec.ddd.valueobjects.ValueobjectsPackage.ValueObjectDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public ValueObjectDecomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ValueObjectDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObject.class, cleon.architecturemethods.arc42.spec.ddd.valueobjects.ValueobjectsPackage.ValueObjectDecomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObjectDecomposition selectToMeInto(cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObject object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObjectDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.valueobjects.ValueobjectsPackage.ValueObjectDecomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,172528f4-266d-11e5-95dc-8f1cdbd9db54,gvVzLhoNuf/afPnp1ZNg/0bRAYo=] */
