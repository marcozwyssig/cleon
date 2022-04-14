package cleon.modelinglanguages.network.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2ef7e101-7aca-11e9-a70f-4dc03941a024,imports]] */
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.*;
import cleon.modelinglanguages.network.metamodel.spec.javamodel.AbstractPhysicalNetwork;
import cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork;
import java.util.ArrayList;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IAbstractIPv4Functions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_MaskFunctions;
/* End Protected Region   [[2ef7e101-7aca-11e9-a70f-4dc03941a024,imports]] */

public class FunctionSpace_Network {

  /* Begin Protected Region [[2ef7e101-7aca-11e9-a70f-4dc03941a024]] */

  /* End Protected Region   [[2ef7e101-7aca-11e9-a70f-4dc03941a024]] */


  public static interface IAbstractNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("37ecf846-7aca-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkAware> GetParents();

    @IDynamicResourceExtension.MethodId("8c46e672-7aca-11e9-a70f-4dc03941a024")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange GetIPRange();

    @IDynamicResourceExtension.MethodId("e8f74219-6e87-11ea-b8e8-f1a46e0c42f7")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> OnlyWithNodes();

    @IDynamicResourceExtension.MethodId("ae237bf5-6e88-11ea-b8e8-f1a46e0c42f7")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractPhysicalNetwork> GetAllPhysicalNetworks();

  }
  
