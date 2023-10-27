package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRealmConnection extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IAbstractRealmHandlers {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9ea1f053-fd82-11ea-b638-e1cc8a02b192");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage> selectUsage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9ea1f053-fd82-11ea-b638-e1cc8a02b192,XBLil2UNojrp7nNbkGjruBKEi6Y=] */
