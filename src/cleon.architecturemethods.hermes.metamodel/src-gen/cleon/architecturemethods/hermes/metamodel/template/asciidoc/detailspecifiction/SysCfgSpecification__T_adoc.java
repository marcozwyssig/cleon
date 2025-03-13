package cleon.architecturemethods.hermes.metamodel.template.asciidoc.detailspecifiction;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d3122746-42ec-11ec-905e-258a812affa7,imports]] */

/* End Protected Region   [[d3122746-42ec-11ec-905e-258a812affa7,imports]] */

public class SysCfgSpecification__T_adoc {

  /* Begin Protected Region [[d3122746-42ec-11ec-905e-258a812affa7]] */
  
  /* End Protected Region   [[d3122746-42ec-11ec-905e-258a812affa7]] */


  public static interface ISysCfgSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5df45a9a-42ed-11ec-905e-258a812affa7")
    public java.lang.String GetSystemComponentName();

    @IDynamicResourceExtension.MethodId("6845a5e7-42ed-11ec-905e-258a812affa7")
    public java.lang.String GetSystemConfigurationName();

    @IDynamicResourceExtension.MethodId("01c09e9e-c747-11ee-8456-2b8c93b367a8")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface ISysCfgSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgSpecificationFunctionsImpl implements ISysCfgSpecificationFunctionsImpl {

    public static final ISysCfgSpecificationFunctionsImpl INSTANCE = new SysCfgSpecificationFunctionsImpl();

    private SysCfgSpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgSpecificationFunctions {

    private SysCfgSpecificationFunctions() {}

  }

  public static interface ISysCfgOsCategorySpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ae882b96-c74e-11ee-8456-2b8c93b367a8")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("6421e276-c74f-11ee-8456-2b8c93b367a8")
    public java.lang.String AdditionalPackages();

    @IDynamicResourceExtension.MethodId("c4c0d6da-c74f-11ee-8456-2b8c93b367a8")
    public java.lang.String CustomOSSpecification();

    @IDynamicResourceExtension.MethodId("b1dd68ae-d18f-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration SysCfg();

  }
  
  public static interface ISysCfgOsCategorySpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgOsCategorySpecificationFunctionsImpl implements ISysCfgOsCategorySpecificationFunctionsImpl {

    public static final ISysCfgOsCategorySpecificationFunctionsImpl INSTANCE = new SysCfgOsCategorySpecificationFunctionsImpl();

    private SysCfgOsCategorySpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgOsCategorySpecificationFunctions {

    private SysCfgOsCategorySpecificationFunctions() {}

  }

  public static interface ISysCfgAppCategorySpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b3bcd3c-c751-11ee-8456-2b8c93b367a8")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("9b3bcd46-c751-11ee-8456-2b8c93b367a8")
    public java.lang.String AD__F_Integration();

    @IDynamicResourceExtension.MethodId("6ee34e5b-c752-11ee-8456-2b8c93b367a8")
    public java.lang.String RBAC__F_Activity__F_Configuration();

    @IDynamicResourceExtension.MethodId("8a3ad11a-c752-11ee-8456-2b8c93b367a8")
    public java.lang.String Service__F_Accounts();

    @IDynamicResourceExtension.MethodId("9866e5ec-c752-11ee-8456-2b8c93b367a8")
    public java.lang.String Local__F_Accounts();

    @IDynamicResourceExtension.MethodId("9f6695ba-c752-11ee-8456-2b8c93b367a8")
    public java.lang.String Certificates();

    @IDynamicResourceExtension.MethodId("a98e1224-c752-11ee-8456-2b8c93b367a8")
    public java.lang.String Puppet__F_Hiera__F_Configuration();

    @IDynamicResourceExtension.MethodId("768e3c27-c753-11ee-8456-2b8c93b367a8")
    public java.lang.String CustomAppSpecification();

  }
  
  public static interface ISysCfgAppCategorySpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgAppCategorySpecificationFunctionsImpl implements ISysCfgAppCategorySpecificationFunctionsImpl {

    public static final ISysCfgAppCategorySpecificationFunctionsImpl INSTANCE = new SysCfgAppCategorySpecificationFunctionsImpl();

    private SysCfgAppCategorySpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgAppCategorySpecificationFunctions {

    private SysCfgAppCategorySpecificationFunctions() {}

  }

  public static interface ISysCfgHwCategorySpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5f062163-c767-11ee-88de-bb28abfdee0c")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISysCfgHwCategorySpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgHwCategorySpecificationFunctionsImpl implements ISysCfgHwCategorySpecificationFunctionsImpl {

    public static final ISysCfgHwCategorySpecificationFunctionsImpl INSTANCE = new SysCfgHwCategorySpecificationFunctionsImpl();

    private SysCfgHwCategorySpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgHwCategorySpecificationFunctions {

    private SysCfgHwCategorySpecificationFunctions() {}

  }

  public static interface ISystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("041d7879-d190-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification GetChapterRefForOs(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.os.javamodel.ISysCfgOsCategorySpecification filterSystemConfiguration);

    @IDynamicResourceExtension.MethodId("4c1ca530-d192-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification GetChapterRefForHW(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.hardware.javamodel.ISysCfgHwCategorySpecification filterSystemConfiguration);

  }
  
  public static interface ISystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationFunctionsImpl implements ISystemConfigurationFunctionsImpl {

    public static final ISystemConfigurationFunctionsImpl INSTANCE = new SystemConfigurationFunctionsImpl();

    private SystemConfigurationFunctionsImpl() {}

  }
  
  public static class SystemConfigurationFunctions {

    private SystemConfigurationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d3122746-42ec-11ec-905e-258a812affa7,ZAW8ysWDLNlzPMtuvFZgQiz4Y64=] */
