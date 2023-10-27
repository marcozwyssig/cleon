package cleon.architecturemethods.systemarc42.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fb58b09d-d181-11e8-b18f-df1540bb7a5c,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleActorResponsibility;
import java.util.stream.Collectors;
/* End Protected Region   [[fb58b09d-d181-11e8-b18f-df1540bb7a5c,imports]] */

public class FunctionSpace_Docbook_SystemArc42 {

  /* Begin Protected Region [[fb58b09d-d181-11e8-b18f-df1540bb7a5c]] */

  /* End Protected Region   [[fb58b09d-d181-11e8-b18f-df1540bb7a5c]] */


  public static interface IAvailabilityConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6005307c-1e3a-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAvailabilityConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AvailabilityConceptFunctionsImpl implements IAvailabilityConceptFunctionsImpl {

    public static final IAvailabilityConceptFunctionsImpl INSTANCE = new AvailabilityConceptFunctionsImpl();

    private AvailabilityConceptFunctionsImpl() {}

  }
  
  public static class AvailabilityConceptFunctions {

    private AvailabilityConceptFunctions() {}

  }

  public static interface IBackupConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("90698ca7-1e3f-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IBackupConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BackupConceptFunctionsImpl implements IBackupConceptFunctionsImpl {

    public static final IBackupConceptFunctionsImpl INSTANCE = new BackupConceptFunctionsImpl();

    private BackupConceptFunctionsImpl() {}

  }
  
  public static class BackupConceptFunctions {

    private BackupConceptFunctions() {}

  }

  public static interface IDeploymentLevelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("13e4610e-0e2a-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeploymentLevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentLevelFunctionsImpl implements IDeploymentLevelFunctionsImpl {

    public static final IDeploymentLevelFunctionsImpl INSTANCE = new DeploymentLevelFunctionsImpl();

    private DeploymentLevelFunctionsImpl() {}

  }
  
  public static class DeploymentLevelFunctions {

    private DeploymentLevelFunctions() {}

  }

