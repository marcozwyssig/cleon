package cleon.doc.spec.chapter.paragraph.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Table extends DynamicResource implements ITable {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITable> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITable>() {
    
    @Override
    public ITable create() {
      return new Table();
    }
    
    @Override
    public ITable create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Table(resourceRepository, resource);
    }
  
  };

  public Table() {
    super(ITable.TYPE_ID);
  }
  
  public Table(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITable.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn> selectColumns() {
    return _getList(cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Table_columns);
  }

  public Table setColumns(java.util.List<? extends cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn> columns) {
    _setList(cleon.doc.spec.chapter.paragraph.table.TablePackage.Table_columns, columns);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.table.javamodel.IRow> selectRows() {
    return _getList(cleon.doc.spec.chapter.paragraph.table.javamodel.IRow.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Table_rows);
  }

  public Table setRows(java.util.List<? extends cleon.doc.spec.chapter.paragraph.table.javamodel.IRow> rows) {
    _setList(cleon.doc.spec.chapter.paragraph.table.TablePackage.Table_rows, rows);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Table setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Table_columns, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.table.javamodel.IRow.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Table_rows, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.doc.spec.chapter.paragraph.table.javamodel.ITable selectToMeColumns(cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.chapter.paragraph.table.javamodel.ITable.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Table_columns, object.getResource());
  }
  
  public static cleon.doc.spec.chapter.paragraph.table.javamodel.ITable selectToMeRows(cleon.doc.spec.chapter.paragraph.table.javamodel.IRow object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.chapter.paragraph.table.javamodel.ITable.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Table_rows, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fd7635ee-3c49-11e5-871f-6beac6a7c24b,qvZkrWjX9ponEDduFeTkA72Lh/8=] */
