package cleon.conception.architecture.spec.uml.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentDecomposition extends DynamicResource implements IComponentDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentDecomposition>() {
    
    @Override
    public IComponentDecomposition create() {
      return new ComponentDecomposition();
    }
    
    @Override
    public IComponentDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentDecomposition(resourceRepository, resource);
    }
  
  };

  public ComponentDecomposition() {
    super(IComponentDecomposition.TYPE_ID);
  }
  
  public ComponentDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentDecomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackage selectDecompose() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackage.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentDecomposition_decompose);
  }

  public ComponentDecomposition setDecompose(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackage decompose) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentDecomposition_decompose, decompose);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock selectInto() {
    return _getSingle(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_into);
  }

  public ComponentDecomposition setInto(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock into) {
    _setSingle(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackage.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentDecomposition_decompose, visitor);
    _acceptSingle(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDecomposition selectToMeDecompose(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentDecomposition_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d4692e40-1755-11e5-9ca7-d1bb57b73459,RNR1nVkkbgPTAe1vEMwH/qbQ4Es=] */
