package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[cffe4329-19c9-11eb-8585-65084a06c07f,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication.ISourceFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService;
import java.util.stream.Collectors;
/* End Protected Region   [[cffe4329-19c9-11eb-8585-65084a06c07f,imports]] */

public class FunctionSpace_Access {

  /* Begin Protected Region [[cffe4329-19c9-11eb-8585-65084a06c07f]] */

  /* End Protected Region   [[cffe4329-19c9-11eb-8585-65084a06c07f]] */


  public static interface ISystemConfigurationAccessFromFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f3bc8050-19c9-11eb-8585-65084a06c07f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> Sources();

  }
  
  public static interface ISystemConfigurationAccessFromFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationAccessFromFunctionsImpl implements ISystemConfigurationAccessFromFunctionsImpl {

    public static final ISystemConfigurationAccessFromFunctionsImpl INSTANCE = new SystemConfigurationAccessFromFunctionsImpl();

    private SystemConfigurationAccessFromFunctionsImpl() {}

  }
  
  public static class SystemConfigurationAccessFromFunctions {

    private SystemConfigurationAccessFromFunctions() {}

  }

  public static interface IAccessConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5637eb3-1e99-11eb-9eef-0dadb2b460da")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> AllCommunicationServices();

  }
  
  public static interface IAccessConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccessConceptFunctionsImpl implements IAccessConceptFunctionsImpl {

    public static final IAccessConceptFunctionsImpl INSTANCE = new AccessConceptFunctionsImpl();

    private AccessConceptFunctionsImpl() {}

  }
  
  public static class AccessConceptFunctions {

    private AccessConceptFunctions() {}

  }

  public static interface IAccessSystemConfigurationToFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1fa9ea98-1e9d-11eb-9eef-0dadb2b460da")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> AllCommunicationServices();

    @IDynamicResourceExtension.MethodId("2f177739-242c-11eb-83b1-3d2a97975978")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllCommunicationServicesFlatten();

    @IDynamicResourceExtension.MethodId("c39590a2-3009-11eb-b17d-af74b7cf0bc4")
    public java.lang.Integer DestinationVLAN();

    @IDynamicResourceExtension.MethodId("dded61bf-300a-11eb-b17d-af74b7cf0bc4")
    public java.lang.String SourceVLAN();

    @IDynamicResourceExtension.MethodId("e865b56d-c7cf-11ec-a59e-d1c88102a398")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration> AllAccessConfigurations();

    @IDynamicResourceExtension.MethodId("91fe0a27-d677-11ec-925d-2b3c72f15572")
    public java.lang.Boolean UseIP();

  }
  
  public static interface IAccessSystemConfigurationToFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccessSystemConfigurationToFunctionsImpl implements IAccessSystemConfigurationToFunctionsImpl {

    public static final IAccessSystemConfigurationToFunctionsImpl INSTANCE = new AccessSystemConfigurationToFunctionsImpl();

    private AccessSystemConfigurationToFunctionsImpl() {}

  }
  
  public static class AccessSystemConfigurationToFunctions {

    private AccessSystemConfigurationToFunctions() {}

  }

  public static interface IAccessCommunicationTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eb8338db-1ea3-11eb-9eef-0dadb2b460da")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> OnlyIfHasServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo to);

    @IDynamicResourceExtension.MethodId("2b832962-c1f0-11eb-8c09-03c14294ecfb")
    public java.lang.String Protocol();

  }
  
  public static interface IAccessCommunicationTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("eb8338db-1ea3-11eb-9eef-0dadb2b460da")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> OnlyIfHasServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo to, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> accessCommunicationTypeList);

  }
  
  public static class AccessCommunicationTypeFunctionsImpl implements IAccessCommunicationTypeFunctionsImpl {

    public static final IAccessCommunicationTypeFunctionsImpl INSTANCE = new AccessCommunicationTypeFunctionsImpl();

    private AccessCommunicationTypeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> OnlyIfHasServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo to, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> accessCommunicationTypeList) {
      /* Begin Protected Region [[eb8338db-1ea3-11eb-9eef-0dadb2b460da]] */
      final var sourceFunctions = to.selectSourceForAccess().extension(ISourceFunctions.class);
      final var portServices = sourceFunctions.AllServicesFlatten();
      return accessCommunicationTypeList.stream()
      		.filter(x -> x.selectServicesForAccess().stream().anyMatch(y -> portServices.contains(y)))
      		.collect(Collectors.toList());
      /* End Protected Region   [[eb8338db-1ea3-11eb-9eef-0dadb2b460da]] */
    }

  }
  
  public static class AccessCommunicationTypeFunctions {

    private AccessCommunicationTypeFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> OnlyIfHasServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo to, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> accessCommunicationTypeList) {
      return DynamicResourceUtil.invoke(IAccessCommunicationTypeFunctionsImpl.class, AccessCommunicationTypeFunctionsImpl.INSTANCE, accessCommunicationTypeList).OnlyIfHasServices(to, accessCommunicationTypeList);
    }

  }

  public static interface IAccessConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d85d517f-bfcc-11eb-af9a-7dff6e60ee1f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> SelectServices();

    @IDynamicResourceExtension.MethodId("4b429d4b-c1da-11eb-8c09-03c14294ecfb")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo Parent();

  }
  
  public static interface IAccessConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d85d517f-bfcc-11eb-af9a-7dff6e60ee1f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> SelectServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration accessConfiguration);

  }
  
  public static class AccessConfigurationFunctionsImpl implements IAccessConfigurationFunctionsImpl {

    public static final IAccessConfigurationFunctionsImpl INSTANCE = new AccessConfigurationFunctionsImpl();

    private AccessConfigurationFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> SelectServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration accessConfiguration) {
      /* Begin Protected Region [[d85d517f-bfcc-11eb-af9a-7dff6e60ee1f]] */
      final var accessConfigurationFunction = accessConfiguration.extension(IAccessConfigurationFunctions.class);
      final var to = accessConfigurationFunction.Parent();
      final var sourceFunctions = to.selectSourceForAccess().extension(ISourceFunctions.class);
      final var validServices = accessConfiguration.selectAccessCommunicationType().selectServicesForAccess();
      final var allServices = sourceFunctions.AllServicesFlatten();
      return allServices.stream().filter( x -> validServices.contains(x)).collect(Collectors.toList());
      /* End Protected Region   [[d85d517f-bfcc-11eb-af9a-7dff6e60ee1f]] */
    }

  }
  
  public static class AccessConfigurationFunctions {

    private AccessConfigurationFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> SelectServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration accessConfiguration) {
      return DynamicResourceUtil.invoke(IAccessConfigurationFunctionsImpl.class, AccessConfigurationFunctionsImpl.INSTANCE, accessConfiguration).SelectServices(accessConfiguration);
    }

  }

  public static interface IAccessConfigurationWebFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c1633eee-c1da-11eb-8c09-03c14294ecfb")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo Parent();

  }
  
  public static interface IAccessConfigurationWebFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccessConfigurationWebFunctionsImpl implements IAccessConfigurationWebFunctionsImpl {

    public static final IAccessConfigurationWebFunctionsImpl INSTANCE = new AccessConfigurationWebFunctionsImpl();

    private AccessConfigurationWebFunctionsImpl() {}

  }
  
  public static class AccessConfigurationWebFunctions {

    private AccessConfigurationWebFunctions() {}

  }

  public static interface IAccessConfigurationServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("31aa5c47-243f-11eb-83b1-3d2a97975978")
    public java.lang.String Decorate(final java.lang.String hostName);

    @IDynamicResourceExtension.MethodId("eed5880a-c906-11eb-afd9-772a261eb5f0")
    public java.lang.Boolean UseFQDN();

  }
  
  public static interface IAccessConfigurationServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("31aa5c47-243f-11eb-83b1-3d2a97975978")
    public java.lang.String Decorate(final java.lang.String hostName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService);

    @IDynamicResourceExtension.MethodId("eed5880a-c906-11eb-afd9-772a261eb5f0")
    public java.lang.Boolean UseFQDN(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService);

  }
  
  public static class AccessConfigurationServiceFunctionsImpl implements IAccessConfigurationServiceFunctionsImpl {

    public static final IAccessConfigurationServiceFunctionsImpl INSTANCE = new AccessConfigurationServiceFunctionsImpl();

    private AccessConfigurationServiceFunctionsImpl() {}

    @Override
    public java.lang.String Decorate(final java.lang.String hostName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService) {
      return hostName;
    }

    @Override
    public java.lang.Boolean UseFQDN(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService) {
      return accessConfigurationService.selectUseFQDN() == null || accessConfigurationService.selectUseFQDN().booleanValue();
    }

  }
  
  public static class AccessConfigurationServiceFunctions {

    private AccessConfigurationServiceFunctions() {}

    public static java.lang.String Decorate(final java.lang.String hostName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService) {
      return DynamicResourceUtil.invoke(IAccessConfigurationServiceFunctionsImpl.class, AccessConfigurationServiceFunctionsImpl.INSTANCE, accessConfigurationService).Decorate(hostName, accessConfigurationService);
    }

    public static java.lang.Boolean UseFQDN(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService) {
      return DynamicResourceUtil.invoke(IAccessConfigurationServiceFunctionsImpl.class, AccessConfigurationServiceFunctionsImpl.INSTANCE, accessConfigurationService).UseFQDN(accessConfigurationService);
    }

  }

  public static interface IAccessConfigurationWebServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("63a996bd-243f-11eb-83b1-3d2a97975978")
    public java.lang.String Decorate(final java.lang.String hostName);

  }
  
  public static interface IAccessConfigurationWebServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccessConfigurationWebServiceFunctionsImpl implements IAccessConfigurationWebServiceFunctionsImpl {

    public static final IAccessConfigurationWebServiceFunctionsImpl INSTANCE = new AccessConfigurationWebServiceFunctionsImpl();

    private AccessConfigurationWebServiceFunctionsImpl() {}

  }
  
  public static class AccessConfigurationWebServiceFunctions {

    private AccessConfigurationWebServiceFunctions() {}

  }

  public static interface IAccessCommunicationTypeRdpFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("37b96211-c1f0-11eb-8c09-03c14294ecfb")
    public java.lang.String Protocol();

  }
  
  public static interface IAccessCommunicationTypeRdpFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccessCommunicationTypeRdpFunctionsImpl implements IAccessCommunicationTypeRdpFunctionsImpl {

    public static final IAccessCommunicationTypeRdpFunctionsImpl INSTANCE = new AccessCommunicationTypeRdpFunctionsImpl();

    private AccessCommunicationTypeRdpFunctionsImpl() {}

  }
  
  public static class AccessCommunicationTypeRdpFunctions {

    private AccessCommunicationTypeRdpFunctions() {}

  }

  public static interface IAccessCommunicationTypeSshFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("414e14d1-c1f0-11eb-8c09-03c14294ecfb")
    public java.lang.String Protocol();

  }
  
  public static interface IAccessCommunicationTypeSshFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccessCommunicationTypeSshFunctionsImpl implements IAccessCommunicationTypeSshFunctionsImpl {

    public static final IAccessCommunicationTypeSshFunctionsImpl INSTANCE = new AccessCommunicationTypeSshFunctionsImpl();

    private AccessCommunicationTypeSshFunctionsImpl() {}

  }
  
  public static class AccessCommunicationTypeSshFunctions {

    private AccessCommunicationTypeSshFunctions() {}

  }

  public static interface IAccessCommunicationTypeVNCFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("488bdfb1-c1f0-11eb-8c09-03c14294ecfb")
    public java.lang.String Protocol();

  }
  
  public static interface IAccessCommunicationTypeVNCFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccessCommunicationTypeVNCFunctionsImpl implements IAccessCommunicationTypeVNCFunctionsImpl {

    public static final IAccessCommunicationTypeVNCFunctionsImpl INSTANCE = new AccessCommunicationTypeVNCFunctionsImpl();

    private AccessCommunicationTypeVNCFunctionsImpl() {}

  }
  
  public static class AccessCommunicationTypeVNCFunctions {

    private AccessCommunicationTypeVNCFunctions() {}

  }

  public static interface IAccessCommunicationTypeWebSecureFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("50b34680-c1f0-11eb-8c09-03c14294ecfb")
    public java.lang.String Protocol();

  }
  
  public static interface IAccessCommunicationTypeWebSecureFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccessCommunicationTypeWebSecureFunctionsImpl implements IAccessCommunicationTypeWebSecureFunctionsImpl {

    public static final IAccessCommunicationTypeWebSecureFunctionsImpl INSTANCE = new AccessCommunicationTypeWebSecureFunctionsImpl();

    private AccessCommunicationTypeWebSecureFunctionsImpl() {}

  }
  
  public static class AccessCommunicationTypeWebSecureFunctions {

    private AccessCommunicationTypeWebSecureFunctions() {}

  }

  public static interface IAccessCommunicationTypeWebUnsecureFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("58b4fca2-c1f0-11eb-8c09-03c14294ecfb")
    public java.lang.String Protocol();

  }
  
  public static interface IAccessCommunicationTypeWebUnsecureFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccessCommunicationTypeWebUnsecureFunctionsImpl implements IAccessCommunicationTypeWebUnsecureFunctionsImpl {

    public static final IAccessCommunicationTypeWebUnsecureFunctionsImpl INSTANCE = new AccessCommunicationTypeWebUnsecureFunctionsImpl();

    private AccessCommunicationTypeWebUnsecureFunctionsImpl() {}

  }
  
  public static class AccessCommunicationTypeWebUnsecureFunctions {

    private AccessCommunicationTypeWebUnsecureFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cffe4329-19c9-11eb-8585-65084a06c07f,cvK48SNBkaBQjQlzwO3Iw8O879o=] */
