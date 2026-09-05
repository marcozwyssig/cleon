package cleon.operationalmethods.hermes.metamodel.template.asciidoc.installation_manual;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[60fce88b-94c8-11ec-9b36-7d300415c806,imports]] */
import cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.InstallationManualDocument;
/* End Protected Region   [[60fce88b-94c8-11ec-9b36-7d300415c806,imports]] */

public class FunctionSpace_Asciidoc {

  /* Begin Protected Region [[60fce88b-94c8-11ec-9b36-7d300415c806]] */

  /* End Protected Region   [[60fce88b-94c8-11ec-9b36-7d300415c806]] */


  public static interface IInstallationManualDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("60fce8ff-94c8-11ec-9b36-7d300415c806")
    public java.lang.String GetDocumentPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("bc5aa631-94c8-11ec-9b36-7d300415c806")
    public java.lang.String SystemName();

    @IDynamicResourceExtension.MethodId("007bbff8-94c9-11ec-9b36-7d300415c806")
    public java.lang.String SystemConfigurationName();

    @IDynamicResourceExtension.MethodId("6ebecfef-94db-11ec-9b36-7d300415c806")
    public java.lang.String RenderContent(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("dc125e90-94dc-11ec-9b36-7d300415c806")
    public java.lang.String SystemConfigurationFullName();

    @IDynamicResourceExtension.MethodId("3f8f558c-9546-11ec-9b36-7d300415c806")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("de7ab9d7-f60f-11ec-bdd9-81f6a5b24344")
    public java.lang.String GetDocId();

    @IDynamicResourceExtension.MethodId("05f16bcb-f610-11ec-bdd9-81f6a5b24344")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("20d919f4-1f53-11ef-9692-a96c1fbdfab3")
    public java.lang.String GetAdocFileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("69c26587-1f5a-11ef-9692-a96c1fbdfab3")
    public java.lang.String GetAdocFileNameWithoutAdoc(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IInstallationManualDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallationManualDocumentFunctionsImpl implements IInstallationManualDocumentFunctionsImpl {

    public static final IInstallationManualDocumentFunctionsImpl INSTANCE = new InstallationManualDocumentFunctionsImpl();

    private InstallationManualDocumentFunctionsImpl() {}

  }
  
  public static class InstallationManualDocumentFunctions {

    private InstallationManualDocumentFunctions() {}

  }

  public static interface IPurposeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("63ec76f3-94dc-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IPurposeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PurposeFunctionsImpl implements IPurposeFunctionsImpl {

    public static final IPurposeFunctionsImpl INSTANCE = new PurposeFunctionsImpl();

    private PurposeFunctionsImpl() {}

  }
  
  public static class PurposeFunctions {

    private PurposeFunctions() {}

  }

  public static interface IPrepare_YamlFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("574db3e3-9538-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("e6eea770-9538-11ec-9b36-7d300415c806")
    public java.lang.String SystemConfigurationName();

    @IDynamicResourceExtension.MethodId("78a1c817-9865-11ec-9d28-89a40da1c4b6")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration SystemConfiguration();

  }
  
  public static interface IPrepare_YamlFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Prepare_YamlFunctionsImpl implements IPrepare_YamlFunctionsImpl {

    public static final IPrepare_YamlFunctionsImpl INSTANCE = new Prepare_YamlFunctionsImpl();

    private Prepare_YamlFunctionsImpl() {}

  }
  
  public static class Prepare_YamlFunctions {

    private Prepare_YamlFunctions() {}

  }

  public static interface IYamlTypeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("886a0791-9538-11ec-9b36-7d300415c806")
    public java.lang.Boolean IsNMS();

    @IDynamicResourceExtension.MethodId("d6f34c53-953f-11ec-9b36-7d300415c806")
    public java.lang.Boolean IsTN();

    @IDynamicResourceExtension.MethodId("da2f3d7b-953f-11ec-9b36-7d300415c806")
    public java.lang.Boolean IsNMSandTN();

  }
  
  public static interface IYamlTypeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("886a0791-9538-11ec-9b36-7d300415c806")
    public java.lang.Boolean IsNMS(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IYamlType yamlType);

    @IDynamicResourceExtension.MethodId("d6f34c53-953f-11ec-9b36-7d300415c806")
    public java.lang.Boolean IsTN(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IYamlType yamlType);

    @IDynamicResourceExtension.MethodId("da2f3d7b-953f-11ec-9b36-7d300415c806")
    public java.lang.Boolean IsNMSandTN(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IYamlType yamlType);

  }
  
