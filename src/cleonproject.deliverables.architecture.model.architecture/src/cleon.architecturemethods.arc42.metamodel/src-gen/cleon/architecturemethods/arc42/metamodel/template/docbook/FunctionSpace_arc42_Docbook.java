package cleon.architecturemethods.arc42.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[de7c9bb2-d17f-11e8-b18f-df1540bb7a5c,imports]] */

/* End Protected Region   [[de7c9bb2-d17f-11e8-b18f-df1540bb7a5c,imports]] */

public class FunctionSpace_arc42_Docbook {

  /* Begin Protected Region [[de7c9bb2-d17f-11e8-b18f-df1540bb7a5c]] */
  
  /* End Protected Region   [[de7c9bb2-d17f-11e8-b18f-df1540bb7a5c]] */


  public static interface ISystem_Scope_and_ContextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("de7c9bfc-d17f-11e8-b18f-df1540bb7a5c")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ISystem_Scope_and_ContextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class System_Scope_and_ContextFunctionsImpl implements ISystem_Scope_and_ContextFunctionsImpl {

    public static final ISystem_Scope_and_ContextFunctionsImpl INSTANCE = new System_Scope_and_ContextFunctionsImpl();

    private System_Scope_and_ContextFunctionsImpl() {}

  }
  
  public static class System_Scope_and_ContextFunctions {

    private System_Scope_and_ContextFunctions() {}

  }

  public static interface IDomainContextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0b0d2cb2-01e2-11e9-9c9d-8d52d6745026")
    public java.lang.String RenderStandardDescription();

    @IDynamicResourceExtension.MethodId("3665f130-043c-11e9-bb22-3f676e869eaa")
    public java.lang.String RenderContentElement();

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

    @IDynamicResourceExtension.MethodId("de7cc416-d17f-11e8-b18f-df1540bb7a5c")
    public java.lang.String RenderStandardDescription();

    @IDynamicResourceExtension.MethodId("519056bd-0441-11e9-bb22-3f676e869eaa")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("3461413d-61c2-11ea-b250-8d3b1d076722")
    public java.lang.String Old_RenderContentElement();

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

    @IDynamicResourceExtension.MethodId("de7cc46d-d17f-11e8-b18f-df1540bb7a5c")
    public java.lang.String RenderTitle();

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

    @IDynamicResourceExtension.MethodId("4da38b16-d181-11e8-b18f-df1540bb7a5c")
    public java.lang.String RenderChapters();

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

    @IDynamicResourceExtension.MethodId("b31330c7-eaa6-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderChapters();

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

    @IDynamicResourceExtension.MethodId("004722f8-eaa7-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderContentElement();

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

  public static interface IRequirementsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("20923ca8-eaa8-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRequirementsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsFunctionsImpl implements IRequirementsFunctionsImpl {

    public static final IRequirementsFunctionsImpl INSTANCE = new RequirementsFunctionsImpl();

    private RequirementsFunctionsImpl() {}

  }
  
  public static class RequirementsFunctions {

    private RequirementsFunctions() {}

  }

  public static interface ITechnicalConstraintsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0d8199df-eaa9-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderContentElement();

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

    @IDynamicResourceExtension.MethodId("13aff001-eaa9-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderContentElement();

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

    @IDynamicResourceExtension.MethodId("0cc8ae11-ed68-11e8-8628-792e8e0b10f3")
    public java.lang.String RenderContentElement();

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

  public static interface IBuildingBlockViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4074b6cf-ee38-11e8-9756-27a593be2ffb")
    public java.lang.String RenderChapters();

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

  public static interface ILevelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("534df0ee-ee3e-11e8-9756-27a593be2ffb")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("47549860-7edd-11ea-9262-7b7e0e9cb204")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface ILevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LevelFunctionsImpl implements ILevelFunctionsImpl {

    public static final ILevelFunctionsImpl INSTANCE = new LevelFunctionsImpl();

    private LevelFunctionsImpl() {}

  }
  
  public static class LevelFunctions {

    private LevelFunctions() {}

  }

  public static interface IBlackboxFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c4ea78ec-0a9b-11e9-9915-0d353533f3da")
    public java.lang.String RenderContentElement();

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

    @IDynamicResourceExtension.MethodId("3e5368c9-092e-11e9-8c40-11db3668c0c9")
    public java.lang.String RenderContentElement();

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

  public static interface IProductAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("68ac1faa-0a76-11e9-9915-0d353533f3da")
    public java.lang.String RenderProduct();

  }
  
  public static interface IProductAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProductAwareFunctionsImpl implements IProductAwareFunctionsImpl {

    public static final IProductAwareFunctionsImpl INSTANCE = new ProductAwareFunctionsImpl();

    private ProductAwareFunctionsImpl() {}

  }
  
  public static class ProductAwareFunctions {

    private ProductAwareFunctions() {}

  }

  public static interface IBlackbox_DependenciesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e7072d5e-0205-11e9-9c9d-8d52d6745026")
    public java.lang.String RenderContentElement();

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

    @IDynamicResourceExtension.MethodId("778aae8d-0205-11e9-9c9d-8d52d6745026")
    public java.lang.String RenderContentElement();

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

    @IDynamicResourceExtension.MethodId("1be1942b-1bf0-11e9-a649-37e63f24427a")
    public java.lang.String RenderCoverageName();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,de7c9bb2-d17f-11e8-b18f-df1540bb7a5c,MKWkX/uTdDQvd9qACUrK+zdHt40=] */
