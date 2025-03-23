package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractAuthZBuildingBlockPermission extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware, cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("912699fe-864a-11eb-9869-4317e18e6c88");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.system.adgroups.javamodel.IADGroup> selectBuiltinADGroup();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel.IActivityTemplateAware> selectUsedBy();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,912699fe-864a-11eb-9869-4317e18e6c88,lHHQnAs5CT6TBmruqtzAFZYGPTA=] */
