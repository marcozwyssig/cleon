package cleon.common.doc.metamodel.spec.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Chapter extends DynamicResource implements IChapter {

  // abstract implementation, only used for static method calls
  private Chapter() {
    super(IChapter.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e04abf20-076f-11e9-9ce3-b59baf185ea8,J8mgq+2nirG+RlvPbZBVJpg3uWc=] */
