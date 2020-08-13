package cleon.common.doc.metamodel.spec.paragraph.table.javamodel;

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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IColumn> selectColumns() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IColumn.class, cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Table_columns);
  }

  public Table setColumns(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IColumn> columns) {
    _setList(cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Table_columns, columns);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements);
  }

  public Table setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IRow> selectRows() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IRow.class, cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Table_rows);
  }

  public Table setRows(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IRow> rows) {
    _setList(cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Table_rows, rows);
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
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IColumn.class, cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Table_columns, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IRow.class, cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Table_rows, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.doc.metamodel.spec.paragraph.table.javamodel.ITable selectToMeColumns(cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IColumn object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.metamodel.spec.paragraph.table.javamodel.ITable.class, cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Table_columns, object.getResource());
  }
  
  public static cleon.common.doc.metamodel.spec.paragraph.table.javamodel.ITable selectToMeRows(cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IRow object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.metamodel.spec.paragraph.table.javamodel.ITable.class, cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Table_rows, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fd7635ee-3c49-11e5-871f-6beac6a7c24b,DBTVJQk3z2wc/v+Jhw4tfolH3Gc=] */
