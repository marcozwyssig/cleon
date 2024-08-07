package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMultilingualName extends cleon.common.language.metamodel.spec.javamodel.IAbstractMultilingual {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1564455b-3360-11e8-a9fe-87ba35d8f5c4");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> selectDefaultName();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> selectNames();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1564455b-3360-11e8-a9fe-87ba35d8f5c4,hwrJ6zMk/+4bbsbGlaVhvA04P8I=] */
