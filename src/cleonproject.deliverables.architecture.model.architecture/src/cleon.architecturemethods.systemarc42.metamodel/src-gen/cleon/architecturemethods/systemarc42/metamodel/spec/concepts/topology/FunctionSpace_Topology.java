package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7b6d94a1-9370-11e9-8139-e76b19cfb4bf,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithFunctionID;
import java.util.stream.Collectors;
/* End Protected Region   [[7b6d94a1-9370-11e9-8139-e76b19cfb4bf,imports]] */

public class FunctionSpace_Topology {

  /* Begin Protected Region [[7b6d94a1-9370-11e9-8139-e76b19cfb4bf]] */
  
  /* End Protected Region   [[7b6d94a1-9370-11e9-8139-e76b19cfb4bf]] */


  public static interface ISiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8accd30d-9370-11e9-8139-e76b19cfb4bf")
    public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology Topology();

    @IDynamicResourceExtension.MethodId("6c917753-9375-11e9-8139-e76b19cfb4bf")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> AllAbstractNetdomainHosts();

    @IDynamicResourceExtension.MethodId("2e419e47-941f-11e9-bbdf-9b4dacbbf865")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> AllZones();

    @IDynamicResourceExtension.MethodId("ad33683d-3775-11ea-bb06-17b9485a5d0a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithFunctionID> sortByFunctionId();

  }
  
