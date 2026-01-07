package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.microservice.servicelayer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceComponent extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentByTemplate {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cb109bbd-e28b-11f0-a927-5b9cb523e701");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IBoundedContext selectBoundedContext();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentByTemplate> selectComponents();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cb109bbd-e28b-11f0-a927-5b9cb523e701,W2axSbp7TFeYhbdw9HXKqR6zu30=] */
