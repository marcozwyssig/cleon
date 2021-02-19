package cleon.common.doc.metamodel.spec.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDocument extends cleon.common.doc.metamodel.spec.javamodel.IChapterAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fd0b0ad8-28bc-11e5-bdaf-69a48f49df43");
  
  public java.lang.Boolean selectWithToC();
  
  public java.util.List<java.lang.String> selectImgDir();
  
  // relations
  
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle();
  
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties();
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fd0b0ad8-28bc-11e5-bdaf-69a48f49df43,CKNikj6kIS6+/U1yRj3XQghcA30=] */
