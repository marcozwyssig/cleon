package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8392bad9-1073-11f0-b378-11a495632127,imports]] */

/* End Protected Region   [[8392bad9-1073-11f0-b378-11a495632127,imports]] */

public class FunctionSpace_Puppet {

  /* Begin Protected Region [[8392bad9-1073-11f0-b378-11a495632127]] */
  
  /* End Protected Region   [[8392bad9-1073-11f0-b378-11a495632127]] */


  public static interface IPuppetConfigurationPermissionsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b514db2-1073-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AvailablePermissions();

    @IDynamicResourceExtension.MethodId("8fc9009e-1078-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AllPermissions();

  }
  
  public static interface IPuppetConfigurationPermissionsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PuppetConfigurationPermissionsFunctionsImpl implements IPuppetConfigurationPermissionsFunctionsImpl {

    public static final IPuppetConfigurationPermissionsFunctionsImpl INSTANCE = new PuppetConfigurationPermissionsFunctionsImpl();

    private PuppetConfigurationPermissionsFunctionsImpl() {}

  }
  
  public static class PuppetConfigurationPermissionsFunctions {

    private PuppetConfigurationPermissionsFunctions() {}

  }

  public static interface IUserrightsassignmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("895bcc67-1078-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AvailablePermissions();

  }
  
  public static interface IUserrightsassignmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UserrightsassignmentFunctionsImpl implements IUserrightsassignmentFunctionsImpl {

    public static final IUserrightsassignmentFunctionsImpl INSTANCE = new UserrightsassignmentFunctionsImpl();

    private UserrightsassignmentFunctionsImpl() {}

  }
  
  public static class UserrightsassignmentFunctions {

    private UserrightsassignmentFunctions() {}

  }

  public static interface ILocalGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fa687ab2-107e-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AvailablePermissions();

  }
  
  public static interface ILocalGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalGroupsFunctionsImpl implements ILocalGroupsFunctionsImpl {

    public static final ILocalGroupsFunctionsImpl INSTANCE = new LocalGroupsFunctionsImpl();

    private LocalGroupsFunctionsImpl() {}

  }
  
  public static class LocalGroupsFunctions {

    private LocalGroupsFunctions() {}

  }

  public static interface IActivityMemberFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f40f664-2197-11f0-83ae-df5418a109a4")
    public java.lang.String FQDN();

    @IDynamicResourceExtension.MethodId("3c346413-2197-11f0-83ae-df5418a109a4")
    public java.lang.String Name();

  }
  
  public static interface IActivityMemberFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityMemberFunctionsImpl implements IActivityMemberFunctionsImpl {

    public static final IActivityMemberFunctionsImpl INSTANCE = new ActivityMemberFunctionsImpl();

    private ActivityMemberFunctionsImpl() {}

  }
  
  public static class ActivityMemberFunctions {

    private ActivityMemberFunctions() {}

  }

  public static interface IAbstractMemberFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("66daf807-2197-11f0-83ae-df5418a109a4")
    public java.lang.String Name();

  }
  
  public static interface IAbstractMemberFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractMemberFunctionsImpl implements IAbstractMemberFunctionsImpl {

    public static final IAbstractMemberFunctionsImpl INSTANCE = new AbstractMemberFunctionsImpl();

    private AbstractMemberFunctionsImpl() {}

  }
  
  public static class AbstractMemberFunctions {

    private AbstractMemberFunctions() {}

  }

  public static interface INamedMemberFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("74978240-2197-11f0-83ae-df5418a109a4")
    public java.lang.String Name();

  }
  
  public static interface INamedMemberFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedMemberFunctionsImpl implements INamedMemberFunctionsImpl {

    public static final INamedMemberFunctionsImpl INSTANCE = new NamedMemberFunctionsImpl();

    private NamedMemberFunctionsImpl() {}

  }
  
  public static class NamedMemberFunctions {

    private NamedMemberFunctions() {}

  }

  public static interface IServiceAccountMemberFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("977f759d-21c2-11f0-83ae-df5418a109a4")
    public java.lang.String Name();

    @IDynamicResourceExtension.MethodId("98b03741-21c3-11f0-83ae-df5418a109a4")
    public java.lang.String LogonAs();

    @IDynamicResourceExtension.MethodId("a77d5c6b-2bde-11f0-9ce1-09b647a63c7b")
    public java.lang.String NetbiosName();

  }
  
  public static interface IServiceAccountMemberFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountMemberFunctionsImpl implements IServiceAccountMemberFunctionsImpl {

    public static final IServiceAccountMemberFunctionsImpl INSTANCE = new ServiceAccountMemberFunctionsImpl();

    private ServiceAccountMemberFunctionsImpl() {}

  }
  
  public static class ServiceAccountMemberFunctions {

    private ServiceAccountMemberFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8392bad9-1073-11f0-b378-11a495632127,WYeRehiCXZTekMoNOnhpLENhBuQ=] */
