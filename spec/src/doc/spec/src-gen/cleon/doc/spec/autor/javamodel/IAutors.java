package cleon.doc.spec.autor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAutors extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a59c8d77-c589-11e5-aeea-1db9268c0ee9");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> selectAutors();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a59c8d77-c589-11e5-aeea-1db9268c0ee9,bHNL3UxK133n7VOwn/l5MiGBi9o=] */
