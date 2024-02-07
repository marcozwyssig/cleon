package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractLanguageSettingsAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ffbf6300-cd3b-11ec-85c9-011c467ea292");
  
  // relations
  
  public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings selectLanguageSettings();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ffbf6300-cd3b-11ec-85c9-011c467ea292,KHhLxQcQHOnJK4hh22DlGFfx9Y4=] */
