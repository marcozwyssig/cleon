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
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

    @IDynamicResourceExtension.MethodId("e33a7145-282d-11ec-a022-ebea6bd1100d")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("e653876c-c9ed-11ee-953e-1bc687172a5b")
    public java.lang.String GetTitleName();

    @IDynamicResourceExtension.MethodId("7a795212-d24d-11ee-b255-49ab47716ebd")
    public java.lang.String RenderEnd(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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

  public static interface IAbstractListOfSysCmpSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e479db75-d6e5-11ee-8fe2-9fdd0afb9b0b")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("38345efe-b335-11f0-8b15-d12a8adc0014")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IAbstractListOfSysCmpSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractListOfSysCmpSpecificationsFunctionsImpl implements IAbstractListOfSysCmpSpecificationsFunctionsImpl {

    public static final IAbstractListOfSysCmpSpecificationsFunctionsImpl INSTANCE = new AbstractListOfSysCmpSpecificationsFunctionsImpl();

    private AbstractListOfSysCmpSpecificationsFunctionsImpl() {}

  }
  
  public static class AbstractListOfSysCmpSpecificationsFunctions {

    private AbstractListOfSysCmpSpecificationsFunctions() {}

  }

  public static interface ISysCmpSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4f1f91c5-d236-11ee-b255-49ab47716ebd")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("8302547c-0010-11f0-945c-87b19aec41f4")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("963f3b00-b335-11f0-8b15-d12a8adc0014")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("39309176-b338-11f0-8b15-d12a8adc0014")
    public java.lang.String FileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

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
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.ISysCfgSpecification GetChapterRefForOs(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.os.javamodel.ISysCfgOsCategorySpecification filterSystemConfiguration);

    @IDynamicResourceExtension.MethodId("4c1ca530-d192-11ee-b624-ff4effe3da71")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.ISysCfgSpecification GetChapterRefForHW(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.hardware.javamodel.ISysCfgHwCategorySpecification filterSystemConfiguration);

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

  public static interface IEnvironmentSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("58e3b87a-b336-11f0-8b15-d12a8adc0014")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IEnvironmentSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnvironmentSpecificationsFunctionsImpl implements IEnvironmentSpecificationsFunctionsImpl {

    public static final IEnvironmentSpecificationsFunctionsImpl INSTANCE = new EnvironmentSpecificationsFunctionsImpl();

    private EnvironmentSpecificationsFunctionsImpl() {}

  }
  
  public static class EnvironmentSpecificationsFunctions {

    private EnvironmentSpecificationsFunctions() {}

  }

  public static interface ISiteSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f11439a-b336-11f0-8b15-d12a8adc0014")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISiteSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SiteSpecificationsFunctionsImpl implements ISiteSpecificationsFunctionsImpl {

    public static final ISiteSpecificationsFunctionsImpl INSTANCE = new SiteSpecificationsFunctionsImpl();

    private SiteSpecificationsFunctionsImpl() {}

  }
  
  public static class SiteSpecificationsFunctions {

    private SiteSpecificationsFunctions() {}

  }

  public static interface IDataCenterSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5956569-b336-11f0-8b15-d12a8adc0014")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDataCenterSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DataCenterSpecificationsFunctionsImpl implements IDataCenterSpecificationsFunctionsImpl {

    public static final IDataCenterSpecificationsFunctionsImpl INSTANCE = new DataCenterSpecificationsFunctionsImpl();

    private DataCenterSpecificationsFunctionsImpl() {}

  }
  
  public static class DataCenterSpecificationsFunctions {

    private DataCenterSpecificationsFunctions() {}

  }

  public static interface IHostSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1b43da63-b337-11f0-8b15-d12a8adc0014")
    public java.lang.String FileName(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("675f7dc8-b342-11f0-8727-8d2c2658a4f8")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IHostSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HostSpecificationFunctionsImpl implements IHostSpecificationFunctionsImpl {

    public static final IHostSpecificationFunctionsImpl INSTANCE = new HostSpecificationFunctionsImpl();

    private HostSpecificationFunctionsImpl() {}

  }
  
  public static class HostSpecificationFunctions {

    private HostSpecificationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6e104406-e64d-11e8-9ed8-5f22de89d1df,dJyW8+Lp16FHSc7JZm66N3rpHOs=] */
