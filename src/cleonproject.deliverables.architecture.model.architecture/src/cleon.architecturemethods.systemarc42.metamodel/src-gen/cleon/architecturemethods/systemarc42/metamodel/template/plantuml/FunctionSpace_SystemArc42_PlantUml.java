package cleon.architecturemethods.systemarc42.metamodel.template.plantuml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f247dcd9-02db-11e9-9e58-33d596257b14,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode;
/* End Protected Region   [[f247dcd9-02db-11e9-9e58-33d596257b14,imports]] */

public class FunctionSpace_SystemArc42_PlantUml {

  /* Begin Protected Region [[f247dcd9-02db-11e9-9e58-33d596257b14]] */

  /* End Protected Region   [[f247dcd9-02db-11e9-9e58-33d596257b14]] */


  public static interface IBuildingBlockSystemOverviewDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("003fc30e-02dc-11e9-9e58-33d596257b14")
    public java.lang.String RenderUmlElement();

  }
  
  public static interface IBuildingBlockSystemOverviewDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockSystemOverviewDiagramFunctionsImpl implements IBuildingBlockSystemOverviewDiagramFunctionsImpl {

    public static final IBuildingBlockSystemOverviewDiagramFunctionsImpl INSTANCE = new BuildingBlockSystemOverviewDiagramFunctionsImpl();

    private BuildingBlockSystemOverviewDiagramFunctionsImpl() {}

  }
  
  public static class BuildingBlockSystemOverviewDiagramFunctions {

    private BuildingBlockSystemOverviewDiagramFunctions() {}

  }

  public static interface IBuildingBlockDependenciesDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2507b706-0e17-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderUmlElement();

    @IDynamicResourceExtension.MethodId("25082caa-0e17-11e9-8b4c-f9aec93d8b56")
    public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock SelectBlackbox();

  }
  
  public static interface IBuildingBlockDependenciesDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockDependenciesDiagramFunctionsImpl implements IBuildingBlockDependenciesDiagramFunctionsImpl {

    public static final IBuildingBlockDependenciesDiagramFunctionsImpl INSTANCE = new BuildingBlockDependenciesDiagramFunctionsImpl();

    private BuildingBlockDependenciesDiagramFunctionsImpl() {}

  }
  
  public static class BuildingBlockDependenciesDiagramFunctions {

    private BuildingBlockDependenciesDiagramFunctions() {}

  }

  public static interface IBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8c01ac28-61c6-11ea-b250-8d3b1d076722")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> SelectDependencies();

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

  public static interface INodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("db9cf69e-0aa1-11e9-8a91-633e556ac68f")
    public java.lang.String RenderNode();

    @IDynamicResourceExtension.MethodId("5254da7b-18e9-11e9-84df-097eeec74d2d")
    public java.lang.String RenderHidden();

    @IDynamicResourceExtension.MethodId("48eadab7-18ec-11e9-84df-097eeec74d2d")
    public java.lang.String javaName();

  }
  
  public static interface INodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("5254da7b-18e9-11e9-84df-097eeec74d2d")
    public java.lang.String RenderHidden(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList);

  }
  
  public static class NodeFunctionsImpl implements INodeFunctionsImpl {

    public static final INodeFunctionsImpl INSTANCE = new NodeFunctionsImpl();

    private NodeFunctionsImpl() {}

    @Override
    public java.lang.String RenderHidden(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      /* Begin Protected Region [[5254da7b-18e9-11e9-84df-097eeec74d2d]] */
      final StringBuilder builder = new StringBuilder();
      INode last = null;
      for (final INode next : nodeList) {
      	if (last != null) {
      		final INodeFunctions lastFunction = last.extension(INodeFunctions.class);
      		final INodeFunctions nextFunction = next.extension(INodeFunctions.class);
      		builder.append(lastFunction.javaName());
      		builder.append(" -[hidden]- ");
      		builder.append(nextFunction.javaName());
      		builder.append("\n");
      	}
      	last = next;
      }
      return builder.toString();
      /* End Protected Region   [[5254da7b-18e9-11e9-84df-097eeec74d2d]] */
    }

  }
  
  public static class NodeFunctions {

    private NodeFunctions() {}

    public static java.lang.String RenderHidden(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      return DynamicResourceUtil.invoke(INodeFunctionsImpl.class, NodeFunctionsImpl.INSTANCE, nodeList).RenderHidden(nodeList);
    }

  }

  public static interface IServiceBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bad58bd9-0e8f-11e9-9f19-6d15636f4ecc")
    public java.lang.String RenderNode();

  }
  
  public static interface IServiceBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceBuildNodeFunctionsImpl implements IServiceBuildNodeFunctionsImpl {

    public static final IServiceBuildNodeFunctionsImpl INSTANCE = new ServiceBuildNodeFunctionsImpl();

    private ServiceBuildNodeFunctionsImpl() {}

  }
  
  public static class ServiceBuildNodeFunctions {

    private ServiceBuildNodeFunctions() {}

  }

  public static interface ISegmentationDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("690e74d7-0e23-11e9-8b4c-f9aec93d8b56")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> SelectZone();

    @IDynamicResourceExtension.MethodId("a15643d8-0e23-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderUmlElement();

  }
  
  public static interface ISegmentationDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SegmentationDiagramFunctionsImpl implements ISegmentationDiagramFunctionsImpl {

    public static final ISegmentationDiagramFunctionsImpl INSTANCE = new SegmentationDiagramFunctionsImpl();

    private SegmentationDiagramFunctionsImpl() {}

  }
  
  public static class SegmentationDiagramFunctions {

    private SegmentationDiagramFunctions() {}

  }

  public static interface IZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("208047b3-0e24-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderZone();

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

  public static interface ISecurityZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5ef1c6d8-0eba-11e9-ab93-7d5aca01d5cb")
    public java.lang.String RenderZone();

  }
  
  public static interface ISecurityZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityZoneFunctionsImpl implements ISecurityZoneFunctionsImpl {

    public static final ISecurityZoneFunctionsImpl INSTANCE = new SecurityZoneFunctionsImpl();

    private SecurityZoneFunctionsImpl() {}

  }
  
  public static class SecurityZoneFunctions {

    private SecurityZoneFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f247dcd9-02db-11e9-9e58-33d596257b14,Yh3qy3juzZ6lbBWVzs4p7IBfuJk=] */
