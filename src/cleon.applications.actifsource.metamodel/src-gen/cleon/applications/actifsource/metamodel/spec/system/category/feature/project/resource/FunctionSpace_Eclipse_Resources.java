package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[1f67b346-9ce8-11ef-924c-a99a7c25fee1,imports]] */

/* End Protected Region   [[1f67b346-9ce8-11ef-924c-a99a7c25fee1,imports]] */

public class FunctionSpace_Eclipse_Resources {

  /* Begin Protected Region [[1f67b346-9ce8-11ef-924c-a99a7c25fee1]] */
  
  /* End Protected Region   [[1f67b346-9ce8-11ef-924c-a99a7c25fee1]] */


  public static interface IAbstractEclipseResourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2b7b6fa6-9ce8-11ef-924c-a99a7c25fee1")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource> SelectAllResources();

    @IDynamicResourceExtension.MethodId("1a40cf42-9cea-11ef-924c-a99a7c25fee1")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource> Parents();

  }
  
  public static interface IAbstractEclipseResourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1a40cf42-9cea-11ef-924c-a99a7c25fee1")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource> Parents(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource abstractEclipseResource);

  }
  
  public static class AbstractEclipseResourceFunctionsImpl implements IAbstractEclipseResourceFunctionsImpl {

    public static final IAbstractEclipseResourceFunctionsImpl INSTANCE = new AbstractEclipseResourceFunctionsImpl();

    private AbstractEclipseResourceFunctionsImpl() {}

    @Override
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource> Parents(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource abstractEclipseResource) {
      return null;
    }

  }
  
  public static class AbstractEclipseResourceFunctions {

    private AbstractEclipseResourceFunctions() {}

    public static List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource> Parents(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource abstractEclipseResource) {
      return DynamicResourceUtil.invoke(IAbstractEclipseResourceFunctionsImpl.class, AbstractEclipseResourceFunctionsImpl.INSTANCE, abstractEclipseResource).Parents(abstractEclipseResource);
    }

  }

  public static interface IEclipseDirectoryFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("47e0dfec-9ce8-11ef-924c-a99a7c25fee1")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource> SelectAllResources();

    @IDynamicResourceExtension.MethodId("36e1749b-9cea-11ef-924c-a99a7c25fee1")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource> Parents();

  }
  
  public static interface IEclipseDirectoryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EclipseDirectoryFunctionsImpl implements IEclipseDirectoryFunctionsImpl {

    public static final IEclipseDirectoryFunctionsImpl INSTANCE = new EclipseDirectoryFunctionsImpl();

    private EclipseDirectoryFunctionsImpl() {}

  }
  
  public static class EclipseDirectoryFunctions {

    private EclipseDirectoryFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,1f67b346-9ce8-11ef-924c-a99a7c25fee1,JqHC/gzW0dF4y6W48utexN20b74=] */
