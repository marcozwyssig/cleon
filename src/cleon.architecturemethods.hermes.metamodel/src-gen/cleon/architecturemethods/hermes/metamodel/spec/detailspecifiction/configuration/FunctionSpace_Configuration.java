package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[82e8262a-0024-11f0-945c-87b19aec41f4,imports]] */

/* End Protected Region   [[82e8262a-0024-11f0-945c-87b19aec41f4,imports]] */

public class FunctionSpace_Configuration {

  /* Begin Protected Region [[82e8262a-0024-11f0-945c-87b19aec41f4]] */
  
  /* End Protected Region   [[82e8262a-0024-11f0-945c-87b19aec41f4]] */


  public static interface IAbstractConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9411f961-001e-11f0-945c-87b19aec41f4")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> AllPuppetConfigurations();

    @IDynamicResourceExtension.MethodId("22b362ac-0015-11f0-945c-87b19aec41f4")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> OnlyWithPuppetConfiguration();

  }
  
  public static interface IAbstractConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("22b362ac-0015-11f0-945c-87b19aec41f4")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> OnlyWithPuppetConfiguration(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList);

  }
  
  public static class AbstractConfigurationFunctionsImpl implements IAbstractConfigurationFunctionsImpl {

    public static final IAbstractConfigurationFunctionsImpl INSTANCE = new AbstractConfigurationFunctionsImpl();

    private AbstractConfigurationFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> OnlyWithPuppetConfiguration(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList) {
      /* Begin Protected Region [[22b362ac-0015-11f0-945c-87b19aec41f4]] */
    	return abstractConfigurationList.stream().filter(x -> x.extension(IAbstractConfigurationFunctions.class).AllPuppetConfigurations().isEmpty() == false).toList();
      /* End Protected Region   [[22b362ac-0015-11f0-945c-87b19aec41f4]] */
    }

  }
  
  public static class AbstractConfigurationFunctions {

    private AbstractConfigurationFunctions() {}

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> OnlyWithPuppetConfiguration(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList) {
      return DynamicResourceUtil.invoke(IAbstractConfigurationFunctionsImpl.class, AbstractConfigurationFunctionsImpl.INSTANCE, abstractConfigurationList).OnlyWithPuppetConfiguration(abstractConfigurationList);
    }

  }

  public static interface IAbstractEnvironmentSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("47f35586-0023-11f0-945c-87b19aec41f4")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> AllPuppetConfigurations();

  }
  
  public static interface IAbstractEnvironmentSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractEnvironmentSpecificationFunctionsImpl implements IAbstractEnvironmentSpecificationFunctionsImpl {

    public static final IAbstractEnvironmentSpecificationFunctionsImpl INSTANCE = new AbstractEnvironmentSpecificationFunctionsImpl();

    private AbstractEnvironmentSpecificationFunctionsImpl() {}

  }
  
  public static class AbstractEnvironmentSpecificationFunctions {

    private AbstractEnvironmentSpecificationFunctions() {}

  }

  public static interface ISysCfgSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d4bc5ec2-0025-11f0-945c-87b19aec41f4")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> AllPuppetConfigurations();

  }
  
  public static interface ISysCfgSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgSpecificationFunctionsImpl implements ISysCfgSpecificationFunctionsImpl {

    public static final ISysCfgSpecificationFunctionsImpl INSTANCE = new SysCfgSpecificationFunctionsImpl();

    private SysCfgSpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgSpecificationFunctions {

    private SysCfgSpecificationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,82e8262a-0024-11f0-945c-87b19aec41f4,QS6fqftM26sLoB/WkE/3d414bng=] */
