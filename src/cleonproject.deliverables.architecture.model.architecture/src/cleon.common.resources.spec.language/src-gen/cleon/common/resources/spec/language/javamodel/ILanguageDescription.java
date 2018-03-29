package cleon.common.resources.spec.language.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILanguageDescription extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d03edb49-335f-11e8-a9fe-87ba35d8f5c4");
  
  // relations
  
  public cleon.common.resources.spec.language.javamodel.ILanguage selectLanguage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d03edb49-335f-11e8-a9fe-87ba35d8f5c4,X84doi86+52Ix1mY5+rbSvgAOIU=] */
