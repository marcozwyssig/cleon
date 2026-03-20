package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.microservice.servicelayer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDomainServiceComponent extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.microservice.servicelayer.javamodel.IServiceComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a916aa13-247e-11f1-8a5a-5da401746046");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IBoundedContext selectBoundedContext();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a916aa13-247e-11f1-8a5a-5da401746046,BjZkD1bOtdmgLhfS0e1FcQntIWQ=] */
