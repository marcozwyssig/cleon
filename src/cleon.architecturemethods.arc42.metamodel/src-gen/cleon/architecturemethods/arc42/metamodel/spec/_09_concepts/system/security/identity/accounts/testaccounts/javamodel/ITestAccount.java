package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestAccount extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractMember, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7c016d76-273a-11f0-bc3e-fdd30b5cbdec");
  
  public java.lang.Integer selectUniqueId();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.IAbstractTestAccountTemplate selectTestAccountTemplate();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> selectMemberOf();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7c016d76-273a-11f0-bc3e-fdd30b5cbdec,Rm5/qQvjtM0Xcd1kJPYSjrSnCDQ=] */
