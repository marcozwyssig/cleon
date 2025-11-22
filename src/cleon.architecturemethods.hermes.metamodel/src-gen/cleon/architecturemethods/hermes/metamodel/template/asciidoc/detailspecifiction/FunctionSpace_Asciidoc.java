package cleon.architecturemethods.hermes.metamodel.template.asciidoc.detailspecifiction;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6e104406-e64d-11e8-9ed8-5f22de89d1df,imports]] */

/* End Protected Region   [[6e104406-e64d-11e8-9ed8-5f22de89d1df,imports]] */

public class FunctionSpace_Asciidoc {

  /* Begin Protected Region [[6e104406-e64d-11e8-9ed8-5f22de89d1df]] */
  
  /* End Protected Region   [[6e104406-e64d-11e8-9ed8-5f22de89d1df]] */


  public static interface IDetailSpecificationDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e262d479-2813-11ec-988b-e1826086c18c")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

    @IDynamicResourceExtension.MethodId("e33a7145-282d-11ec-a022-ebea6bd1100d")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("e653876c-c9ed-11ee-953e-1bc687172a5b")
    public java.lang.String GetTitleName();

    @IDynamicResourceExtension.MethodId("7a795212-d24d-11ee-b255-49ab47716ebd")
    public java.lang.String RenderEnd(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDetailSpecificationDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DetailSpecificationDocumentFunctionsImpl implements IDetailSpecificationDocumentFunctionsImpl {

    public static final IDetailSpecificationDocumentFunctionsImpl INSTANCE = new DetailSpecificationDocumentFunctionsImpl();

    private DetailSpecificationDocumentFunctionsImpl() {}

  }
  
  public static class DetailSpecificationDocumentFunctions {

    private DetailSpecificationDocumentFunctions() {}

  }

  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7456a29c-4879-11ec-b3cc-9dd8204a254a")
    public java.lang.String convert();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

  }

