package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractActivityTemplatePermission extends DynamicResource implements IAbstractActivityTemplatePermission {

  // abstract implementation, only used for static method calls
  private AbstractActivityTemplatePermission() {
    super(IAbstractActivityTemplatePermission.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> selectToMeBuiltinADGroup(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.AbstractActivityTemplatePermission_builtinADGroup, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> selectToMeUsedBy(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateAware object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.AbstractActivityTemplatePermission_usedBy, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,912699fe-864a-11eb-9869-4317e18e6c88,jPHlfZRVCWDzl73kCzBxMgzwIXg=] */
