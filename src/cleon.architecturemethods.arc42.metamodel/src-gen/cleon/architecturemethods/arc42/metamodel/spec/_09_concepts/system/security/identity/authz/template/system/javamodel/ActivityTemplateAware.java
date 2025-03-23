package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ActivityTemplateAware extends DynamicResource implements IActivityTemplateAware {

  // abstract implementation, only used for static method calls
  private ActivityTemplateAware() {
    super(IActivityTemplateAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel.IActivityTemplateAware> selectToMeActivityTemplatesOnSites(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel.IAbstractAuthZBuildingBlockPermission object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel.IActivityTemplateAware.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.SystemPackage.ActivityTemplateAware_activityTemplatesOnSites, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel.IActivityTemplateAware> selectToMeActivityTemplatesOnLocalSite(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel.IAbstractAuthZBuildingBlockPermission object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel.IActivityTemplateAware.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.SystemPackage.ActivityTemplateAware_activityTemplatesOnLocalSite, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c8872d57-d426-11eb-9862-7f597b9587dd,AYtQtWmZbTzgP3skCZfY0SBjzSE=] */
