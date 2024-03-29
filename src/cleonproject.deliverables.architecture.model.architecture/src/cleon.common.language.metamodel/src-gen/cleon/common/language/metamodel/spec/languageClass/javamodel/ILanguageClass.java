package cleon.common.language.metamodel.spec.languageClass.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILanguageClass extends ch.actifsource.core.javamodel.IClass, cleon.common.language.metamodel.spec.javamodel.IAbstractLanguageSettingsAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("af81de75-c04e-11ee-bc88-af1934b8c942");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.languageClass.javamodel.ILanguageNameAspectTranslation> selectTranslations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,af81de75-c04e-11ee-bc88-af1934b8c942,36GIWvrhf3yvlsxoSpImwCKDsy0=] */
