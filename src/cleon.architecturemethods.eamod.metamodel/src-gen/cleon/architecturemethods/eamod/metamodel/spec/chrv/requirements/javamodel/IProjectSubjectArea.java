package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProjectSubjectArea extends ch.actifsource.core.javamodel.INamedResource, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubjectArea {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f92279cc-ff9a-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubSubjectArea> selectSubjectareas();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f92279cc-ff9a-11e4-ac0a-959b440f987f,avqq7TDalQw6WLoWfhUoIx6WuIc=] */
