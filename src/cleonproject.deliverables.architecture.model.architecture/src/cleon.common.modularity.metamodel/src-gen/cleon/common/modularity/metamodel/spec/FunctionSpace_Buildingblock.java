package cleon.common.modularity.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[3aea3d68-44bf-11e5-93ef-c50f9659357a,imports]] */
import cleon.common.modularity.metamodel.spec.javamodel.*;
import java.util.stream.Collectors;
/* End Protected Region   [[3aea3d68-44bf-11e5-93ef-c50f9659357a,imports]] */

public class FunctionSpace_Buildingblock {

  /* Begin Protected Region [[3aea3d68-44bf-11e5-93ef-c50f9659357a]] */

  /* End Protected Region   [[3aea3d68-44bf-11e5-93ef-c50f9659357a]] */


  public static interface IBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4713cc2d-44bf-11e5-93ef-c50f9659357a")
    public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock Parent();

    @IDynamicResourceExtension.MethodId("ba47ee81-f989-11e5-af79-a55292c8fa9f")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> GetAllParents();

    @IDynamicResourceExtension.MethodId("f37babca-3a03-11e6-a354-253097f89a49")
    public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock TopBuildingBlock();

    @IDynamicResourceExtension.MethodId("d3ef14f8-3c75-11e6-aafa-bd565efc0ead")
    public java.lang.String FullBuildingBlockName();

    @IDynamicResourceExtension.MethodId("65d029d5-5b58-11e7-9702-abdab196c2a1")
    public java.lang.String CreateFullBuildingBlockName();

    @IDynamicResourceExtension.MethodId("281c80c3-3c77-11e6-aafa-bd565efc0ead")
    public java.lang.String BuildingBlockName();

    @IDynamicResourceExtension.MethodId("feec2b18-0aa6-11e9-b5db-cdf0b8dad9e4")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> AllDecomposingBuildingBlocksWithSelf();

    @IDynamicResourceExtension.MethodId("b34d757f-24c0-11ea-9904-7d41f80113d4")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> DecomposingBuildingBlocks();

    @IDynamicResourceExtension.MethodId("5f8b2abd-4823-11e6-82f6-0f210765495b")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> DecomposingBuildingBlocksExceptSelf();

    @IDynamicResourceExtension.MethodId("2d309b24-4355-11e6-a9d7-97cf4f7c398b")
    public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock DecomposingBuildingBlocksFromParent();

    @IDynamicResourceExtension.MethodId("3b3cfddc-4356-11e6-a9d7-97cf4f7c398b")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> DecomposeBuildingBlockOfAllDependenciesFromParent();

    @IDynamicResourceExtension.MethodId("2d309b3b-4355-11e6-a9d7-97cf4f7c398b")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> AllAllowedBuildingBlockFromParent();

    @IDynamicResourceExtension.MethodId("2d3073fe-4355-11e6-a9d7-97cf4f7c398b")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> AllDependenciesFromParent();

    @IDynamicResourceExtension.MethodId("a032d549-4823-11e6-82f6-0f210765495b")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> DependsOn();

    @IDynamicResourceExtension.MethodId("aadf82b1-51a1-11e9-80a8-e19504dc2bb6")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IDependency> OnlyDependencies();

    @IDynamicResourceExtension.MethodId("68a66aec-4910-11e6-be22-874cc08f42ce")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> DirectDependingBuildingBlocksWhereInteresectWithDecompsingBuildingBlockOfParent();

    @IDynamicResourceExtension.MethodId("15cae2bf-4914-11e6-be22-874cc08f42ce")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> DependingBuildingBlocksOutsideParent();

    @IDynamicResourceExtension.MethodId("b07d4c71-894c-11e6-ad04-d1961316644a")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> AllDependsOn();

    @IDynamicResourceExtension.MethodId("caa2cbf5-8959-11e6-ad04-d1961316644a")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> AllDuplicatedDependsOn();

    @IDynamicResourceExtension.MethodId("24cf8570-2ce6-11e8-a902-afb10318295e")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> IndirectDependingBuildingBlocks();

    @IDynamicResourceExtension.MethodId("f9141268-1b4b-11e9-9171-31a0f985a0be")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> InvertDependencies();

    @IDynamicResourceExtension.MethodId("eefb42b7-6dba-11ea-98d4-4d756e6b7091")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("11f2fb1f-6dbb-11ea-98d4-4d756e6b7091")
    public java.lang.String GetShortname();

    @IDynamicResourceExtension.MethodId("e9b270bf-8017-11ea-b039-9728191a5cdc")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> OnlyDependsFrom();

    @IDynamicResourceExtension.MethodId("e612da8f-fe52-11ea-abcb-bfad67a56d79")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> OnlyDependsOn();

    @IDynamicResourceExtension.MethodId("83992df6-bbb5-11ea-83bb-3d6d7d2cf439")
    public java.lang.String GetNameInParentheses();

