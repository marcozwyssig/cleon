package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TableRelationManyToOne extends DynamicResource implements ITableRelationManyToOne {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITableRelationManyToOne> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITableRelationManyToOne>() {
    
    @Override
    public ITableRelationManyToOne create() {
      return new TableRelationManyToOne();
    }
    
    @Override
    public ITableRelationManyToOne create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TableRelationManyToOne(resourceRepository, resource);
    }
  
  };

  public TableRelationManyToOne() {
    super(ITableRelationManyToOne.TYPE_ID);
  }
  
  public TableRelationManyToOne(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITableRelationManyToOne.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectPrimaryKey() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_primaryKey);
  }

  public TableRelationManyToOne setPrimaryKey(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn primaryKey) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_primaryKey, primaryKey);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable selectToTable() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_toTable);
  }

  public TableRelationManyToOne setToTable(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable toTable) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_toTable, toTable);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TableRelationManyToOne setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_primaryKey, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_toTable, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4d1683b4-621d-11f0-8ed9-1d79caf8da43,Yl7M0N8b/oOojJ7FWvW1O4N8GgY=] */
