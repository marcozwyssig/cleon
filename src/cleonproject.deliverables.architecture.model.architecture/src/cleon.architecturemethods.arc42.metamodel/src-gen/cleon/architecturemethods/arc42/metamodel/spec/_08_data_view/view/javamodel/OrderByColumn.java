package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OrderByColumn extends DynamicResource implements IOrderByColumn {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrderByColumn> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrderByColumn>() {
    
    @Override
    public IOrderByColumn create() {
      return new OrderByColumn();
    }
    
    @Override
    public IOrderByColumn create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OrderByColumn(resourceRepository, resource);
    }
  
  };

  public OrderByColumn() {
    super(IOrderByColumn.TYPE_ID);
  }
  
  public OrderByColumn(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrderByColumn.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.AbstractColumn_column);
  }

  public OrderByColumn setColumn(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn column) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.AbstractColumn_column, column);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public OrderByColumn setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OrderByColumn setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.ViewPackage.AbstractColumn_column, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,30593d8e-e142-11ee-9375-43bf1495bfd9,OHyHRYBMUNYBVMhd/z43zMqNwts=] */
