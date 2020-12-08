package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceAccountEnvironmentSystem extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b2c26a28-394e-11eb-93f1-c3f5ad8bb73f");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem selectServiceAccountsForSystem();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount> selectAccounts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b2c26a28-394e-11eb-93f1-c3f5ad8bb73f,HIbz3R6APcV6RtY01uETyoH3vv0=] */
