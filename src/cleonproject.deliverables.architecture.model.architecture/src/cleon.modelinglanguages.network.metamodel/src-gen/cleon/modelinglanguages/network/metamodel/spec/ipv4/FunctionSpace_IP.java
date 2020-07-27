package cleon.modelinglanguages.network.metamodel.spec.ipv4;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2fad7962-7232-11e9-8705-4f693d402426,imports]] */
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.*;
import java.util.Optional;
/* End Protected Region   [[2fad7962-7232-11e9-8705-4f693d402426,imports]] */

public class FunctionSpace_IP {

  /* Begin Protected Region [[2fad7962-7232-11e9-8705-4f693d402426]] */
  
  /* End Protected Region   [[2fad7962-7232-11e9-8705-4f693d402426]] */


  public static interface IAbstractIPv4Functions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3cc07de3-7232-11e9-8705-4f693d402426")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("43f55517-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IAbstractIPv4 Parent();

  }
  
  public static interface IAbstractIPv4FunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractIPv4FunctionsImpl implements IAbstractIPv4FunctionsImpl {

    public static final IAbstractIPv4FunctionsImpl INSTANCE = new AbstractIPv4FunctionsImpl();

    private AbstractIPv4FunctionsImpl() {}

  }
  
  public static class AbstractIPv4Functions {

    private AbstractIPv4Functions() {}

  }

  public static interface IIPv4_AFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7f8dae45-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IAbstractIPv4 Parent();

    @IDynamicResourceExtension.MethodId("8d5aa621-786c-11e9-97e0-b7c808aefc46")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B FindIP(final java.lang.String ip);

  }
  
  public static interface IIPv4_AFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7f8dae45-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IAbstractIPv4 Parent(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A iPv4_A);

    @IDynamicResourceExtension.MethodId("8d5aa621-786c-11e9-97e0-b7c808aefc46")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A iPv4_A);

  }
  
  public static class IPv4_AFunctionsImpl implements IIPv4_AFunctionsImpl {

    public static final IIPv4_AFunctionsImpl INSTANCE = new IPv4_AFunctionsImpl();

    private IPv4_AFunctionsImpl() {}

    @Override
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IAbstractIPv4 Parent(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A iPv4_A) {
      return null;
    }

    @Override
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A iPv4_A) {
      /* Begin Protected Region [[8d5aa621-786c-11e9-97e0-b7c808aefc46]] */
    	for( IIPv4_B ipv4 : iPv4_A.selectIPv4_B())
    	{
    		if( ipv4.selectIp().equals(Integer.parseInt(ip)))
    		{
    			return ipv4;
    		}
    	}
    	return null;      
      /* End Protected Region   [[8d5aa621-786c-11e9-97e0-b7c808aefc46]] */
    }

  }
  
  public static class IPv4_AFunctions {

    private IPv4_AFunctions() {}

    public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IAbstractIPv4 Parent(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A iPv4_A) {
      return DynamicResourceUtil.invoke(IIPv4_AFunctionsImpl.class, IPv4_AFunctionsImpl.INSTANCE, iPv4_A).Parent(iPv4_A);
    }

    public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A iPv4_A) {
      return DynamicResourceUtil.invoke(IIPv4_AFunctionsImpl.class, IPv4_AFunctionsImpl.INSTANCE, iPv4_A).FindIP(ip, iPv4_A);
    }

  }

  public static interface IIPv4_BFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("73956962-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IAbstractIPv4 Parent();

    @IDynamicResourceExtension.MethodId("92e394e1-786c-11e9-97e0-b7c808aefc46")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C FindIP(final java.lang.String ip);

  }
  
  public static interface IIPv4_BFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("92e394e1-786c-11e9-97e0-b7c808aefc46")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B iPv4_B);

  }
  
  public static class IPv4_BFunctionsImpl implements IIPv4_BFunctionsImpl {

    public static final IIPv4_BFunctionsImpl INSTANCE = new IPv4_BFunctionsImpl();

    private IPv4_BFunctionsImpl() {}

    @Override
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B iPv4_B) {
      /* Begin Protected Region [[92e394e1-786c-11e9-97e0-b7c808aefc46]] */
    	for( IIPv4_C ipv4 : iPv4_B.selectIPv4_C())
    	{
    		if( ipv4.selectIp().equals(Integer.parseInt(ip)))
    		{
    			return ipv4;
    		}
    	}
    	return null;       
      /* End Protected Region   [[92e394e1-786c-11e9-97e0-b7c808aefc46]] */
    }

  }
  
  public static class IPv4_BFunctions {

    private IPv4_BFunctions() {}

    public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B iPv4_B) {
      return DynamicResourceUtil.invoke(IIPv4_BFunctionsImpl.class, IPv4_BFunctionsImpl.INSTANCE, iPv4_B).FindIP(ip, iPv4_B);
    }

  }

  public static interface IIPv4_CFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("73201234-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IAbstractIPv4 Parent();

    @IDynamicResourceExtension.MethodId("99ef5200-786c-11e9-97e0-b7c808aefc46")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D FindIP(final java.lang.String ip);

  }
  
  public static interface IIPv4_CFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("99ef5200-786c-11e9-97e0-b7c808aefc46")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C iPv4_C);

  }
  
  public static class IPv4_CFunctionsImpl implements IIPv4_CFunctionsImpl {

    public static final IIPv4_CFunctionsImpl INSTANCE = new IPv4_CFunctionsImpl();

    private IPv4_CFunctionsImpl() {}

    @Override
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C iPv4_C) {
      /* Begin Protected Region [[99ef5200-786c-11e9-97e0-b7c808aefc46]] */
    	for( IIPv4_D ipv4 : iPv4_C.selectIPv4_D())
    	{
    		if( ipv4.selectIp().equals(Integer.parseInt(ip)))
    		{
    			return ipv4;
    		}
    	}
    	return null;       
      /* End Protected Region   [[99ef5200-786c-11e9-97e0-b7c808aefc46]] */
    }

  }
  
  public static class IPv4_CFunctions {

    private IPv4_CFunctions() {}

    public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C iPv4_C) {
      return DynamicResourceUtil.invoke(IIPv4_CFunctionsImpl.class, IPv4_CFunctionsImpl.INSTANCE, iPv4_C).FindIP(ip, iPv4_C);
    }

  }

  public static interface IIPv4_DFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("678a3870-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IAbstractIPv4 Parent();

    @IDynamicResourceExtension.MethodId("8d9e3651-36e8-11ea-bb06-17b9485a5d0a")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C IPv4_C();

    @IDynamicResourceExtension.MethodId("ad96dfec-36e8-11ea-bb06-17b9485a5d0a")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B IPv4_B();

    @IDynamicResourceExtension.MethodId("bb126981-36e8-11ea-bb06-17b9485a5d0a")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A IPv4_A();

  }
  
  public static interface IIPv4_DFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IPv4_DFunctionsImpl implements IIPv4_DFunctionsImpl {

    public static final IIPv4_DFunctionsImpl INSTANCE = new IPv4_DFunctionsImpl();

    private IPv4_DFunctionsImpl() {}

  }
  
  public static class IPv4_DFunctions {

    private IPv4_DFunctions() {}

  }

  public static interface IIPv4_Mask_AwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5a0bd0bf-749a-11e9-8765-0925552fc2b7")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange SelectIPRange();

  }
  
  public static interface IIPv4_Mask_AwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IPv4_Mask_AwareFunctionsImpl implements IIPv4_Mask_AwareFunctionsImpl {

    public static final IIPv4_Mask_AwareFunctionsImpl INSTANCE = new IPv4_Mask_AwareFunctionsImpl();

    private IPv4_Mask_AwareFunctionsImpl() {}

  }
  
  public static class IPv4_Mask_AwareFunctions {

    private IPv4_Mask_AwareFunctions() {}

  }

  public static interface IAbstractNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6b37432f-749a-11e9-8765-0925552fc2b7")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange SelectIPRange();

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

  public static interface IIPv4_MaskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a9ca8c66-749a-11e9-8765-0925552fc2b7")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange SelectIPRange();

    @IDynamicResourceExtension.MethodId("c459d826-7b90-11e9-94aa-f1ea7ea33f46")
    public java.lang.String SubnetMask();

    @IDynamicResourceExtension.MethodId("ffbb2544-7b91-11e9-94aa-f1ea7ea33f46")
    public java.lang.String Broadcast();

    @IDynamicResourceExtension.MethodId("04ae8aa0-7b92-11e9-94aa-f1ea7ea33f46")
    public java.lang.String NetworkAddress();

    @IDynamicResourceExtension.MethodId("395edf32-cff4-11ea-9eba-a3ed39c8fa1a")
    public java.lang.String DisplayName();

  }
  
  public static interface IIPv4_MaskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c459d826-7b90-11e9-94aa-f1ea7ea33f46")
    public java.lang.String SubnetMask(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask iPv4_Mask);

    @IDynamicResourceExtension.MethodId("ffbb2544-7b91-11e9-94aa-f1ea7ea33f46")
    public java.lang.String Broadcast(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask iPv4_Mask);

    @IDynamicResourceExtension.MethodId("04ae8aa0-7b92-11e9-94aa-f1ea7ea33f46")
    public java.lang.String NetworkAddress(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask iPv4_Mask);

  }
  
  public static class IPv4_MaskFunctionsImpl implements IIPv4_MaskFunctionsImpl {

    public static final IIPv4_MaskFunctionsImpl INSTANCE = new IPv4_MaskFunctionsImpl();

    private IPv4_MaskFunctionsImpl() {}

    @Override
    public java.lang.String SubnetMask(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask iPv4_Mask) {
      /* Begin Protected Region [[c459d826-7b90-11e9-94aa-f1ea7ea33f46]] */
    	SubnetUtils subnet = new SubnetUtils(iPv4_Mask.selectIPv4() + "/" + iPv4_Mask.selectMask());
    	return subnet.getInfo().getNetmask();  
      /* End Protected Region   [[c459d826-7b90-11e9-94aa-f1ea7ea33f46]] */
    }

    @Override
    public java.lang.String Broadcast(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask iPv4_Mask) {
      /* Begin Protected Region [[ffbb2544-7b91-11e9-94aa-f1ea7ea33f46]] */
    	SubnetUtils subnet = new SubnetUtils(iPv4_Mask.selectIPv4() + "/" + iPv4_Mask.selectMask());
    	return subnet.getInfo().getBroadcastAddress();
      /* End Protected Region   [[ffbb2544-7b91-11e9-94aa-f1ea7ea33f46]] */
    }

    @Override
    public java.lang.String NetworkAddress(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask iPv4_Mask) {
      /* Begin Protected Region [[04ae8aa0-7b92-11e9-94aa-f1ea7ea33f46]] */
    	SubnetUtils subnet = new SubnetUtils(iPv4_Mask.selectIPv4() + "/" + iPv4_Mask.selectMask());
    	return subnet.getInfo().getNetworkAddress();   
      /* End Protected Region   [[04ae8aa0-7b92-11e9-94aa-f1ea7ea33f46]] */
    }

  }
  
  public static class IPv4_MaskFunctions {

    private IPv4_MaskFunctions() {}

    public static java.lang.String SubnetMask(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask iPv4_Mask) {
      return DynamicResourceUtil.invoke(IIPv4_MaskFunctionsImpl.class, IPv4_MaskFunctionsImpl.INSTANCE, iPv4_Mask).SubnetMask(iPv4_Mask);
    }

    public static java.lang.String Broadcast(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask iPv4_Mask) {
      return DynamicResourceUtil.invoke(IIPv4_MaskFunctionsImpl.class, IPv4_MaskFunctionsImpl.INSTANCE, iPv4_Mask).Broadcast(iPv4_Mask);
    }

    public static java.lang.String NetworkAddress(final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask iPv4_Mask) {
      return DynamicResourceUtil.invoke(IIPv4_MaskFunctionsImpl.class, IPv4_MaskFunctionsImpl.INSTANCE, iPv4_Mask).NetworkAddress(iPv4_Mask);
    }

  }

  public static interface IIPRangeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("89455e59-7867-11e9-97e0-b7c808aefc46")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D toIPv4(final java.lang.String ip);

    @IDynamicResourceExtension.MethodId("7b3e443d-786c-11e9-97e0-b7c808aefc46")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A FindIP(final java.lang.String ip);

  }
  
  public static interface IIPRangeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("89455e59-7867-11e9-97e0-b7c808aefc46")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D toIPv4(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange iPRange);

    @IDynamicResourceExtension.MethodId("7b3e443d-786c-11e9-97e0-b7c808aefc46")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange iPRange);

  }
  
  public static class IPRangeFunctionsImpl implements IIPRangeFunctionsImpl {

    public static final IIPRangeFunctionsImpl INSTANCE = new IPRangeFunctionsImpl();

    private IPRangeFunctionsImpl() {}

    @Override
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D toIPv4(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange iPRange) {
      /* Begin Protected Region [[89455e59-7867-11e9-97e0-b7c808aefc46]] */
      String[] parts = ip.trim().split("\\.");
      IIPv4_A ipV4_A = FindIP(parts[0], iPRange);
      if( ipV4_A == null)
      {
    	  return null;
      }
      
      IIPv4_B ipV4_B = ipV4_A.extension(IIPv4_AFunctions.class).FindIP(parts[1]);
      if( ipV4_B == null)
      {
    	  return null;
      }
      
      IIPv4_C ipV4_C = ipV4_B.extension(IIPv4_BFunctions.class).FindIP(parts[2]);
      if( ipV4_C == null)
      {
    	  return null;
      }
      
      return ipV4_C.extension(IIPv4_CFunctions.class).FindIP(parts[3]);
      /* End Protected Region   [[89455e59-7867-11e9-97e0-b7c808aefc46]] */
    }

    @Override
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange iPRange) {
      /* Begin Protected Region [[7b3e443d-786c-11e9-97e0-b7c808aefc46]] */
		for( IIPv4_A ipv4 : iPRange.selectIPv4_A())
		{
			if( ipv4.selectIp().equals(Integer.parseInt(ip)))
			{
				return ipv4;
			}
		}
		return null;   
      /* End Protected Region   [[7b3e443d-786c-11e9-97e0-b7c808aefc46]] */
    }

  }
  
  public static class IPRangeFunctions {

    private IPRangeFunctions() {}

    public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D toIPv4(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange iPRange) {
      return DynamicResourceUtil.invoke(IIPRangeFunctionsImpl.class, IPRangeFunctionsImpl.INSTANCE, iPRange).toIPv4(ip, iPRange);
    }

    public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A FindIP(final java.lang.String ip, final cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange iPRange) {
      return DynamicResourceUtil.invoke(IIPRangeFunctionsImpl.class, IPRangeFunctionsImpl.INSTANCE, iPRange).FindIP(ip, iPRange);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2fad7962-7232-11e9-8705-4f693d402426,wj55NjteAEj9+Y3rM9+S+IjPjEI=] */
