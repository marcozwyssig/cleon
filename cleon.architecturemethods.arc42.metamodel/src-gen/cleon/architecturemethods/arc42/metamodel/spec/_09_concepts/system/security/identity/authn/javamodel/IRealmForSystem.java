package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRealmForSystem extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f66c720-fd7e-11ea-8062-0d8dc98d6158");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem selectRealmForSystem();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel.IRealmForSystemConfiguration> selectRealmForSystemConfigurations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f66c720-fd7e-11ea-8062-0d8dc98d6158,AJ+NZGw4ToKtcbbd7s+9gtxoXBI=] */
