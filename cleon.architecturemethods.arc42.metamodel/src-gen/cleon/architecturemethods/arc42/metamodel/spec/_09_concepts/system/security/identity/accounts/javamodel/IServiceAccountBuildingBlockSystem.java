package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceAccountBuildingBlockSystem extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("34244042-395b-11eb-978d-47c0228773ba");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem selectServiceAccountTemplatesForSystem();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountTemplate> selectServiceAccountTemplate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,34244042-395b-11eb-978d-47c0228773ba,vbTIeJEKDaUS7ZgOkJM/itgxjAU=] */
