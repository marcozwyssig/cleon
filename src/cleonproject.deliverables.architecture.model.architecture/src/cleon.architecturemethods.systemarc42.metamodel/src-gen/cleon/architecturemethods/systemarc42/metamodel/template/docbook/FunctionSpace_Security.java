package cleon.architecturemethods.systemarc42.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8db33913-1e0a-11e9-834d-77c41fccc6bf,imports]] */

/* End Protected Region   [[8db33913-1e0a-11e9-834d-77c41fccc6bf,imports]] */

public class FunctionSpace_Security {

  /* Begin Protected Region [[8db33913-1e0a-11e9-834d-77c41fccc6bf]] */
  
  /* End Protected Region   [[8db33913-1e0a-11e9-834d-77c41fccc6bf]] */


  public static interface IActivitySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ffcbe63a-1e15-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("8b15e7c2-61cd-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters();

  }
  
  public static interface IActivitySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8b15e7c2-61cd-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration activitySystemConfiguration);

  }
  
  public static class ActivitySystemConfigurationFunctionsImpl implements IActivitySystemConfigurationFunctionsImpl {

    public static final IActivitySystemConfigurationFunctionsImpl INSTANCE = new ActivitySystemConfigurationFunctionsImpl();

    private ActivitySystemConfigurationFunctionsImpl() {}

    @Override
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration activitySystemConfiguration) {
      return null;
    }

  }
  
  public static class ActivitySystemConfigurationFunctions {

    private ActivitySystemConfigurationFunctions() {}

    public static java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration activitySystemConfiguration) {
      return DynamicResourceUtil.invoke(IActivitySystemConfigurationFunctionsImpl.class, ActivitySystemConfigurationFunctionsImpl.INSTANCE, activitySystemConfiguration).RenderChapters(activitySystemConfiguration);
    }

  }

  public static interface IActivityRootGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8fcdfb48-1e18-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IActivityRootGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityRootGroupsFunctionsImpl implements IActivityRootGroupsFunctionsImpl {

    public static final IActivityRootGroupsFunctionsImpl INSTANCE = new ActivityRootGroupsFunctionsImpl();

    private ActivityRootGroupsFunctionsImpl() {}

  }
  
  public static class ActivityRootGroupsFunctions {

    private ActivityRootGroupsFunctions() {}

  }

  public static interface IRoleActorGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fa35cae7-1e1b-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("2f696a13-61d4-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters();

  }
  
  public static interface IRoleActorGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2f696a13-61d4-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleActorGroup roleActorGroup);

  }
  
  public static class RoleActorGroupFunctionsImpl implements IRoleActorGroupFunctionsImpl {

    public static final IRoleActorGroupFunctionsImpl INSTANCE = new RoleActorGroupFunctionsImpl();

    private RoleActorGroupFunctionsImpl() {}

    @Override
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleActorGroup roleActorGroup) {
      return null;
    }

  }
  
  public static class RoleActorGroupFunctions {

    private RoleActorGroupFunctions() {}

    public static java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleActorGroup roleActorGroup) {
      return DynamicResourceUtil.invoke(IRoleActorGroupFunctionsImpl.class, RoleActorGroupFunctionsImpl.INSTANCE, roleActorGroup).RenderChapters(roleActorGroup);
    }

  }

  public static interface IRoleRootGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0093bca4-1e1c-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRoleRootGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RoleRootGroupsFunctionsImpl implements IRoleRootGroupsFunctionsImpl {

    public static final IRoleRootGroupsFunctionsImpl INSTANCE = new RoleRootGroupsFunctionsImpl();

    private RoleRootGroupsFunctionsImpl() {}

  }
  
  public static class RoleRootGroupsFunctions {

    private RoleRootGroupsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8db33913-1e0a-11e9-834d-77c41fccc6bf,ikP9hbq4g6Xj78mrwQEfFiVIN9Q=] */