  public static interface ISystemEnvironmentNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b4d3279-0e9e-11e9-9f19-6d15636f4ecc")
    public java.lang.String RenderChapters();

  }
  
  public static interface ISystemEnvironmentNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemEnvironmentNodeFunctionsImpl implements ISystemEnvironmentNodeFunctionsImpl {

    public static final ISystemEnvironmentNodeFunctionsImpl INSTANCE = new SystemEnvironmentNodeFunctionsImpl();

    private SystemEnvironmentNodeFunctionsImpl() {}

  }
  
  public static class SystemEnvironmentNodeFunctions {

    private SystemEnvironmentNodeFunctions() {}

  }

  public static interface IDeployViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cccabf27-1983-11e9-88a0-1f786f12e4c1")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeployViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeployViewFunctionsImpl implements IDeployViewFunctionsImpl {

    public static final IDeployViewFunctionsImpl INSTANCE = new DeployViewFunctionsImpl();

    private DeployViewFunctionsImpl() {}

  }
  
  public static class DeployViewFunctions {

    private DeployViewFunctions() {}

  }

  public static interface IDeploymentDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52e6d461-199d-11e9-9d43-9ddad24f774b")
    public java.lang.String GetStandardDescription();

    @IDynamicResourceExtension.MethodId("b42c03d5-8551-11ea-a579-31bf00957a06")
    public java.lang.String RenderContent();

  }
  
  public static interface IDeploymentDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentDiagramFunctionsImpl implements IDeploymentDiagramFunctionsImpl {

    public static final IDeploymentDiagramFunctionsImpl INSTANCE = new DeploymentDiagramFunctionsImpl();

    private DeploymentDiagramFunctionsImpl() {}

  }
  
  public static class DeploymentDiagramFunctions {

    private DeploymentDiagramFunctions() {}

  }

  public static interface IActivitySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ffcbe63a-1e15-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("8b15e7c2-61cd-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters();

  }
  
  public static interface IActivitySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8b15e7c2-61cd-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySystemConfiguration activitySystemConfiguration);

  }
  
  public static class ActivitySystemConfigurationFunctionsImpl implements IActivitySystemConfigurationFunctionsImpl {

    public static final IActivitySystemConfigurationFunctionsImpl INSTANCE = new ActivitySystemConfigurationFunctionsImpl();

    private ActivitySystemConfigurationFunctionsImpl() {}

    @Override
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySystemConfiguration activitySystemConfiguration) {
      return null;
    }

  }
  
  public static class ActivitySystemConfigurationFunctions {

    private ActivitySystemConfigurationFunctions() {}

    public static java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySystemConfiguration activitySystemConfiguration) {
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

    @IDynamicResourceExtension.MethodId("0a09741d-6e97-11ea-b8e8-f1a46e0c42f7")
    public java.lang.Integer Count();

  }
  
  public static interface IRoleActorGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2f696a13-61d4-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleActorGroup roleActorGroup);

    @IDynamicResourceExtension.MethodId("0a09741d-6e97-11ea-b8e8-f1a46e0c42f7")
    public java.lang.Integer Count(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleActorGroup roleActorGroup);

  }
  
  public static class RoleActorGroupFunctionsImpl implements IRoleActorGroupFunctionsImpl {

    public static final IRoleActorGroupFunctionsImpl INSTANCE = new RoleActorGroupFunctionsImpl();

    private RoleActorGroupFunctionsImpl() {}

    @Override
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleActorGroup roleActorGroup) {
      return null;
    }

    @Override
    public java.lang.Integer Count(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleActorGroup roleActorGroup) {
      /* Begin Protected Region [[0a09741d-6e97-11ea-b8e8-f1a46e0c42f7]] */
      int count = 0;
      for (final IRoleActorResponsibility actorResponsibility : roleActorGroup.selectRoleActorResponsibilities()
      		.values()) {
      	count += actorResponsibility.selectRolesForSystemComponents().size();
      }
      return count;
      /* End Protected Region   [[0a09741d-6e97-11ea-b8e8-f1a46e0c42f7]] */
    }

  }
  
  public static class RoleActorGroupFunctions {

    private RoleActorGroupFunctions() {}

    public static java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleActorGroup roleActorGroup) {
      return DynamicResourceUtil.invoke(IRoleActorGroupFunctionsImpl.class, RoleActorGroupFunctionsImpl.INSTANCE, roleActorGroup).RenderChapters(roleActorGroup);
    }

    public static java.lang.Integer Count(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleActorGroup roleActorGroup) {
      return DynamicResourceUtil.invoke(IRoleActorGroupFunctionsImpl.class, RoleActorGroupFunctionsImpl.INSTANCE, roleActorGroup).Count(roleActorGroup);
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

  public static interface IDestinationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5de412e9-6df3-11ea-ab3c-05911d3796c8")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDestinationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DestinationFunctionsImpl implements IDestinationFunctionsImpl {

    public static final IDestinationFunctionsImpl INSTANCE = new DestinationFunctionsImpl();

    private DestinationFunctionsImpl() {}

  }
  
  public static class DestinationFunctions {

    private DestinationFunctions() {}

  }

  public static interface IZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99621024-6e6e-11ea-b8e8-f1a46e0c42f7")
    public java.lang.String RenderChapters();

    @IDynamicResourceExtension.MethodId("4047d49d-0d1e-11e9-be4f-03130cc057ef")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ZoneFunctionsImpl implements IZoneFunctionsImpl {

    public static final IZoneFunctionsImpl INSTANCE = new ZoneFunctionsImpl();

    private ZoneFunctionsImpl() {}

  }
  
  public static class ZoneFunctions {

    private ZoneFunctions() {}

  }

  public static interface IAbstractPhysicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("765c9a86-6e84-11ea-b8e8-f1a46e0c42f7")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAbstractPhysicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractPhysicalNetworkFunctionsImpl implements IAbstractPhysicalNetworkFunctionsImpl {

    public static final IAbstractPhysicalNetworkFunctionsImpl INSTANCE = new AbstractPhysicalNetworkFunctionsImpl();

    private AbstractPhysicalNetworkFunctionsImpl() {}

  }
  
  public static class AbstractPhysicalNetworkFunctions {

    private AbstractPhysicalNetworkFunctions() {}

  }

  public static interface IAbstractLogicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9e732d10-6e87-11ea-b8e8-f1a46e0c42f7")
    public java.lang.String RenderChapters();

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

  public static interface IAutorizationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("acf274f1-6e93-11ea-b8e8-f1a46e0c42f7")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface IAutorizationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AutorizationConceptFunctionsImpl implements IAutorizationConceptFunctionsImpl {

    public static final IAutorizationConceptFunctionsImpl INSTANCE = new AutorizationConceptFunctionsImpl();

    private AutorizationConceptFunctionsImpl() {}

  }
  
  public static class AutorizationConceptFunctions {

    private AutorizationConceptFunctions() {}

  }

  public static interface IAbstractSiteGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4ebcf47f-6e95-11ea-b8e8-f1a46e0c42f7")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAbstractSiteGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSiteGroupFunctionsImpl implements IAbstractSiteGroupFunctionsImpl {

    public static final IAbstractSiteGroupFunctionsImpl INSTANCE = new AbstractSiteGroupFunctionsImpl();

    private AbstractSiteGroupFunctionsImpl() {}

  }
  
  public static class AbstractSiteGroupFunctions {

    private AbstractSiteGroupFunctions() {}

  }

  public static interface ISourceSubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e8e78fbc-d1a5-11ea-aaa2-e3554b4f77be")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ISourceSubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceSubZoneFunctionsImpl implements ISourceSubZoneFunctionsImpl {

    public static final ISourceSubZoneFunctionsImpl INSTANCE = new SourceSubZoneFunctionsImpl();

    private SourceSubZoneFunctionsImpl() {}

  }
  
  public static class SourceSubZoneFunctions {

    private SourceSubZoneFunctions() {}

  }

  public static interface IQoSSystemConfigurationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("70ffa98d-d1aa-11ea-aaa2-e3554b4f77be")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("87ae5508-0a3b-11ec-8912-0f9ef89df758")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept OnlyWhereAreNotZero(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNet);

  }
  
  public static interface IQoSSystemConfigurationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("87ae5508-0a3b-11ec-8912-0f9ef89df758")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept OnlyWhereAreNotZero(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNet, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept);

  }
  
  public static class QoSSystemConfigurationConceptFunctionsImpl implements IQoSSystemConfigurationConceptFunctionsImpl {

    public static final IQoSSystemConfigurationConceptFunctionsImpl INSTANCE = new QoSSystemConfigurationConceptFunctionsImpl();

    private QoSSystemConfigurationConceptFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept OnlyWhereAreNotZero(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNet, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept) {
      /* Begin Protected Region [[87ae5508-0a3b-11ec-8912-0f9ef89df758]] */
    	var bandwith = qoSSystemConfigurationConcept.extension(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.FunctionSpace_QoS.IQoSSystemConfigurationConceptFunctions.class).SumBandwithRequirements_aE__aA_byte_aC_(environment, transportNet);
    	if( bandwith > 0) {
    		return qoSSystemConfigurationConcept;
    	}
    	return null;  
      /* End Protected Region   [[87ae5508-0a3b-11ec-8912-0f9ef89df758]] */
    }

  }
  
  public static class QoSSystemConfigurationConceptFunctions {

    private QoSSystemConfigurationConceptFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept OnlyWhereAreNotZero(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNet, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationConceptFunctionsImpl.class, QoSSystemConfigurationConceptFunctionsImpl.INSTANCE, qoSSystemConfigurationConcept).OnlyWhereAreNotZero(environment, transportNet, qoSSystemConfigurationConcept);
    }

  }

  public static interface IServiceAccountEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cf0e7bcd-d1b5-11ea-aaa2-e3554b4f77be")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IServiceAccountEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountEnvironmentFunctionsImpl implements IServiceAccountEnvironmentFunctionsImpl {

    public static final IServiceAccountEnvironmentFunctionsImpl INSTANCE = new ServiceAccountEnvironmentFunctionsImpl();

    private ServiceAccountEnvironmentFunctionsImpl() {}

  }
  
  public static class ServiceAccountEnvironmentFunctions {

    private ServiceAccountEnvironmentFunctions() {}

  }

  public static interface IWhiteboxFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("17d0424a-d7dd-11ea-ae00-5518e944c256")
    public java.lang.String RenderAdditionalChapters();

    @IDynamicResourceExtension.MethodId("457549ba-d7dd-11ea-ae00-5518e944c256")
    public java.lang.String RenderNetworkSegmentation();

  }
  
  public static interface IWhiteboxFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WhiteboxFunctionsImpl implements IWhiteboxFunctionsImpl {

    public static final IWhiteboxFunctionsImpl INSTANCE = new WhiteboxFunctionsImpl();

    private WhiteboxFunctionsImpl() {}

  }
  
  public static class WhiteboxFunctions {

    private WhiteboxFunctions() {}

  }

  public static interface IRealmForSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b01db1fa-fd92-11ea-aa08-3550db97e5ec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRealmForSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RealmForSystemConfigurationFunctionsImpl implements IRealmForSystemConfigurationFunctionsImpl {

    public static final IRealmForSystemConfigurationFunctionsImpl INSTANCE = new RealmForSystemConfigurationFunctionsImpl();

    private RealmForSystemConfigurationFunctionsImpl() {}

  }
  
  public static class RealmForSystemConfigurationFunctions {

    private RealmForSystemConfigurationFunctions() {}

  }

  public static interface IAbstractRealmHandlersFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c93a7167-fd9b-11ea-aa08-3550db97e5ec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAbstractRealmHandlersFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractRealmHandlersFunctionsImpl implements IAbstractRealmHandlersFunctionsImpl {

    public static final IAbstractRealmHandlersFunctionsImpl INSTANCE = new AbstractRealmHandlersFunctionsImpl();

    private AbstractRealmHandlersFunctionsImpl() {}

  }
  
  public static class AbstractRealmHandlersFunctions {

    private AbstractRealmHandlersFunctions() {}

  }

  public static interface IRealmDependentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e1c2a7c8-fd9b-11ea-aa08-3550db97e5ec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRealmDependentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RealmDependentFunctionsImpl implements IRealmDependentFunctionsImpl {

    public static final IRealmDependentFunctionsImpl INSTANCE = new RealmDependentFunctionsImpl();

    private RealmDependentFunctionsImpl() {}

  }
  
  public static class RealmDependentFunctions {

    private RealmDependentFunctions() {}

  }

  public static interface IRealmConnectionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("27b99338-fd9c-11ea-aa08-3550db97e5ec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRealmConnectionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RealmConnectionFunctionsImpl implements IRealmConnectionFunctionsImpl {

    public static final IRealmConnectionFunctionsImpl INSTANCE = new RealmConnectionFunctionsImpl();

    private RealmConnectionFunctionsImpl() {}

  }
  
  public static class RealmConnectionFunctions {

    private RealmConnectionFunctions() {}

  }

  public static interface IRealmConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6a53ed4a-fd99-11ea-aa08-3550db97e5ec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRealmConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RealmConceptFunctionsImpl implements IRealmConceptFunctionsImpl {

    public static final IRealmConceptFunctionsImpl INSTANCE = new RealmConceptFunctionsImpl();

    private RealmConceptFunctionsImpl() {}

  }
  
  public static class RealmConceptFunctions {

    private RealmConceptFunctions() {}

  }

  public static interface IRealmConfigurationUsageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4f425a8b-fd9e-11ea-aa08-3550db97e5ec")
    public java.lang.String Text();

  }
  
  public static interface IRealmConfigurationUsageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4f425a8b-fd9e-11ea-aa08-3550db97e5ec")
    public java.lang.String Text(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage realmConfigurationUsage);

  }
  
  public static class RealmConfigurationUsageFunctionsImpl implements IRealmConfigurationUsageFunctionsImpl {

    public static final IRealmConfigurationUsageFunctionsImpl INSTANCE = new RealmConfigurationUsageFunctionsImpl();

    private RealmConfigurationUsageFunctionsImpl() {}

    @Override
    public java.lang.String Text(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage realmConfigurationUsage) {
      /* Begin Protected Region [[4f425a8b-fd9e-11ea-aa08-3550db97e5ec]] */
      if (realmConfigurationUsage.selectDescriptions().isEmpty()) {
      	return String.join("\n", realmConfigurationUsage.selectDirectoryService().selectStandardDescription());
      }
      return String.join("\n", realmConfigurationUsage.selectDescriptions());
      /* End Protected Region   [[4f425a8b-fd9e-11ea-aa08-3550db97e5ec]] */
    }

  }
  
  public static class RealmConfigurationUsageFunctions {

    private RealmConfigurationUsageFunctions() {}

    public static java.lang.String Text(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConfigurationUsage realmConfigurationUsage) {
      return DynamicResourceUtil.invoke(IRealmConfigurationUsageFunctionsImpl.class, RealmConfigurationUsageFunctionsImpl.INSTANCE, realmConfigurationUsage).Text(realmConfigurationUsage);
    }

  }

  public static interface IDeploymentMethodConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c8cdea46-fe53-11ea-abcb-bfad67a56d79")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeploymentMethodConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentMethodConceptFunctionsImpl implements IDeploymentMethodConceptFunctionsImpl {

    public static final IDeploymentMethodConceptFunctionsImpl INSTANCE = new DeploymentMethodConceptFunctionsImpl();

    private DeploymentMethodConceptFunctionsImpl() {}

  }
  
  public static class DeploymentMethodConceptFunctions {

    private DeploymentMethodConceptFunctions() {}

  }

  public static interface IDeploymentMethodForSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("68164823-fe54-11ea-abcb-bfad67a56d79")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeploymentMethodForSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentMethodForSystemConfigurationFunctionsImpl implements IDeploymentMethodForSystemConfigurationFunctionsImpl {

    public static final IDeploymentMethodForSystemConfigurationFunctionsImpl INSTANCE = new DeploymentMethodForSystemConfigurationFunctionsImpl();

    private DeploymentMethodForSystemConfigurationFunctionsImpl() {}

  }
  
  public static class DeploymentMethodForSystemConfigurationFunctions {

    private DeploymentMethodForSystemConfigurationFunctions() {}

  }

  public static interface IDeploymentMethodForDependentSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("15864ee0-fe55-11ea-abcb-bfad67a56d79")
    public java.lang.String Text();

  }
  
  public static interface IDeploymentMethodForDependentSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("15864ee0-fe55-11ea-abcb-bfad67a56d79")
    public java.lang.String Text(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfiguration deploymentMethodForDependentSystemConfiguration);

  }
  
  public static class DeploymentMethodForDependentSystemConfigurationFunctionsImpl implements IDeploymentMethodForDependentSystemConfigurationFunctionsImpl {

    public static final IDeploymentMethodForDependentSystemConfigurationFunctionsImpl INSTANCE = new DeploymentMethodForDependentSystemConfigurationFunctionsImpl();

    private DeploymentMethodForDependentSystemConfigurationFunctionsImpl() {}

    @Override
    public java.lang.String Text(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfiguration deploymentMethodForDependentSystemConfiguration) {
      /* Begin Protected Region [[15864ee0-fe55-11ea-abcb-bfad67a56d79]] */
      return String.join("\n", deploymentMethodForDependentSystemConfiguration.selectUsedDeploymentMethod()
      		.selectStandardDescription());
      /* End Protected Region   [[15864ee0-fe55-11ea-abcb-bfad67a56d79]] */
    }

  }
  
  public static class DeploymentMethodForDependentSystemConfigurationFunctions {

    private DeploymentMethodForDependentSystemConfigurationFunctions() {}

    public static java.lang.String Text(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfiguration deploymentMethodForDependentSystemConfiguration) {
      return DynamicResourceUtil.invoke(IDeploymentMethodForDependentSystemConfigurationFunctionsImpl.class, DeploymentMethodForDependentSystemConfigurationFunctionsImpl.INSTANCE, deploymentMethodForDependentSystemConfiguration).Text(deploymentMethodForDependentSystemConfiguration);
    }

  }

  public static interface IDeploymentSystemArc42Functions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1eca449a-fe5c-11ea-abcb-bfad67a56d79")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeploymentSystemArc42FunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentSystemArc42FunctionsImpl implements IDeploymentSystemArc42FunctionsImpl {

    public static final IDeploymentSystemArc42FunctionsImpl INSTANCE = new DeploymentSystemArc42FunctionsImpl();

    private DeploymentSystemArc42FunctionsImpl() {}

  }
  
  public static class DeploymentSystemArc42Functions {

    private DeploymentSystemArc42Functions() {}

  }

  public static interface IAvailabilitySystemArc42Functions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5450483f-fe69-11ea-abcb-bfad67a56d79")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAvailabilitySystemArc42FunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AvailabilitySystemArc42FunctionsImpl implements IAvailabilitySystemArc42FunctionsImpl {

    public static final IAvailabilitySystemArc42FunctionsImpl INSTANCE = new AvailabilitySystemArc42FunctionsImpl();

    private AvailabilitySystemArc42FunctionsImpl() {}

  }
  
  public static class AvailabilitySystemArc42Functions {

    private AvailabilitySystemArc42Functions() {}

  }

  public static interface IAuthenticationSystemArc42Functions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e9bd53f7-fe71-11ea-a3a8-c10b28569251")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAuthenticationSystemArc42FunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthenticationSystemArc42FunctionsImpl implements IAuthenticationSystemArc42FunctionsImpl {

    public static final IAuthenticationSystemArc42FunctionsImpl INSTANCE = new AuthenticationSystemArc42FunctionsImpl();

    private AuthenticationSystemArc42FunctionsImpl() {}

  }
  
  public static class AuthenticationSystemArc42Functions {

    private AuthenticationSystemArc42Functions() {}

  }

  public static interface IAvailabilityBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ee33f9b5-00e0-11eb-89a7-8344c130228c")
    public java.lang.String Text();

  }
  
  public static interface IAvailabilityBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ee33f9b5-00e0-11eb-89a7-8344c130228c")
    public java.lang.String Text(final cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityBuildingBlock availabilityBuildingBlock);

  }
  
  public static class AvailabilityBuildingBlockFunctionsImpl implements IAvailabilityBuildingBlockFunctionsImpl {

    public static final IAvailabilityBuildingBlockFunctionsImpl INSTANCE = new AvailabilityBuildingBlockFunctionsImpl();

    private AvailabilityBuildingBlockFunctionsImpl() {}

    @Override
    public java.lang.String Text(final cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityBuildingBlock availabilityBuildingBlock) {
      /* Begin Protected Region [[ee33f9b5-00e0-11eb-89a7-8344c130228c]] */
      if (availabilityBuildingBlock.selectDescriptions().isEmpty()) {
      	return String.join("\n", availabilityBuildingBlock.selectAvailability().selectStandardDescription());
      }
      return String.join("\n", availabilityBuildingBlock.selectDescriptions());
      /* End Protected Region   [[ee33f9b5-00e0-11eb-89a7-8344c130228c]] */
    }

  }
  
  public static class AvailabilityBuildingBlockFunctions {

    private AvailabilityBuildingBlockFunctions() {}

    public static java.lang.String Text(final cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityBuildingBlock availabilityBuildingBlock) {
      return DynamicResourceUtil.invoke(IAvailabilityBuildingBlockFunctionsImpl.class, AvailabilityBuildingBlockFunctionsImpl.INSTANCE, availabilityBuildingBlock).Text(availabilityBuildingBlock);
    }

  }

  public static interface IAutorizationSystemArc42Functions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c7bc48b5-25ac-11eb-b9ae-4df44b18aa9b")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAutorizationSystemArc42FunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AutorizationSystemArc42FunctionsImpl implements IAutorizationSystemArc42FunctionsImpl {

    public static final IAutorizationSystemArc42FunctionsImpl INSTANCE = new AutorizationSystemArc42FunctionsImpl();

    private AutorizationSystemArc42FunctionsImpl() {}

  }
  
  public static class AutorizationSystemArc42Functions {

    private AutorizationSystemArc42Functions() {}

  }

  public static interface ISystemConfigurationAccessFromFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("04e4b0b0-3008-11eb-b17d-af74b7cf0bc4")
    public java.lang.String RenderContentElement();

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

  public static interface ISourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9eb54937-30a5-11eb-9149-f1e36a7322e5")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyWithDescription();

  }
  
  public static interface ISourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9eb54937-30a5-11eb-9149-f1e36a7322e5")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyWithDescription(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

  }
  
  public static class SourceFunctionsImpl implements ISourceFunctionsImpl {

    public static final ISourceFunctionsImpl INSTANCE = new SourceFunctionsImpl();

    private SourceFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyWithDescription(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[9eb54937-30a5-11eb-9149-f1e36a7322e5]] */
      return sourceList.stream().filter( x -> x.selectDescriptions().isEmpty() == false).collect(Collectors.toList());
      /* End Protected Region   [[9eb54937-30a5-11eb-9149-f1e36a7322e5]] */
    }

  }
  
  public static class SourceFunctions {

    private SourceFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyWithDescription(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).OnlyWithDescription(sourceList);
    }

  }

  public static interface IResourceBuildingBlockSystemConfigurationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2053c61d-c9fa-11eb-b6ae-b54ac45d32ca")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IResourceBuildingBlockSystemConfigurationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ResourceBuildingBlockSystemConfigurationConceptFunctionsImpl implements IResourceBuildingBlockSystemConfigurationConceptFunctionsImpl {

    public static final IResourceBuildingBlockSystemConfigurationConceptFunctionsImpl INSTANCE = new ResourceBuildingBlockSystemConfigurationConceptFunctionsImpl();

    private ResourceBuildingBlockSystemConfigurationConceptFunctionsImpl() {}

  }
  
  public static class ResourceBuildingBlockSystemConfigurationConceptFunctions {

    private ResourceBuildingBlockSystemConfigurationConceptFunctions() {}

  }

  public static interface IResourcePlanningNodeConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cb1654ef-dff2-11eb-93d3-9f230e4bb32b")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IResourcePlanningNodeConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ResourcePlanningNodeConceptFunctionsImpl implements IResourcePlanningNodeConceptFunctionsImpl {

    public static final IResourcePlanningNodeConceptFunctionsImpl INSTANCE = new ResourcePlanningNodeConceptFunctionsImpl();

    private ResourcePlanningNodeConceptFunctionsImpl() {}

  }
  
  public static class ResourcePlanningNodeConceptFunctions {

    private ResourcePlanningNodeConceptFunctions() {}

  }

  public static interface IAverageBandwithAndQoSConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0b96a4cd-e08b-11eb-9584-9144fca99be9")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAverageBandwithAndQoSConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AverageBandwithAndQoSConceptFunctionsImpl implements IAverageBandwithAndQoSConceptFunctionsImpl {

    public static final IAverageBandwithAndQoSConceptFunctionsImpl INSTANCE = new AverageBandwithAndQoSConceptFunctionsImpl();

    private AverageBandwithAndQoSConceptFunctionsImpl() {}

  }
  
  public static class AverageBandwithAndQoSConceptFunctions {

    private AverageBandwithAndQoSConceptFunctions() {}

  }

  public static interface IDeploymentProcedureConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4b241b58-7e9f-11ec-b55c-f5ca121c82b7")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeploymentProcedureConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentProcedureConceptFunctionsImpl implements IDeploymentProcedureConceptFunctionsImpl {

    public static final IDeploymentProcedureConceptFunctionsImpl INSTANCE = new DeploymentProcedureConceptFunctionsImpl();

    private DeploymentProcedureConceptFunctionsImpl() {}

  }
  
  public static class DeploymentProcedureConceptFunctions {

    private DeploymentProcedureConceptFunctions() {}

  }

  public static interface IDeploymentProcedureOrderGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("86e5ffd3-0e86-11ed-992a-279da38c72c5")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeploymentProcedureOrderGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentProcedureOrderGroupFunctionsImpl implements IDeploymentProcedureOrderGroupFunctionsImpl {

    public static final IDeploymentProcedureOrderGroupFunctionsImpl INSTANCE = new DeploymentProcedureOrderGroupFunctionsImpl();

    private DeploymentProcedureOrderGroupFunctionsImpl() {}

  }
  
  public static class DeploymentProcedureOrderGroupFunctions {

    private DeploymentProcedureOrderGroupFunctions() {}

  }

  public static interface IDNSSystemIntegrationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("393210f8-d0f5-11ec-a32f-e7eb43a099bd")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDNSSystemIntegrationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DNSSystemIntegrationFunctionsImpl implements IDNSSystemIntegrationFunctionsImpl {

    public static final IDNSSystemIntegrationFunctionsImpl INSTANCE = new DNSSystemIntegrationFunctionsImpl();

    private DNSSystemIntegrationFunctionsImpl() {}

  }
  
  public static class DNSSystemIntegrationFunctions {

    private DNSSystemIntegrationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fb58b09d-d181-11e8-b18f-df1540bb7a5c,M2V8Rc+WQ363x3sEOHny4a0bHZ0=] */
