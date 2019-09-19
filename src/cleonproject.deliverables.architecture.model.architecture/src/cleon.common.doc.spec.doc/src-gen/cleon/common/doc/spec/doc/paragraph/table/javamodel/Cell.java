package cleon.common.doc.spec.doc.paragraph.table.javamodel;

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
  public cleon.common.doc.spec.doc.paragraph.table.javamodel.IColumn selectColumn() {
    return _getSingle(cleon.common.doc.spec.doc.paragraph.table.javamodel.IColumn.class, cleon.common.doc.spec.doc.paragraph.table.TablePackage.Cell_column);
  }

  public Cell setColumn(cleon.common.doc.spec.doc.paragraph.table.javamodel.IColumn column) {
    _setSingle(cleon.common.doc.spec.doc.paragraph.table.TablePackage.Cell_column, column);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Cell setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Cell setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
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
    _acceptSingle(cleon.common.doc.spec.doc.paragraph.table.javamodel.IColumn.class, cleon.common.doc.spec.doc.paragraph.table.TablePackage.Cell_column, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.doc.spec.doc.paragraph.table.javamodel.ICell> selectToMeColumn(cleon.common.doc.spec.doc.paragraph.table.javamodel.IColumn object) {
    return _getToMeList(object.getRepository(), cleon.common.doc.spec.doc.paragraph.table.javamodel.ICell.class, cleon.common.doc.spec.doc.paragraph.table.TablePackage.Cell_column, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,37a450a4-3c4a-11e5-871f-6beac6a7c24b,qiXEWm0NKl7GYqGWqwBXL8B3USk=] */
