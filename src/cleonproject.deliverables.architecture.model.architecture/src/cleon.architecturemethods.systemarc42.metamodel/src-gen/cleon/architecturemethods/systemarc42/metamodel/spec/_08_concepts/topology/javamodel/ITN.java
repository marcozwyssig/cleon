package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITN extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IMulti_TN {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c0a851b6-9286-11e9-959e-8115c2f9e41e");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN> selectMss();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IManagedRN> selectNoManagedBy();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c0a851b6-9286-11e9-959e-8115c2f9e41e,S6TE8mwT3TmIypRdI/kdhV5b8yg=] */
