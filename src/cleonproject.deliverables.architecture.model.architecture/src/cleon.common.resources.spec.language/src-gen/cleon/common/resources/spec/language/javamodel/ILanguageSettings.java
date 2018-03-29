package cleon.common.resources.spec.language.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILanguageSettings extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("73f7c4f5-335e-11e8-a9fe-87ba35d8f5c4");
  
  // relations
  
  public cleon.common.resources.spec.language.javamodel.ILanguage selectDefaultLanguage();
  
  public java.util.List<? extends cleon.common.resources.spec.language.javamodel.ILanguage> selectLanguages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,73f7c4f5-335e-11e8-a9fe-87ba35d8f5c4,q5N6hb3pNb+DzpzwKNHcjNjl++A=] */
