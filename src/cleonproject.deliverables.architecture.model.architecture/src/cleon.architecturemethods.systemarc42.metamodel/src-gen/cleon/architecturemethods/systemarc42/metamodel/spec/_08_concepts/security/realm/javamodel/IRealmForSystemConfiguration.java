package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRealmForSystemConfiguration extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dd9ead87-7e62-11ea-9262-7b7e0e9cb204");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectRealmForSystemConfiguration();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmConfigurationUsage> selectUsage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dd9ead87-7e62-11ea-9262-7b7e0e9cb204,9rpTVC1p1391f7xtebHXWwZAheo=] */