  public static class YamlTypeFunctionsImpl implements IYamlTypeFunctionsImpl {

    public static final IYamlTypeFunctionsImpl INSTANCE = new YamlTypeFunctionsImpl();

    private YamlTypeFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsNMS(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IYamlType yamlType) {
      /* Begin Protected Region [[886a0791-9538-11ec-9b36-7d300415c806]] */
      return yamlType.isNMS();
      /* End Protected Region   [[886a0791-9538-11ec-9b36-7d300415c806]] */
    }

    @Override
    public java.lang.Boolean IsTN(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IYamlType yamlType) {
      /* Begin Protected Region [[d6f34c53-953f-11ec-9b36-7d300415c806]] */
      return yamlType.isTN();
      /* End Protected Region   [[d6f34c53-953f-11ec-9b36-7d300415c806]] */
    }

    @Override
    public java.lang.Boolean IsNMSandTN(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IYamlType yamlType) {
      /* Begin Protected Region [[da2f3d7b-953f-11ec-9b36-7d300415c806]] */
      return yamlType.isNMSandTN();
      /* End Protected Region   [[da2f3d7b-953f-11ec-9b36-7d300415c806]] */
    }

  }
  
  public static class YamlTypeFunctions {

    private YamlTypeFunctions() {}

    public static java.lang.Boolean IsNMS(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IYamlType yamlType) {
      return DynamicResourceUtil.invoke(IYamlTypeFunctionsImpl.class, YamlTypeFunctionsImpl.INSTANCE, yamlType).IsNMS(yamlType);
    }

    public static java.lang.Boolean IsTN(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IYamlType yamlType) {
      return DynamicResourceUtil.invoke(IYamlTypeFunctionsImpl.class, YamlTypeFunctionsImpl.INSTANCE, yamlType).IsTN(yamlType);
    }

    public static java.lang.Boolean IsNMSandTN(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IYamlType yamlType) {
      return DynamicResourceUtil.invoke(IYamlTypeFunctionsImpl.class, YamlTypeFunctionsImpl.INSTANCE, yamlType).IsNMSandTN(yamlType);
    }

  }

  public static interface IInstallationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("50a2bee6-9539-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IInstallationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallationFunctionsImpl implements IInstallationFunctionsImpl {

    public static final IInstallationFunctionsImpl INSTANCE = new InstallationFunctionsImpl();

    private InstallationFunctionsImpl() {}

  }
  
  public static class InstallationFunctions {

    private InstallationFunctions() {}

  }

  public static interface IAudienceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("be1e3d1a-9539-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IAudienceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AudienceFunctionsImpl implements IAudienceFunctionsImpl {

    public static final IAudienceFunctionsImpl INSTANCE = new AudienceFunctionsImpl();

    private AudienceFunctionsImpl() {}

  }
  
  public static class AudienceFunctions {

    private AudienceFunctions() {}

  }

  public static interface IPrerequisitesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("67cdceae-953c-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IPrerequisitesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PrerequisitesFunctionsImpl implements IPrerequisitesFunctionsImpl {

    public static final IPrerequisitesFunctionsImpl INSTANCE = new PrerequisitesFunctionsImpl();

    private PrerequisitesFunctionsImpl() {}

  }
  
  public static class PrerequisitesFunctions {

    private PrerequisitesFunctions() {}

  }

