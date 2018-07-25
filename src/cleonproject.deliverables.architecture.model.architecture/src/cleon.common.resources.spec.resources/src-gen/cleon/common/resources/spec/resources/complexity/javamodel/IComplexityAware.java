package cleon.common.resources.spec.resources.complexity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComplexityAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c145e25c-8fe7-11e8-a5b5-191902fe097a");
  
  // relations
  
  public cleon.common.resources.spec.resources.complexity.javamodel.IComplexity selectComplexity();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c145e25c-8fe7-11e8-a5b5-191902fe097a,FpxRhq0lZPf+YUmUx4oQOdiEh7A=] */
