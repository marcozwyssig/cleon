package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TN extends DynamicResource implements ITN {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITN> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITN>() {
    
    @Override
    public ITN create() {
      return new TN();
    }
    
    @Override
    public ITN create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TN(resourceRepository, resource);
    }
  
  };

  public TN() {
    super(ITN.TYPE_ID);
  }
  
  public TN(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITN.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectFunctionID() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithFunctionID_functionID);
  }
    
  public void setFunctionID(java.lang.Integer functionID) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithFunctionID_functionID, functionID);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectOwner() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.OwnerAware_owner);
  }
    
  public void setOwner(java.lang.String owner) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.OwnerAware_owner, owner);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.naming.NamingPackage.ShortName_shortName, shortName);
  }

  @Override
  public java.lang.String selectSiteShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithFunctionID_siteShortName);
  }
    
  public void setSiteShortName(java.lang.String siteShortName) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithFunctionID_siteShortName, siteShortName);
  }

  @Override
  public java.lang.Boolean selectSkipMonitoringGeneration() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.SkipMonitoringAware_skipMonitoringGeneration);
  }
    
  public void setSkipMonitoringGeneration(java.lang.Boolean skipMonitoringGeneration) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.SkipMonitoringAware_skipMonitoringGeneration, skipMonitoringGeneration);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectAllowAccessWith() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSite_allowAccessWith);
  }

  public TN setAllowAccessWith(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> allowAccessWith) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSite_allowAccessWith, allowAccessWith);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISite> selectAllowedToManage() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSite_allowedToManage);
  }

  public TN setAllowedToManage(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISite> allowedToManage) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSite_allowedToManage, allowedToManage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN> selectHss() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Multi_aE_TN_hss);
  }

  public TN setHss(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN> hss) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Multi_aE_TN_hss, hss);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IManagedRN> selectManagedBy() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IManagedRN.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Multi_aE_TN_managedBy);
  }

  public TN setManagedBy(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IManagedRN> managedBy) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Multi_aE_TN_managedBy, managedBy);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN> selectMss() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.TN_mss);
  }

  public TN setMss(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN> mss) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.TN_mss, mss);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IManagedRN> selectNoManagedBy() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IManagedRN.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.TN_noManagedBy);
  }

  public TN setNoManagedBy(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IManagedRN> noManagedBy) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.TN_noManagedBy, noManagedBy);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectSkipHostGenerationFor() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithFunctionID_skipHostGenerationFor);
  }

  public TN setSkipHostGenerationFor(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> skipHostGenerationFor) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithFunctionID_skipHostGenerationFor, skipHostGenerationFor);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectSubsite() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteComposition_subsite);
  }

  public TN setSubsite(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> subsite) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteComposition_subsite, subsite);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITDM> selectTdm() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITDM.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Multi_aE_TN_tdm);
  }

  public TN setTdm(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITDM> tdm) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Multi_aE_TN_tdm, tdm);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TN setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithFunctionID_functionID, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.OwnerAware_owner, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.ShortName_shortName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithFunctionID_siteShortName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.SkipMonitoringAware_skipMonitoringGeneration, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSite_allowAccessWith, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSite_allowedToManage, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Multi_aE_TN_hss, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.TN_mss, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithFunctionID_skipHostGenerationFor, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITDM.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Multi_aE_TN_tdm, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITN selectToMeMss(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITN.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.TN_mss, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITN selectToMeNoManagedBy(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IManagedRN object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITN.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.TN_noManagedBy, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c0a851b6-9286-11e9-959e-8115c2f9e41e,y9y8Q5susSKViaNd7SzqEK7M8Ek=] */
