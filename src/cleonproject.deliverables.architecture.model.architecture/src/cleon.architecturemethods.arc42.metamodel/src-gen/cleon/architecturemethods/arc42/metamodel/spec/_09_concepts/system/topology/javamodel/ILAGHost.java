package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILAGHost extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSingleHost, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractNumberAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("36338349-303c-11ed-b561-abe8147b73fc");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ILAGType selectType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,36338349-303c-11ed-b561-abe8147b73fc,6B4VLUsWybD2JsdnhizDwKnFcRY=] */
