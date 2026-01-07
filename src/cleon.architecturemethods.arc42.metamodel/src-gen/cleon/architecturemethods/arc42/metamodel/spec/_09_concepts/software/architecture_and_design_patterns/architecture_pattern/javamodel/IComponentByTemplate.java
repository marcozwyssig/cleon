package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComponentByTemplate extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("26c798cd-e598-11f0-a60c-db015d172622");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentTemplate selectComponentTemplate();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentByTemplate> selectComponents();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,26c798cd-e598-11f0-a60c-db015d172622,nMY05gV5SKBXd3oc/Cd38gkXxWo=] */
