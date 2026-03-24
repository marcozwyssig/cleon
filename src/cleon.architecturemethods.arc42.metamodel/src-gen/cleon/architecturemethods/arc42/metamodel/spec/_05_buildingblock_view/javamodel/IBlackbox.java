package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBlackbox extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.resources.metamodel.spec.descriptions.javamodel.INoDescription, cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapterPath {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d58842b6-2858-11e8-9af4-b7d7a3bbddc1");
  
  // attributes
  
  public java.lang.String selectResponsibility();
  
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectBlackBoxbuildingBlock();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox_Dependencies selectBlackbox_dependencies();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox_Requirements selectBlackbox_requirements();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox selectWhiteBox();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d58842b6-2858-11e8-9af4-b7d7a3bbddc1,HG3E7xImH6M2KxEg+SM+NG11pwU=] */
