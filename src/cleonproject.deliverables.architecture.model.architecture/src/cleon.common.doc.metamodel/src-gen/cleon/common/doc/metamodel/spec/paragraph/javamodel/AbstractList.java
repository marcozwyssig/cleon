package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractList extends DynamicResource implements IAbstractList {

  // abstract implementation, only used for static method calls
  private AbstractList() {
    super(IAbstractList.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.metamodel.spec.paragraph.javamodel.IAbstractList selectToMeListItem(cleon.common.doc.metamodel.spec.paragraph.javamodel.IListItem object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.metamodel.spec.paragraph.javamodel.IAbstractList.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.AbstractList_listItem, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,39c294a9-24f7-11ef-83a6-fdf80672957b,Yy8irvBTIIEaxHrnolsflH3LrRM=] */
