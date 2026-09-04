package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestAccountTemplate extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.IAbstractTestAccountTemplate {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dbe98e6a-2732-11f0-8098-59f455ea82af");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate selectTestAccountForRoleTemplate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dbe98e6a-2732-11f0-8098-59f455ea82af,4s56v4+TmFi9fw0SJxkKNROLTzg=] */
