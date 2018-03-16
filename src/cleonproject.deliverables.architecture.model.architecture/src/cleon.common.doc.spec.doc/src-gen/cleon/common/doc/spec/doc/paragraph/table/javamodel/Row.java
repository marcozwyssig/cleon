package cleon.common.doc.spec.doc.paragraph.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Row extends DynamicResource implements IRow {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRow> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRow>() {
    
    @Override
    public IRow create() {
      return new Row();
    }
    
    @Override
    public IRow create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Row(resourceRepository, resource);
    }
  
  };

  public Row() {
    super(IRow.TYPE_ID);
  }
  
  public Row(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRow.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.doc.spec.doc.paragraph.table.javamodel.ICell> selectCell() {
    return _getMap(cleon.common.doc.spec.doc.paragraph.table.javamodel.ICell.class, cleon.common.doc.spec.doc.paragraph.table.TablePackage.Row_cell);
  }

  public Row setCell(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.doc.spec.doc.paragraph.table.javamodel.ICell> cell) {
    _setMap(cleon.common.doc.spec.doc.paragraph.table.TablePackage.Row_cell, cell);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Row setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.common.doc.spec.doc.paragraph.table.javamodel.ICell.class, cleon.common.doc.spec.doc.paragraph.table.TablePackage.Row_cell, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.doc.spec.doc.paragraph.table.javamodel.IRow selectToMeCell(cleon.common.doc.spec.doc.paragraph.table.javamodel.ICell object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.spec.doc.paragraph.table.javamodel.IRow.class, cleon.common.doc.spec.doc.paragraph.table.TablePackage.Row_cell, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2a47c140-3c4a-11e5-871f-6beac6a7c24b,ZMFTGUguMVTg9gjk3TBJNCQTWbg=] */
