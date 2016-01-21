package cleon.sda.spec.analysis.solution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AnalysisDocument extends DynamicResource implements IAnalysisDocument {

  // abstract implementation, only used for static method calls
  private AnalysisDocument() {
    super(IAnalysisDocument.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0d22ecc1-c02a-11e5-b927-b1b055d0575f,pCry3pi7NyYLg4MbOL3TjJaEcds=] */
