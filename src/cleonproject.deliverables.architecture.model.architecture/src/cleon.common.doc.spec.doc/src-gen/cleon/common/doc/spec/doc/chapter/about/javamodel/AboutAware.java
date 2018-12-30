package cleon.common.doc.spec.doc.chapter.about.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AboutAware extends DynamicResource implements IAboutAware {

  // abstract implementation, only used for static method calls
  private AboutAware() {
    super(IAboutAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.spec.doc.chapter.about.javamodel.IAboutAware selectToMeAbout(cleon.common.doc.spec.doc.chapter.about.javamodel.IAbout object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.spec.doc.chapter.about.javamodel.IAboutAware.class, cleon.common.doc.spec.doc.chapter.about.AboutPackage.AboutAware_about, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,29a8b5ed-0c20-11e9-8a28-597a9a8945ea,9ojBkEOz8qqk12xmJNCos4lTDAo=] */
