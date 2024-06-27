package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSiteWithFunctionID extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bc8dc18d-3633-11ea-b5c2-e3e297a45d39");
  
  // attributes
  
  public java.lang.Integer selectFunctionID();
  
  public java.lang.String selectSiteShortName();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectSkipHostGenerationFor();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bc8dc18d-3633-11ea-b5c2-e3e297a45d39,WI1BfqkdwL0mqXBSYSbSo1Y3PQM=] */
