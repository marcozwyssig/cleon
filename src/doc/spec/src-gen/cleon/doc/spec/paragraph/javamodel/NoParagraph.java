package cleon.doc.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NoParagraph extends DynamicResource implements INoParagraph {

  // abstract implementation, only used for static method calls
  private NoParagraph() {
    super(INoParagraph.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.doc.spec.paragraph.javamodel.INoParagraph selectToMeNoParagraph(cleon.doc.spec.paragraph.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.paragraph.javamodel.INoParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c1b084d9-34f9-11e5-909a-4bcced25d7ee,Ce/5L1i95MQTmh7NVen5s03YUm4=] */
