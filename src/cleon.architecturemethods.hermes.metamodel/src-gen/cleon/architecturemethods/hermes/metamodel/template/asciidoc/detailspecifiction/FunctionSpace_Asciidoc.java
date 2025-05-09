package cleon.architecturemethods.hermes.metamodel.template.asciidoc.detailspecifiction;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6e104406-e64d-11e8-9ed8-5f22de89d1df,imports]] */

/* End Protected Region   [[6e104406-e64d-11e8-9ed8-5f22de89d1df,imports]] */

public class FunctionSpace_Asciidoc {

  /* Begin Protected Region [[6e104406-e64d-11e8-9ed8-5f22de89d1df]] */
  
  /* End Protected Region   [[6e104406-e64d-11e8-9ed8-5f22de89d1df]] */


  public static interface IDetailSpecificationDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e262d479-2813-11ec-988b-e1826086c18c")
    public List<ch.actifsource.core.javamodel.IResource> ChapterOrder();

    @IDynamicResourceExtension.MethodId("e33a7145-282d-11ec-a022-ebea6bd1100d")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("e653876c-c9ed-11ee-953e-1bc687172a5b")
    public java.lang.String GetTitleName();

    @IDynamicResourceExtension.MethodId("7a795212-d24d-11ee-b255-49ab47716ebd")
    public java.lang.String RenderEnd(final ch.actifsource.core.javamodel.IResource language);

  }
  
  public static interface IDetailSpecificationDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DetailSpecificationDocumentFunctionsImpl implements IDetailSpecificationDocumentFunctionsImpl {

    public static final IDetailSpecificationDocumentFunctionsImpl INSTANCE = new DetailSpecificationDocumentFunctionsImpl();

    private DetailSpecificationDocumentFunctionsImpl() {}

  }
  
  public static class DetailSpecificationDocumentFunctions {

    private DetailSpecificationDocumentFunctions() {}

  }

  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7456a29c-4879-11ec-b3cc-9dd8204a254a")
    public java.lang.String convert();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

  }

  public static interface IComponentSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d9b44979-d6e5-11ee-8fe2-9fdd0afb9b0b")
    public java.lang.String RenderChapters(final ch.actifsource.core.javamodel.IResource language);

    @IDynamicResourceExtension.MethodId("e479db75-d6e5-11ee-8fe2-9fdd0afb9b0b")
    public java.lang.String RenderContentElement(final ch.actifsource.core.javamodel.IResource language);

  }
  
  public static interface IComponentSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ComponentSpecificationsFunctionsImpl implements IComponentSpecificationsFunctionsImpl {

    public static final IComponentSpecificationsFunctionsImpl INSTANCE = new ComponentSpecificationsFunctionsImpl();

    private ComponentSpecificationsFunctionsImpl() {}

  }
  
  public static class ComponentSpecificationsFunctions {

    private ComponentSpecificationsFunctions() {}

  }

  public static interface IAboutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("edcd601f-d7a1-11ee-890b-0db639851a38")
    public java.lang.String ChapterName();

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

  public static interface ISysCmpSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4f1f91c5-d236-11ee-b255-49ab47716ebd")
    public java.lang.String RenderContentElement(final ch.actifsource.core.javamodel.IResource language);

    @IDynamicResourceExtension.MethodId("686110eb-d237-11ee-b255-49ab47716ebd")
    public java.lang.String RenderChapters(final ch.actifsource.core.javamodel.IResource language);

    @IDynamicResourceExtension.MethodId("8302547c-0010-11f0-945c-87b19aec41f4")
    public java.lang.String ChapterPath(final ch.actifsource.core.javamodel.IResource language);

  }
  
  public static interface ISysCmpSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCmpSpecificationFunctionsImpl implements ISysCmpSpecificationFunctionsImpl {

    public static final ISysCmpSpecificationFunctionsImpl INSTANCE = new SysCmpSpecificationFunctionsImpl();

    private SysCmpSpecificationFunctionsImpl() {}

  }
  
  public static class SysCmpSpecificationFunctions {

    private SysCmpSpecificationFunctions() {}

  }

  public static interface ISysCfgSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("01c09e9e-c747-11ee-8456-2b8c93b367a8")
    public List<ch.actifsource.core.javamodel.IResource> ChapterOrder();

    @IDynamicResourceExtension.MethodId("127fbb00-0011-11f0-945c-87b19aec41f4")
    public java.lang.Boolean InASeparateFile();

    @IDynamicResourceExtension.MethodId("1f3f2afc-0012-11f0-945c-87b19aec41f4")
    public java.lang.String FileName(final ch.actifsource.core.javamodel.IResource language);

  }
  
  public static interface ISysCfgSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("127fbb00-0011-11f0-945c-87b19aec41f4")
    public java.lang.Boolean InASeparateFile(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration sysCfgSpecification);

  }
  
  public static class SysCfgSpecificationFunctionsImpl implements ISysCfgSpecificationFunctionsImpl {

    public static final ISysCfgSpecificationFunctionsImpl INSTANCE = new SysCfgSpecificationFunctionsImpl();

    private SysCfgSpecificationFunctionsImpl() {}

    @Override
    public java.lang.Boolean InASeparateFile(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration sysCfgSpecification) {
      return true;
    }

  }
  
  public static class SysCfgSpecificationFunctions {

    private SysCfgSpecificationFunctions() {}

    public static java.lang.Boolean InASeparateFile(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration sysCfgSpecification) {
      return DynamicResourceUtil.invoke(ISysCfgSpecificationFunctionsImpl.class, SysCfgSpecificationFunctionsImpl.INSTANCE, sysCfgSpecification).InASeparateFile(sysCfgSpecification);
    }

  }

  public static interface ISysCfgOsCategorySpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ae882b96-c74e-11ee-8456-2b8c93b367a8")
    public java.lang.String RenderContentElement(final ch.actifsource.core.javamodel.IResource language);

    @IDynamicResourceExtension.MethodId("6421e276-c74f-11ee-8456-2b8c93b367a8")
    public java.lang.String AdditionalPackages();

    @IDynamicResourceExtension.MethodId("c4c0d6da-c74f-11ee-8456-2b8c93b367a8")
    public java.lang.String CustomOSSpecification();

    @IDynamicResourceExtension.MethodId("b1dd68ae-d18f-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware SysCfg();

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
    public java.lang.String RenderContentElement(final ch.actifsource.core.javamodel.IResource language);

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
    public java.lang.String RenderContentElement(final ch.actifsource.core.javamodel.IResource language);

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
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration GetChapterRefForOs(final ch.actifsource.core.javamodel.IResource filterSystemConfiguration);

    @IDynamicResourceExtension.MethodId("4c1ca530-d192-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration GetChapterRefForHW(final ch.actifsource.core.javamodel.IResource filterSystemConfiguration);

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6e104406-e64d-11e8-9ed8-5f22de89d1df,SjAHm2ctC1eIIzLCuMbS/Qc37Xg=] */
