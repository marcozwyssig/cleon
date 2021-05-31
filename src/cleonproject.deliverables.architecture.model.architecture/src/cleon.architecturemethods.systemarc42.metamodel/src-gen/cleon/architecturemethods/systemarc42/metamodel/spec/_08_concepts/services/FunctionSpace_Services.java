package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d1f3b31c-9340-11e9-a1f7-0765a2e4170d,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.FunctionSpace_Access.IAccessSystemConfigurationToFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService;
import java.util.stream.Collectors;
/* End Protected Region   [[d1f3b31c-9340-11e9-a1f7-0765a2e4170d,imports]] */

public class FunctionSpace_Services {

  /* Begin Protected Region [[d1f3b31c-9340-11e9-a1f7-0765a2e4170d]] */

  /* End Protected Region   [[d1f3b31c-9340-11e9-a1f7-0765a2e4170d]] */


  public static interface IAbstractServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("df34f394-9340-11e9-a1f7-0765a2e4170d")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IServiceGroup Parent();

    @IDynamicResourceExtension.MethodId("119cb311-9341-11e9-a1f7-0765a2e4170d")
    public java.lang.Integer Position();

    @IDynamicResourceExtension.MethodId("3b777729-cfeb-11e9-83dd-7d113aa47006")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> All();

    @IDynamicResourceExtension.MethodId("3fb01a9e-a0e2-11ea-8daa-afb4679c3497")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IService> AllServicesFlatten();

    @IDynamicResourceExtension.MethodId("7c5bf95b-bc71-11ea-88d5-a50b07f2e9c3")
    public java.lang.String DisplayName();

    @IDynamicResourceExtension.MethodId("80247504-1a84-11eb-97e9-413a49c2a05f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> OnlyMgmt(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo to);

    @IDynamicResourceExtension.MethodId("1514d39c-3d4b-11eb-986d-0d884ba5cf53")
    public java.lang.String ShortName();

  }
  
  public static interface IAbstractServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("119cb311-9341-11e9-a1f7-0765a2e4170d")
    public java.lang.Integer Position(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService abstractService);

    @IDynamicResourceExtension.MethodId("80247504-1a84-11eb-97e9-413a49c2a05f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> OnlyMgmt(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo to, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> abstractServiceList);

  }
  
  public static class AbstractServiceFunctionsImpl implements IAbstractServiceFunctionsImpl {

    public static final IAbstractServiceFunctionsImpl INSTANCE = new AbstractServiceFunctionsImpl();

    private AbstractServiceFunctionsImpl() {}

    @Override
    public java.lang.Integer Position(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService abstractService) {
      /* Begin Protected Region [[119cb311-9341-11e9-a1f7-0765a2e4170d]] */
      final IAbstractServiceFunctions functions = abstractService.extension(IAbstractServiceFunctions.class);
      final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IServiceGroup parent = functions.Parent();

      int i = 0;
      for( final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService child : parent.selectServices())
      {
      	++i;
      	if( child.equals(abstractService))
      	{
      		return i;
      	}
      }

      return i;
      /* End Protected Region   [[119cb311-9341-11e9-a1f7-0765a2e4170d]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> OnlyMgmt(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo to, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> abstractServiceList) {
      /* Begin Protected Region [[80247504-1a84-11eb-97e9-413a49c2a05f]] */
      final var configurationAccessToFunctions = to.extension(IAccessSystemConfigurationToFunctions.class);
      final List<IPortService> portServices = configurationAccessToFunctions.AllCommunicationServices();
      return abstractServiceList.stream()
      		.filter(IPortService.class::isInstance)
      		.map(IPortService.class::cast)
      		.filter(y -> portServices.contains(y))
      		.map(IAbstractService.class::cast)
      		.collect(Collectors.toList());
      /* End Protected Region   [[80247504-1a84-11eb-97e9-413a49c2a05f]] */
    }

  }
  
  public static class AbstractServiceFunctions {

    private AbstractServiceFunctions() {}

    public static java.lang.Integer Position(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService abstractService) {
      return DynamicResourceUtil.invoke(IAbstractServiceFunctionsImpl.class, AbstractServiceFunctionsImpl.INSTANCE, abstractService).Position(abstractService);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> OnlyMgmt(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo to, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> abstractServiceList) {
      return DynamicResourceUtil.invoke(IAbstractServiceFunctionsImpl.class, AbstractServiceFunctionsImpl.INSTANCE, abstractServiceList).OnlyMgmt(to, abstractServiceList);
    }

  }