  public static interface IAboutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("edcd601f-d7a1-11ee-890b-0db639851a38")
    public java.lang.String ChapterName();

  }
  
  public static interface IAboutFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AboutFunctionsImpl implements IAboutFunctionsImpl {

    public static final IAboutFunctionsImpl INSTANCE = new AboutFunctionsImpl();

    private AboutFunctionsImpl() {}

  }
  
  public static class AboutFunctions {

    private AboutFunctions() {}

  }

  public static interface IAbstractListOfSysCmpSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e479db75-d6e5-11ee-8fe2-9fdd0afb9b0b")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("38345efe-b335-11f0-8b15-d12a8adc0014")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IAbstractListOfSysCmpSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractListOfSysCmpSpecificationsFunctionsImpl implements IAbstractListOfSysCmpSpecificationsFunctionsImpl {

    public static final IAbstractListOfSysCmpSpecificationsFunctionsImpl INSTANCE = new AbstractListOfSysCmpSpecificationsFunctionsImpl();

    private AbstractListOfSysCmpSpecificationsFunctionsImpl() {}

  }
  
  public static class AbstractListOfSysCmpSpecificationsFunctions {

    private AbstractListOfSysCmpSpecificationsFunctions() {}

  }

  public static interface ISysCmpSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4f1f91c5-d236-11ee-b255-49ab47716ebd")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("8302547c-0010-11f0-945c-87b19aec41f4")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISysCmpSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCmpSpecificationFunctionsImpl implements ISysCmpSpecificationFunctionsImpl {

    public static final ISysCmpSpecificationFunctionsImpl INSTANCE = new SysCmpSpecificationFunctionsImpl();

    private SysCmpSpecificationFunctionsImpl() {}

  }
  
  public static class SysCmpSpecificationFunctions {

    private SysCmpSpecificationFunctions() {}

  }

  public static interface ISysCfgSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cd594f03-c7b7-11f0-b286-65ef926a257f")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

    @IDynamicResourceExtension.MethodId("963f3b00-b335-11f0-8b15-d12a8adc0014")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("39309176-b338-11f0-8b15-d12a8adc0014")
    public java.lang.String FileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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

  public static interface ISysCfgOsCategorySpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ae882b96-c74e-11ee-8456-2b8c93b367a8")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("b1dd68ae-d18f-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration SysCfg();

  }
  
  public static interface ISysCfgOsCategorySpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgOsCategorySpecificationFunctionsImpl implements ISysCfgOsCategorySpecificationFunctionsImpl {

    public static final ISysCfgOsCategorySpecificationFunctionsImpl INSTANCE = new SysCfgOsCategorySpecificationFunctionsImpl();

    private SysCfgOsCategorySpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgOsCategorySpecificationFunctions {

    private SysCfgOsCategorySpecificationFunctions() {}

  }

  public static interface ISysCfgAppCategorySpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b3bcd3c-c751-11ee-8456-2b8c93b367a8")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISysCfgAppCategorySpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgAppCategorySpecificationFunctionsImpl implements ISysCfgAppCategorySpecificationFunctionsImpl {

    public static final ISysCfgAppCategorySpecificationFunctionsImpl INSTANCE = new SysCfgAppCategorySpecificationFunctionsImpl();

    private SysCfgAppCategorySpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgAppCategorySpecificationFunctions {

    private SysCfgAppCategorySpecificationFunctions() {}

  }

  public static interface ISysCfgHwCategorySpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5f062163-c767-11ee-88de-bb28abfdee0c")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISysCfgHwCategorySpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgHwCategorySpecificationFunctionsImpl implements ISysCfgHwCategorySpecificationFunctionsImpl {

    public static final ISysCfgHwCategorySpecificationFunctionsImpl INSTANCE = new SysCfgHwCategorySpecificationFunctionsImpl();

    private SysCfgHwCategorySpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgHwCategorySpecificationFunctions {

    private SysCfgHwCategorySpecificationFunctions() {}

  }

  public static interface ISystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("041d7879-d190-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.ISysCfgSpecification GetChapterRefForOs(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.os.javamodel.ISysCfgOsCategorySpecification filterSystemConfiguration);

    @IDynamicResourceExtension.MethodId("4c1ca530-d192-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.ISysCfgSpecification GetChapterRefForHW(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.hardware.javamodel.ISysCfgHwCategorySpecification filterSystemConfiguration);

  }
  
  public static interface ISystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationFunctionsImpl implements ISystemConfigurationFunctionsImpl {

    public static final ISystemConfigurationFunctionsImpl INSTANCE = new SystemConfigurationFunctionsImpl();

    private SystemConfigurationFunctionsImpl() {}

  }
  
  public static class SystemConfigurationFunctions {

    private SystemConfigurationFunctions() {}

  }

  public static interface IEnvironmentSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("58e3b87a-b336-11f0-8b15-d12a8adc0014")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IEnvironmentSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnvironmentSpecificationsFunctionsImpl implements IEnvironmentSpecificationsFunctionsImpl {

    public static final IEnvironmentSpecificationsFunctionsImpl INSTANCE = new EnvironmentSpecificationsFunctionsImpl();

    private EnvironmentSpecificationsFunctionsImpl() {}

  }
  
  public static class EnvironmentSpecificationsFunctions {

    private EnvironmentSpecificationsFunctions() {}

  }

  public static interface ISiteSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f11439a-b336-11f0-8b15-d12a8adc0014")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISiteSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SiteSpecificationsFunctionsImpl implements ISiteSpecificationsFunctionsImpl {

    public static final ISiteSpecificationsFunctionsImpl INSTANCE = new SiteSpecificationsFunctionsImpl();

    private SiteSpecificationsFunctionsImpl() {}

  }
  
  public static class SiteSpecificationsFunctions {

    private SiteSpecificationsFunctions() {}

  }

  public static interface IDataCenterSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5956569-b336-11f0-8b15-d12a8adc0014")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDataCenterSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DataCenterSpecificationsFunctionsImpl implements IDataCenterSpecificationsFunctionsImpl {

    public static final IDataCenterSpecificationsFunctionsImpl INSTANCE = new DataCenterSpecificationsFunctionsImpl();

    private DataCenterSpecificationsFunctionsImpl() {}

  }
  
  public static class DataCenterSpecificationsFunctions {

    private DataCenterSpecificationsFunctions() {}

  }

  public static interface IHostSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1b43da63-b337-11f0-8b15-d12a8adc0014")
    public java.lang.String FileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("675f7dc8-b342-11f0-8727-8d2c2658a4f8")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IHostSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HostSpecificationFunctionsImpl implements IHostSpecificationFunctionsImpl {

    public static final IHostSpecificationFunctionsImpl INSTANCE = new HostSpecificationFunctionsImpl();

    private HostSpecificationFunctionsImpl() {}

  }
  
  public static class HostSpecificationFunctions {

    private HostSpecificationFunctions() {}

  }

  public static interface IAbstractConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("25696335-ba57-11f0-9349-73cfbb54b949")
    public java.lang.String RenderFullChapterName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IAbstractConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractConfigurationFunctionsImpl implements IAbstractConfigurationFunctionsImpl {

    public static final IAbstractConfigurationFunctionsImpl INSTANCE = new AbstractConfigurationFunctionsImpl();

    private AbstractConfigurationFunctionsImpl() {}

  }
  
  public static class AbstractConfigurationFunctions {

    private AbstractConfigurationFunctions() {}

  }

  public static interface IPuppetConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("554f346c-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

    @IDynamicResourceExtension.MethodId("65616f6d-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IPuppetConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PuppetConfigurationFunctionsImpl implements IPuppetConfigurationFunctionsImpl {

    public static final IPuppetConfigurationFunctionsImpl INSTANCE = new PuppetConfigurationFunctionsImpl();

    private PuppetConfigurationFunctionsImpl() {}

  }
  
  public static class PuppetConfigurationFunctions {

    private PuppetConfigurationFunctions() {}

  }

  public static interface IAdDialinFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("992403d3-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IAdDialinFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AdDialinFunctionsImpl implements IAdDialinFunctionsImpl {

    public static final IAdDialinFunctionsImpl INSTANCE = new AdDialinFunctionsImpl();

    private AdDialinFunctionsImpl() {}

  }
  
  public static class AdDialinFunctions {

    private AdDialinFunctions() {}

  }

  public static interface IEthernet_8021xFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("992403dc-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IEthernet_8021xFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Ethernet_8021xFunctionsImpl implements IEthernet_8021xFunctionsImpl {

    public static final IEthernet_8021xFunctionsImpl INSTANCE = new Ethernet_8021xFunctionsImpl();

    private Ethernet_8021xFunctionsImpl() {}

  }
  
  public static class Ethernet_8021xFunctions {

    private Ethernet_8021xFunctions() {}

  }

  public static interface INetworkProfileFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0dfd964d-c7bb-11f0-b286-65ef926a257f")
    public java.lang.String RenderSpecification();

  }
  
  public static interface INetworkProfileFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NetworkProfileFunctionsImpl implements INetworkProfileFunctionsImpl {

    public static final INetworkProfileFunctionsImpl INSTANCE = new NetworkProfileFunctionsImpl();

    private NetworkProfileFunctionsImpl() {}

  }
  
  public static class NetworkProfileFunctions {

    private NetworkProfileFunctions() {}

  }

  public static interface IGitLabFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99240439-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IGitLabFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GitLabFunctionsImpl implements IGitLabFunctionsImpl {

    public static final IGitLabFunctionsImpl INSTANCE = new GitLabFunctionsImpl();

    private GitLabFunctionsImpl() {}

  }
  
  public static class GitLabFunctions {

    private GitLabFunctions() {}

  }

  public static interface IInstallRootCAFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924048d-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IInstallRootCAFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallRootCAFunctionsImpl implements IInstallRootCAFunctionsImpl {

    public static final IInstallRootCAFunctionsImpl INSTANCE = new InstallRootCAFunctionsImpl();

    private InstallRootCAFunctionsImpl() {}

  }
  
  public static class InstallRootCAFunctions {

    private InstallRootCAFunctions() {}

  }

  public static interface ISatelliteRegistrationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("992404c1-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ISatelliteRegistrationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SatelliteRegistrationFunctionsImpl implements ISatelliteRegistrationFunctionsImpl {

    public static final ISatelliteRegistrationFunctionsImpl INSTANCE = new SatelliteRegistrationFunctionsImpl();

    private SatelliteRegistrationFunctionsImpl() {}

  }
  
  public static class SatelliteRegistrationFunctions {

    private SatelliteRegistrationFunctions() {}

  }

  public static interface ILocalLinFwFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("992404ff-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ILocalLinFwFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalLinFwFunctionsImpl implements ILocalLinFwFunctionsImpl {

    public static final ILocalLinFwFunctionsImpl INSTANCE = new LocalLinFwFunctionsImpl();

    private LocalLinFwFunctionsImpl() {}

  }
  
  public static class LocalLinFwFunctions {

    private LocalLinFwFunctions() {}

  }

  public static interface ICreateShortcutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99240535-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ICreateShortcutFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CreateShortcutFunctionsImpl implements ICreateShortcutFunctionsImpl {

    public static final ICreateShortcutFunctionsImpl INSTANCE = new CreateShortcutFunctionsImpl();

    private CreateShortcutFunctionsImpl() {}

  }
  
  public static class CreateShortcutFunctions {

    private CreateShortcutFunctions() {}

  }

  public static interface IWsusApprovalUpdatesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("992405db-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IWsusApprovalUpdatesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WsusApprovalUpdatesFunctionsImpl implements IWsusApprovalUpdatesFunctionsImpl {

    public static final IWsusApprovalUpdatesFunctionsImpl INSTANCE = new WsusApprovalUpdatesFunctionsImpl();

    private WsusApprovalUpdatesFunctionsImpl() {}

  }
  
  public static class WsusApprovalUpdatesFunctions {

    private WsusApprovalUpdatesFunctions() {}

  }

  public static interface INpsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924060d-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface INpsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NpsFunctionsImpl implements INpsFunctionsImpl {

    public static final INpsFunctionsImpl INSTANCE = new NpsFunctionsImpl();

    private NpsFunctionsImpl() {}

  }
  
  public static class NpsFunctions {

    private NpsFunctions() {}

  }

  public static interface IGposFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99240651-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IGposFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GposFunctionsImpl implements IGposFunctionsImpl {

    public static final IGposFunctionsImpl INSTANCE = new GposFunctionsImpl();

    private GposFunctionsImpl() {}

  }
  
  public static class GposFunctions {

    private GposFunctions() {}

  }

  public static interface IScheduledBackupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99242af0-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IScheduledBackupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ScheduledBackupFunctionsImpl implements IScheduledBackupFunctionsImpl {

    public static final IScheduledBackupFunctionsImpl INSTANCE = new ScheduledBackupFunctionsImpl();

    private ScheduledBackupFunctionsImpl() {}

  }
  
  public static class ScheduledBackupFunctions {

    private ScheduledBackupFunctions() {}

  }

  public static interface IWindowsClientHardeningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99242bf6-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IWindowsClientHardeningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WindowsClientHardeningFunctionsImpl implements IWindowsClientHardeningFunctionsImpl {

    public static final IWindowsClientHardeningFunctionsImpl INSTANCE = new WindowsClientHardeningFunctionsImpl();

    private WindowsClientHardeningFunctionsImpl() {}

  }
  
  public static class WindowsClientHardeningFunctions {

    private WindowsClientHardeningFunctions() {}

  }

  public static interface ICertificateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99242c01-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String CommonName();

    @IDynamicResourceExtension.MethodId("99242c0f-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String SubjectAltNames();

    @IDynamicResourceExtension.MethodId("99242c35-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String SubjectAltNamesFromHost();

  }
  
  public static interface ICertificateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CertificateFunctionsImpl implements ICertificateFunctionsImpl {

    public static final ICertificateFunctionsImpl INSTANCE = new CertificateFunctionsImpl();

    private CertificateFunctionsImpl() {}

  }
  
  public static class CertificateFunctions {

    private CertificateFunctions() {}

  }

  public static interface ICertificatesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99242d4f-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ICertificatesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CertificatesFunctionsImpl implements ICertificatesFunctionsImpl {

    public static final ICertificatesFunctionsImpl INSTANCE = new CertificatesFunctionsImpl();

    private CertificatesFunctionsImpl() {}

  }
  
  public static class CertificatesFunctions {

    private CertificatesFunctions() {}

  }

  public static interface IMailRelayFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99245237-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IMailRelayFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MailRelayFunctionsImpl implements IMailRelayFunctionsImpl {

    public static final IMailRelayFunctionsImpl INSTANCE = new MailRelayFunctionsImpl();

    private MailRelayFunctionsImpl() {}

  }
  
  public static class MailRelayFunctions {

    private MailRelayFunctions() {}

  }

  public static interface ISudoFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99245258-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ISudoFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SudoFunctionsImpl implements ISudoFunctionsImpl {

    public static final ISudoFunctionsImpl INSTANCE = new SudoFunctionsImpl();

    private SudoFunctionsImpl() {}

  }
  
  public static class SudoFunctions {

    private SudoFunctions() {}

  }

  public static interface IWinRMFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99245261-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IWinRMFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WinRMFunctionsImpl implements IWinRMFunctionsImpl {

    public static final IWinRMFunctionsImpl INSTANCE = new WinRMFunctionsImpl();

    private WinRMFunctionsImpl() {}

  }
  
  public static class WinRMFunctions {

    private WinRMFunctions() {}

  }

  public static interface IWsusJoinFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("992452a0-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IWsusJoinFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WsusJoinFunctionsImpl implements IWsusJoinFunctionsImpl {

    public static final IWsusJoinFunctionsImpl INSTANCE = new WsusJoinFunctionsImpl();

    private WsusJoinFunctionsImpl() {}

  }
  
  public static class WsusJoinFunctions {

    private WsusJoinFunctions() {}

  }

  public static interface IInstallWSUSFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99245353-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IInstallWSUSFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallWSUSFunctionsImpl implements IInstallWSUSFunctionsImpl {

    public static final IInstallWSUSFunctionsImpl INSTANCE = new InstallWSUSFunctionsImpl();

    private InstallWSUSFunctionsImpl() {}

  }
  
  public static class InstallWSUSFunctions {

    private InstallWSUSFunctions() {}

  }

  public static interface IVeeamProxyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99245387-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IVeeamProxyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VeeamProxyFunctionsImpl implements IVeeamProxyFunctionsImpl {

    public static final IVeeamProxyFunctionsImpl INSTANCE = new VeeamProxyFunctionsImpl();

    private VeeamProxyFunctionsImpl() {}

  }
  
  public static class VeeamProxyFunctions {

    private VeeamProxyFunctions() {}

  }

  public static interface IVeeamMasterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99247939-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IVeeamMasterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VeeamMasterFunctionsImpl implements IVeeamMasterFunctionsImpl {

    public static final IVeeamMasterFunctionsImpl INSTANCE = new VeeamMasterFunctionsImpl();

    private VeeamMasterFunctionsImpl() {}

  }
  
  public static class VeeamMasterFunctions {

    private VeeamMasterFunctions() {}

  }

  public static interface ICopyCertFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99247986-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ICopyCertFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CopyCertFunctionsImpl implements ICopyCertFunctionsImpl {

    public static final ICopyCertFunctionsImpl INSTANCE = new CopyCertFunctionsImpl();

    private CopyCertFunctionsImpl() {}

  }
  
  public static class CopyCertFunctions {

    private CopyCertFunctions() {}

  }

  public static interface IKrbtgtrenewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924798f-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IKrbtgtrenewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class KrbtgtrenewFunctionsImpl implements IKrbtgtrenewFunctionsImpl {

    public static final IKrbtgtrenewFunctionsImpl INSTANCE = new KrbtgtrenewFunctionsImpl();

    private KrbtgtrenewFunctionsImpl() {}

  }
  
  public static class KrbtgtrenewFunctions {

    private KrbtgtrenewFunctions() {}

  }

  public static interface IDotNetFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("992479ae-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IDotNetFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DotNetFunctionsImpl implements IDotNetFunctionsImpl {

    public static final IDotNetFunctionsImpl INSTANCE = new DotNetFunctionsImpl();

    private DotNetFunctionsImpl() {}

  }
  
  public static class DotNetFunctions {

    private DotNetFunctions() {}

  }

  public static interface ILocalUsersFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("992479df-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ILocalUsersFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalUsersFunctionsImpl implements ILocalUsersFunctionsImpl {

    public static final ILocalUsersFunctionsImpl INSTANCE = new LocalUsersFunctionsImpl();

    private LocalUsersFunctionsImpl() {}

  }
  
  public static class LocalUsersFunctions {

    private LocalUsersFunctions() {}

  }

  public static interface IDNSResolverFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99247a57-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IDNSResolverFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DNSResolverFunctionsImpl implements IDNSResolverFunctionsImpl {

    public static final IDNSResolverFunctionsImpl INSTANCE = new DNSResolverFunctionsImpl();

    private DNSResolverFunctionsImpl() {}

  }
  
  public static class DNSResolverFunctions {

    private DNSResolverFunctions() {}

  }

  public static interface ISSHFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99247a76-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ISSHFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SSHFunctionsImpl implements ISSHFunctionsImpl {

    public static final ISSHFunctionsImpl INSTANCE = new SSHFunctionsImpl();

    private SSHFunctionsImpl() {}

  }
  
  public static class SSHFunctions {

    private SSHFunctions() {}

  }

  public static interface IRepoFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99247aa5-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IRepoFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RepoFunctionsImpl implements IRepoFunctionsImpl {

    public static final IRepoFunctionsImpl INSTANCE = new RepoFunctionsImpl();

    private RepoFunctionsImpl() {}

  }
  
  public static class RepoFunctions {

    private RepoFunctions() {}

  }

  public static interface IExtendRootFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99247aae-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IExtendRootFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ExtendRootFunctionsImpl implements IExtendRootFunctionsImpl {

    public static final IExtendRootFunctionsImpl INSTANCE = new ExtendRootFunctionsImpl();

    private ExtendRootFunctionsImpl() {}

  }
  
  public static class ExtendRootFunctions {

    private ExtendRootFunctions() {}

  }

  public static interface IAdJoinFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99247b04-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IAdJoinFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AdJoinFunctionsImpl implements IAdJoinFunctionsImpl {

    public static final IAdJoinFunctionsImpl INSTANCE = new AdJoinFunctionsImpl();

    private AdJoinFunctionsImpl() {}

  }
  
  public static class AdJoinFunctions {

    private AdJoinFunctions() {}

  }

  public static interface IRegistryKeysFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99247b63-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IRegistryKeysFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RegistryKeysFunctionsImpl implements IRegistryKeysFunctionsImpl {

    public static final IRegistryKeysFunctionsImpl INSTANCE = new RegistryKeysFunctionsImpl();

    private RegistryKeysFunctionsImpl() {}

  }
  
  public static class RegistryKeysFunctions {

    private RegistryKeysFunctions() {}

  }

  public static interface IRemoveUserCertsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99247b7c-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IRemoveUserCertsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RemoveUserCertsFunctionsImpl implements IRemoveUserCertsFunctionsImpl {

    public static final IRemoveUserCertsFunctionsImpl INSTANCE = new RemoveUserCertsFunctionsImpl();

    private RemoveUserCertsFunctionsImpl() {}

  }
  
  public static class RemoveUserCertsFunctions {

    private RemoveUserCertsFunctions() {}

  }

  public static interface IFoldersCleanupTaskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99247c02-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IFoldersCleanupTaskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FoldersCleanupTaskFunctionsImpl implements IFoldersCleanupTaskFunctionsImpl {

    public static final IFoldersCleanupTaskFunctionsImpl INSTANCE = new FoldersCleanupTaskFunctionsImpl();

    private FoldersCleanupTaskFunctionsImpl() {}

  }
  
  public static class FoldersCleanupTaskFunctions {

    private FoldersCleanupTaskFunctions() {}

  }

  public static interface IFoldersAndPuppetCleanupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99249f61-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IFoldersAndPuppetCleanupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FoldersAndPuppetCleanupFunctionsImpl implements IFoldersAndPuppetCleanupFunctionsImpl {

    public static final IFoldersAndPuppetCleanupFunctionsImpl INSTANCE = new FoldersAndPuppetCleanupFunctionsImpl();

    private FoldersAndPuppetCleanupFunctionsImpl() {}

  }
  
  public static class FoldersAndPuppetCleanupFunctions {

    private FoldersAndPuppetCleanupFunctions() {}

  }

  public static interface ILocalRepoFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99249f91-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ILocalRepoFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalRepoFunctionsImpl implements ILocalRepoFunctionsImpl {

    public static final ILocalRepoFunctionsImpl INSTANCE = new LocalRepoFunctionsImpl();

    private LocalRepoFunctionsImpl() {}

  }
  
  public static class LocalRepoFunctions {

    private LocalRepoFunctions() {}

  }

  public static interface ILocalFileFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99249fd8-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ILocalFileFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalFileFunctionsImpl implements ILocalFileFunctionsImpl {

    public static final ILocalFileFunctionsImpl INSTANCE = new LocalFileFunctionsImpl();

    private LocalFileFunctionsImpl() {}

  }
  
  public static class LocalFileFunctions {

    private LocalFileFunctions() {}

  }

  public static interface IAbstractComputerGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924a037-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IAbstractComputerGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractComputerGroupsFunctionsImpl implements IAbstractComputerGroupsFunctionsImpl {

    public static final IAbstractComputerGroupsFunctionsImpl INSTANCE = new AbstractComputerGroupsFunctionsImpl();

    private AbstractComputerGroupsFunctionsImpl() {}

  }
  
  public static class AbstractComputerGroupsFunctions {

    private AbstractComputerGroupsFunctions() {}

  }

  public static interface IWorkplaceLinksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924a0e7-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IWorkplaceLinksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WorkplaceLinksFunctionsImpl implements IWorkplaceLinksFunctionsImpl {

    public static final IWorkplaceLinksFunctionsImpl INSTANCE = new WorkplaceLinksFunctionsImpl();

    private WorkplaceLinksFunctionsImpl() {}

  }
  
  public static class WorkplaceLinksFunctions {

    private WorkplaceLinksFunctions() {}

  }

  public static interface IChocoSoftwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924a128-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IChocoSoftwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ChocoSoftwareFunctionsImpl implements IChocoSoftwareFunctionsImpl {

    public static final IChocoSoftwareFunctionsImpl INSTANCE = new ChocoSoftwareFunctionsImpl();

    private ChocoSoftwareFunctionsImpl() {}

  }
  
  public static class ChocoSoftwareFunctions {

    private ChocoSoftwareFunctions() {}

  }

  public static interface IDnsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924a1e5-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IDnsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DnsFunctionsImpl implements IDnsFunctionsImpl {

    public static final IDnsFunctionsImpl INSTANCE = new DnsFunctionsImpl();

    private DnsFunctionsImpl() {}

  }
  
  public static class DnsFunctions {

    private DnsFunctions() {}

  }

  public static interface IIISMimelistFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924a20c-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IIISMimelistFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IISMimelistFunctionsImpl implements IIISMimelistFunctionsImpl {

    public static final IIISMimelistFunctionsImpl INSTANCE = new IISMimelistFunctionsImpl();

    private IISMimelistFunctionsImpl() {}

  }
  
  public static class IISMimelistFunctions {

    private IISMimelistFunctions() {}

  }

  public static interface IInstallIISFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924a28b-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IInstallIISFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallIISFunctionsImpl implements IInstallIISFunctionsImpl {

    public static final IInstallIISFunctionsImpl INSTANCE = new InstallIISFunctionsImpl();

    private InstallIISFunctionsImpl() {}

  }
  
  public static class InstallIISFunctions {

    private InstallIISFunctions() {}

  }

  public static interface ISQLServerFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924a2cb-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ISQLServerFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SQLServerFunctionsImpl implements ISQLServerFunctionsImpl {

    public static final ISQLServerFunctionsImpl INSTANCE = new SQLServerFunctionsImpl();

    private SQLServerFunctionsImpl() {}

  }
  
  public static class SQLServerFunctions {

    private SQLServerFunctions() {}

  }

  public static interface ISoftwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924a326-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ISoftwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SoftwareFunctionsImpl implements ISoftwareFunctionsImpl {

    public static final ISoftwareFunctionsImpl INSTANCE = new SoftwareFunctionsImpl();

    private SoftwareFunctionsImpl() {}

  }
  
  public static class SoftwareFunctions {

    private SoftwareFunctions() {}

  }

  public static interface IServicesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924a344-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IServicesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServicesFunctionsImpl implements IServicesFunctionsImpl {

    public static final IServicesFunctionsImpl INSTANCE = new ServicesFunctionsImpl();

    private ServicesFunctionsImpl() {}

  }
  
  public static class ServicesFunctions {

    private ServicesFunctions() {}

  }

  public static interface IWineventlogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924a35c-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IWineventlogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WineventlogFunctionsImpl implements IWineventlogFunctionsImpl {

    public static final IWineventlogFunctionsImpl INSTANCE = new WineventlogFunctionsImpl();

    private WineventlogFunctionsImpl() {}

  }
  
  public static class WineventlogFunctions {

    private WineventlogFunctions() {}

  }

  public static interface IRegistryFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c6b2-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IRegistryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RegistryFunctionsImpl implements IRegistryFunctionsImpl {

    public static final IRegistryFunctionsImpl INSTANCE = new RegistryFunctionsImpl();

    private RegistryFunctionsImpl() {}

  }
  
  public static class RegistryFunctions {

    private RegistryFunctions() {}

  }

  public static interface IRemoteDesktopLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c6c5-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IRemoteDesktopLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RemoteDesktopLicenseFunctionsImpl implements IRemoteDesktopLicenseFunctionsImpl {

    public static final IRemoteDesktopLicenseFunctionsImpl INSTANCE = new RemoteDesktopLicenseFunctionsImpl();

    private RemoteDesktopLicenseFunctionsImpl() {}

  }
  
  public static class RemoteDesktopLicenseFunctions {

    private RemoteDesktopLicenseFunctions() {}

  }

  public static interface IRemoteDesktopHardeningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c758-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IRemoteDesktopHardeningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RemoteDesktopHardeningFunctionsImpl implements IRemoteDesktopHardeningFunctionsImpl {

    public static final IRemoteDesktopHardeningFunctionsImpl INSTANCE = new RemoteDesktopHardeningFunctionsImpl();

    private RemoteDesktopHardeningFunctionsImpl() {}

  }
  
  public static class RemoteDesktopHardeningFunctions {

    private RemoteDesktopHardeningFunctions() {}

  }

  public static interface INetbiosFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c766-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface INetbiosFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NetbiosFunctionsImpl implements INetbiosFunctionsImpl {

    public static final INetbiosFunctionsImpl INSTANCE = new NetbiosFunctionsImpl();

    private NetbiosFunctionsImpl() {}

  }
  
  public static class NetbiosFunctions {

    private NetbiosFunctions() {}

  }

  public static interface IServiceConfigFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c77d-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IServiceConfigFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceConfigFunctionsImpl implements IServiceConfigFunctionsImpl {

    public static final IServiceConfigFunctionsImpl INSTANCE = new ServiceConfigFunctionsImpl();

    private ServiceConfigFunctionsImpl() {}

  }
  
  public static class ServiceConfigFunctions {

    private ServiceConfigFunctions() {}

  }

  public static interface ILocalGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c7b1-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

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

  public static interface IUserrightsassignmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c7eb-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

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

  public static interface ISetWindowsEditionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c7fd-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ISetWindowsEditionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SetWindowsEditionFunctionsImpl implements ISetWindowsEditionFunctionsImpl {

    public static final ISetWindowsEditionFunctionsImpl INSTANCE = new SetWindowsEditionFunctionsImpl();

    private SetWindowsEditionFunctionsImpl() {}

  }
  
  public static class SetWindowsEditionFunctions {

    private SetWindowsEditionFunctions() {}

  }

  public static interface IRouteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c826-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IRouteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RouteFunctionsImpl implements IRouteFunctionsImpl {

    public static final IRouteFunctionsImpl INSTANCE = new RouteFunctionsImpl();

    private RouteFunctionsImpl() {}

  }
  
  public static class RouteFunctions {

    private RouteFunctions() {}

  }

  public static interface ILocalWinFwFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c8f6-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ILocalWinFwFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalWinFwFunctionsImpl implements ILocalWinFwFunctionsImpl {

    public static final ILocalWinFwFunctionsImpl INSTANCE = new LocalWinFwFunctionsImpl();

    private LocalWinFwFunctionsImpl() {}

  }
  
  public static class LocalWinFwFunctions {

    private LocalWinFwFunctions() {}

  }

  public static interface IResizeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c8fb-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IResizeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ResizeFunctionsImpl implements IResizeFunctionsImpl {

    public static final IResizeFunctionsImpl INSTANCE = new ResizeFunctionsImpl();

    private ResizeFunctionsImpl() {}

  }
  
  public static class ResizeFunctions {

    private ResizeFunctions() {}

  }

  public static interface IDiskPartFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c928-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IDiskPartFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DiskPartFunctionsImpl implements IDiskPartFunctionsImpl {

    public static final IDiskPartFunctionsImpl INSTANCE = new DiskPartFunctionsImpl();

    private DiskPartFunctionsImpl() {}

  }
  
  public static class DiskPartFunctions {

    private DiskPartFunctions() {}

  }

  public static interface IServiceAccountsAndTestUserFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c963-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IServiceAccountsAndTestUserFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountsAndTestUserFunctionsImpl implements IServiceAccountsAndTestUserFunctionsImpl {

    public static final IServiceAccountsAndTestUserFunctionsImpl INSTANCE = new ServiceAccountsAndTestUserFunctionsImpl();

    private ServiceAccountsAndTestUserFunctionsImpl() {}

  }
  
  public static class ServiceAccountsAndTestUserFunctions {

    private ServiceAccountsAndTestUserFunctions() {}

  }

  public static interface IGMSAServiceAccountsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924c9d1-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IGMSAServiceAccountsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GMSAServiceAccountsFunctionsImpl implements IGMSAServiceAccountsFunctionsImpl {

    public static final IGMSAServiceAccountsFunctionsImpl INSTANCE = new GMSAServiceAccountsFunctionsImpl();

    private GMSAServiceAccountsFunctionsImpl() {}

  }
  
  public static class GMSAServiceAccountsFunctions {

    private GMSAServiceAccountsFunctions() {}

  }

  public static interface IActivitiesAndRolesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924ee63-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IActivitiesAndRolesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivitiesAndRolesFunctionsImpl implements IActivitiesAndRolesFunctionsImpl {

    public static final IActivitiesAndRolesFunctionsImpl INSTANCE = new ActivitiesAndRolesFunctionsImpl();

    private ActivitiesAndRolesFunctionsImpl() {}

  }
  
  public static class ActivitiesAndRolesFunctions {

    private ActivitiesAndRolesFunctions() {}

  }

  public static interface IOUFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924eece-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IOUFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OUFunctionsImpl implements IOUFunctionsImpl {

    public static final IOUFunctionsImpl INSTANCE = new OUFunctionsImpl();

    private OUFunctionsImpl() {}

  }
  
  public static class OUFunctions {

    private OUFunctions() {}

  }

  public static interface ISharesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924efce-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface ISharesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SharesFunctionsImpl implements ISharesFunctionsImpl {

    public static final ISharesFunctionsImpl INSTANCE = new SharesFunctionsImpl();

    private SharesFunctionsImpl() {}

  }
  
  public static class SharesFunctions {

    private SharesFunctions() {}

  }

  public static interface IDfsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924f023-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IDfsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DfsFunctionsImpl implements IDfsFunctionsImpl {

    public static final IDfsFunctionsImpl INSTANCE = new DfsFunctionsImpl();

    private DfsFunctionsImpl() {}

  }
  
  public static class DfsFunctions {

    private DfsFunctions() {}

  }

  public static interface IIssuingCAFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924f1e9-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IIssuingCAFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IssuingCAFunctionsImpl implements IIssuingCAFunctionsImpl {

    public static final IIssuingCAFunctionsImpl INSTANCE = new IssuingCAFunctionsImpl();

    private IssuingCAFunctionsImpl() {}

  }
  
  public static class IssuingCAFunctions {

    private IssuingCAFunctions() {}

  }

  public static interface IFeaturesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924f209-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IFeaturesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FeaturesFunctionsImpl implements IFeaturesFunctionsImpl {

    public static final IFeaturesFunctionsImpl INSTANCE = new FeaturesFunctionsImpl();

    private FeaturesFunctionsImpl() {}

  }
  
  public static class FeaturesFunctions {

    private FeaturesFunctions() {}

  }

  public static interface IUninstallFeaturesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9924f220-bb2a-11f0-b276-534b2ac4ca1d")
    public java.lang.String RenderSpecification();

  }
  
  public static interface IUninstallFeaturesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UninstallFeaturesFunctionsImpl implements IUninstallFeaturesFunctionsImpl {

    public static final IUninstallFeaturesFunctionsImpl INSTANCE = new UninstallFeaturesFunctionsImpl();

    private UninstallFeaturesFunctionsImpl() {}

  }
  
  public static class UninstallFeaturesFunctions {

    private UninstallFeaturesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6e104406-e64d-11e8-9ed8-5f22de89d1df,Sl7X0/aQMWbbq16KHkz8Te36wTE=] */
