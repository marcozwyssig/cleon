package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRealmForSystemConfiguration extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dd9ead87-7e62-11ea-9262-7b7e0e9cb204");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectRealmForSystemConfiguration();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel.IAbstractRealmHandlers> selectUsageForComponents();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dd9ead87-7e62-11ea-9262-7b7e0e9cb204,6ZGlVDjkj856HPiMJg91X41nTiQ=] */
