package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestAccountEnvironment extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dcb6fae2-2733-11f0-8098-59f455ea82af");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode selectTestAccountForEnvironment();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccountEnvironmentSite> selectTestAccountSite();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dcb6fae2-2733-11f0-8098-59f455ea82af,weNw7jidy6BcdErB+lPwcGRBjl4=] */
