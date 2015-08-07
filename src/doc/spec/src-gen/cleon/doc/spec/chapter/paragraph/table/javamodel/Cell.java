package cleon.doc.spec.chapter.paragraph.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Cell extends DynamicResource implements ICell {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICell> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICell>() {
    
    @Override
    public ICell create() {
      return new Cell();
    }
    
    @Override
    public ICell create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Cell(resourceRepository, resource);
    }
  
  };

  public Cell() {
    super(ICell.TYPE_ID);
  }
  
  public Cell(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICell.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Cell_column);
  }

  public Cell setColumn(cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn column) {
    _setSingle(cleon.doc.spec.chapter.paragraph.table.TablePackage.Cell_column, column);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraph() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Cell_paragraph);
  }

  public Cell setParagraph(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraph) {
    _setList(cleon.doc.spec.chapter.paragraph.table.TablePackage.Cell_paragraph, paragraph);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Cell setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Cell setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Cell_column, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Cell_paragraph, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.doc.spec.chapter.paragraph.table.javamodel.ICell> selectToMeColumn(cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn object) {
    return _getToMeList(object.getRepository(), cleon.doc.spec.chapter.paragraph.table.javamodel.ICell.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Cell_column, object.getResource());
  }
  
  public static cleon.doc.spec.chapter.paragraph.table.javamodel.ICell selectToMeParagraph(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.chapter.paragraph.table.javamodel.ICell.class, cleon.doc.spec.chapter.paragraph.table.TablePackage.Cell_paragraph, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,37a450a4-3c4a-11e5-871f-6beac6a7c24b,WLXn35u6eyyUUl0W0lIWW1WEwa8=] */
