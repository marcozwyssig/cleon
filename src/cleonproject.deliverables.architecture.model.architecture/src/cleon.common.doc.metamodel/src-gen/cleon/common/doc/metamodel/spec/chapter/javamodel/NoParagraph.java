package cleon.common.doc.metamodel.spec.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NoParagraph extends DynamicResource implements INoParagraph {

  // abstract implementation, only used for static method calls
  private NoParagraph() {
    super(INoParagraph.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph selectToMeNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ae9ee485-66a0-11e9-9ec9-5fbc84faaeb1,no2kpDjhGpNfQEItG52oTsUvsTM=] */
