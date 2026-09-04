package cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFlowSequence extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IAbstractSequence, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IColorAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f054a44c-de55-11ef-81c7-3391f050addb");
  
  // relations
  
  public cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant selectFrom();
  
  public cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant selectTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f054a44c-de55-11ef-81c7-3391f050addb,HarTPaQzBeq1zP30PY+TiL5Cw8A=] */
