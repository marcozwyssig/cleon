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

  public static interface ISystemConfigurationAccessToFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1fa9ea98-1e9d-11eb-9eef-0dadb2b460da")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> AllCommunicationServices();

    @IDynamicResourceExtension.MethodId("2f177739-242c-11eb-83b1-3d2a97975978")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllCommunicationServicesFlatten();

    @IDynamicResourceExtension.MethodId("c39590a2-3009-11eb-b17d-af74b7cf0bc4")
    public java.lang.Integer DestinationVLAN();

    @IDynamicResourceExtension.MethodId("dded61bf-300a-11eb-b17d-af74b7cf0bc4")
    public java.lang.String SourceVLAN();

  }
  
  public static interface ISystemConfigurationAccessToFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationAccessToFunctionsImpl implements ISystemConfigurationAccessToFunctionsImpl {

    public static final ISystemConfigurationAccessToFunctionsImpl INSTANCE = new SystemConfigurationAccessToFunctionsImpl();

    private SystemConfigurationAccessToFunctionsImpl() {}

  }
  
  public static class SystemConfigurationAccessToFunctions {

    private SystemConfigurationAccessToFunctions() {}

  }

  public static interface IAccessCommunicationTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eb8338db-1ea3-11eb-9eef-0dadb2b460da")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> OnlyIfHasServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessTo to);

  }
  
  public static interface IAccessCommunicationTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("eb8338db-1ea3-11eb-9eef-0dadb2b460da")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> OnlyIfHasServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessTo to, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> accessCommunicationTypeList);

  }
  
  public static class AccessCommunicationTypeFunctionsImpl implements IAccessCommunicationTypeFunctionsImpl {

    public static final IAccessCommunicationTypeFunctionsImpl INSTANCE = new AccessCommunicationTypeFunctionsImpl();

    private AccessCommunicationTypeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> OnlyIfHasServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessTo to, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> accessCommunicationTypeList) {
      /* Begin Protected Region [[eb8338db-1ea3-11eb-9eef-0dadb2b460da]] */
      final ISourceFunctions sourceFunctions = to.selectSource().extension(ISourceFunctions.class);
      final List<IAbstractService> portServices = sourceFunctions.AllServices();
      return accessCommunicationTypeList.stream()
      		.filter(x -> x.selectServicesForAccess().stream().anyMatch(y -> portServices.contains(y)))
      		.collect(Collectors.toList());
      /* End Protected Region   [[eb8338db-1ea3-11eb-9eef-0dadb2b460da]] */
    }

  }
  
  public static class AccessCommunicationTypeFunctions {

    private AccessCommunicationTypeFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> OnlyIfHasServices(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessTo to, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> accessCommunicationTypeList) {
      return DynamicResourceUtil.invoke(IAccessCommunicationTypeFunctionsImpl.class, AccessCommunicationTypeFunctionsImpl.INSTANCE, accessCommunicationTypeList).OnlyIfHasServices(to, accessCommunicationTypeList);
    }

  }

  public static interface IAccessConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("31aa5c47-243f-11eb-83b1-3d2a97975978")
    public java.lang.String Decorate(final java.lang.String hostName);

  }
  
  public static interface IAccessConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("31aa5c47-243f-11eb-83b1-3d2a97975978")
    public java.lang.String Decorate(final java.lang.String hostName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration accessConfiguration);

  }
  
  public static class AccessConfigurationFunctionsImpl implements IAccessConfigurationFunctionsImpl {

    public static final IAccessConfigurationFunctionsImpl INSTANCE = new AccessConfigurationFunctionsImpl();

    private AccessConfigurationFunctionsImpl() {}

    @Override
    public java.lang.String Decorate(final java.lang.String hostName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration accessConfiguration) {
      return hostName;
    }

  }
  
  public static class AccessConfigurationFunctions {

    private AccessConfigurationFunctions() {}

    public static java.lang.String Decorate(final java.lang.String hostName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfiguration accessConfiguration) {
      return DynamicResourceUtil.invoke(IAccessConfigurationFunctionsImpl.class, AccessConfigurationFunctionsImpl.INSTANCE, accessConfiguration).Decorate(hostName, accessConfiguration);
    }

  }

  public static interface IAccessConfigurationWebFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("63a996bd-243f-11eb-83b1-3d2a97975978")
    public java.lang.String Decorate(final java.lang.String hostName);

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cffe4329-19c9-11eb-8585-65084a06c07f,8dE+S61WJP5QG9e3SlLqwfX34X8=] */
