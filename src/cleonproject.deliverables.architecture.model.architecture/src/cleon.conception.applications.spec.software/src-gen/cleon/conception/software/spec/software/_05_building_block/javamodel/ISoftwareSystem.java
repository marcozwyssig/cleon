package cleon.conception.software.spec.software._05_building_block.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwareSystem extends cleon.conception.framework.spec.arc42._03_system_scope_and_context.javamodel.ISystem, cleon.conception.uml.spec.uml.structural.components.javamodel.IAbstractComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9237e4d5-4aa3-11e6-9c0f-393d355c5fe3");
  
  // relations
  
  public java.util.List<? extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9237e4d5-4aa3-11e6-9c0f-393d355c5fe3,gngUjenQPmoutZDhEyh8elYXvzE=] */
