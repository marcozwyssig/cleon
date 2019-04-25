package cleon.architecturemethods.itarc42.template.plantuml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[3aa83cb8-0aa0-11e9-8a91-633e556ac68f,imports]] */
import cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode;
import javafx.util.Pair;
import java.util.ArrayList;
/* End Protected Region   [[3aa83cb8-0aa0-11e9-8a91-633e556ac68f,imports]] */

public class FunctionSpace_Deployment_Plantuml {

  /* Begin Protected Region [[3aa83cb8-0aa0-11e9-8a91-633e556ac68f]] */
  
  /* End Protected Region   [[3aa83cb8-0aa0-11e9-8a91-633e556ac68f]] */


  public static interface IDeploymentDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("57d8c62b-0aa0-11e9-8a91-633e556ac68f")
    public java.lang.String RenderUmlElement();

    @IDynamicResourceExtension.MethodId("4b8d60da-0aac-11e9-8a91-633e556ac68f")
    public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode GetNode();

    @IDynamicResourceExtension.MethodId("d316009e-0eb3-11e9-9f19-6d15636f4ecc")
    public java.lang.Boolean onlyOneLayer();

    @IDynamicResourceExtension.MethodId("c044124c-1977-11e9-b3a0-d155f11f9df1")
    public java.lang.Boolean leftToRight();

    @IDynamicResourceExtension.MethodId("5104adea-1980-11e9-88a0-1f786f12e4c1")
    public java.lang.Boolean renderHidden();

  }
  
  public static interface IDeploymentDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d316009e-0eb3-11e9-9f19-6d15636f4ecc")
    public java.lang.Boolean onlyOneLayer(final cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IDeploymentDiagram deploymentDiagram);

    @IDynamicResourceExtension.MethodId("c044124c-1977-11e9-b3a0-d155f11f9df1")
    public java.lang.Boolean leftToRight(final cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IDeploymentDiagram deploymentDiagram);

    @IDynamicResourceExtension.MethodId("5104adea-1980-11e9-88a0-1f786f12e4c1")
    public java.lang.Boolean renderHidden(final cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IDeploymentDiagram deploymentDiagram);

  }
  
  public static class DeploymentDiagramFunctionsImpl implements IDeploymentDiagramFunctionsImpl {

    public static final IDeploymentDiagramFunctionsImpl INSTANCE = new DeploymentDiagramFunctionsImpl();

    private DeploymentDiagramFunctionsImpl() {}

    @Override
    public java.lang.Boolean onlyOneLayer(final cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IDeploymentDiagram deploymentDiagram) {
      /* Begin Protected Region [[d316009e-0eb3-11e9-9f19-6d15636f4ecc]] */
      if (deploymentDiagram.selectOnlyOneLayer() == null)
      {
    	  return true;
      }
      return deploymentDiagram.selectOnlyOneLayer().booleanValue() == false;
      /* End Protected Region   [[d316009e-0eb3-11e9-9f19-6d15636f4ecc]] */
    }

    @Override
    public java.lang.Boolean leftToRight(final cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IDeploymentDiagram deploymentDiagram) {
      /* Begin Protected Region [[c044124c-1977-11e9-b3a0-d155f11f9df1]] */
        if (deploymentDiagram.selectLeftToRight() == null)
        {
      	  return false;
        }
        return deploymentDiagram.selectLeftToRight().booleanValue() == false;
      /* End Protected Region   [[c044124c-1977-11e9-b3a0-d155f11f9df1]] */
    }

    @Override
    public java.lang.Boolean renderHidden(final cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IDeploymentDiagram deploymentDiagram) {
      /* Begin Protected Region [[5104adea-1980-11e9-88a0-1f786f12e4c1]] */
        if (deploymentDiagram.selectRenderHidden() == null)
        {
        	return false;
        }
        return deploymentDiagram.selectRenderHidden().booleanValue() == false;
      /* End Protected Region   [[5104adea-1980-11e9-88a0-1f786f12e4c1]] */
    }

  }
  
  public static class DeploymentDiagramFunctions {

    private DeploymentDiagramFunctions() {}

    public static java.lang.Boolean onlyOneLayer(final cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IDeploymentDiagram deploymentDiagram) {
      return DynamicResourceUtil.invoke(IDeploymentDiagramFunctionsImpl.class, DeploymentDiagramFunctionsImpl.INSTANCE, deploymentDiagram).onlyOneLayer(deploymentDiagram);
    }

    public static java.lang.Boolean leftToRight(final cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IDeploymentDiagram deploymentDiagram) {
      return DynamicResourceUtil.invoke(IDeploymentDiagramFunctionsImpl.class, DeploymentDiagramFunctionsImpl.INSTANCE, deploymentDiagram).leftToRight(deploymentDiagram);
    }

    public static java.lang.Boolean renderHidden(final cleon.architecturemethods.itarc42.spec.itarc42.diagram.javamodel.IDeploymentDiagram deploymentDiagram) {
      return DynamicResourceUtil.invoke(IDeploymentDiagramFunctionsImpl.class, DeploymentDiagramFunctionsImpl.INSTANCE, deploymentDiagram).renderHidden(deploymentDiagram);
    }

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
    public java.lang.String RenderHidden(final List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode> nodeList);

  }
  
  public static class NodeFunctionsImpl implements INodeFunctionsImpl {

    public static final INodeFunctionsImpl INSTANCE = new NodeFunctionsImpl();

    private NodeFunctionsImpl() {}

    @Override
    public java.lang.String RenderHidden(final List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      /* Begin Protected Region [[5254da7b-18e9-11e9-84df-097eeec74d2d]] */
    	StringBuilder builder = new StringBuilder();
    	INode last = null;
    	for( INode next : nodeList)
    	{
    		if( last != null)
    		{
    			INodeFunctions lastFunction = last.extension(INodeFunctions.class);
    			INodeFunctions nextFunction = next.extension(INodeFunctions.class);
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

    public static java.lang.String RenderHidden(final List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode> nodeList) {
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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,3aa83cb8-0aa0-11e9-8a91-633e556ac68f,ILYO2880mZCVZU/DzLiybv5hIVM=] */
