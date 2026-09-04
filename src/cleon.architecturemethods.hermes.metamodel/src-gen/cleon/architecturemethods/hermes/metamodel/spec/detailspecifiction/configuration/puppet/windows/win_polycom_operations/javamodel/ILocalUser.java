package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILocalUser extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9c30fcad-2be0-11f0-9ce1-09b647a63c7b");
  
  public java.lang.String selectPassword();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount_Local selectServiceAccount_Local();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9c30fcad-2be0-11f0-9ce1-09b647a63c7b,jzTpBykpjmOawLaDw0l+pBU0NRE=] */
