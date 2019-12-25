package cleon.common.doc.metamodel.spec.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractChapter extends DynamicResource implements IAbstractChapter {

  // abstract implementation, only used for static method calls
  private AbstractChapter() {
    super(IAbstractChapter.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,44b08026-d86d-11e4-aa2f-c11242a92b60,d+5igLJKliO1OWPMq9nPDKWWVkM=] */
