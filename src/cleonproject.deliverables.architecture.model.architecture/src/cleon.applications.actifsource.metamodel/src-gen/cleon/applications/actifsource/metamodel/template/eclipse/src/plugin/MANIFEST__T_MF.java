package cleon.applications.actifsource.metamodel.template.eclipse.src.plugin;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[80a3b9c4-2d5d-11e5-a80e-a94c0ceb2081,imports]] */
import java.util.stream.Collectors;
import ch.actifsource.util.log.Logger;
import cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage;
/* End Protected Region   [[80a3b9c4-2d5d-11e5-a80e-a94c0ceb2081,imports]] */

public class MANIFEST__T_MF {

  /* Begin Protected Region [[80a3b9c4-2d5d-11e5-a80e-a94c0ceb2081]] */

  /* End Protected Region   [[80a3b9c4-2d5d-11e5-a80e-a94c0ceb2081]] */


  public static interface IExportPackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9715e34c-49ee-11eb-a257-57f1ec3994e6")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> OnlyExports();

    @IDynamicResourceExtension.MethodId("a62e5e49-49ef-11eb-a257-57f1ec3994e6")
    public java.lang.String PackageNames();

    @IDynamicResourceExtension.MethodId("2bf6b6ed-49fb-11eb-82ab-0d86130a47ce")
    public java.lang.Boolean existJavaModelPackage();

  }
  
  public static interface IExportPackageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9715e34c-49ee-11eb-a257-57f1ec3994e6")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> OnlyExports(final List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> exportPackageList);

    @IDynamicResourceExtension.MethodId("2bf6b6ed-49fb-11eb-82ab-0d86130a47ce")
    public java.lang.Boolean existJavaModelPackage(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage exportPackage);

  }
  
  public static class ExportPackageFunctionsImpl implements IExportPackageFunctionsImpl {

    public static final IExportPackageFunctionsImpl INSTANCE = new ExportPackageFunctionsImpl();

    private ExportPackageFunctionsImpl() {}

    @Override
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> OnlyExports(final List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> exportPackageList) {
      /* Begin Protected Region [[9715e34c-49ee-11eb-a257-57f1ec3994e6]] */
      return exportPackageList.stream().filter(IExportPackage::selectIsExport).collect(Collectors.toList());
      /* End Protected Region   [[9715e34c-49ee-11eb-a257-57f1ec3994e6]] */
    }

    @Override
    public java.lang.Boolean existJavaModelPackage(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage exportPackage) {
      /* Begin Protected Region [[2bf6b6ed-49fb-11eb-82ab-0d86130a47ce]] */
      final var packageName = exportPackage.selectPackage().selectName() + ".javamodel";
      // Thread.currentThread().getContextClassLoader()

      final var _package = Package.getPackage(packageName);
      final var found = _package != null;
      Logger.instance().logInfo("searching " + packageName + "-> " + found);
      return found;
      /* End Protected Region   [[2bf6b6ed-49fb-11eb-82ab-0d86130a47ce]] */
    }

  }
  
  public static class ExportPackageFunctions {

    private ExportPackageFunctions() {}

    public static List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> OnlyExports(final List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> exportPackageList) {
      return DynamicResourceUtil.invoke(IExportPackageFunctionsImpl.class, ExportPackageFunctionsImpl.INSTANCE, exportPackageList).OnlyExports(exportPackageList);
    }

    public static java.lang.Boolean existJavaModelPackage(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage exportPackage) {
      return DynamicResourceUtil.invoke(IExportPackageFunctionsImpl.class, ExportPackageFunctionsImpl.INSTANCE, exportPackage).existJavaModelPackage(exportPackage);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,80a3b9c4-2d5d-11e5-a80e-a94c0ceb2081,vDk4sB4A9Nr5iaxVUjczr0qF10E=] */
