package cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISequenceDiagram extends cleon.common.language.metamodel.spec.translation.name.javamodel.IMultilingualName, cleon.modelinglanguages.uml.metamodel.spec.javamodel.IUmlDiagram {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("66daed74-de53-11ef-81c7-3391f050addb");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant> selectParticipants();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IAbstractSequence> selectSequences();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,66daed74-de53-11ef-81c7-3391f050addb,2QnJkhyarfEXu31Km7x5o7DDpLc=] */
