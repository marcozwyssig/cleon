package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITextAware extends ch.actifsource.core.javamodel.IResource, cleon.common.language.metamodel.spec.javamodel.IAbstractMultilingual {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1961c00f-cac4-11ec-8012-87976b97438b");
  
  // attributes
  
  public java.lang.String selectText();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.ILanguageTextTranslation> selectTextTranslation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1961c00f-cac4-11ec-8012-87976b97438b,gXlIkAs60G5WQGy1RzV0i3IhAXQ=] */
