package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWhitebox extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph, cleon.common.resources.metamodel.spec.descriptions.javamodel.INoDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7bbfe5fd-e085-11ee-a506-c5335c4d5040");
  
  // relations
  
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectWhitebox();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox> selectBlackboxes();
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> selectChapters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7bbfe5fd-e085-11ee-a506-c5335c4d5040,sKatVtWQIlwZaVDO7OsABpSujls=] */
