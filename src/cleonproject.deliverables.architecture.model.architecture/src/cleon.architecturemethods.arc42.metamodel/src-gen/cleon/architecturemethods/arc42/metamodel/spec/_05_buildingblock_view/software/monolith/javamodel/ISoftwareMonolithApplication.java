package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwareMonolithApplication extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.INamedComponentComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f3fd43df-bf7e-11ee-b188-131fa688415c");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel.ISoftwareMonolithComponent> selectComponents();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f3fd43df-bf7e-11ee-b188-131fa688415c,8kR09Ke0aA+dADMN/HcDAfqPfXA=] */
