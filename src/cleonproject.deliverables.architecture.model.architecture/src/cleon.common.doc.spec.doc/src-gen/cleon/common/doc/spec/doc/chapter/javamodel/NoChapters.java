package cleon.common.doc.spec.doc.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NoChapters extends DynamicResource implements INoChapters {

  // abstract implementation, only used for static method calls
  private NoChapters() {
    super(INoChapters.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.spec.doc.chapter.javamodel.INoChapters selectToMeNoChapters(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.spec.doc.chapter.javamodel.INoChapters.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_noChapters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,18625181-5154-11e9-bb61-971a423d31e9,BQRDsW4qzYo6Erh8o8c2/dNxE/Y=] */
