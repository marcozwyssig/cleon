package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.architecture_pattern.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwareArchitecturePattern extends cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISoftwareSystem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("80b2c98b-cb09-11f0-ad08-33c52acb975f");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IArchitecturePattern selectArchitecturePattern();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentByTemplate> selectComponents();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,80b2c98b-cb09-11f0-ad08-33c52acb975f,OpIIvj9r7RgZk99Rgs54nj5J4AY=] */
