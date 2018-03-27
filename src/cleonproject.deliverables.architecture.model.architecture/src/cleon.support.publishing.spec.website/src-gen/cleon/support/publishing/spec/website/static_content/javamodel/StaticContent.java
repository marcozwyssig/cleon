package cleon.support.publishing.spec.website.static_content.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class StaticContent extends DynamicResource implements IStaticContent {

  // abstract implementation, only used for static method calls
  private StaticContent() {
    super(IStaticContent.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c3477a3b-afde-11e5-a548-13e054f2d74f,d2x+xwmlbMZDvEmyGHZUbpoM1C8=] */