    @IDynamicResourceExtension.MethodId("631a0430-035a-11e9-a251-e3767b78f69f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("54d20256-035a-11e9-a251-e3767b78f69f")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("4be2cbb2-d8a1-11ea-ae00-5518e944c256")
    public java.lang.String GetIncludePath();

    @IDynamicResourceExtension.MethodId("f58993e5-fe34-11ea-892b-df291bae18c5")
    public java.lang.String ShortAndNameInParentheses();

  }
  
  public static interface IBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("eefb42b7-6dba-11ea-98d4-4d756e6b7091")
    public java.lang.String GetName(final cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buildingBlock);

    @IDynamicResourceExtension.MethodId("e9b270bf-8017-11ea-b039-9728191a5cdc")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> OnlyDependsFrom(final List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> buildingBlockList);

    @IDynamicResourceExtension.MethodId("e612da8f-fe52-11ea-abcb-bfad67a56d79")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> OnlyDependsOn(final List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> buildingBlockList);

    @IDynamicResourceExtension.MethodId("4be2cbb2-d8a1-11ea-ae00-5518e944c256")
    public java.lang.String GetIncludePath(final cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buildingBlock);

  }
  
  public static class BuildingBlockFunctionsImpl implements IBuildingBlockFunctionsImpl {

    public static final IBuildingBlockFunctionsImpl INSTANCE = new BuildingBlockFunctionsImpl();

    private BuildingBlockFunctionsImpl() {}

    @Override
    public java.lang.String GetName(final cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buildingBlock) {
      return null;
    }

    @Override
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> OnlyDependsFrom(final List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> buildingBlockList) {
      /* Begin Protected Region [[e9b270bf-8017-11ea-b039-9728191a5cdc]] */
      return buildingBlockList.stream().filter(x -> {
      	if( x instanceof IDependentBuildingBlock ) {
      		return ((IDependentBuildingBlock)x).selectHasDependency().isEmpty();
      	}
      	return false;
      }).collect(Collectors.toList());
      /* End Protected Region   [[e9b270bf-8017-11ea-b039-9728191a5cdc]] */
    }

    @Override
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> OnlyDependsOn(final List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> buildingBlockList) {
      /* Begin Protected Region [[e612da8f-fe52-11ea-abcb-bfad67a56d79]] */
      return buildingBlockList.stream().filter(x -> (Dependency.selectToMeTo(x) == null)).collect(Collectors.toList()); 
      /* End Protected Region   [[e612da8f-fe52-11ea-abcb-bfad67a56d79]] */
    }

    @Override
    public java.lang.String GetIncludePath(final cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buildingBlock) {
      return null;
    }

  }
  
  public static class BuildingBlockFunctions {

    private BuildingBlockFunctions() {}

    public static java.lang.String GetName(final cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buildingBlock) {
      return DynamicResourceUtil.invoke(IBuildingBlockFunctionsImpl.class, BuildingBlockFunctionsImpl.INSTANCE, buildingBlock).GetName(buildingBlock);
    }

    public static List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> OnlyDependsFrom(final List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> buildingBlockList) {
      return DynamicResourceUtil.invoke(IBuildingBlockFunctionsImpl.class, BuildingBlockFunctionsImpl.INSTANCE, buildingBlockList).OnlyDependsFrom(buildingBlockList);
    }

    public static List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> OnlyDependsOn(final List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> buildingBlockList) {
      return DynamicResourceUtil.invoke(IBuildingBlockFunctionsImpl.class, BuildingBlockFunctionsImpl.INSTANCE, buildingBlockList).OnlyDependsOn(buildingBlockList);
    }

    public static java.lang.String GetIncludePath(final cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buildingBlock) {
      return DynamicResourceUtil.invoke(IBuildingBlockFunctionsImpl.class, BuildingBlockFunctionsImpl.INSTANCE, buildingBlock).GetIncludePath(buildingBlock);
    }

  }

  public static interface IDependencyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e1f94e4e-3c6e-11e6-aafa-bd565efc0ead")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> GetDependingBuildingBlocksFromParent();

    @IDynamicResourceExtension.MethodId("e1f94e5e-3c6e-11e6-aafa-bd565efc0ead")
    public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock GetDecomposingBuildingBlocksFromParent();

    @IDynamicResourceExtension.MethodId("e1f9757c-3c6e-11e6-aafa-bd565efc0ead")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> GetAllAllowedBuildingBlock();

    @IDynamicResourceExtension.MethodId("c5959139-c07c-11e6-beed-bb6789615dd5")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> GetAllNotAllowedDependencies();

    @IDynamicResourceExtension.MethodId("fa54ae2d-c07c-11e6-beed-bb6789615dd5")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> GetDependingBuildingBlocks();

    @IDynamicResourceExtension.MethodId("0a296a70-c07d-11e6-beed-bb6789615dd5")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> GetDecomposingBuildingBlocks();

    @IDynamicResourceExtension.MethodId("755d5492-c086-11e6-beed-bb6789615dd5")
    public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock GetBuildingBlock();

    @IDynamicResourceExtension.MethodId("a3ef82a6-518a-11e9-bfac-5bd977bac00a")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IDependency> GetDependencies();

    @IDynamicResourceExtension.MethodId("a985f835-6dbc-11ea-98d4-4d756e6b7091")
    public java.lang.String ToName();

    @IDynamicResourceExtension.MethodId("45b301c5-6dc7-11ea-93e6-776d19f4f559")
    public java.lang.String FromName();

  }
  
  public static interface IDependencyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DependencyFunctionsImpl implements IDependencyFunctionsImpl {

    public static final IDependencyFunctionsImpl INSTANCE = new DependencyFunctionsImpl();

    private DependencyFunctionsImpl() {}

  }
  
  public static class DependencyFunctions {

    private DependencyFunctions() {}

  }

  public static interface IDecompositionBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d1d1146d-4394-11e6-a883-1f8f2b17c061")
    public java.lang.Integer GetLevelNr();

    @IDynamicResourceExtension.MethodId("83431bc4-4395-11e6-a883-1f8f2b17c061")
    public java.lang.Integer GetLevelNr(final java.lang.Integer level, final cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock parent);

    @IDynamicResourceExtension.MethodId("49a6b322-894c-11e6-ad04-d1961316644a")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> GetDecomposeBuildingBlocks();

    @IDynamicResourceExtension.MethodId("29cb5be2-0aa7-11e9-b5db-cdf0b8dad9e4")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> GetAllDecomposeBuildingBlocks();

  }
  
  public static interface IDecompositionBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d1d1146d-4394-11e6-a883-1f8f2b17c061")
    public java.lang.Integer GetLevelNr(final cleon.common.modularity.metamodel.spec.javamodel.IDecompositionBuildingBlock decompositionBuildingBlock);

    @IDynamicResourceExtension.MethodId("83431bc4-4395-11e6-a883-1f8f2b17c061")
    public java.lang.Integer GetLevelNr(final java.lang.Integer level, final cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock parent, final cleon.common.modularity.metamodel.spec.javamodel.IDecompositionBuildingBlock decompositionBuildingBlock);

  }
  
  public static class DecompositionBuildingBlockFunctionsImpl implements IDecompositionBuildingBlockFunctionsImpl {

    public static final IDecompositionBuildingBlockFunctionsImpl INSTANCE = new DecompositionBuildingBlockFunctionsImpl();

    private DecompositionBuildingBlockFunctionsImpl() {}

    @Override
    public java.lang.Integer GetLevelNr(final cleon.common.modularity.metamodel.spec.javamodel.IDecompositionBuildingBlock decompositionBuildingBlock) {
      /* Begin Protected Region [[d1d1146d-4394-11e6-a883-1f8f2b17c061]] */
      final IBuildingBlockFunctions functions = decompositionBuildingBlock.extension(IBuildingBlockFunctions.class);
      final IBuildingBlock topBuildingBlock = functions.TopBuildingBlock();
      return GetLevelNr(1, topBuildingBlock, decompositionBuildingBlock);     
      /* End Protected Region   [[d1d1146d-4394-11e6-a883-1f8f2b17c061]] */
    }

    @Override
    public java.lang.Integer GetLevelNr(final java.lang.Integer level, final cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock parent, final cleon.common.modularity.metamodel.spec.javamodel.IDecompositionBuildingBlock decompositionBuildingBlock) {
      /* Begin Protected Region [[83431bc4-4395-11e6-a883-1f8f2b17c061]] */
      if(parent.equals(decompositionBuildingBlock))
      {
      	return level;
      }

      if( !(parent instanceof IDecompositionBuildingBlock))
      {
      	return 0;
      }		


      final IDecompositionBuildingBlock decomposeParentBlock = (IDecompositionBuildingBlock) parent;
      for(final IBuildingBlock nestedBlock : decomposeParentBlock.selectDecompose())
      {   		
      	final int childLevel = GetLevelNr(level+1, nestedBlock, decompositionBuildingBlock);
      	if( childLevel != 0)
      	{
      		return childLevel;
      	}
      }

      return 0;   
      /* End Protected Region   [[83431bc4-4395-11e6-a883-1f8f2b17c061]] */
    }

  }
  
  public static class DecompositionBuildingBlockFunctions {

    private DecompositionBuildingBlockFunctions() {}

    public static java.lang.Integer GetLevelNr(final cleon.common.modularity.metamodel.spec.javamodel.IDecompositionBuildingBlock decompositionBuildingBlock) {
      return DynamicResourceUtil.invoke(IDecompositionBuildingBlockFunctionsImpl.class, DecompositionBuildingBlockFunctionsImpl.INSTANCE, decompositionBuildingBlock).GetLevelNr(decompositionBuildingBlock);
    }

    public static java.lang.Integer GetLevelNr(final java.lang.Integer level, final cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock parent, final cleon.common.modularity.metamodel.spec.javamodel.IDecompositionBuildingBlock decompositionBuildingBlock) {
      return DynamicResourceUtil.invoke(IDecompositionBuildingBlockFunctionsImpl.class, DecompositionBuildingBlockFunctionsImpl.INSTANCE, decompositionBuildingBlock).GetLevelNr(level, parent, decompositionBuildingBlock);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,3aea3d68-44bf-11e5-93ef-c50f9659357a,JNNdU4wdoC6x0oB3sMzUxMqiQA8=] */
