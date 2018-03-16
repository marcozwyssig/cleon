package cleon.common.resources.spec.resources.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Documentation extends DynamicResource implements IDocumentation {

  // abstract implementation, only used for static method calls
  private Documentation() {
    super(IDocumentation.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,78925465-1cdb-11e6-8e4f-e37ebca0f18f,Ek2k2UqEWe8/xt9KW37SvWX/IZw=] */
