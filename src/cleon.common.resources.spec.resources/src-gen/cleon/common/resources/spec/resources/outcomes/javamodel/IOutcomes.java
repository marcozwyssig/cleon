package cleon.common.resources.spec.resources.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOutcomes extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ca9809d8-1cec-11e6-aaba-9db7fdc64d7e");
  
  // relations
  
  public java.util.List<? extends cleon.common.resources.spec.resources.outcomes.javamodel.IOutcome> selectOutcomes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ca9809d8-1cec-11e6-aaba-9db7fdc64d7e,weySterv5sY3F+F6qoGWgN1jGoU=] */
