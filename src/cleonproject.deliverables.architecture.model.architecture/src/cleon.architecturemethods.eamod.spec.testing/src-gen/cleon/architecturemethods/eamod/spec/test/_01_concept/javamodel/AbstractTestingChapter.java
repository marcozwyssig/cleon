package cleon.architecturemethods.eamod.spec.test._01_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractTestingChapter extends DynamicResource implements IAbstractTestingChapter {

  // abstract implementation, only used for static method calls
  private AbstractTestingChapter() {
    super(IAbstractTestingChapter.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ccfbf9df-1519-11e6-a185-8f02bf3f95ba,2BN04QW0M/WBthao5kICBBgYsPI=] */
