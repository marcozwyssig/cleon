package cleon.architecturemethods.systemarc42.metamodel.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b12f0237-e2b4-11ea-a524-1b14d0598ecd,imports]] */
import java.util.stream.Collectors;
import cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.javamodel.IServerSystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.operatingsystem.javamodel.IWindowsSystemConfiguration;
/* End Protected Region   [[b12f0237-e2b4-11ea-a524-1b14d0598ecd,imports]] */

public class ServerNodes__T_xml {

  /* Begin Protected Region [[b12f0237-e2b4-11ea-a524-1b14d0598ecd]] */

  /* End Protected Region   [[b12f0237-e2b4-11ea-a524-1b14d0598ecd]] */


  public static interface INodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4697afc3-e37b-11ea-90a0-29b751c6ace9")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyServerWithWindows();

  }
  
  public static interface INodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4697afc3-e37b-11ea-90a0-29b751c6ace9")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyServerWithWindows(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList);

  }
  
  public static class NodeFunctionsImpl implements INodeFunctionsImpl {

    public static final INodeFunctionsImpl INSTANCE = new NodeFunctionsImpl();

    private NodeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyServerWithWindows(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      /* Begin Protected Region [[4697afc3-e37b-11ea-90a0-29b751c6ace9]] */
      return nodeList.stream()
      		.filter(s -> s instanceof IBuildNode)
      		.map(IBuildNode.class::cast)
      		.filter(build -> {
      			if( build.selectInstanceOf() instanceof IServerSystemConfiguration ) {
      				final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.FunctionSpace_Node.INodeFunctions functions = build.extension(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.FunctionSpace_Node.INodeFunctions.class);
      				for(final IBuildNode neszedBuildNode : functions.GetAllNestedBuildNodes()) {
      					if ( neszedBuildNode.selectInstanceOf() instanceof IWindowsSystemConfiguration ) {
      						return true;
      					}
      				}
      			}		
      			return false;
      		})
      		.collect(Collectors.toList());
      /* End Protected Region   [[4697afc3-e37b-11ea-90a0-29b751c6ace9]] */
    }

  }
  
  public static class NodeFunctions {

    private NodeFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyServerWithWindows(final List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodeList) {
      return DynamicResourceUtil.invoke(INodeFunctionsImpl.class, NodeFunctionsImpl.INSTANCE, nodeList).OnlyServerWithWindows(nodeList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b12f0237-e2b4-11ea-a524-1b14d0598ecd,n/bHgzgLT93QGvfIkc151K6e4/w=] */
