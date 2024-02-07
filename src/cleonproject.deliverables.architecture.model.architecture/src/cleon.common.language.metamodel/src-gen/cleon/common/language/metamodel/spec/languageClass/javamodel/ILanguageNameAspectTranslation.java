package cleon.common.language.metamodel.spec.languageClass.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILanguageNameAspectTranslation extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("07e0a1d7-c5d2-11ee-8549-1528e55916a4");
  
  // relations
  
  public cleon.common.language.metamodel.spec.language.javamodel.ILanguage selectLanguage();
  
  public ch.actifsource.core.selector.element.javamodel.ILinkSelector selectTranslations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,07e0a1d7-c5d2-11ee-8549-1528e55916a4,D6dsbZlfByl+VRc9RdWBQjZyL/U=] */
