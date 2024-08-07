package cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Contents
 * Specification of the communication channels linking your system to neighboring
 * systems and the environment.
 * 
 * Motivation
 * Understanding of the media used for information exchange with neighboring
 * systems, and the environment.
 * 
 * Form
 * E.g. UML deployment diagram describing channels to neighboring systems, together
 * with a mapping table of logical input and output flows of the logical context
 * diagram (3.1) to the channels.
 */
public interface ITechnicalContext extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2420a6f8-27cc-11e6-b263-9db62e053e59");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> selectExternalSystems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2420a6f8-27cc-11e6-b263-9db62e053e59,qCwnYY3/vanhZwwQfCAkmfTYaTM=] */
