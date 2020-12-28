package cleon.applications.actifsource.metamodel.spec.system;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[1a3e7433-491a-11eb-9bd7-6114c4f17e0c,imports]] */
import java.util.stream.Collectors;
import cleon.applications.actifsource.metamodel.spec.FunctionSpace_Actifsource.IBuildingBlockFunctions;
import cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.AbstractProject;
/* End Protected Region   [[1a3e7433-491a-11eb-9bd7-6114c4f17e0c,imports]] */

public class FunctionSpace_EclipseEcoSystem {

  /* Begin Protected Region [[1a3e7433-491a-11eb-9bd7-6114c4f17e0c]] */

  /* End Protected Region   [[1a3e7433-491a-11eb-9bd7-6114c4f17e0c]] */


  public static interface IPackagesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2471148e-491a-11eb-9bd7-6114c4f17e0c")
    public List<cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage> FindPackages(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin);

  }
  
  public static interface IPackagesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2471148e-491a-11eb-9bd7-6114c4f17e0c")
    public List<cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage> FindPackages(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin, final cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages packages);

  }
  
  public static class PackagesFunctionsImpl implements IPackagesFunctionsImpl {

    public static final IPackagesFunctionsImpl INSTANCE = new PackagesFunctionsImpl();

    private PackagesFunctionsImpl() {}

    @Override
    public List<cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage> FindPackages(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin, final cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages packages) {
      /* Begin Protected Region [[2471148e-491a-11eb-9bd7-6114c4f17e0c]] */
      final var abstractProjectFunctions = AbstractProject.selectToMePlugin(plugin)
      		.extension(IBuildingBlockFunctions.class);
      final var name = abstractProjectFunctions.FullActifsourceBuildingBlockName();
      return packages.selectPackages().stream().filter(x -> x.selectName().startsWith(name))
      		.collect(Collectors.toList());
      /* End Protected Region   [[2471148e-491a-11eb-9bd7-6114c4f17e0c]] */
    }

  }
  
  public static class PackagesFunctions {

    private PackagesFunctions() {}

    public static List<cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage> FindPackages(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin, final cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages packages) {
      return DynamicResourceUtil.invoke(IPackagesFunctionsImpl.class, PackagesFunctionsImpl.INSTANCE, packages).FindPackages(plugin, packages);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,1a3e7433-491a-11eb-9bd7-6114c4f17e0c,jLJPp+XF0zbaAE37zLbPfFOSy/I=] */
