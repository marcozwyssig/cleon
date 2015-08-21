package cleon.doc.spec.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NoChapters extends DynamicResource implements INoChapters {

  // abstract implementation, only used for static method calls
  private NoChapters() {
    super(INoChapters.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.doc.spec.chapter.javamodel.INoChapters selectToMeNoChapters(cleon.doc.spec.chapter.javamodel.IChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.chapter.javamodel.INoChapters.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eaf1f7df-31f6-11e5-bd99-eda9ce254b0b,8yWQuhFRhLsMBikMPUoNQCdDiWU=] */
