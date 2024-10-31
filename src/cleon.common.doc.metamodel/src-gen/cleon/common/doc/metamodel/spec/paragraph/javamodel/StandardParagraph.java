package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class StandardParagraph extends DynamicResource implements IStandardParagraph {

  // abstract implementation, only used for static method calls
  private StandardParagraph() {
    super(IStandardParagraph.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f5a1c130-e989-11e8-af5c-a5aa9dc47205,iQsteAxEESqYPgKghCTFugfwly4=] */