  public static interface IAbstractNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e8f74219-6e87-11ea-b8e8-f1a46e0c42f7")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> OnlyWithNodes(final List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> abstractNetworkList);

  }
  
  public static class AbstractNetworkFunctionsImpl implements IAbstractNetworkFunctionsImpl {

    public static final IAbstractNetworkFunctionsImpl INSTANCE = new AbstractNetworkFunctionsImpl();

    private AbstractNetworkFunctionsImpl() {}

    @Override
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> OnlyWithNodes(final List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> abstractNetworkList) {
      /* Begin Protected Region [[e8f74219-6e87-11ea-b8e8-f1a46e0c42f7]] */
      final ArrayList<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> list = new ArrayList<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork>();
      for( final IAbstractNetwork network : abstractNetworkList ) {
      	final boolean anyMatch = network.extension(IAbstractNetworkFunctions.class).GetAllPhysicalNetworks().stream().anyMatch(x-> !x.selectNodes().values().isEmpty());
      	if( anyMatch ) {
      		list.add(network);
      	}    		
      }
      return list;   
      /* End Protected Region   [[e8f74219-6e87-11ea-b8e8-f1a46e0c42f7]] */
    }

  }
  
  public static class AbstractNetworkFunctions {

    private AbstractNetworkFunctions() {}

    public static List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> OnlyWithNodes(final List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> abstractNetworkList) {
      return DynamicResourceUtil.invoke(IAbstractNetworkFunctionsImpl.class, AbstractNetworkFunctionsImpl.INSTANCE, abstractNetworkList).OnlyWithNodes(abstractNetworkList);
    }

  }

  public static interface IAbstractPhysicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ba66d8e3-7acc-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkAware> GetParents();

    @IDynamicResourceExtension.MethodId("e7d5af53-6e88-11ea-b8e8-f1a46e0c42f7")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractPhysicalNetwork> GetAllPhysicalNetworks();

  }
  
  public static interface IAbstractPhysicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractPhysicalNetworkFunctionsImpl implements IAbstractPhysicalNetworkFunctionsImpl {

    public static final IAbstractPhysicalNetworkFunctionsImpl INSTANCE = new AbstractPhysicalNetworkFunctionsImpl();

    private AbstractPhysicalNetworkFunctionsImpl() {}

  }
  
  public static class AbstractPhysicalNetworkFunctions {

    private AbstractPhysicalNetworkFunctions() {}

  }

  public static interface IAbstractNetworkAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fdfe289e-7acc-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkAware> GetParents();

    @IDynamicResourceExtension.MethodId("00bbe456-6e89-11ea-b8e8-f1a46e0c42f7")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractPhysicalNetwork> GetAllPhysicalNetworks();

  }
  
  public static interface IAbstractNetworkAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractNetworkAwareFunctionsImpl implements IAbstractNetworkAwareFunctionsImpl {

    public static final IAbstractNetworkAwareFunctionsImpl INSTANCE = new AbstractNetworkAwareFunctionsImpl();

    private AbstractNetworkAwareFunctionsImpl() {}

  }
  
  public static class AbstractNetworkAwareFunctions {

    private AbstractNetworkAwareFunctions() {}

  }

  public static interface IAbstractLogicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d5cce544-7acd-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkAware> GetParents();

    @IDynamicResourceExtension.MethodId("0463e90b-6e8a-11ea-b8e8-f1a46e0c42f7")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractPhysicalNetwork> GetAllPhysicalNetworks();

  }
  
  public static interface IAbstractLogicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractLogicalNetworkFunctionsImpl implements IAbstractLogicalNetworkFunctionsImpl {

    public static final IAbstractLogicalNetworkFunctionsImpl INSTANCE = new AbstractLogicalNetworkFunctionsImpl();

    private AbstractLogicalNetworkFunctionsImpl() {}

  }
  
  public static class AbstractLogicalNetworkFunctions {

    private AbstractLogicalNetworkFunctions() {}

  }

  public static interface IAbstractNetworksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f1e03dad-7acd-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkAware> GetParents();

  }
  
  public static interface IAbstractNetworksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractNetworksFunctionsImpl implements IAbstractNetworksFunctionsImpl {

    public static final IAbstractNetworksFunctionsImpl INSTANCE = new AbstractNetworksFunctionsImpl();

    private AbstractNetworksFunctionsImpl() {}

  }
  
  public static class AbstractNetworksFunctions {

    private AbstractNetworksFunctions() {}

  }

  public static interface IAbstractNetworkNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a37c1622-ca55-11e9-83b0-559396620907")
    public java.lang.String Name();

    @IDynamicResourceExtension.MethodId("c9e02962-7b97-11e9-94aa-f1ea7ea33f46")
    public java.lang.String SubnetMask();

    @IDynamicResourceExtension.MethodId("c9e05074-7b97-11e9-94aa-f1ea7ea33f46")
    public java.lang.String Broadcast();

    @IDynamicResourceExtension.MethodId("c9e09e96-7b97-11e9-94aa-f1ea7ea33f46")
    public java.lang.String NetworkAddress();

    @IDynamicResourceExtension.MethodId("17b56361-cff2-11ea-99e7-03141914df18")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask Cidr();

  }
  
  public static interface IAbstractNetworkNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("17b56361-cff2-11ea-99e7-03141914df18")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask Cidr(final cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode abstractNetworkNode);

  }
  
  public static class AbstractNetworkNodeFunctionsImpl implements IAbstractNetworkNodeFunctionsImpl {

    public static final IAbstractNetworkNodeFunctionsImpl INSTANCE = new AbstractNetworkNodeFunctionsImpl();

    private AbstractNetworkNodeFunctionsImpl() {}

    @Override
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask Cidr(final cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode abstractNetworkNode) {
      /* Begin Protected Region [[17b56361-cff2-11ea-99e7-03141914df18]] */
      final List<? extends IIPv4_Mask> cidrs =  AbstractPhysicalNetwork.selectToMeNodes(abstractNetworkNode).selectCidrs();
      final IAbstractIPv4Functions abstractIPv4Functions = abstractNetworkNode.selectIPv4_D().extension(IAbstractIPv4Functions.class);
      final String  ipv4 = abstractIPv4Functions.SimpleName();
      return cidrs.stream().filter(x -> {
      	if( x.selectMask() == 32 ) {
      		//Logger.instance().logInfo("Compare " + ipv4 + " with " + x.selectIPv4());
      		return x.selectIPv4().equals(ipv4);
      	} else {
      		final IIPv4_MaskFunctions functions = x.extension(IIPv4_MaskFunctions.class);
      		final String displayName = functions.DisplayName();
      		final SubnetUtils subnetUtils = new SubnetUtils(displayName);      	
      		return subnetUtils.getInfo().isInRange(ipv4);    		  
      	}
      }).findFirst().orElseThrow();
      /* End Protected Region   [[17b56361-cff2-11ea-99e7-03141914df18]] */
    }

  }
  
  public static class AbstractNetworkNodeFunctions {

    private AbstractNetworkNodeFunctions() {}

    public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask Cidr(final cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode abstractNetworkNode) {
      return DynamicResourceUtil.invoke(IAbstractNetworkNodeFunctionsImpl.class, AbstractNetworkNodeFunctionsImpl.INSTANCE, abstractNetworkNode).Cidr(abstractNetworkNode);
    }

  }

  public static interface IGatewayNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5d8b6c2f-3ecc-11ea-9af7-ad5bf30c585a")
    public java.lang.String Name();

  }
  
  public static interface IGatewayNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GatewayNodeFunctionsImpl implements IGatewayNodeFunctionsImpl {

    public static final IGatewayNodeFunctionsImpl INSTANCE = new GatewayNodeFunctionsImpl();

    private GatewayNodeFunctionsImpl() {}

  }
  
  public static class GatewayNodeFunctions {

    private GatewayNodeFunctions() {}

  }

  public static interface INamedNetworkNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("63c226ce-3ecc-11ea-9af7-ad5bf30c585a")
    public java.lang.String Name();

  }
  
  public static interface INamedNetworkNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedNetworkNodeFunctionsImpl implements INamedNetworkNodeFunctionsImpl {

    public static final INamedNetworkNodeFunctionsImpl INSTANCE = new NamedNetworkNodeFunctionsImpl();

    private NamedNetworkNodeFunctionsImpl() {}

  }
  
  public static class NamedNetworkNodeFunctions {

    private NamedNetworkNodeFunctions() {}

  }

  public static interface INetworkSubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f0059be4-4cf1-11ea-b2c1-57c8b0ec51b7")
    public java.lang.String Vlan();

  }
  
  public static interface INetworkSubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NetworkSubZoneFunctionsImpl implements INetworkSubZoneFunctionsImpl {

    public static final INetworkSubZoneFunctionsImpl INSTANCE = new NetworkSubZoneFunctionsImpl();

    private NetworkSubZoneFunctionsImpl() {}

  }
  
  public static class NetworkSubZoneFunctions {

    private NetworkSubZoneFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2ef7e101-7aca-11e9-a70f-4dc03941a024,Zs+UTLTwW+yvLztAhoKOSYTN2sA=] */