  public static interface ISiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ad33683d-3775-11ea-bb06-17b9485a5d0a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithFunctionID> sortByFunctionId(final List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite> siteList);

  }
  
  public static class SiteFunctionsImpl implements ISiteFunctionsImpl {

    public static final ISiteFunctionsImpl INSTANCE = new SiteFunctionsImpl();

    private SiteFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithFunctionID> sortByFunctionId(final List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite> siteList) {
      /* Begin Protected Region [[ad33683d-3775-11ea-bb06-17b9485a5d0a]] */
    	return siteList.stream().filter(x -> x instanceof IAbstractSiteWithFunctionID).map(x -> (IAbstractSiteWithFunctionID)x).sorted(java.util.Comparator.comparing(IAbstractSiteWithFunctionID::selectFunctionID)).collect(Collectors.toList());   
      /* End Protected Region   [[ad33683d-3775-11ea-bb06-17b9485a5d0a]] */
    }

  }
  
  public static class SiteFunctions {

    private SiteFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithFunctionID> sortByFunctionId(final List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite> siteList) {
      return DynamicResourceUtil.invoke(ISiteFunctionsImpl.class, SiteFunctionsImpl.INSTANCE, siteList).sortByFunctionId(siteList);
    }

  }

  public static interface IRNFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a808f3f8-9370-11e9-8139-e76b19cfb4bf")
    public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology Topology();

    @IDynamicResourceExtension.MethodId("58d0d9f3-941f-11e9-bbdf-9b4dacbbf865")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> AllZones();

  }
  
  public static interface IRNFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RNFunctionsImpl implements IRNFunctionsImpl {

    public static final IRNFunctionsImpl INSTANCE = new RNFunctionsImpl();

    private RNFunctionsImpl() {}

  }
  
  public static class RNFunctions {

    private RNFunctions() {}

  }

  public static interface ITNFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8612b3b3-9375-11e9-8139-e76b19cfb4bf")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> AllAbstractNetdomainHosts();

    @IDynamicResourceExtension.MethodId("cb247f83-941d-11e9-bbdf-9b4dacbbf865")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> IP();

    @IDynamicResourceExtension.MethodId("dc4bfb26-941d-11e9-bbdf-9b4dacbbf865")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> TDM();

    @IDynamicResourceExtension.MethodId("65380d4d-941f-11e9-bbdf-9b4dacbbf865")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> AllZones();

  }
  
  public static interface ITNFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TNFunctionsImpl implements ITNFunctionsImpl {

    public static final ITNFunctionsImpl INSTANCE = new TNFunctionsImpl();

    private TNFunctionsImpl() {}

  }
  
  public static class TNFunctions {

    private TNFunctions() {}

  }

  public static interface IAbstractSiteWithHostsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a3a3f9cd-9375-11e9-8139-e76b19cfb4bf")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> AllAbstractNetdomainHosts();

    @IDynamicResourceExtension.MethodId("6b666867-deae-11e9-b714-478bec98e62d")
    public java.lang.String GroupNameOld(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("8ada83c1-0aa1-11ea-97f4-9d91b2097bad")
    public java.lang.String GroupName(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration systemConfiguration, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone);

    @IDynamicResourceExtension.MethodId("5e11ab82-deaf-11e9-b714-478bec98e62d")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> UsedZones(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("1351e2e7-df72-11e9-9827-a1514ee8d06a")
    public java.lang.String Guid(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("205b7ce9-e051-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration> AllSystemConfiguration();

    @IDynamicResourceExtension.MethodId("30077b36-e051-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration> AllSystemConfigurationDistinct();

    @IDynamicResourceExtension.MethodId("74d772a9-e076-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication> AllCommunications();

    @IDynamicResourceExtension.MethodId("8f5cb108-e076-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication> AllCommunicationsDistinct();

  }
  
  public static interface IAbstractSiteWithHostsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSiteWithHostsFunctionsImpl implements IAbstractSiteWithHostsFunctionsImpl {

    public static final IAbstractSiteWithHostsFunctionsImpl INSTANCE = new AbstractSiteWithHostsFunctionsImpl();

    private AbstractSiteWithHostsFunctionsImpl() {}

  }
  
  public static class AbstractSiteWithHostsFunctions {

    private AbstractSiteWithHostsFunctions() {}

  }

  public static interface ITDMFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8289bc8e-93e1-11e9-8139-e76b19cfb4bf")
    public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology Topology();

    @IDynamicResourceExtension.MethodId("8016901b-941f-11e9-bbdf-9b4dacbbf865")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> AllZones();

  }
  
  public static interface ITDMFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TDMFunctionsImpl implements ITDMFunctionsImpl {

    public static final ITDMFunctionsImpl INSTANCE = new TDMFunctionsImpl();

    private TDMFunctionsImpl() {}

  }
  
  public static class TDMFunctions {

    private TDMFunctions() {}

  }

  public static interface ICentralSiteFunctions extends IDynamicResourceExtension {

  }
  
  public static interface ICentralSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CentralSiteFunctionsImpl implements ICentralSiteFunctionsImpl {

    public static final ICentralSiteFunctionsImpl INSTANCE = new CentralSiteFunctionsImpl();

    private CentralSiteFunctionsImpl() {}

  }
  
  public static class CentralSiteFunctions {

    private CentralSiteFunctions() {}

  }

  public static interface IAbstractSiteWithZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("88d184ca-941f-11e9-bbdf-9b4dacbbf865")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> AllZones();

  }
  
  public static interface IAbstractSiteWithZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSiteWithZoneFunctionsImpl implements IAbstractSiteWithZoneFunctionsImpl {

    public static final IAbstractSiteWithZoneFunctionsImpl INSTANCE = new AbstractSiteWithZoneFunctionsImpl();

    private AbstractSiteWithZoneFunctionsImpl() {}

  }
  
  public static class AbstractSiteWithZoneFunctions {

    private AbstractSiteWithZoneFunctions() {}

  }

  public static interface IAbstractHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6876a694-fb12-11e9-890e-576c93cea08c")
    public java.lang.String ShortName();

    @IDynamicResourceExtension.MethodId("9d2e0ada-0780-11ea-8638-e775d7e940cc")
    public java.lang.String SiteName();

    @IDynamicResourceExtension.MethodId("738023f9-09f0-11ea-baed-218c3e076b56")
    public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts Site();

  }
  
  public static interface IAbstractHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractHostFunctionsImpl implements IAbstractHostFunctionsImpl {

    public static final IAbstractHostFunctionsImpl INSTANCE = new AbstractHostFunctionsImpl();

    private AbstractHostFunctionsImpl() {}

  }
  
  public static class AbstractHostFunctions {

    private AbstractHostFunctions() {}

  }

  public static interface IStackHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8e5181ea-fb12-11e9-890e-576c93cea08c")
    public java.lang.String ShortName();

  }
  
  public static interface IStackHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StackHostFunctionsImpl implements IStackHostFunctionsImpl {

    public static final IStackHostFunctionsImpl INSTANCE = new StackHostFunctionsImpl();

    private StackHostFunctionsImpl() {}

  }
  
  public static class StackHostFunctions {

    private StackHostFunctions() {}

  }

  public static interface IHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("945f300c-fb12-11e9-890e-576c93cea08c")
    public java.lang.String ShortName();

  }
  
  public static interface IHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HostFunctionsImpl implements IHostFunctionsImpl {

    public static final IHostFunctionsImpl INSTANCE = new HostFunctionsImpl();

    private HostFunctionsImpl() {}

  }
  
  public static class HostFunctions {

    private HostFunctions() {}

  }

  public static interface IClusterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("95b634af-fb12-11e9-890e-576c93cea08c")
    public java.lang.String ShortName();

  }
  
  public static interface IClusterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ClusterFunctionsImpl implements IClusterFunctionsImpl {

    public static final IClusterFunctionsImpl INSTANCE = new ClusterFunctionsImpl();

    private ClusterFunctionsImpl() {}

  }
  
  public static class ClusterFunctions {

    private ClusterFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7b6d94a1-9370-11e9-8139-e76b19cfb4bf,w6YYwzU2rqTITbG+2kRxXMTJhXs=] */
