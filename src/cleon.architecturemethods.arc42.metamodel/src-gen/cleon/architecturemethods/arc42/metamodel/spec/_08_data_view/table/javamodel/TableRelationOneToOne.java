package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TableRelationOneToOne extends DynamicResource implements ITableRelationOneToOne {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITableRelationOneToOne> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITableRelationOneToOne>() {
    
    @Override
    public ITableRelationOneToOne create() {
      return new TableRelationOneToOne();
    }
    
    @Override
    public ITableRelationOneToOne create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TableRelationOneToOne(resourceRepository, resource);
    }
  
  };

  public TableRelationOneToOne() {
    super(ITableRelationOneToOne.TYPE_ID);
  }
  
  public TableRelationOneToOne(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITableRelationOneToOne.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectPrimaryKey() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_primaryKey);
  }

  public TableRelationOneToOne setPrimaryKey(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn primaryKey) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_primaryKey, primaryKey);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable selectToTable() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_toTable);
  }

  public TableRelationOneToOne setToTable(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable toTable) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.AbstractTableRelation_toTable, toTable);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TableRelationOneToOne setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8bed3e48-621d-11f0-8ed9-1d79caf8da43,JruX2UvoFj6x0qh3Di/xdRvMJmM=] */
