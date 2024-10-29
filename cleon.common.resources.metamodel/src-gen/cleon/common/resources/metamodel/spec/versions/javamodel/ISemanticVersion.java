package cleon.common.resources.metamodel.spec.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISemanticVersion extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2b7fed0c-d40f-11e5-8556-8f55ceb91287");
  
  // attributes
  
  public java.lang.Integer selectMajor();
  
  public java.lang.Integer selectMinor();
  
  public java.lang.Integer selectPatch();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2b7fed0c-d40f-11e5-8556-8f55ceb91287,2zbJGnPjj3A1OL7bFmT1HOuXdMk=] */
