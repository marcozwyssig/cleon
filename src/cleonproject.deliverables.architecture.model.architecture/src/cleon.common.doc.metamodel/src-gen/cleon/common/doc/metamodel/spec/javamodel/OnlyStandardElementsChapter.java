package cleon.common.doc.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class OnlyStandardElementsChapter extends DynamicResource implements IOnlyStandardElementsChapter {

  // abstract implementation, only used for static method calls
  private OnlyStandardElementsChapter() {
    super(IOnlyStandardElementsChapter.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.metamodel.spec.javamodel.IOnlyStandardElementsChapter selectToMeParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.metamodel.spec.javamodel.IOnlyStandardElementsChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_paragraphs, object.getResource());
  }
  
  public static cleon.common.doc.metamodel.spec.javamodel.IOnlyStandardElementsChapter selectToMeChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.metamodel.spec.javamodel.IOnlyStandardElementsChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_chapters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7ab7c627-e98b-11e8-af5c-a5aa9dc47205,JBJHwVYY6lzeHBJMtF2PJzk/Vjk=] */
