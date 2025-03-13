package cleon.architecturemethods.arc42.metamodel.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[65a357a1-2663-11e6-ae54-e50d44645ae7,imports]] */

/* End Protected Region   [[65a357a1-2663-11e6-ae54-e50d44645ae7,imports]] */

public class FunctionSpace_Asciidoc_arc42 {

  /* Begin Protected Region [[65a357a1-2663-11e6-ae54-e50d44645ae7]] */
  
  /* End Protected Region   [[65a357a1-2663-11e6-ae54-e50d44645ae7]] */


  public static interface Iarc42TopLevelChapterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("50aaa6c3-abeb-11ef-ad6e-61718268e815")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("50aaa6cc-abeb-11ef-ad6e-61718268e815")
    public java.lang.String FileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("d5d65e3b-ac0e-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface Iarc42TopLevelChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class arc42TopLevelChapterFunctionsImpl implements Iarc42TopLevelChapterFunctionsImpl {

    public static final Iarc42TopLevelChapterFunctionsImpl INSTANCE = new arc42TopLevelChapterFunctionsImpl();

    private arc42TopLevelChapterFunctionsImpl() {}

  }
  
  public static class arc42TopLevelChapterFunctions {

    private arc42TopLevelChapterFunctions() {}

  }

  public static interface ISystemScopeAndContextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cd8e8e4-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("0afb4150-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

    @IDynamicResourceExtension.MethodId("419f01aa-b242-11ef-918d-5f6110826920")
    public java.lang.String FileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISystemScopeAndContextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemScopeAndContextFunctionsImpl implements ISystemScopeAndContextFunctionsImpl {

    public static final ISystemScopeAndContextFunctionsImpl INSTANCE = new SystemScopeAndContextFunctionsImpl();

    private SystemScopeAndContextFunctionsImpl() {}

  }
  
  public static class SystemScopeAndContextFunctions {

    private SystemScopeAndContextFunctions() {}

  }

  public static interface IDomainContextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cd95d91-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDomainContextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DomainContextFunctionsImpl implements IDomainContextFunctionsImpl {

    public static final IDomainContextFunctionsImpl INSTANCE = new DomainContextFunctionsImpl();

    private DomainContextFunctionsImpl() {}

  }
  
  public static class DomainContextFunctions {

    private DomainContextFunctions() {}

  }

  public static interface ITechnicalContextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cd98524-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ITechnicalContextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TechnicalContextFunctionsImpl implements ITechnicalContextFunctionsImpl {

    public static final ITechnicalContextFunctionsImpl INSTANCE = new TechnicalContextFunctionsImpl();

    private TechnicalContextFunctionsImpl() {}

  }
  
  public static class TechnicalContextFunctions {

    private TechnicalContextFunctions() {}

  }

  public static interface IDecompositionBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cd9d383-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String RenderTitle(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDecompositionBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DecompositionBuildingBlockFunctionsImpl implements IDecompositionBuildingBlockFunctionsImpl {

    public static final IDecompositionBuildingBlockFunctionsImpl INSTANCE = new DecompositionBuildingBlockFunctionsImpl();

    private DecompositionBuildingBlockFunctionsImpl() {}

  }
  
  public static class DecompositionBuildingBlockFunctions {

    private DecompositionBuildingBlockFunctions() {}

  }

  public static interface IDeploymentViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cd9f9db-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String RenderChapters(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("1e9a731b-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface IDeploymentViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentViewFunctionsImpl implements IDeploymentViewFunctionsImpl {

    public static final IDeploymentViewFunctionsImpl INSTANCE = new DeploymentViewFunctionsImpl();

    private DeploymentViewFunctionsImpl() {}

  }
  
  public static class DeploymentViewFunctions {

    private DeploymentViewFunctions() {}

  }

  public static interface IIntroductionAndGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("34391dec-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

    @IDynamicResourceExtension.MethodId("7fa8ec6c-b241-11ef-918d-5f6110826920")
    public java.lang.String FileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IIntroductionAndGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IntroductionAndGoalsFunctionsImpl implements IIntroductionAndGoalsFunctionsImpl {

    public static final IIntroductionAndGoalsFunctionsImpl INSTANCE = new IntroductionAndGoalsFunctionsImpl();

    private IntroductionAndGoalsFunctionsImpl() {}

  }
  
  public static class IntroductionAndGoalsFunctions {

    private IntroductionAndGoalsFunctions() {}

  }

  public static interface IQualityGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cd9fa65-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IQualityGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class QualityGoalsFunctionsImpl implements IQualityGoalsFunctionsImpl {

    public static final IQualityGoalsFunctionsImpl INSTANCE = new QualityGoalsFunctionsImpl();

    private QualityGoalsFunctionsImpl() {}

  }
  
  public static class QualityGoalsFunctions {

    private QualityGoalsFunctions() {}

  }

  public static interface IRequirementsOverviewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cda20e4-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IRequirementsOverviewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsOverviewFunctionsImpl implements IRequirementsOverviewFunctionsImpl {

    public static final IRequirementsOverviewFunctionsImpl INSTANCE = new RequirementsOverviewFunctionsImpl();

    private RequirementsOverviewFunctionsImpl() {}

  }
  
  public static class RequirementsOverviewFunctions {

    private RequirementsOverviewFunctions() {}

  }

  public static interface ITechnicalConstraintsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cda2150-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ITechnicalConstraintsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TechnicalConstraintsFunctionsImpl implements ITechnicalConstraintsFunctionsImpl {

    public static final ITechnicalConstraintsFunctionsImpl INSTANCE = new TechnicalConstraintsFunctionsImpl();

    private TechnicalConstraintsFunctionsImpl() {}

  }
  
  public static class TechnicalConstraintsFunctions {

    private TechnicalConstraintsFunctions() {}

  }

  public static interface IOrganizationalConstraintsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cda21c0-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IOrganizationalConstraintsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OrganizationalConstraintsFunctionsImpl implements IOrganizationalConstraintsFunctionsImpl {

    public static final IOrganizationalConstraintsFunctionsImpl INSTANCE = new OrganizationalConstraintsFunctionsImpl();

    private OrganizationalConstraintsFunctionsImpl() {}

  }
  
  public static class OrganizationalConstraintsFunctions {

    private OrganizationalConstraintsFunctions() {}

  }

  public static interface IDecisionTopicFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cda4972-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDecisionTopicFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DecisionTopicFunctionsImpl implements IDecisionTopicFunctionsImpl {

    public static final IDecisionTopicFunctionsImpl INSTANCE = new DecisionTopicFunctionsImpl();

    private DecisionTopicFunctionsImpl() {}

  }
  
  public static class DecisionTopicFunctions {

    private DecisionTopicFunctions() {}

  }

  public static interface IWhiteboxSystemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cda704d-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("5cda709e-2516-11ec-beea-a9d94a6f89e0")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> _ChapterOrder();

    @IDynamicResourceExtension.MethodId("5cda95d2-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderDescriptions(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("5cda95ed-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderChapters(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("5cda95f5-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderAdditionalChapters(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("5cda96a4-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderProduct(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IWhiteboxSystemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WhiteboxSystemFunctionsImpl implements IWhiteboxSystemFunctionsImpl {

    public static final IWhiteboxSystemFunctionsImpl INSTANCE = new WhiteboxSystemFunctionsImpl();

    private WhiteboxSystemFunctionsImpl() {}

  }
  
  public static class WhiteboxSystemFunctions {

    private WhiteboxSystemFunctions() {}

  }

  public static interface IBlackboxFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("048c0e46-e5db-11ee-a627-83563cb3bdc6")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("808098ba-cdc4-11ef-aceb-ed2f5b1a4839")
    public java.lang.String GetIndentChar();

    @IDynamicResourceExtension.MethodId("9a57d270-cdc6-11ef-aceb-ed2f5b1a4839")
    public java.lang.String RenderWhiteBoxRef(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("043a4b8f-f41e-11ef-a51c-b3802a5d3f21")
    public java.lang.String RenderInterface();

    @IDynamicResourceExtension.MethodId("adc04659-f41e-11ef-a51c-b3802a5d3f21")
    public java.lang.String RenderPerformance();

    @IDynamicResourceExtension.MethodId("bdc9f4ff-f41e-11ef-a51c-b3802a5d3f21")
    public java.lang.String RenderRequirements();

    @IDynamicResourceExtension.MethodId("cd197b0e-f41e-11ef-a51c-b3802a5d3f21")
    public java.lang.String RenderLocation();

  }
  
  public static interface IBlackboxFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BlackboxFunctionsImpl implements IBlackboxFunctionsImpl {

    public static final IBlackboxFunctionsImpl INSTANCE = new BlackboxFunctionsImpl();

    private BlackboxFunctionsImpl() {}

  }
  
  public static class BlackboxFunctions {

    private BlackboxFunctions() {}

  }

  public static interface IProductViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("48cbce71-ffdf-11ef-a4b8-93f936374459")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("f503ab5e-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface IProductViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProductViewFunctionsImpl implements IProductViewFunctionsImpl {

    public static final IProductViewFunctionsImpl INSTANCE = new ProductViewFunctionsImpl();

    private ProductViewFunctionsImpl() {}

  }
  
  public static class ProductViewFunctions {

    private ProductViewFunctions() {}

  }

  public static interface IBlackbox_DependenciesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cdae4cf-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IBlackbox_DependenciesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Blackbox_DependenciesFunctionsImpl implements IBlackbox_DependenciesFunctionsImpl {

    public static final IBlackbox_DependenciesFunctionsImpl INSTANCE = new Blackbox_DependenciesFunctionsImpl();

    private Blackbox_DependenciesFunctionsImpl() {}

  }
  
  public static class Blackbox_DependenciesFunctions {

    private Blackbox_DependenciesFunctions() {}

  }

  public static interface IBlackbox_RequirementsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cdb0b2e-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IBlackbox_RequirementsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Blackbox_RequirementsFunctionsImpl implements IBlackbox_RequirementsFunctionsImpl {

    public static final IBlackbox_RequirementsFunctionsImpl INSTANCE = new Blackbox_RequirementsFunctionsImpl();

    private Blackbox_RequirementsFunctionsImpl() {}

  }
  
  public static class Blackbox_RequirementsFunctions {

    private Blackbox_RequirementsFunctions() {}

  }

  public static interface IBuildingBlockRequirementCoverageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cdb0b4d-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderCoverageName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IBuildingBlockRequirementCoverageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockRequirementCoverageFunctionsImpl implements IBuildingBlockRequirementCoverageFunctionsImpl {

    public static final IBuildingBlockRequirementCoverageFunctionsImpl INSTANCE = new BuildingBlockRequirementCoverageFunctionsImpl();

    private BuildingBlockRequirementCoverageFunctionsImpl() {}

  }
  
  public static class BuildingBlockRequirementCoverageFunctions {

    private BuildingBlockRequirementCoverageFunctions() {}

  }

  public static interface IMonitoringFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cdb0b62-2516-11ec-beea-a9d94a6f89e0")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> _ChapterOrder();

  }
  
  public static interface IMonitoringFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MonitoringFunctionsImpl implements IMonitoringFunctionsImpl {

    public static final IMonitoringFunctionsImpl INSTANCE = new MonitoringFunctionsImpl();

    private MonitoringFunctionsImpl() {}

  }
  
  public static class MonitoringFunctions {

    private MonitoringFunctions() {}

  }

  public static interface IComponentCompositionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cdb5a04-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderComponents(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IComponentCompositionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ComponentCompositionFunctionsImpl implements IComponentCompositionFunctionsImpl {

    public static final IComponentCompositionFunctionsImpl INSTANCE = new ComponentCompositionFunctionsImpl();

    private ComponentCompositionFunctionsImpl() {}

  }
  
  public static class ComponentCompositionFunctions {

    private ComponentCompositionFunctions() {}

  }

  public static interface IBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cdb5a16-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderBlackboxReference(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockFunctionsImpl implements IBuildingBlockFunctionsImpl {

    public static final IBuildingBlockFunctionsImpl INSTANCE = new BuildingBlockFunctionsImpl();

    private BuildingBlockFunctionsImpl() {}

  }
  
  public static class BuildingBlockFunctions {

    private BuildingBlockFunctions() {}

  }

  public static interface IBackupAndRecoveryAspectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cdb5a54-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IBackupAndRecoveryAspectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BackupAndRecoveryAspectFunctionsImpl implements IBackupAndRecoveryAspectFunctionsImpl {

    public static final IBackupAndRecoveryAspectFunctionsImpl INSTANCE = new BackupAndRecoveryAspectFunctionsImpl();

    private BackupAndRecoveryAspectFunctionsImpl() {}

  }
  
  public static class BackupAndRecoveryAspectFunctions {

    private BackupAndRecoveryAspectFunctions() {}

  }

  public static interface ISensorFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cdb5a58-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _SensorNote(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISensorFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SensorFunctionsImpl implements ISensorFunctionsImpl {

    public static final ISensorFunctionsImpl INSTANCE = new SensorFunctionsImpl();

    private SensorFunctionsImpl() {}

  }
  
  public static class SensorFunctions {

    private SensorFunctions() {}

  }

  public static interface ITechnicalRisksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cdb5a6e-2516-11ec-beea-a9d94a6f89e0")
    public java.lang.String _RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("7b8400db-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface ITechnicalRisksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TechnicalRisksFunctionsImpl implements ITechnicalRisksFunctionsImpl {

    public static final ITechnicalRisksFunctionsImpl INSTANCE = new TechnicalRisksFunctionsImpl();

    private TechnicalRisksFunctionsImpl() {}

  }
  
  public static class TechnicalRisksFunctions {

    private TechnicalRisksFunctions() {}

  }

  public static interface IBuildingBlockViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("24208986-e5d9-11ee-a627-83563cb3bdc6")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("641947c8-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface IBuildingBlockViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockViewFunctionsImpl implements IBuildingBlockViewFunctionsImpl {

    public static final IBuildingBlockViewFunctionsImpl INSTANCE = new BuildingBlockViewFunctionsImpl();

    private BuildingBlockViewFunctionsImpl() {}

  }
  
  public static class BuildingBlockViewFunctions {

    private BuildingBlockViewFunctions() {}

  }

  public static interface IWhiteboxFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c0be5947-d64d-11ee-8014-c150876d6b6e")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("00a195ac-e5cd-11ee-9463-7b6f2009e56e")
    public java.lang.String FileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("5b3e882f-e5da-11ee-a627-83563cb3bdc6")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("4e006861-cdbc-11ef-aceb-ed2f5b1a4839")
    public java.lang.String RendererCustomElement();

    @IDynamicResourceExtension.MethodId("c2afb89b-cdc2-11ef-aceb-ed2f5b1a4839")
    public java.lang.String RenderChapter(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IWhiteboxFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4e006861-cdbc-11ef-aceb-ed2f5b1a4839")
    public java.lang.String RendererCustomElement(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox whitebox);

  }
  
  public static class WhiteboxFunctionsImpl implements IWhiteboxFunctionsImpl {

    public static final IWhiteboxFunctionsImpl INSTANCE = new WhiteboxFunctionsImpl();

    private WhiteboxFunctionsImpl() {}

    @Override
    public java.lang.String RendererCustomElement(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox whitebox) {
      return null;
    }

  }
  
  public static class WhiteboxFunctions {

    private WhiteboxFunctions() {}

    public static java.lang.String RendererCustomElement(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox whitebox) {
      return DynamicResourceUtil.invoke(IWhiteboxFunctionsImpl.class, WhiteboxFunctionsImpl.INSTANCE, whitebox).RendererCustomElement(whitebox);
    }

  }

  public static interface IDatabaseViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fd5c8639-27c3-11ef-9acc-81efe99aa8b6")
    public java.lang.String FileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("3e680ed4-27dc-11ef-9e2d-0b682fec1a77")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("a179d28c-cd14-11ef-947c-3b647dbecb9f")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDatabaseViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a179d28c-cd14-11ef-947c-3b647dbecb9f")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView databaseView);

  }
  
  public static class DatabaseViewFunctionsImpl implements IDatabaseViewFunctionsImpl {

    public static final IDatabaseViewFunctionsImpl INSTANCE = new DatabaseViewFunctionsImpl();

    private DatabaseViewFunctionsImpl() {}

    @Override
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView databaseView) {
      return "";
    }

  }
  
  public static class DatabaseViewFunctions {

    private DatabaseViewFunctions() {}

    public static java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language, final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView databaseView) {
      return DynamicResourceUtil.invoke(IDatabaseViewFunctionsImpl.class, DatabaseViewFunctionsImpl.INSTANCE, databaseView).ChapterPath(language, databaseView);
    }

  }

  public static interface ITableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("76bb50ae-27d1-11ef-9e2d-0b682fec1a77")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("ba830c78-c019-11ee-b73c-c3f9bd2ce1e0")
    public java.lang.String RefName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("d4c6277a-cfff-11ee-9bb8-5f4f5b483c01")
    public java.lang.String DbRef(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("507f2375-d004-11ee-8ad8-7318f4718a69")
    public java.lang.Boolean IsHistoryNullFalseOrTrue();

    @IDynamicResourceExtension.MethodId("a33db0f5-e51f-11ee-a074-d7afe74e4a27")
    public java.lang.String ElementName();

  }
  
  public static interface ITableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("507f2375-d004-11ee-8ad8-7318f4718a69")
    public java.lang.Boolean IsHistoryNullFalseOrTrue(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable table);

  }
  
  public static class TableFunctionsImpl implements ITableFunctionsImpl {

    public static final ITableFunctionsImpl INSTANCE = new TableFunctionsImpl();

    private TableFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsHistoryNullFalseOrTrue(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable table) {
      /* Begin Protected Region [[507f2375-d004-11ee-8ad8-7318f4718a69]] */
		if( table.selectHistory() == null) {
			return false;
		}
		return table.selectHistory(); 
      /* End Protected Region   [[507f2375-d004-11ee-8ad8-7318f4718a69]] */
    }

  }
  
  public static class TableFunctions {

    private TableFunctions() {}

    public static java.lang.Boolean IsHistoryNullFalseOrTrue(final cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable table) {
      return DynamicResourceUtil.invoke(ITableFunctionsImpl.class, TableFunctionsImpl.INSTANCE, table).IsHistoryNullFalseOrTrue(table);
    }

  }

  public static interface IViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8de75e52-e50d-11ee-a074-d7afe74e4a27")
    public java.lang.String DbRef(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("9afb73f1-e50d-11ee-a074-d7afe74e4a27")
    public java.lang.String RefName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("9964c974-e51f-11ee-a074-d7afe74e4a27")
    public java.lang.String ElementName();

    @IDynamicResourceExtension.MethodId("86ae41e2-27dc-11ef-9e2d-0b682fec1a77")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ViewFunctionsImpl implements IViewFunctionsImpl {

    public static final IViewFunctionsImpl INSTANCE = new ViewFunctionsImpl();

    private ViewFunctionsImpl() {}

  }
  
  public static class ViewFunctions {

    private ViewFunctions() {}

  }

  public static interface IDatabaseElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8fbd2b16-e51f-11ee-a074-d7afe74e4a27")
    public java.lang.String ElementName();

    @IDynamicResourceExtension.MethodId("287ac3e9-e537-11ee-a074-d7afe74e4a27")
    public java.lang.String DbRef(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDatabaseElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DatabaseElementFunctionsImpl implements IDatabaseElementFunctionsImpl {

    public static final IDatabaseElementFunctionsImpl INSTANCE = new DatabaseElementFunctionsImpl();

    private DatabaseElementFunctionsImpl() {}

  }
  
  public static class DatabaseElementFunctions {

    private DatabaseElementFunctions() {}

  }

  public static interface ITableAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("be85f5d4-27c7-11ef-9acc-81efe99aa8b6")
    public java.lang.String DbRef(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("62e9ea30-27dc-11ef-9e2d-0b682fec1a77")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ITableAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TableAreaFunctionsImpl implements ITableAreaFunctionsImpl {

    public static final ITableAreaFunctionsImpl INSTANCE = new TableAreaFunctionsImpl();

    private TableAreaFunctionsImpl() {}

  }
  
  public static class TableAreaFunctions {

    private TableAreaFunctions() {}

  }

  public static interface IAboutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("18164d4e-9dde-11ef-bee3-bbbac6a8abc2")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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

  public static interface IArchitectureConstraintsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4b48e5ab-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface IArchitectureConstraintsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ArchitectureConstraintsFunctionsImpl implements IArchitectureConstraintsFunctionsImpl {

    public static final IArchitectureConstraintsFunctionsImpl INSTANCE = new ArchitectureConstraintsFunctionsImpl();

    private ArchitectureConstraintsFunctionsImpl() {}

  }
  
  public static class ArchitectureConstraintsFunctions {

    private ArchitectureConstraintsFunctions() {}

  }

  public static interface ISolutionStrategyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("42203a8e-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface ISolutionStrategyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SolutionStrategyFunctionsImpl implements ISolutionStrategyFunctionsImpl {

    public static final ISolutionStrategyFunctionsImpl INSTANCE = new SolutionStrategyFunctionsImpl();

    private SolutionStrategyFunctionsImpl() {}

  }
  
  public static class SolutionStrategyFunctions {

    private SolutionStrategyFunctions() {}

  }

  public static interface ICrosscuttingConceptsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99acf364-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface ICrosscuttingConceptsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CrosscuttingConceptsFunctionsImpl implements ICrosscuttingConceptsFunctionsImpl {

    public static final ICrosscuttingConceptsFunctionsImpl INSTANCE = new CrosscuttingConceptsFunctionsImpl();

    private CrosscuttingConceptsFunctionsImpl() {}

  }
  
  public static class CrosscuttingConceptsFunctions {

    private CrosscuttingConceptsFunctions() {}

  }

  public static interface IDataViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a11a0b3c-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface IDataViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DataViewFunctionsImpl implements IDataViewFunctionsImpl {

    public static final IDataViewFunctionsImpl INSTANCE = new DataViewFunctionsImpl();

    private DataViewFunctionsImpl() {}

  }
  
  public static class DataViewFunctions {

    private DataViewFunctions() {}

  }

  public static interface IArchitecturalDecisionsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b3faf4f3-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface IArchitecturalDecisionsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ArchitecturalDecisionsFunctionsImpl implements IArchitecturalDecisionsFunctionsImpl {

    public static final IArchitecturalDecisionsFunctionsImpl INSTANCE = new ArchitecturalDecisionsFunctionsImpl();

    private ArchitecturalDecisionsFunctionsImpl() {}

  }
  
  public static class ArchitecturalDecisionsFunctions {

    private ArchitecturalDecisionsFunctions() {}

  }

  public static interface IRuntimeViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cfbb737c-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface IRuntimeViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RuntimeViewFunctionsImpl implements IRuntimeViewFunctionsImpl {

    public static final IRuntimeViewFunctionsImpl INSTANCE = new RuntimeViewFunctionsImpl();

    private RuntimeViewFunctionsImpl() {}

  }
  
  public static class RuntimeViewFunctions {

    private RuntimeViewFunctions() {}

  }

  public static interface IQualityRequirementsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e799d58f-ac0f-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface IQualityRequirementsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class QualityRequirementsFunctionsImpl implements IQualityRequirementsFunctionsImpl {

    public static final IQualityRequirementsFunctionsImpl INSTANCE = new QualityRequirementsFunctionsImpl();

    private QualityRequirementsFunctionsImpl() {}

  }
  
  public static class QualityRequirementsFunctions {

    private QualityRequirementsFunctions() {}

  }

  public static interface IArc42RequirementCoveragesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("164b1cb2-ac10-11ef-afba-fb66280e2230")
    public java.lang.String No();

  }
  
  public static interface IArc42RequirementCoveragesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Arc42RequirementCoveragesFunctionsImpl implements IArc42RequirementCoveragesFunctionsImpl {

    public static final IArc42RequirementCoveragesFunctionsImpl INSTANCE = new Arc42RequirementCoveragesFunctionsImpl();

    private Arc42RequirementCoveragesFunctionsImpl() {}

  }
  
  public static class Arc42RequirementCoveragesFunctions {

    private Arc42RequirementCoveragesFunctions() {}

  }

  public static interface IUnderTheHood_ConceptsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cb9e4cc3-cd0e-11ef-947c-3b647dbecb9f")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("cb9e4ccb-cd0e-11ef-947c-3b647dbecb9f")
    public java.lang.String FileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IUnderTheHood_ConceptsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UnderTheHood_ConceptsFunctionsImpl implements IUnderTheHood_ConceptsFunctionsImpl {

    public static final IUnderTheHood_ConceptsFunctionsImpl INSTANCE = new UnderTheHood_ConceptsFunctionsImpl();

    private UnderTheHood_ConceptsFunctionsImpl() {}

  }
  
  public static class UnderTheHood_ConceptsFunctions {

    private UnderTheHood_ConceptsFunctions() {}

  }

  public static interface IResourceBuildingBlockSystemConfigurationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("48cb7e2e-ffdf-11ef-a4b8-93f936374459")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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

    @IDynamicResourceExtension.MethodId("48cba7ff-ffdf-11ef-a4b8-93f936374459")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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

    @IDynamicResourceExtension.MethodId("48cba970-ffdf-11ef-a4b8-93f936374459")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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

    @IDynamicResourceExtension.MethodId("48cbcc67-ffdf-11ef-a4b8-93f936374459")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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

    @IDynamicResourceExtension.MethodId("48cbcd02-ffdf-11ef-a4b8-93f936374459")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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

    @IDynamicResourceExtension.MethodId("48cbcdac-ffdf-11ef-a4b8-93f936374459")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,65a357a1-2663-11e6-ae54-e50d44645ae7,jNmR+2GjH4rbejxGBLTaJ32H5Jg=] */
