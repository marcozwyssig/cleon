package cleon.modelinglanguages.network.spec.network;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2ef7e101-7aca-11e9-a70f-4dc03941a024,imports]] */
import cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_Mask;
import cleon.modelinglanguages.network.spec.network.ipv4.javamodel.SubnetUtils;

/* End Protected Region   [[2ef7e101-7aca-11e9-a70f-4dc03941a024,imports]] */

public class FunctionSpace_Network {

  /* Begin Protected Region [[2ef7e101-7aca-11e9-a70f-4dc03941a024]] */
  
  /* End Protected Region   [[2ef7e101-7aca-11e9-a70f-4dc03941a024]] */


  public static interface IAbstractNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("37ecf846-7aca-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkAware> GetParents();

    @IDynamicResourceExtension.MethodId("8c46e672-7aca-11e9-a70f-4dc03941a024")
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange GetIPRange();

  }
  
  public static interface IAbstractNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractNetworkFunctionsImpl implements IAbstractNetworkFunctionsImpl {

    public static final IAbstractNetworkFunctionsImpl INSTANCE = new AbstractNetworkFunctionsImpl();

    private AbstractNetworkFunctionsImpl() {}

  }
  
  public static class AbstractNetworkFunctions {

    private AbstractNetworkFunctions() {}

  }

  public static interface IAbstractPhysicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ba66d8e3-7acc-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkAware> GetParents();

    @IDynamicResourceExtension.MethodId("c459d826-7b90-11e9-94aa-f1ea7ea33f46")
    public java.lang.String SubnetMask();

    @IDynamicResourceExtension.MethodId("ffbb2544-7b91-11e9-94aa-f1ea7ea33f46")
    public java.lang.String Broadcast();

    @IDynamicResourceExtension.MethodId("04ae8aa0-7b92-11e9-94aa-f1ea7ea33f46")
    public java.lang.String NetworkAddress();

  }
  
  public static interface IAbstractPhysicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c459d826-7b90-11e9-94aa-f1ea7ea33f46")
    public java.lang.String SubnetMask(final cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork abstractPhysicalNetwork);

    @IDynamicResourceExtension.MethodId("ffbb2544-7b91-11e9-94aa-f1ea7ea33f46")
    public java.lang.String Broadcast(final cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork abstractPhysicalNetwork);

    @IDynamicResourceExtension.MethodId("04ae8aa0-7b92-11e9-94aa-f1ea7ea33f46")
    public java.lang.String NetworkAddress(final cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork abstractPhysicalNetwork);

  }
  
  public static class AbstractPhysicalNetworkFunctionsImpl implements IAbstractPhysicalNetworkFunctionsImpl {

    public static final IAbstractPhysicalNetworkFunctionsImpl INSTANCE = new AbstractPhysicalNetworkFunctionsImpl();

    private AbstractPhysicalNetworkFunctionsImpl() {}

    @Override
    public java.lang.String SubnetMask(final cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork abstractPhysicalNetwork) {
      /* Begin Protected Region [[c459d826-7b90-11e9-94aa-f1ea7ea33f46]] */
    	IIPv4_Mask cidr = abstractPhysicalNetwork.selectCidr();
    	SubnetUtils subnet = new SubnetUtils(cidr.selectIPv4() + "/" + cidr.selectMask());
    	return subnet.getInfo().getNetmask();  
      /* End Protected Region   [[c459d826-7b90-11e9-94aa-f1ea7ea33f46]] */
    }

    @Override
    public java.lang.String Broadcast(final cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork abstractPhysicalNetwork) {
      /* Begin Protected Region [[ffbb2544-7b91-11e9-94aa-f1ea7ea33f46]] */
    	IIPv4_Mask cidr = abstractPhysicalNetwork.selectCidr();
    	SubnetUtils subnet = new SubnetUtils(cidr.selectIPv4() + "/" + cidr.selectMask());
    	return subnet.getInfo().getBroadcastAddress();
      /* End Protected Region   [[ffbb2544-7b91-11e9-94aa-f1ea7ea33f46]] */
    }

    @Override
    public java.lang.String NetworkAddress(final cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork abstractPhysicalNetwork) {
      /* Begin Protected Region [[04ae8aa0-7b92-11e9-94aa-f1ea7ea33f46]] */
    	IIPv4_Mask cidr = abstractPhysicalNetwork.selectCidr();
    	SubnetUtils subnet = new SubnetUtils(cidr.selectIPv4() + "/" + cidr.selectMask());
    	return subnet.getInfo().getNetworkAddress();    
      /* End Protected Region   [[04ae8aa0-7b92-11e9-94aa-f1ea7ea33f46]] */
    }

  }
  
  public static class AbstractPhysicalNetworkFunctions {

    private AbstractPhysicalNetworkFunctions() {}

    public static java.lang.String SubnetMask(final cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork abstractPhysicalNetwork) {
      return DynamicResourceUtil.invoke(IAbstractPhysicalNetworkFunctionsImpl.class, AbstractPhysicalNetworkFunctionsImpl.INSTANCE, abstractPhysicalNetwork).SubnetMask(abstractPhysicalNetwork);
    }

    public static java.lang.String Broadcast(final cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork abstractPhysicalNetwork) {
      return DynamicResourceUtil.invoke(IAbstractPhysicalNetworkFunctionsImpl.class, AbstractPhysicalNetworkFunctionsImpl.INSTANCE, abstractPhysicalNetwork).Broadcast(abstractPhysicalNetwork);
    }

    public static java.lang.String NetworkAddress(final cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork abstractPhysicalNetwork) {
      return DynamicResourceUtil.invoke(IAbstractPhysicalNetworkFunctionsImpl.class, AbstractPhysicalNetworkFunctionsImpl.INSTANCE, abstractPhysicalNetwork).NetworkAddress(abstractPhysicalNetwork);
    }

  }

  public static interface IAbstractNetworkAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fdfe289e-7acc-11e9-a70f-4dc03941a024")
    public List<cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkAware> GetParents();

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
    public List<cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkAware> GetParents();

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
    public List<cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkAware> GetParents();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2ef7e101-7aca-11e9-a70f-4dc03941a024,KKBrMaRAjkFbfEL2NfU76k7e1vg=] */
