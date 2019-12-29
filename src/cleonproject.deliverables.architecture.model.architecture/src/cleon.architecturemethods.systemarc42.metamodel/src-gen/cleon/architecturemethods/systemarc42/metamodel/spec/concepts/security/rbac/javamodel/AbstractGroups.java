package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractGroups extends DynamicResource implements IAbstractGroups {

  // abstract implementation, only used for static method calls
  private AbstractGroups() {
    super(IAbstractGroups.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroups selectToMeGroups(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractGroups_groups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cc875e00-7f08-11e9-98a3-b1bd805f0a31,gVH6vaWc4VjFWl/R+xp/3IcCy2I=] */