  public static interface ISkillsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("228b49c7-953d-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISkillsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SkillsFunctionsImpl implements ISkillsFunctionsImpl {

    public static final ISkillsFunctionsImpl INSTANCE = new SkillsFunctionsImpl();

    private SkillsFunctionsImpl() {}

  }
  
  public static class SkillsFunctions {

    private SkillsFunctions() {}

  }

  public static interface IHW_InstallationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("94b1d668-9544-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IHW_InstallationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HW_InstallationFunctionsImpl implements IHW_InstallationFunctionsImpl {

    public static final IHW_InstallationFunctionsImpl INSTANCE = new HW_InstallationFunctionsImpl();

    private HW_InstallationFunctionsImpl() {}

  }
  
  public static class HW_InstallationFunctions {

    private HW_InstallationFunctions() {}

  }

  public static interface IDeploy_VMFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8f8a24a9-9545-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDeploy_VMFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Deploy_VMFunctionsImpl implements IDeploy_VMFunctionsImpl {

    public static final IDeploy_VMFunctionsImpl INSTANCE = new Deploy_VMFunctionsImpl();

    private Deploy_VMFunctionsImpl() {}

  }
  
  public static class Deploy_VMFunctions {

    private Deploy_VMFunctions() {}

  }

  public static interface IVertical_DependenciesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("def8f69f-9546-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IVertical_DependenciesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Vertical_DependenciesFunctionsImpl implements IVertical_DependenciesFunctionsImpl {

    public static final IVertical_DependenciesFunctionsImpl INSTANCE = new Vertical_DependenciesFunctionsImpl();

    private Vertical_DependenciesFunctionsImpl() {}

  }
  
  public static class Vertical_DependenciesFunctions {

    private Vertical_DependenciesFunctions() {}

  }

