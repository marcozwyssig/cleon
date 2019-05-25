package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Group extends DynamicResource implements IGroup {

  // abstract implementation, only used for static method calls
  private Group() {
    super(IGroup.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d2272f28-7f08-11e9-98a3-b1bd805f0a31,wwjr2KteYawnXjZfQxQtwq1GLhg=] */
