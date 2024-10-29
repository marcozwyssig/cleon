package cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISourceReferenceAware extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("51e1e58c-ea67-11e8-8092-1f65b9544bbd");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceReference> selectReferences();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,51e1e58c-ea67-11e8-8092-1f65b9544bbd,8U3UCERwKQElcDI4oViAdLa1q90=] */