  public static interface IPortServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("89eb159a-cfeb-11e9-83dd-7d113aa47006")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> All();

    @IDynamicResourceExtension.MethodId("dad9ab85-a0e3-11ea-8daa-afb4679c3497")
    public java.lang.Integer Port();

  }
  
  public static interface IPortServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PortServiceFunctionsImpl implements IPortServiceFunctionsImpl {

    public static final IPortServiceFunctionsImpl INSTANCE = new PortServiceFunctionsImpl();

    private PortServiceFunctionsImpl() {}

  }
  
  public static class PortServiceFunctions {

    private PortServiceFunctions() {}

  }

  public static interface IAbstractServiceGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9baed0f0-cfeb-11e9-83dd-7d113aa47006")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> All();

    @IDynamicResourceExtension.MethodId("a6a55203-bc71-11ea-88d5-a50b07f2e9c3")
    public java.lang.String DisplayName();

    @IDynamicResourceExtension.MethodId("29670194-3d4b-11eb-986d-0d884ba5cf53")
    public java.lang.String ShortName();

  }
  
  public static interface IAbstractServiceGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractServiceGroupFunctionsImpl implements IAbstractServiceGroupFunctionsImpl {

    public static final IAbstractServiceGroupFunctionsImpl INSTANCE = new AbstractServiceGroupFunctionsImpl();

    private AbstractServiceGroupFunctionsImpl() {}

  }
  
  public static class AbstractServiceGroupFunctions {

    private AbstractServiceGroupFunctions() {}

  }

  public static interface IFWStandardTCPServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("43e012f6-a0e3-11ea-8daa-afb4679c3497")
    public java.lang.String Protocol();

    @IDynamicResourceExtension.MethodId("7565142d-bc77-11ea-88d5-a50b07f2e9c3")
    public java.lang.String DisplayName();

    @IDynamicResourceExtension.MethodId("3bc30474-3d4b-11eb-986d-0d884ba5cf53")
    public java.lang.String ShortName();

  }
  
  public static interface IFWStandardTCPServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FWStandardTCPServiceFunctionsImpl implements IFWStandardTCPServiceFunctionsImpl {

    public static final IFWStandardTCPServiceFunctionsImpl INSTANCE = new FWStandardTCPServiceFunctionsImpl();

    private FWStandardTCPServiceFunctionsImpl() {}

  }
  
  public static class FWStandardTCPServiceFunctions {

    private FWStandardTCPServiceFunctions() {}

  }

  public static interface IFWStandardUDPServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f585364e-a0ee-11ea-8daa-afb4679c3497")
    public java.lang.String Protocol();

    @IDynamicResourceExtension.MethodId("98100c80-bc77-11ea-88d5-a50b07f2e9c3")
    public java.lang.String DisplayName();

    @IDynamicResourceExtension.MethodId("5dba3d66-3d4b-11eb-986d-0d884ba5cf53")
    public java.lang.String ShortName();

  }
  
  public static interface IFWStandardUDPServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FWStandardUDPServiceFunctionsImpl implements IFWStandardUDPServiceFunctionsImpl {

    public static final IFWStandardUDPServiceFunctionsImpl INSTANCE = new FWStandardUDPServiceFunctionsImpl();

    private FWStandardUDPServiceFunctionsImpl() {}

  }
  
  public static class FWStandardUDPServiceFunctions {

    private FWStandardUDPServiceFunctions() {}

  }

  public static interface IServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("30c468f1-a0e3-11ea-8daa-afb4679c3497")
    public java.lang.String Protocol();

    @IDynamicResourceExtension.MethodId("cab8a431-a0e3-11ea-8daa-afb4679c3497")
    public java.lang.Integer Port();

    @IDynamicResourceExtension.MethodId("3ade8da6-afb0-11ea-9bc4-516448cfb46a")
    public java.lang.String Id();

  }
  
  public static interface IServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("3ade8da6-afb0-11ea-9bc4-516448cfb46a")
    public java.lang.String Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IService service);

  }
  
  public static class ServiceFunctionsImpl implements IServiceFunctionsImpl {

    public static final IServiceFunctionsImpl INSTANCE = new ServiceFunctionsImpl();

    private ServiceFunctionsImpl() {}

    @Override
    public java.lang.String Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IService service) {
      return String.format("%03d", service.selectIdentifier());
    }

  }
  
  public static class ServiceFunctions {

    private ServiceFunctions() {}

    public static java.lang.String Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IService service) {
      return DynamicResourceUtil.invoke(IServiceFunctionsImpl.class, ServiceFunctionsImpl.INSTANCE, service).Id(service);
    }

  }

  public static interface IServiceTCPFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("55f43771-a0e3-11ea-8daa-afb4679c3497")
    public java.lang.String Protocol();

    @IDynamicResourceExtension.MethodId("d601a691-bc71-11ea-88d5-a50b07f2e9c3")
    public java.lang.String DisplayName();

    @IDynamicResourceExtension.MethodId("708814c9-3d4b-11eb-986d-0d884ba5cf53")
    public java.lang.String ShortName();

  }
  
  public static interface IServiceTCPFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceTCPFunctionsImpl implements IServiceTCPFunctionsImpl {

    public static final IServiceTCPFunctionsImpl INSTANCE = new ServiceTCPFunctionsImpl();

    private ServiceTCPFunctionsImpl() {}

  }
  
  public static class ServiceTCPFunctions {

    private ServiceTCPFunctions() {}

  }

  public static interface IServiceUDPFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5a8669b0-a0e3-11ea-8daa-afb4679c3497")
    public java.lang.String Protocol();

    @IDynamicResourceExtension.MethodId("c1ef67c6-bc71-11ea-88d5-a50b07f2e9c3")
    public java.lang.String DisplayName();

    @IDynamicResourceExtension.MethodId("7e106fbd-3d4b-11eb-986d-0d884ba5cf53")
    public java.lang.String ShortName();

  }
  
  public static interface IServiceUDPFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceUDPFunctionsImpl implements IServiceUDPFunctionsImpl {

    public static final IServiceUDPFunctionsImpl INSTANCE = new ServiceUDPFunctionsImpl();

    private ServiceUDPFunctionsImpl() {}

  }
  
  public static class ServiceUDPFunctions {

    private ServiceUDPFunctions() {}

  }

  public static interface IAnyServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d1029f14-b6bf-11ea-83ac-afd79efb5e4a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> All();

    @IDynamicResourceExtension.MethodId("b880daeb-bc71-11ea-88d5-a50b07f2e9c3")
    public java.lang.String DisplayName();

    @IDynamicResourceExtension.MethodId("8b429518-3d4b-11eb-986d-0d884ba5cf53")
    public java.lang.String ShortName();

  }
  
  public static interface IAnyServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AnyServiceFunctionsImpl implements IAnyServiceFunctionsImpl {

    public static final IAnyServiceFunctionsImpl INSTANCE = new AnyServiceFunctionsImpl();

    private AnyServiceFunctionsImpl() {}

  }
  
  public static class AnyServiceFunctions {

    private AnyServiceFunctions() {}

  }

  public static interface IFWStandardIPProtocolFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8dc3846b-3bcc-11eb-b8e1-3fcf5510f7e6")
    public java.lang.String Protocol();

    @IDynamicResourceExtension.MethodId("93f1dad3-3bcc-11eb-b8e1-3fcf5510f7e6")
    public java.lang.String DisplayName();

    @IDynamicResourceExtension.MethodId("97f417c9-3d4b-11eb-986d-0d884ba5cf53")
    public java.lang.String ShortName();

  }
  
  public static interface IFWStandardIPProtocolFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FWStandardIPProtocolFunctionsImpl implements IFWStandardIPProtocolFunctionsImpl {

    public static final IFWStandardIPProtocolFunctionsImpl INSTANCE = new FWStandardIPProtocolFunctionsImpl();

    private FWStandardIPProtocolFunctionsImpl() {}

  }
  
  public static class FWStandardIPProtocolFunctions {

    private FWStandardIPProtocolFunctions() {}

  }

  public static interface IFWICMPServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aafdaa03-3bcc-11eb-b8e1-3fcf5510f7e6")
    public java.lang.String Protocol();

    @IDynamicResourceExtension.MethodId("aafdd121-3bcc-11eb-b8e1-3fcf5510f7e6")
    public java.lang.String DisplayName();

    @IDynamicResourceExtension.MethodId("a65fa717-3d4b-11eb-986d-0d884ba5cf53")
    public java.lang.String ShortName();

  }
  
  public static interface IFWICMPServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FWICMPServiceFunctionsImpl implements IFWICMPServiceFunctionsImpl {

    public static final IFWICMPServiceFunctionsImpl INSTANCE = new FWICMPServiceFunctionsImpl();

    private FWICMPServiceFunctionsImpl() {}

  }
  
  public static class FWICMPServiceFunctions {

    private FWICMPServiceFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d1f3b31c-9340-11e9-a1f7-0765a2e4170d,knoFC28bWKobar4PcX8DeKFCZsE=] */
