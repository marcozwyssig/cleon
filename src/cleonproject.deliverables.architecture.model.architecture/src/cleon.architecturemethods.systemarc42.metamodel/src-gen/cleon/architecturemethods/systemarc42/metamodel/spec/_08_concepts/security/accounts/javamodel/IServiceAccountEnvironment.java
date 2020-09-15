package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceAccountEnvironment extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e0be5246-a1a0-11ea-886d-354b9ee6fb2d");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IAccount> selectAccounts();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectSystemEnvironmentForAccounts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e0be5246-a1a0-11ea-886d-354b9ee6fb2d,xAGn8KP1uAUyVWg8YEMnCj+L4kk=] */
