package cleon.architecturemethods.systemarc42.metamodel.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[160415c0-90d9-11e9-b29b-f1077960b1fa,imports]] */

/* End Protected Region   [[160415c0-90d9-11e9-b29b-f1077960b1fa,imports]] */

public class FunctionSpace_XML {

  /* Begin Protected Region [[160415c0-90d9-11e9-b29b-f1077960b1fa]] */
  
  /* End Protected Region   [[160415c0-90d9-11e9-b29b-f1077960b1fa]] */


  public static interface IAbstractNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2cdd8a41-90d9-11e9-b29b-f1077960b1fa")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> allNetworkSubZone();

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

  public static interface IAbstractLogicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6bded80b-90d9-11e9-b29b-f1077960b1fa")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> allNetworkSubZone();

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

  public static interface INamedPhysicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7f94024f-90d9-11e9-b29b-f1077960b1fa")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> allNetworkSubZone();

  }
  
  public static interface INamedPhysicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7f94024f-90d9-11e9-b29b-f1077960b1fa")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> allNetworkSubZone(final cleon.modelinglanguages.network.metamodel.spec.javamodel.INamedPhysicalNetwork namedPhysicalNetwork);

  }
  
  public static class NamedPhysicalNetworkFunctionsImpl implements INamedPhysicalNetworkFunctionsImpl {

    public static final INamedPhysicalNetworkFunctionsImpl INSTANCE = new NamedPhysicalNetworkFunctionsImpl();

    private NamedPhysicalNetworkFunctionsImpl() {}

    @Override
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> allNetworkSubZone(final cleon.modelinglanguages.network.metamodel.spec.javamodel.INamedPhysicalNetwork namedPhysicalNetwork) {
      return null;
    }

  }
  
  public static class NamedPhysicalNetworkFunctions {

    private NamedPhysicalNetworkFunctions() {}

    public static List<cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> allNetworkSubZone(final cleon.modelinglanguages.network.metamodel.spec.javamodel.INamedPhysicalNetwork namedPhysicalNetwork) {
      return DynamicResourceUtil.invoke(INamedPhysicalNetworkFunctionsImpl.class, NamedPhysicalNetworkFunctionsImpl.INSTANCE, namedPhysicalNetwork).allNetworkSubZone(namedPhysicalNetwork);
    }

  }

  public static interface INetworkSubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8bcea7c8-90d9-11e9-b29b-f1077960b1fa")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> allNetworkSubZone();

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

  public static interface IAbstractNetworkNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cc27a06d-90da-11e9-b29b-f1077960b1fa")
    public java.lang.String Name();

  }
  
  public static interface IAbstractNetworkNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractNetworkNodeFunctionsImpl implements IAbstractNetworkNodeFunctionsImpl {

    public static final IAbstractNetworkNodeFunctionsImpl INSTANCE = new AbstractNetworkNodeFunctionsImpl();

    private AbstractNetworkNodeFunctionsImpl() {}

  }
  
  public static class AbstractNetworkNodeFunctions {

    private AbstractNetworkNodeFunctions() {}

  }

  public static interface IGatewayNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d9629f1d-90da-11e9-b29b-f1077960b1fa")
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

  public static interface IDefaultGatewayNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e08a979a-90da-11e9-b29b-f1077960b1fa")
    public java.lang.String Name();

  }
  
  public static interface IDefaultGatewayNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DefaultGatewayNodeFunctionsImpl implements IDefaultGatewayNodeFunctionsImpl {

    public static final IDefaultGatewayNodeFunctionsImpl INSTANCE = new DefaultGatewayNodeFunctionsImpl();

    private DefaultGatewayNodeFunctionsImpl() {}

  }
  
  public static class DefaultGatewayNodeFunctions {

    private DefaultGatewayNodeFunctions() {}

  }

  public static interface INamedNetworkNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f53b3933-90da-11e9-b29b-f1077960b1fa")
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

  public static interface INetworkNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fd21c5e8-90da-11e9-b29b-f1077960b1fa")
    public java.lang.String Name();

  }
  
  public static interface INetworkNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NetworkNodeFunctionsImpl implements INetworkNodeFunctionsImpl {

    public static final INetworkNodeFunctionsImpl INSTANCE = new NetworkNodeFunctionsImpl();

    private NetworkNodeFunctionsImpl() {}

  }
  
  public static class NetworkNodeFunctions {

    private NetworkNodeFunctions() {}

  }

  public static interface IHostNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("de1344bb-4836-11ea-a9d8-93d0ce680cba")
    public java.lang.String Name();

  }
  
  public static interface IHostNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HostNodeFunctionsImpl implements IHostNodeFunctionsImpl {

    public static final IHostNodeFunctionsImpl INSTANCE = new HostNodeFunctionsImpl();

    private HostNodeFunctionsImpl() {}

  }
  
  public static class HostNodeFunctions {

    private HostNodeFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,160415c0-90d9-11e9-b29b-f1077960b1fa,bXct7UbCniuqxlzEe9AXoOmENS0=] */
