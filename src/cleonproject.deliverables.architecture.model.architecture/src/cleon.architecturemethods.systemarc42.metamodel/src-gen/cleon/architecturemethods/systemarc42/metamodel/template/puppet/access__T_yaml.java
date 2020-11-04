package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b13f88ca-1e75-11eb-b08c-d72de2e3f55f,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.remote_access.javamodel.ITerminalServerSystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication.ISourceFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractSiteFunctions;

import java.util.stream.Collectors;
/* End Protected Region   [[b13f88ca-1e75-11eb-b08c-d72de2e3f55f,imports]] */

public class access__T_yaml {

  /* Begin Protected Region [[b13f88ca-1e75-11eb-b08c-d72de2e3f55f]] */

  /* End Protected Region   [[b13f88ca-1e75-11eb-b08c-d72de2e3f55f]] */


  public static interface IAbstractHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7687af9c-1e76-11eb-b08c-d72de2e3f55f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyTerminals();

  }
  
  public static interface IAbstractHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7687af9c-1e76-11eb-b08c-d72de2e3f55f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyTerminals(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList);

  }
  
  public static class AbstractHostFunctionsImpl implements IAbstractHostFunctionsImpl {

    public static final IAbstractHostFunctionsImpl INSTANCE = new AbstractHostFunctionsImpl();

    private AbstractHostFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyTerminals(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      /* Begin Protected Region [[7687af9c-1e76-11eb-b08c-d72de2e3f55f]] */
      return abstractHostList.stream().filter(x -> x.selectInstanceOf() instanceof ITerminalServerSystemConfiguration).collect(Collectors.toList());
      /* End Protected Region   [[7687af9c-1e76-11eb-b08c-d72de2e3f55f]] */
    }

  }
  
  public static class AbstractHostFunctions {

    private AbstractHostFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyTerminals(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHostList).OnlyTerminals(abstractHostList);
    }

  }

  public static interface ISystemConfigurationAccessFromFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("706413be-1e91-11eb-b08c-d72de2e3f55f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyWithAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite);

  }
  
  public static interface ISystemConfigurationAccessFromFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("706413be-1e91-11eb-b08c-d72de2e3f55f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyWithAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom systemConfigurationAccessFrom);

  }
  
  public static class SystemConfigurationAccessFromFunctionsImpl implements ISystemConfigurationAccessFromFunctionsImpl {

    public static final ISystemConfigurationAccessFromFunctionsImpl INSTANCE = new SystemConfigurationAccessFromFunctionsImpl();

    private SystemConfigurationAccessFromFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyWithAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom systemConfigurationAccessFrom) {
      /* Begin Protected Region [[706413be-1e91-11eb-b08c-d72de2e3f55f]] */
      final IAbstractSiteFunctions abstractSiteFunctions = abstractSite.extension(IAbstractSiteFunctions.class);
      return abstractSiteFunctions.AllHosts().stream()
      		.filter(x -> systemConfigurationAccessFrom.selectAccessTo().values().stream()
      				.anyMatch(y -> {
      					final ISourceFunctions sourceFunctions = y.selectSource().extension(ISourceFunctions.class);
      					return sourceFunctions.Destination().selectDestinationSystemConfiguration().equals(x.selectInstanceOf());
      				}))
      		.collect(Collectors.toList());
      /* End Protected Region   [[706413be-1e91-11eb-b08c-d72de2e3f55f]] */
    }

  }
  
  public static class SystemConfigurationAccessFromFunctions {

    private SystemConfigurationAccessFromFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyWithAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom systemConfigurationAccessFrom) {
      return DynamicResourceUtil.invoke(ISystemConfigurationAccessFromFunctionsImpl.class, SystemConfigurationAccessFromFunctionsImpl.INSTANCE, systemConfigurationAccessFrom).OnlyWithAccess(abstractSite, systemConfigurationAccessFrom);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b13f88ca-1e75-11eb-b08c-d72de2e3f55f,+oybxNMQ292oC3GiE68exDcIbzo=] */
