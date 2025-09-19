package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivityPermission extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IMembereable, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractSingleGroup, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph, cleon.common.resources.metamodel.spec.descriptions.javamodel.INoDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b898fc57-7f22-11e9-9a52-07d4b074defc");
  
  public java.lang.Integer selectUniqueId();
  
  public java.lang.Boolean selectAssignComputer();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission selectActivityTemplate();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> selectMemberRoles();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup> selectMemberOfAdGroup();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> selectMemberOfComputers();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b898fc57-7f22-11e9-9a52-07d4b074defc,EjF9w+Vhsx8jUZqjT4dgt2yXesk=] */