  public static interface IPost_InstallationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f2be8a0b-9548-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("f8a1b106-9549-11ec-9b36-7d300415c806")
    public java.lang.Boolean DoGenerate();

  }
  
  public static interface IPost_InstallationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f8a1b106-9549-11ec-9b36-7d300415c806")
    public java.lang.Boolean DoGenerate(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IPost_Installation post_Installation);

  }
  
  public static class Post_InstallationFunctionsImpl implements IPost_InstallationFunctionsImpl {

    public static final IPost_InstallationFunctionsImpl INSTANCE = new Post_InstallationFunctionsImpl();

    private Post_InstallationFunctionsImpl() {}

    @Override
    public java.lang.Boolean DoGenerate(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IPost_Installation post_Installation) {
      /* Begin Protected Region [[f8a1b106-9549-11ec-9b36-7d300415c806]] */
      if (post_Installation.selectSuppress() == null) {
      	return true;
      }
      return !post_Installation.selectSuppress().booleanValue();
      /* End Protected Region   [[f8a1b106-9549-11ec-9b36-7d300415c806]] */
    }

  }
  
  public static class Post_InstallationFunctions {

    private Post_InstallationFunctions() {}

    public static java.lang.Boolean DoGenerate(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IPost_Installation post_Installation) {
      return DynamicResourceUtil.invoke(IPost_InstallationFunctionsImpl.class, Post_InstallationFunctionsImpl.INSTANCE, post_Installation).DoGenerate(post_Installation);
    }

  }

  public static interface IReinstallationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("48155ec9-131e-11ed-9688-130be89c46a5")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("48155ecb-131e-11ed-9688-130be89c46a5")
    public java.lang.Boolean DoGenerate();

  }
  
  public static interface IReinstallationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("48155ecb-131e-11ed-9688-130be89c46a5")
    public java.lang.Boolean DoGenerate(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.reinstallation.javamodel.IReinstallation reinstallation);

  }
  
  public static class ReinstallationFunctionsImpl implements IReinstallationFunctionsImpl {

    public static final IReinstallationFunctionsImpl INSTANCE = new ReinstallationFunctionsImpl();

    private ReinstallationFunctionsImpl() {}

    @Override
    public java.lang.Boolean DoGenerate(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.reinstallation.javamodel.IReinstallation reinstallation) {
      /* Begin Protected Region [[48155ecb-131e-11ed-9688-130be89c46a5]] */
      final var postinstallation = InstallationManualDocument.selectToMeReinstallation(reinstallation).selectInstallation().selectPost_installation();
      if (postinstallation.selectSuppress() == null) {
      	return true;
      }
      return !postinstallation.selectSuppress().booleanValue();
      /* End Protected Region   [[48155ecb-131e-11ed-9688-130be89c46a5]] */
    }

  }
  
  public static class ReinstallationFunctions {

    private ReinstallationFunctions() {}

    public static java.lang.Boolean DoGenerate(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.reinstallation.javamodel.IReinstallation reinstallation) {
      return DynamicResourceUtil.invoke(IReinstallationFunctionsImpl.class, ReinstallationFunctionsImpl.INSTANCE, reinstallation).DoGenerate(reinstallation);
    }

  }

  public static interface IOS_InstallationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8ef2ae28-954a-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("8ef2ae2a-954a-11ec-9b36-7d300415c806")
    public java.lang.Boolean DoGenerate();

  }
  
  public static interface IOS_InstallationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8ef2ae2a-954a-11ec-9b36-7d300415c806")
    public java.lang.Boolean DoGenerate(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IOS_Installation oS_Installation);

  }
  
  public static class OS_InstallationFunctionsImpl implements IOS_InstallationFunctionsImpl {

    public static final IOS_InstallationFunctionsImpl INSTANCE = new OS_InstallationFunctionsImpl();

    private OS_InstallationFunctionsImpl() {}

    @Override
    public java.lang.Boolean DoGenerate(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IOS_Installation oS_Installation) {
      /* Begin Protected Region [[8ef2ae2a-954a-11ec-9b36-7d300415c806]] */
      if (oS_Installation.selectManualOsInstallation() == null) {
      	return true;
      }
      return !oS_Installation.selectManualOsInstallation().booleanValue();
      /* End Protected Region   [[8ef2ae2a-954a-11ec-9b36-7d300415c806]] */
    }

  }
  
  public static class OS_InstallationFunctions {

    private OS_InstallationFunctions() {}

    public static java.lang.Boolean DoGenerate(final cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IOS_Installation oS_Installation) {
      return DynamicResourceUtil.invoke(IOS_InstallationFunctionsImpl.class, OS_InstallationFunctionsImpl.INSTANCE, oS_Installation).DoGenerate(oS_Installation);
    }

  }

  public static interface IHorizontal_DependenciesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ffa6744c-954a-11ec-9b36-7d300415c806")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IHorizontal_DependenciesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Horizontal_DependenciesFunctionsImpl implements IHorizontal_DependenciesFunctionsImpl {

    public static final IHorizontal_DependenciesFunctionsImpl INSTANCE = new Horizontal_DependenciesFunctionsImpl();

    private Horizontal_DependenciesFunctionsImpl() {}

  }
  
  public static class Horizontal_DependenciesFunctions {

    private Horizontal_DependenciesFunctions() {}

  }

  public static interface IInstallation_Manual_DependencyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e8b8e36a-d7b4-11ee-8935-7facceea0829")
    public java.lang.String RenderInstallationManualReference();

  }
  
  public static interface IInstallation_Manual_DependencyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Installation_Manual_DependencyFunctionsImpl implements IInstallation_Manual_DependencyFunctionsImpl {

    public static final IInstallation_Manual_DependencyFunctionsImpl INSTANCE = new Installation_Manual_DependencyFunctionsImpl();

    private Installation_Manual_DependencyFunctionsImpl() {}

  }
  
  public static class Installation_Manual_DependencyFunctions {

    private Installation_Manual_DependencyFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,60fce88b-94c8-11ec-9b36-7d300415c806,CyhABYYL/cRyRr/0Vfe0QxkxLTY=] */
