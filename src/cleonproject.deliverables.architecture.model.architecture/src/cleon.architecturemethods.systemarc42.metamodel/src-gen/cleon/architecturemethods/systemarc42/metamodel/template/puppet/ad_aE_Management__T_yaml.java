package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[cfa40d24-5180-11ea-a946-13c393300b57,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.ActivitySystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivitySystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.FunctionSpace_AuthZ_Deployment.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite;

/* End Protected Region   [[cfa40d24-5180-11ea-a946-13c393300b57,imports]] */

public class ad_aE_Management__T_yaml {

  /* Begin Protected Region [[cfa40d24-5180-11ea-a946-13c393300b57]] */

  /* End Protected Region   [[cfa40d24-5180-11ea-a946-13c393300b57]] */


  public static interface IAbstractHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("82ca75a5-b075-11ea-b791-9b401fd02359")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission WriteActivity();

  }
  
  public static interface IAbstractHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("82ca75a5-b075-11ea-b791-9b401fd02359")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission WriteActivity(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost abstractHost);

  }
  
  public static class AbstractHostFunctionsImpl implements IAbstractHostFunctionsImpl {

    public static final IAbstractHostFunctionsImpl INSTANCE = new AbstractHostFunctionsImpl();

    private AbstractHostFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission WriteActivity(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost abstractHost) {
      /* Begin Protected Region [[82ca75a5-b075-11ea-b791-9b401fd02359]] */
      final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractHostFunctions abstractHostFunctions = abstractHost
      		.extension(
      				cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractHostFunctions.class);
      final List<IActivitySystemConfiguration> activitySystemConfigurations = ActivitySystemConfiguration
      		.selectToMeActivityForSystemConfiguration(abstractHost.selectInstanceOf());
      for (final IActivitySystemConfiguration activitySystemConfiguration : activitySystemConfigurations) {
      	final IAbstractGroupFunctions abstractGroupFunctions = activitySystemConfiguration
      			.extension(IAbstractGroupFunctions.class);
      	final IAbstractSite site = abstractGroupFunctions.GetSite();
      	if (site.equals(abstractHostFunctions.TopSite())) {
      		return activitySystemConfiguration.selectActivitiesForPermissions().values().stream()
      				.filter(x -> x.selectPermissionTemplate().selectPermission().selectName().equals("write"))
      				.findFirst().orElse(null);
      	}
      }
      return null;

      /* End Protected Region   [[82ca75a5-b075-11ea-b791-9b401fd02359]] */
    }

  }
  
  public static class AbstractHostFunctions {

    private AbstractHostFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission WriteActivity(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost abstractHost) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHost).WriteActivity(abstractHost);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cfa40d24-5180-11ea-a946-13c393300b57,stIhdxCORsA6MeN/W/bZvoJRpx8=] */
