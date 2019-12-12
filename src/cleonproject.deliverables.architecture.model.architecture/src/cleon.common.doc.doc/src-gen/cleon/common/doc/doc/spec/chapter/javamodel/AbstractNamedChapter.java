package cleon.common.doc.doc.spec.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractNamedChapter extends DynamicResource implements IAbstractNamedChapter {

  // abstract implementation, only used for static method calls
  private AbstractNamedChapter() {
    super(IAbstractNamedChapter.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cdb18e6a-1003-11e5-865e-55f33dbc76dc,m8YLxrIJDkOLIdo+jq0OpClHfiE=] */
