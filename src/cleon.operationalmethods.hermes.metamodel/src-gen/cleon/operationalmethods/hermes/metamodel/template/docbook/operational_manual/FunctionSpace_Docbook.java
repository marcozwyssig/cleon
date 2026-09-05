package cleon.operationalmethods.hermes.metamodel.template.docbook.operational_manual;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[a00a452b-1a64-11e9-b1cd-355f2e2f05a9,imports]] */

/* End Protected Region   [[a00a452b-1a64-11e9-b1cd-355f2e2f05a9,imports]] */

public class FunctionSpace_Docbook {

  /* Begin Protected Region [[a00a452b-1a64-11e9-b1cd-355f2e2f05a9]] */
  
  /* End Protected Region   [[a00a452b-1a64-11e9-b1cd-355f2e2f05a9]] */


  public static interface ISystemOperatingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b4a38e2e-1a64-11e9-b1cd-355f2e2f05a9")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISystemOperatingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemOperatingFunctionsImpl implements ISystemOperatingFunctionsImpl {

    public static final ISystemOperatingFunctionsImpl INSTANCE = new SystemOperatingFunctionsImpl();

    private SystemOperatingFunctionsImpl() {}

  }
  
  public static class SystemOperatingFunctions {

    private SystemOperatingFunctions() {}

  }

  public static interface IPreqrequisitesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("faec8373-1a84-11e9-ad9a-a143a9cb74e7")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IPreqrequisitesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PreqrequisitesFunctionsImpl implements IPreqrequisitesFunctionsImpl {

    public static final IPreqrequisitesFunctionsImpl INSTANCE = new PreqrequisitesFunctionsImpl();

    private PreqrequisitesFunctionsImpl() {}

  }
  
  public static class PreqrequisitesFunctions {

    private PreqrequisitesFunctions() {}

  }

  public static interface IStatisticsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("73b0f2b1-1b3a-11e9-ad9a-a143a9cb74e7")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IStatisticsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StatisticsFunctionsImpl implements IStatisticsFunctionsImpl {

    public static final IStatisticsFunctionsImpl INSTANCE = new StatisticsFunctionsImpl();

    private StatisticsFunctionsImpl() {}

  }
  
  public static class StatisticsFunctions {

    private StatisticsFunctions() {}

  }

  public static interface ILaunchingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ffd1b9dd-1b32-11e9-ad9a-a143a9cb74e7")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ILaunchingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LaunchingFunctionsImpl implements ILaunchingFunctionsImpl {

    public static final ILaunchingFunctionsImpl INSTANCE = new LaunchingFunctionsImpl();

    private LaunchingFunctionsImpl() {}

  }
  
  public static class LaunchingFunctions {

    private LaunchingFunctions() {}

  }

  public static interface IDocumentElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a3a82973-1a85-11e9-ad9a-a143a9cb74e7")
    public List<cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> GetSelfAndParents();

  }
  
  public static interface IDocumentElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DocumentElementFunctionsImpl implements IDocumentElementFunctionsImpl {

    public static final IDocumentElementFunctionsImpl INSTANCE = new DocumentElementFunctionsImpl();

    private DocumentElementFunctionsImpl() {}

  }
  
  public static class DocumentElementFunctions {

    private DocumentElementFunctions() {}

  }

  public static interface IActivitySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("08b2dc91-1a86-11e9-ad9a-a143a9cb74e7")
    public java.lang.String RenderSystemConfigurationName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("f8b23885-1a86-11e9-ad9a-a143a9cb74e7")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration GetSystemConfiguration(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("d36be71e-1b48-11e9-8bf4-8d8e8ba8db8b")
    public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel.IInstallationmanualReference GetReference(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IActivitySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivitySystemConfigurationFunctionsImpl implements IActivitySystemConfigurationFunctionsImpl {

    public static final IActivitySystemConfigurationFunctionsImpl INSTANCE = new ActivitySystemConfigurationFunctionsImpl();

    private ActivitySystemConfigurationFunctionsImpl() {}

  }
  
  public static class ActivitySystemConfigurationFunctions {

    private ActivitySystemConfigurationFunctions() {}

  }

  public static interface ILaunchingQualityAssuranceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("80f52df2-1b3c-11e9-ad9a-a143a9cb74e7")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ILaunchingQualityAssuranceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LaunchingQualityAssuranceFunctionsImpl implements ILaunchingQualityAssuranceFunctionsImpl {

    public static final ILaunchingQualityAssuranceFunctionsImpl INSTANCE = new LaunchingQualityAssuranceFunctionsImpl();

    private LaunchingQualityAssuranceFunctionsImpl() {}

  }
  
  public static class LaunchingQualityAssuranceFunctions {

    private LaunchingQualityAssuranceFunctions() {}

  }

  public static interface IRequirementsSystemAcceptanceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("578116f7-1b42-11e9-8bf4-8d8e8ba8db8b")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IRequirementsSystemAcceptanceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsSystemAcceptanceFunctionsImpl implements IRequirementsSystemAcceptanceFunctionsImpl {

    public static final IRequirementsSystemAcceptanceFunctionsImpl INSTANCE = new RequirementsSystemAcceptanceFunctionsImpl();

    private RequirementsSystemAcceptanceFunctionsImpl() {}

  }
  
  public static class RequirementsSystemAcceptanceFunctions {

    private RequirementsSystemAcceptanceFunctions() {}

  }

  public static interface ISystemStopFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e01b082d-1b42-11e9-8bf4-8d8e8ba8db8b")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISystemStopFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemStopFunctionsImpl implements ISystemStopFunctionsImpl {

    public static final ISystemStopFunctionsImpl INSTANCE = new SystemStopFunctionsImpl();

    private SystemStopFunctionsImpl() {}

  }
  
  public static class SystemStopFunctions {

    private SystemStopFunctions() {}

  }

  public static interface IInterruptQualityAssuranceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3d18d230-1b49-11e9-8bf4-8d8e8ba8db8b")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IInterruptQualityAssuranceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InterruptQualityAssuranceFunctionsImpl implements IInterruptQualityAssuranceFunctionsImpl {

    public static final IInterruptQualityAssuranceFunctionsImpl INSTANCE = new InterruptQualityAssuranceFunctionsImpl();

    private InterruptQualityAssuranceFunctionsImpl() {}

  }
  
  public static class InterruptQualityAssuranceFunctions {

    private InterruptQualityAssuranceFunctions() {}

  }

  public static interface IDecommissioningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("859a3167-1b4c-11e9-8bf4-8d8e8ba8db8b")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDecommissioningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DecommissioningFunctionsImpl implements IDecommissioningFunctionsImpl {

    public static final IDecommissioningFunctionsImpl INSTANCE = new DecommissioningFunctionsImpl();

    private DecommissioningFunctionsImpl() {}

  }
  
  public static class DecommissioningFunctions {

    private DecommissioningFunctions() {}

  }

  public static interface IMonitoringSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5353d7f8-1c91-11e9-9896-651e5faa32a4")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IMonitoringSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MonitoringSystemConfigurationFunctionsImpl implements IMonitoringSystemConfigurationFunctionsImpl {

    public static final IMonitoringSystemConfigurationFunctionsImpl INSTANCE = new MonitoringSystemConfigurationFunctionsImpl();

    private MonitoringSystemConfigurationFunctionsImpl() {}

  }
  
  public static class MonitoringSystemConfigurationFunctions {

    private MonitoringSystemConfigurationFunctions() {}

  }

  public static interface IDataSecurityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8c5c418a-1c92-11e9-9896-651e5faa32a4")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDataSecurityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DataSecurityFunctionsImpl implements IDataSecurityFunctionsImpl {

    public static final IDataSecurityFunctionsImpl INSTANCE = new DataSecurityFunctionsImpl();

    private DataSecurityFunctionsImpl() {}

  }
  
  public static class DataSecurityFunctions {

    private DataSecurityFunctions() {}

  }

  public static interface IChangesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1f9468c7-1c97-11e9-9896-651e5faa32a4")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IChangesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ChangesFunctionsImpl implements IChangesFunctionsImpl {

    public static final IChangesFunctionsImpl INSTANCE = new ChangesFunctionsImpl();

    private ChangesFunctionsImpl() {}

  }
  
  public static class ChangesFunctions {

    private ChangesFunctions() {}

  }

  public static interface IChangesSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("58b050db-1c97-11e9-9896-651e5faa32a4")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IChangesSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ChangesSystemConfigurationFunctionsImpl implements IChangesSystemConfigurationFunctionsImpl {

    public static final IChangesSystemConfigurationFunctionsImpl INSTANCE = new ChangesSystemConfigurationFunctionsImpl();

    private ChangesSystemConfigurationFunctionsImpl() {}

  }
  
  public static class ChangesSystemConfigurationFunctions {

    private ChangesSystemConfigurationFunctions() {}

  }

  public static interface IErrorAnalysisFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9febf45d-1c9b-11e9-9896-651e5faa32a4")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IErrorAnalysisFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ErrorAnalysisFunctionsImpl implements IErrorAnalysisFunctionsImpl {

    public static final IErrorAnalysisFunctionsImpl INSTANCE = new ErrorAnalysisFunctionsImpl();

    private ErrorAnalysisFunctionsImpl() {}

  }
  
  public static class ErrorAnalysisFunctions {

    private ErrorAnalysisFunctions() {}

  }

  public static interface IDataProtectionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c4656adb-1c9b-11e9-9896-651e5faa32a4")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDataProtectionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DataProtectionFunctionsImpl implements IDataProtectionFunctionsImpl {

    public static final IDataProtectionFunctionsImpl INSTANCE = new DataProtectionFunctionsImpl();

    private DataProtectionFunctionsImpl() {}

  }
  
  public static class DataProtectionFunctions {

    private DataProtectionFunctions() {}

  }

  public static interface ISupervisingTaskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("16a85cfb-95d0-11ea-9744-7dd962dc1878")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISupervisingTaskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SupervisingTaskFunctionsImpl implements ISupervisingTaskFunctionsImpl {

    public static final ISupervisingTaskFunctionsImpl INSTANCE = new SupervisingTaskFunctionsImpl();

    private SupervisingTaskFunctionsImpl() {}

  }
  
  public static class SupervisingTaskFunctions {

    private SupervisingTaskFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,a00a452b-1a64-11e9-b1cd-355f2e2f05a9,aOniYNMioqziOzPMI8CrZ8uKvkI=] */
