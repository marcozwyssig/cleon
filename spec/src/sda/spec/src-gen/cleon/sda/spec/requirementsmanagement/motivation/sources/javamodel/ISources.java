package cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISources extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.doc.spec.document.javamodel.INoSubDocuments, cleon.doc.spec.chapter.javamodel.INoChapters, cleon.sda.spec.requirementsmanagement.javamodel.IRequirementDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("efb0f224-a281-11e5-9332-1b5893de4362");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectSources();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,efb0f224-a281-11e5-9332-1b5893de4362,bdXUMEZYupX7Y0SvVbPJLFeIFXM=] */
