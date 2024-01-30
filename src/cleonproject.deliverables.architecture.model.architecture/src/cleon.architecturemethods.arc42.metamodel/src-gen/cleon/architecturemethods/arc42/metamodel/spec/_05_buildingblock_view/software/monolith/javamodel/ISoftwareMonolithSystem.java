package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwareMonolithSystem extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b064943e-bf7e-11ee-b188-131fa688415c");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel.ISoftwareMonolithApplication> selectApplications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b064943e-bf7e-11ee-b188-131fa688415c,8wUHADBOM6lX5Nr5tc7Zfhb/cvU=] */
