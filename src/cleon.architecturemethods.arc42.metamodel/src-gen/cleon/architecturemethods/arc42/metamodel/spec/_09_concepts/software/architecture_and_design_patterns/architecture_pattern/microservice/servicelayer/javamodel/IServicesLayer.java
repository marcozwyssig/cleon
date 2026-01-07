package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.microservice.servicelayer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServicesLayer extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentByTemplate {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cae1916c-cb09-11f0-ad08-33c52acb975f");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.microservice.servicelayer.javamodel.IServiceComponent> selectServices();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IDomainModelConcept selectDomainConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cae1916c-cb09-11f0-ad08-33c52acb975f,69Fa92tQYkXlowCy25zyZcke3zE=] */
