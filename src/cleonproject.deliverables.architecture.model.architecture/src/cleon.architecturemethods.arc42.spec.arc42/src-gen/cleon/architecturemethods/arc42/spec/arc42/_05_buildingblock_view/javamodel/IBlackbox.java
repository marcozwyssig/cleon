package cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBlackbox extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d58842b6-2858-11e8-9af4-b7d7a3bbddc1");
  
  // relations
  
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectBlackbox();
  
  public cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBlackbox_Dependencies selectBlackbox_Dependencies();
  
  public cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBlackbox_Requirements selectBlackbox_requirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d58842b6-2858-11e8-9af4-b7d7a3bbddc1,XJA7HEsdBzBRDFEwTPSXc9ssaE8=] */
