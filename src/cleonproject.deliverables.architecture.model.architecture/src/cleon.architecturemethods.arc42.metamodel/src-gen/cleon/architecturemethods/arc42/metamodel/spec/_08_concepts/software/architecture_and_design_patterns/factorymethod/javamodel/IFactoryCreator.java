package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.architecture_and_design_patterns.factorymethod.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFactoryCreator extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("03b41966-ddd3-11e4-b0b5-6911fa4e24e5");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.architecture_and_design_patterns.factorymethod.javamodel.IFactoryMethod> selectFactoryMethods();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,03b41966-ddd3-11e4-b0b5-6911fa4e24e5,KHNOqXTlL4fXJ2Olhyt71JuQIp0=] */
