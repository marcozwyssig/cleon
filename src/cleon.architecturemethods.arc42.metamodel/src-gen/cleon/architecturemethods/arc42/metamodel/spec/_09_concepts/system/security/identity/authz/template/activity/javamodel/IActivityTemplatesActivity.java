package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivityTemplatesActivity extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IPermissionTemplateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6dd2381d-03d6-11eb-9c97-71aa0c3a8a81");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateForSystem> selectAuthZForSystems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6dd2381d-03d6-11eb-9c97-71aa0c3a8a81,wKSP0d/9QSYuIvosgTtK1ptZh4Q=] */
