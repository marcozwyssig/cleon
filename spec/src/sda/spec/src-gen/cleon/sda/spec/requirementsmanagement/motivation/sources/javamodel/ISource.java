package cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISource extends ch.actifsource.core.javamodel.INamedResource, cleon.doc.spec.javamodel.ISimpleDescription, cleon.sda.spec.requirementsmanagement.javamodel.INotes, cleon.sda.spec.javamodel.IBusinessObjectId, cleon.doc.spec.autor.javamodel.IAutors {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3b2b59c5-a951-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectComposites();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3b2b59c5-a951-11e5-bda2-a7fc3bd7c783,9cFI8Yn826ERfo6Mhf+ck/QJN5Y=] */
