package cleon.conception.architecture.spec.arc42._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILevel extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1551fb66-2857-11e8-9af4-b7d7a3bbddc1");
  
  // relations
  
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectWhitebox();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.arc42._05_buildingblock_view.javamodel.IBlackbox> selectBlackboxes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1551fb66-2857-11e8-9af4-b7d7a3bbddc1,2SoeHQBsIl46gVfCHojEAHDN0FA=] */
