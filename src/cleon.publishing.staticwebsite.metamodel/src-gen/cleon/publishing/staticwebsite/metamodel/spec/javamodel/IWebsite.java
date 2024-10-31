package cleon.publishing.staticwebsite.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWebsite extends cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d9c0f89d-afd7-11e5-a976-57ed3906441a");
  
  // relations
  
  public java.util.List<? extends cleon.publishing.staticwebsite.metamodel.spec.static_content.javamodel.IImage> selectImages();
  
  public cleon.publishing.staticwebsite.metamodel.spec.static_content.javamodel.IImage selectLogo();
  
  public cleon.publishing.staticwebsite.metamodel.spec.static_content.javamodel.IImage selectCover();
  
  public java.util.List<? extends cleon.publishing.staticwebsite.metamodel.spec.static_content.javamodel.ILayout> selectLayouts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d9c0f89d-afd7-11e5-a976-57ed3906441a,p2YBs+vNpGNcqViQc+nqReUTEkA=] */
