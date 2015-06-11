package cleon.arc42.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IArc42 extends ch.actifsource.core.javamodel.INamedResource, cleon.doc.spec.javamodel.IDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2cbcf671-ffcc-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlockView selectBuildingBlockView();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2cbcf671-ffcc-11e4-ac0a-959b440f987f,NzocMBpz7Qb4nSYsuAN2QfbmyLQ=] */
