package cleon.common.language.metamodel.spec.translation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractTranslation extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dc37c0c0-9794-11ef-a385-611913ad635b");
  
  public java.lang.String selectMd5();
  
  public java.lang.String selectMd5_origin();
  
  // relations
  
  public cleon.common.language.metamodel.spec.languages.javamodel.ILanguage selectLanguage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dc37c0c0-9794-11ef-a385-611913ad635b,XMMtlT9WYUVbb5Ur3iv12854euc=] */
