package cleon.modelinglanguages.network.spec.network.ipv4;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2fad7962-7232-11e9-8705-4f693d402426,imports]] */

/* End Protected Region   [[2fad7962-7232-11e9-8705-4f693d402426,imports]] */

public class FunctionSpace_IP {

  /* Begin Protected Region [[2fad7962-7232-11e9-8705-4f693d402426]] */
  
  /* End Protected Region   [[2fad7962-7232-11e9-8705-4f693d402426]] */


  public static interface IAbstractIPv4Functions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3cc07de3-7232-11e9-8705-4f693d402426")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("43f55517-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IAbstractIPv4 Parent();

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
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IAbstractIPv4 Parent();

  }
  
  public static interface IIPv4_AFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7f8dae45-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IAbstractIPv4 Parent(final cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_A iPv4_A);

  }
  
  public static class IPv4_AFunctionsImpl implements IIPv4_AFunctionsImpl {

    public static final IIPv4_AFunctionsImpl INSTANCE = new IPv4_AFunctionsImpl();

    private IPv4_AFunctionsImpl() {}

    @Override
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IAbstractIPv4 Parent(final cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_A iPv4_A) {
      return null;
    }

  }
  
  public static class IPv4_AFunctions {

    private IPv4_AFunctions() {}

    public static cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IAbstractIPv4 Parent(final cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_A iPv4_A) {
      return DynamicResourceUtil.invoke(IIPv4_AFunctionsImpl.class, IPv4_AFunctionsImpl.INSTANCE, iPv4_A).Parent(iPv4_A);
    }

  }

  public static interface IIPv4_BFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("73956962-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IAbstractIPv4 Parent();

  }
  
  public static interface IIPv4_BFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IPv4_BFunctionsImpl implements IIPv4_BFunctionsImpl {

    public static final IIPv4_BFunctionsImpl INSTANCE = new IPv4_BFunctionsImpl();

    private IPv4_BFunctionsImpl() {}

  }
  
  public static class IPv4_BFunctions {

    private IPv4_BFunctions() {}

  }

  public static interface IIPv4_CFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("73201234-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IAbstractIPv4 Parent();

  }
  
  public static interface IIPv4_CFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IPv4_CFunctionsImpl implements IIPv4_CFunctionsImpl {

    public static final IIPv4_CFunctionsImpl INSTANCE = new IPv4_CFunctionsImpl();

    private IPv4_CFunctionsImpl() {}

  }
  
  public static class IPv4_CFunctions {

    private IPv4_CFunctions() {}

  }

  public static interface IIPv4_DFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("678a3870-73e4-11e9-9cd4-8d88045ca5f3")
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IAbstractIPv4 Parent();

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
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange SelectIPRange();

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
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange SelectIPRange();

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
    public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPRange SelectIPRange();

  }
  
  public static interface IIPv4_MaskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IPv4_MaskFunctionsImpl implements IIPv4_MaskFunctionsImpl {

    public static final IIPv4_MaskFunctionsImpl INSTANCE = new IPv4_MaskFunctionsImpl();

    private IPv4_MaskFunctionsImpl() {}

  }
  
  public static class IPv4_MaskFunctions {

    private IPv4_MaskFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2fad7962-7232-11e9-8705-4f693d402426,xPd1JDq0ROmjYDWhca4Qj2ovCDY=] */
