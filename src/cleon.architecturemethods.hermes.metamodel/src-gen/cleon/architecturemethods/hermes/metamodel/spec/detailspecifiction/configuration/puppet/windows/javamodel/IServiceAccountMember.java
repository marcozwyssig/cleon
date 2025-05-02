package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceAccountMember extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("707d30a3-21c2-11f0-83ae-df5418a109a4");
  
  public java.lang.String selectLogonAs();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount selectServiceAccount();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,707d30a3-21c2-11f0-83ae-df5418a109a4,RFsmqWvf//l+4ttCilKGgSzMgiE=] */
