package cleon.architecturemethods.systemarc42.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fb58b09d-d181-11e8-b18f-df1540bb7a5c,imports]] */

/* End Protected Region   [[fb58b09d-d181-11e8-b18f-df1540bb7a5c,imports]] */

public class FunctionSpace_SystemArc42_Docbook {

  /* Begin Protected Region [[fb58b09d-d181-11e8-b18f-df1540bb7a5c]] */
  
  /* End Protected Region   [[fb58b09d-d181-11e8-b18f-df1540bb7a5c]] */


  public static interface ISystemArc42DocumentFunctions extends IDynamicResourceExtension {

  }
  
  public static interface ISystemArc42DocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemArc42DocumentFunctionsImpl implements ISystemArc42DocumentFunctionsImpl {

    public static final ISystemArc42DocumentFunctionsImpl INSTANCE = new SystemArc42DocumentFunctionsImpl();

    private SystemArc42DocumentFunctionsImpl() {}

  }
  
  public static class SystemArc42DocumentFunctions {

    private SystemArc42DocumentFunctions() {}

  }

  public static interface INetworkConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d97e499e-61d2-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters();

  }
  
  public static interface INetworkConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d97e499e-61d2-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept networkConcept);

  }
  
  public static class NetworkConceptFunctionsImpl implements INetworkConceptFunctionsImpl {

    public static final INetworkConceptFunctionsImpl INSTANCE = new NetworkConceptFunctionsImpl();

    private NetworkConceptFunctionsImpl() {}

    @Override
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept networkConcept) {
      return null;
    }

  }
  
  public static class NetworkConceptFunctions {

    private NetworkConceptFunctions() {}

    public static java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept networkConcept) {
      return DynamicResourceUtil.invoke(INetworkConceptFunctionsImpl.class, NetworkConceptFunctionsImpl.INSTANCE, networkConcept).RenderChapters(networkConcept);
    }

  }

  public static interface IAvailabilityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6005307c-1e3a-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAvailabilityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AvailabilityFunctionsImpl implements IAvailabilityFunctionsImpl {

    public static final IAvailabilityFunctionsImpl INSTANCE = new AvailabilityFunctionsImpl();

    private AvailabilityFunctionsImpl() {}

  }
  
  public static class AvailabilityFunctions {

    private AvailabilityFunctions() {}

  }

  public static interface IBackupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("90698ca7-1e3f-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IBackupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BackupFunctionsImpl implements IBackupFunctionsImpl {

    public static final IBackupFunctionsImpl INSTANCE = new BackupFunctionsImpl();

    private BackupFunctionsImpl() {}

  }
  
  public static class BackupFunctions {

    private BackupFunctions() {}

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

  public static interface ISystemEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b4d3279-0e9e-11e9-9f19-6d15636f4ecc")
    public java.lang.String RenderChapters();

  }
  
  public static interface ISystemEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemEnvironmentFunctionsImpl implements ISystemEnvironmentFunctionsImpl {

    public static final ISystemEnvironmentFunctionsImpl INSTANCE = new SystemEnvironmentFunctionsImpl();

    private SystemEnvironmentFunctionsImpl() {}

  }
  
  public static class SystemEnvironmentFunctions {

    private SystemEnvironmentFunctions() {}

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

  public static interface IQoSConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a62fb841-1d8d-11e9-b601-db75aa6f89a4")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("7494a4f9-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS();

    @IDynamicResourceExtension.MethodId("9cb503c2-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS_Mean();

  }
  
  public static interface IQoSConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7494a4f9-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept);

    @IDynamicResourceExtension.MethodId("9cb503c2-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept);

  }
  
  public static class QoSConceptFunctionsImpl implements IQoSConceptFunctionsImpl {

    public static final IQoSConceptFunctionsImpl INSTANCE = new QoSConceptFunctionsImpl();

    private QoSConceptFunctionsImpl() {}

    @Override
    public java.lang.Integer SumQoS(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept) {
      /* Begin Protected Region [[7494a4f9-1d92-11e9-b601-db75aa6f89a4]] */
    	return qoSConcept.selectQosConfigurationConcept().values().stream().mapToInt(x -> x.selectEstimate_KBits()).sum();   
      /* End Protected Region   [[7494a4f9-1d92-11e9-b601-db75aa6f89a4]] */
    }

    @Override
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept) {
      /* Begin Protected Region [[9cb503c2-1d92-11e9-b601-db75aa6f89a4]] */
    	return qoSConcept.selectQosConfigurationConcept().values().stream().mapToInt(x -> x.selectEstimateMean_KBits()).sum();   
      /* End Protected Region   [[9cb503c2-1d92-11e9-b601-db75aa6f89a4]] */
    }

  }
  
  public static class QoSConceptFunctions {

    private QoSConceptFunctions() {}

    public static java.lang.Integer SumQoS(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept) {
      return DynamicResourceUtil.invoke(IQoSConceptFunctionsImpl.class, QoSConceptFunctionsImpl.INSTANCE, qoSConcept).SumQoS(qoSConcept);
    }

    public static java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept) {
      return DynamicResourceUtil.invoke(IQoSConceptFunctionsImpl.class, QoSConceptFunctionsImpl.INSTANCE, qoSConcept).SumQoS_Mean(qoSConcept);
    }

  }

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

  public static interface ISegmentationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4047d49d-0d1e-11e9-be4f-03130cc057ef")
    public java.lang.String Old_RenderContentElement();

  }
  
  public static interface ISegmentationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SegmentationFunctionsImpl implements ISegmentationFunctionsImpl {

    public static final ISegmentationFunctionsImpl INSTANCE = new SegmentationFunctionsImpl();

    private SegmentationFunctionsImpl() {}

  }
  
  public static class SegmentationFunctions {

    private SegmentationFunctions() {}

  }

  public static interface ISegmentationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eb430c4c-0e21-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderChapters();

  }
  
  public static interface ISegmentationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SegmentationConceptFunctionsImpl implements ISegmentationConceptFunctionsImpl {

    public static final ISegmentationConceptFunctionsImpl INSTANCE = new SegmentationConceptFunctionsImpl();

    private SegmentationConceptFunctionsImpl() {}

  }
  
  public static class SegmentationConceptFunctions {

    private SegmentationConceptFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fb58b09d-d181-11e8-b18f-df1540bb7a5c,JuYLXuJBiJixpjrHGvchOUT6qJ4=] */
