package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemConfiguration extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.resources.metamodel.spec.naming.javamodel.IMandatoryShortName, cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.INamedComponent, cleon.architecturemethods.arc42.metamodel.spec._14_requirements_coverage.javamodel.IBuildingBlockRequirementCoverage, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IOverrideShortNameAware, cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.INotes, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystemOrSystemConfiguration, cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4e0a6f85-e0fb-11e8-8499-a3b0fb3cad90");
  
  public java.lang.Boolean selectAllowDNSRecord();
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationDependency> selectHasDependency();
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectInSubZone();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectInheritServices();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> selectProvides();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface> selectInterface();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationProperty> selectProperties();
  
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestination selectDestinationCommunications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4e0a6f85-e0fb-11e8-8499-a3b0fb3cad90,vOqE96DrK5Tg0W85jtTXeTn9FMg=] */
