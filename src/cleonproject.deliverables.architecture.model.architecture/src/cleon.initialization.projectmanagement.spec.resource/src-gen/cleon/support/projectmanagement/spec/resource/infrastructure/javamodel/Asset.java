package cleon.support.projectmanagement.spec.resource.infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Asset extends DynamicResource implements IAsset {

  // abstract implementation, only used for static method calls
  private Asset() {
    super(IAsset.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6ef368b1-bbd6-11e6-997f-d73ea5a3671c,DCrfW90aIaN5Cc1QsVblVwCLiqs=] */
