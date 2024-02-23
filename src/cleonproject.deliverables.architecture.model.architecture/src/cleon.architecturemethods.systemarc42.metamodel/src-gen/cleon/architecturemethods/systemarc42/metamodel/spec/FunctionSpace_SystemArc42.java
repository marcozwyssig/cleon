package cleon.architecturemethods.systemarc42.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[1270d567-5d76-11ea-a17e-876aff2eba30,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration;
/* End Protected Region   [[1270d567-5d76-11ea-a17e-876aff2eba30,imports]] */

public class FunctionSpace_SystemArc42 {

  /* Begin Protected Region [[1270d567-5d76-11ea-a17e-876aff2eba30]] */

  /* End Protected Region   [[1270d567-5d76-11ea-a17e-876aff2eba30]] */


  public static interface Iarc42DocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("45c60299-5d76-11ea-a17e-876aff2eba30")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration> AllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("74fb7141-2f40-11eb-a94a-69eb35614fc8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration> AllBuildSystemConfigurations();

    @IDynamicResourceExtension.MethodId("032975f9-d21c-11ee-9471-713ee8ae5987")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemcomponent.javamodel.ISystemComponent> AllBuildSystemComponents();

    @IDynamicResourceExtension.MethodId("da0e8af9-95ca-11ea-9744-7dd962dc1878")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemcomponent.javamodel.ISystemComponent> AllSystemComponents();

    @IDynamicResourceExtension.MethodId("d6f12bfe-fd72-11ea-bd30-fd04439335e1")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem> AllSystems();

  }
  
  public static interface Iarc42DocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class arc42DocumentFunctionsImpl implements Iarc42DocumentFunctionsImpl {

    public static final Iarc42DocumentFunctionsImpl INSTANCE = new arc42DocumentFunctionsImpl();

    private arc42DocumentFunctionsImpl() {}

  }
  
  public static class arc42DocumentFunctions {

    private arc42DocumentFunctions() {}

  }

  public static interface ISystemArc42DocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4ad206a2-b1fa-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology Topology();

    @IDynamicResourceExtension.MethodId("47e109fb-b211-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IIPNetworkConcept Network();

    @IDynamicResourceExtension.MethodId("5d3590b9-b20a-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration GetSystemConfiguration(final java.lang.String name);

  }
  
  public static interface ISystemArc42DocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("5d3590b9-b20a-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration GetSystemConfiguration(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec.javamodel.ISystemArc42Document systemArc42Document);

  }
  
  public static class SystemArc42DocumentFunctionsImpl implements ISystemArc42DocumentFunctionsImpl {

    public static final ISystemArc42DocumentFunctionsImpl INSTANCE = new SystemArc42DocumentFunctionsImpl();

    private SystemArc42DocumentFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration GetSystemConfiguration(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec.javamodel.ISystemArc42Document systemArc42Document) {
      /* Begin Protected Region [[5d3590b9-b20a-11ea-a3a2-e9d3344bee73]] */
    	final Iarc42DocumentFunctions iarc42DocumentFunctions = systemArc42Document.extension(Iarc42DocumentFunctions.class);
    	final List<ISystemConfiguration> systemConfigurations = iarc42DocumentFunctions.AllSystemConfigurations();
    	for( final ISystemConfiguration configuration : systemConfigurations ) {
    		if (configuration.selectShortName().equalsIgnoreCase(name)) {
    			return configuration;
    		}
    	}
    	return null;
      /* End Protected Region   [[5d3590b9-b20a-11ea-a3a2-e9d3344bee73]] */
    }

  }
  
  public static class SystemArc42DocumentFunctions {

    private SystemArc42DocumentFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration GetSystemConfiguration(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec.javamodel.ISystemArc42Document systemArc42Document) {
      return DynamicResourceUtil.invoke(ISystemArc42DocumentFunctionsImpl.class, SystemArc42DocumentFunctionsImpl.INSTANCE, systemArc42Document).GetSystemConfiguration(name, systemArc42Document);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,1270d567-5d76-11ea-a17e-876aff2eba30,/1d4/8Cf+ya9daJ64MMBHYuVQtg=] */
