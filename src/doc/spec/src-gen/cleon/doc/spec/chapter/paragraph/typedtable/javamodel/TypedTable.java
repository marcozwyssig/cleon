package cleon.doc.spec.chapter.paragraph.typedtable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TypedTable extends DynamicResource implements ITypedTable {

  // abstract implementation, only used for static method calls
  private TypedTable() {
    super(ITypedTable.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.doc.spec.chapter.paragraph.typedtable.javamodel.ITypedTable selectToMeColumnOwns(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.chapter.paragraph.typedtable.javamodel.ITypedTable.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,325e4f86-3cef-11e5-871f-6beac6a7c24b,zJD4u6JleJDtXCgjLlykTBXGk28=] */
